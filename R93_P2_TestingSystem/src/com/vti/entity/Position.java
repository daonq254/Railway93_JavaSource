package com.vti.entity;

public class Position {
	public int id;
	public PositionName name;

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}

}
