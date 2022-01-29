package com.mytest.core.entity;

import com.mytest.core.AttackKind;

public class Attack {    
    private int baseDamage;
    private AttackKind attackKind;
    
    public Attack(AttackKind kind, int baseDamage) {
        this.attackKind = kind;
        this.baseDamage = baseDamage;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    public AttackKind getAttackKind() {
        return attackKind;
    }
    public void setAttackKind(AttackKind attackKind) {
        this.attackKind = attackKind;
    }
}
