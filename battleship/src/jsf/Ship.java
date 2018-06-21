package jsf;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Ship {
	/**
	 * position is the position of the first element of the ship
	 * length is the length of the ship (between 2 and 5)
	 * state is the table of 3 boolean states : untouched, touched, sank
	 */
	//instance fields
	private int position;
	private int length;
	private boolean[] state;

	//constructor
	public Ship(int oceanLength) {
		length = 2 + (int) (Math.random()*4);
		position = (int) (Math.random()*(oceanLength-length));
		state = new boolean[length];
		for (int i=0; i<state.length; i++) {
			state[i] = false;
		}
	}
	
	//methods
	/**
	 * 
	 * @param shoot
	 * @return 0 if untouched, 1 if touched, 2 if sunk
	 */
	public int isTouched (Shoot shoot) {
		int response = 0;
		if ((shoot.getValue() >=position)
		&& (shoot.getValue() <= position + length-1)) {
			state[shoot.getValue() - position]=true;
			response = 1;
			}
		if (isSunk()) {
			response = 2;
		}
		return response;
	}
	
	public boolean isSunk () {
		boolean response = true;
		for (boolean b: state) {
			if(b == false) {
				response  = false; break;
			}
		}
		return response;
	}
	
	//getters
	public int getPosition() {
		return position;
	}

	public int getLength() {
		return length;
	}

	public boolean[] getState() {
		return state;
	}
}
