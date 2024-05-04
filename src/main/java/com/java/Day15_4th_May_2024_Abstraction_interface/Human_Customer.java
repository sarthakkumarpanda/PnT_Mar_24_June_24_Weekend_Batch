package com.java.Day15_4th_May_2024_Abstraction_interface;

public class Human_Customer extends NRI_CUSTOMER implements SecretBankingLogic, HiddenCreditUnionService{
	
	//Whenever a class implements an interface then it acts as the implementing Class
	
	public static void main(String[] args) {
		
	}

	@Override
	public void secretCode() {
		//this is a service provided by the interface
		System.out.println("This is secret code -  Bank ");
	}
	
	
	


	@Override
	public void moneyPolicy() {
		//this is a service provided by the interface
		
	}

	@Override
	public void secretPath() {
		//this is a service provided by the interface
		
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nriloans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nricards() {
		// TODO Auto-generated method stub
		
	}

}
