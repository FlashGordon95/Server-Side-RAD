package com.lab3;

public class Engine {
	
	private double size;
	private String fuel;
	
	
	
	public Engine(double size, String fuel) {
		super();
		this.size = size;
		this.fuel = fuel;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}
	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [size=" + size + ", fuel=" + fuel + "]";
	}
	
	

}
