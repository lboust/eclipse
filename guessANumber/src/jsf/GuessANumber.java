package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="GuessANumber", eager = true)
@SessionScoped
public class GuessANumber {
	
	private int secretNumber;
	private int currentNumber;
	private int countDown;
	private int maxCounter;
	private String outputMessage;
	
	public GuessANumber() {
		secretNumber=(int) (Math.random()*101);
		currentNumber=1;
		maxCounter=10;	
		countDown=maxCounter;
			
	}
	
	public void guess() {
		if (currentNumber<1 
			||currentNumber>100) {
				outputMessage="Entre un nombre entre 1 et 100 inclus";
			} else {
		countDown--;
		int counter=maxCounter-countDown;
		 if (currentNumber == secretNumber) {
			 outputMessage="Gagné en " + counter + " coup(s)";
		 } else if (currentNumber < secretNumber) {
			 outputMessage="Essaie un nombre plus grand";
		 } else {
			 outputMessage="Essaie un nombre plus petit";
		 }
			}
		 
	}
	//accessors
	public int getSecretNumber() {
		return secretNumber;
	}

	public int getCurrentNumber() {
		return currentNumber;
	}

	public int getCountDown() {
		return countDown;
	}

	public int getMaxCounter() {
		return maxCounter;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public String getOutputMessage() {
		return outputMessage;
	}
	
	
	

}
