package com.lab3;

public class Car {
	private String beanID;
	private String reg;
	private int doors;
	private String colour;
	private Engine engine;
	
	
	
	
	public Car(String beanID, String reg, int doors, String colour, Engine engine) {
		super();
		this.beanID = beanID;
		this.reg = reg;
		this.doors = doors;
		this.colour = colour;
		this.engine = engine;
	}
	
	/**
	 * @return the beanID
	 */
	public String getBeanID() {
		return beanID;
	}

	/**
	 * @param beanID the beanID to set
	 */
	public void setBeanID(String beanID) {
		this.beanID = beanID;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}
	/**
	 * @param reg the reg to set
	 */
	public void setReg(String reg) {
		this.reg = reg;
	}
	/**
	 * @return the doors
	 */
	public int getDoors() {
		return doors;
	}
	/**
	 * @param doors the doors to set
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [reg=" + reg + ", doors=" + doors + ", colour=" + colour + ", engine=" + engine + "]";
	}
	
	
}
