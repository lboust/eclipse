package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="bataillenavale", eager = true)
@SessionScoped
public class Battleship {
	/**
	 * compteur compte le nombre de tentatives du joueur
	 * ocean est l'espace de jeu
	 */
	//instance fields
	private int compteur = 0;
	private Ocean ocean;
	private Ship ship;
	private int oceanLength = 20;
	
	//constructor
	public Battleship() {
		ocean = new Ocean(oceanLength);
		ship = new Ship(oceanLength);
	}
	
	//methods
	public void reset() {
		compteur = 0;
		ship = new Ship(oceanLength);
		ocean = new Ocean(oceanLength);
	}
	
	private String code2color(int code) {
		String[] txtcolor = {"cyan", "orange", "red"};
		return txtcolor[code];
	}
	
	public void selection(Tile tile) {
		int code = ship.isTouched(new Shoot(tile.getValue()));
		ocean.getTiles().get(tile.getValue()).setColor(code2color(code));
/*		if (ship.isSunk()) {
			reset();
		}*/
	}
	
	//accessors

	public int getCompteur() {
		return compteur++;
	}

	public int getOceanLength() {
		return oceanLength;
	}

	public void setOceanLength(int oceanLength) {
		this.oceanLength = oceanLength;
	}

	public Ocean getOcean() {
		return ocean;
	}

	public Ship getShip() {
		return ship;
	}

}
