package com.mytest.core.entity;

public class Squad {
    public static final int BASE_SQUAD_LENGTH = 6;
    private Unit[] units;
    private int squadLength;
    public Squad() {
        this(BASE_SQUAD_LENGTH);
    }

    public Squad(Unit[] units) {
        squadLength = units.length;
        this.units = units.clone();
    }

    public Squad(int length) {
        units = new Unit[length];
        squadLength = length;
    }

    public Unit getUnitAt(int index) {
        return units[index]; 
    }

    public void putUnitTo(Unit unit, int index) {
        units[index] = unit;
    }

    public int getSquadLength() {
        return squadLength;
    }
}
