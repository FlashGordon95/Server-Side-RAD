package com.lab4;

public class Module {
	
	private String moduleName;
	private int credits;
	private boolean allCA;
	
	
	
	
	public Module(String moduleName, int credits, boolean allCA) {
		super();
		this.moduleName = moduleName;
		this.credits = credits;
		this.allCA = allCA;
	}
	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		return moduleName;
	}
	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @return the allCA
	 */
	public boolean isAllCA() {
		return allCA;
	}
	/**
	 * @param allCA the allCA to set
	 */
	public void setAllCA(boolean allCA) {
		this.allCA = allCA;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", credits=" + credits + ", allCA=" + allCA + "]";
	}

	
	
}
