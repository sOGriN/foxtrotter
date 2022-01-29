package com.mytest.core;

import com.badlogic.gdx.graphics.GL30;
import com.mytest.core.assets.AssetsManager;
import com.mytest.core.dao.UnitClassDao;
import com.mytest.core.entity.Battleground;
import com.mytest.core.entity.Squad;
import com.mytest.core.entity.Unit;
import com.mytest.core.entity.UnitClass;
import com.mytest.core.gdx.BattlegroundView;
import com.mytest.core.gdx.assets.GdxAssetsManager;

import java.util.List;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class MyGame implements ApplicationListener {
	BattlegroundView bv;

	@Override
	public void create () {
		AssetsManager am = new GdxAssetsManager();
		List<UnitClass> classes = UnitClassDao.generateBaseClasses(am);
		Squad squad = new Squad();
		squad.putUnitTo(new Unit(classes.get(0)), 0);
		squad.putUnitTo(new Unit(classes.get(0)), 1);
		squad.putUnitTo(new Unit(classes.get(1)), 3);
		squad.putUnitTo(new Unit(classes.get(2)), 5);
		Battleground bg = new Battleground();
		bg.setLeftSquad(squad);
		bg.setRightSquad(new Squad());
		bv = new BattlegroundView(bg);
	}

	@Override
	public void resize (int width, int height) {
		bv.resize(width, height);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		bv.render();
	}

	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}

	@Override
	public void dispose () {
	}
}
