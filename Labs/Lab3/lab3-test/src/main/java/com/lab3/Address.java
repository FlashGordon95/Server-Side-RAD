package com.lab3;

public class Address {
	//Variables
	private String street;
	private String town;
	private String county;
	
	
	/*
	 * Constructor
	 */
	public Address(String street, String town, String county) {
		super();
		this.street = street;
		this.town = town;
		this.county = county;
	}
	
	
	
	/*
	 * Getters and Setters
	 */
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}

}
