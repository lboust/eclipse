package jsf;

import java.util.ArrayList;
import java.util.List;

public class Ocean {
	
	//instance fields
	List<Tile> tiles = null;
	
	//contructor
	public Ocean(int length) {
		 tiles = new ArrayList<Tile>();
		for (int i=0; i<length;i++) {
			tiles.add(new Tile(i));
		}
	}
	
	//getters
	public List<Tile> getTiles() {
		return tiles;
	}


	
	
}
