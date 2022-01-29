package com.mytest.core.entity;

public class Unit {
    private UnitClass baseClass;
    private int currentHp;

    public Unit(UnitClass unitClass) {
        this.baseClass = unitClass;
        currentHp = unitClass.getMaxHp();
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        if (baseClass != null) {
            return baseClass.getMaxHp();
        }
        return -1;
    }

    public UnitClass getUnitClass() {
        return baseClass;
    }

    public Attack getAttack() {
        if (baseClass != null) {
            return baseClass.getBaseAttack();
        }
        return null;
    }

}
