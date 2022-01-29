package com.mytest.core.gdx.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mytest.core.assets.ISpriteAsset;

import org.lwjgl.util.Point;

public class GdxSpriteAsset implements ISpriteAsset {
    private String path;
    private Texture sprite;
    private int w = 150, h = 200;
    public GdxSpriteAsset(String path) {
        this.path = path;        
		sprite = new Texture(Gdx.files.internal(path));
    }

    public String getPath() {
        return path;
    }
    
    public Texture getSprite() {
        return sprite;
    }

    public void setSprite(Texture sprite) {
        this.sprite = sprite;
    } 

    public void draw(Batch batch, Point point) {
        batch.draw(sprite, point.getX(), point.getY(), w, h);
    }
}
