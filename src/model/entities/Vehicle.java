package model.entities;

public class Vehicle {
	
	private String model;
	
	// #1: CONSTRUCTOR PADRÃO:
	public Vehicle() {
	}
	
	// #2: CONSTRUCTOR COM ARGUMENTOS:
	public Vehicle(String model) {		
		this.model = model;
	}
	
	// #3: GETTERS AND SETTERS:
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	

}
