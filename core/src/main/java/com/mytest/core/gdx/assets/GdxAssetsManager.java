package com.mytest.core.gdx.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mytest.core.assets.AssetsManager;
import com.mytest.core.assets.ISpriteAsset;

public class GdxAssetsManager extends AssetsManager {
    @Override
    public ISpriteAsset createAsset(String path) {
        GdxSpriteAsset asset = new GdxSpriteAsset(path);
        Texture texture = new Texture(Gdx.files.internal(path));
        asset.setSprite(texture);
        return asset;
    }
}
