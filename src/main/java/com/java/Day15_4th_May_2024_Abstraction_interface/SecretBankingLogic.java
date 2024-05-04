package com.java.Day15_4th_May_2024_Abstraction_interface;

public interface SecretBankingLogic {
	
	//inteface is 100% abstraction
		//interface is blueprint of a Class. blueprint provides a high-level overview 
		//a Class defines much more in depth
		//interface has definitions but it does not expose those definitions
		
		//variables 
		//variables inside an interface are public, static and final in nature
		//java8 - default concrete methods were allowed, static concrete methods were allowed
		//java9 - private concrete methods were allowed
	
	
	int i = 10;
	
	public void secretCode();
	public abstract void moneyPolicy(); //you do not need abstract keyword in an interface to define abstract methods
	
	default void helloWorld() {
		
	}
	
	//Are protected and private abstract methods allowed in Interface ?? NO
	
	//protected void safeHouse(); //safehouse is service ???? anyone can use this service
	//private void locker(); //locker is a service ??? 
	void secretPath();

	

}
