package jsf;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="compteur", eager = true)
@SessionScoped
public class Compteur {

	//instance fields
	int centaine = 0;
	int dizaine = 0;
	int unite = 0;
	
	//methods
	public void rdm() {
		int min = 0;
		int max = 9;
		int result = (int)( Math.random()*( max - min + 1 ) ) + min;
		centaine = result;
		result = (int)( Math.random()*( max - min + 1 ) ) + min;
		dizaine = result;
		result = (int)( Math.random()*( max - min + 1 ) ) + min;
		unite = result;
	}
	
	//accessors
	public int getCentaine() {
		return centaine;
	}
	public void setCentaine(int centaine) {
		this.centaine = centaine;
	}
	public int getDizaine() {
		return dizaine;
	}
	public void setDizaine(int dizaine) {
		this.dizaine = dizaine;
	}
	public int getUnite() {
		return unite;
	}
	public void setUnite(int unite) {
		this.unite = unite;
	}
	
	


	
}
