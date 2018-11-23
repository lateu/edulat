package com.dlr.project.edu.entities;

public enum Cycle {
Cycle_I("I"),Cycle_II("II");
private final String displayName;

/**
 * @param displayName
 */
private Cycle(String displayName) {
	this.displayName = displayName;
}

/**
 * @return the displayName
 */
public String getDisplayName() {
	return displayName;
}



}
