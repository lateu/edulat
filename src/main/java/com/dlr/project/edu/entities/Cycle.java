package com.dlr.project.edu.entities;

public enum Cycle {
	Cycle_I("I"), Cycle_II("II");

	private final String name;

	/**
	 * @param displayName
	 */
	private Cycle(String displayName) {
		this.name = displayName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
