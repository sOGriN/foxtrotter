package com.mytest.core.entity;

import com.mytest.core.assets.ISpriteAsset;

public class UnitClass {
    private int classId;
    private String name;
    private int maxHp;
    private Attack baseAttack;
    private ISpriteAsset sprite; 

    public int getClassId() {
        return classId;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public Attack getBaseAttack() {
        return baseAttack;
    }
    public void setBaseAttack(Attack baseAttack) {
        this.baseAttack = baseAttack;
    }
        
    public ISpriteAsset getSprite() {
        return sprite;
    }
    public void setSprite(ISpriteAsset sprite) {
        this.sprite = sprite;
    }
    
}
