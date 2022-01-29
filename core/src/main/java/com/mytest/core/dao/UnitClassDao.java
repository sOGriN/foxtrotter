package com.mytest.core.dao;

import java.util.ArrayList;
import java.util.List;

import com.mytest.core.AttackKind;
import com.mytest.core.assets.AssetsManager;
import com.mytest.core.entity.Attack;
import com.mytest.core.entity.UnitClass;

public class UnitClassDao {
    public static List<UnitClass> generateBaseClasses(AssetsManager assetsManager) {
        List<UnitClass> list = new ArrayList<UnitClass>();
        int classCounter = 0;
        UnitClass current = null;//new UnitClass();

        current = new UnitClass();
        current.setClassId(classCounter++);
        current.setName("Рыцарь");
        current.setMaxHp(100);
        current.setBaseAttack(new Attack(AttackKind.MELEE, 20));
        current.setSprite(assetsManager.createAsset("../assets/knight.jpg"));
        list.add(current);
        
        current = new UnitClass();
        current.setClassId(classCounter++);
        current.setName("Рейнджер");
        current.setMaxHp(80);
        current.setBaseAttack(new Attack(AttackKind.RANGED, 25));
        current.setSprite(assetsManager.createAsset("../assets/ranger.jpg"));
        list.add(current);
        
        current = new UnitClass();
        current.setClassId(classCounter++);
        current.setName("Знахарь");
        current.setMaxHp(100);
        current.setBaseAttack(new Attack(AttackKind.FRIENDLY, 20));
        current.setSprite(assetsManager.createAsset("../assets/healer.jpg"));
        list.add(current);

        return list;
    }
}
