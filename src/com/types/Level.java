package com.types;

public enum Level {
	HIGH(5),
	MEDIUM(2),
	LOW(8);
	 final int levelCode;
	private Level(int levelCode) {
		this.levelCode = levelCode;
	}
	public int getLevelCode() {
		return this .levelCode;
	}
}
