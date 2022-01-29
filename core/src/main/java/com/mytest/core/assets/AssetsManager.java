package com.mytest.core.assets;

import java.util.HashMap;

public abstract class AssetsManager {
    private HashMap<String, ISpriteAsset> store = new HashMap<String, ISpriteAsset>();
    private ISpriteAsset innerLoadSpriteAsset(String path) {
        ISpriteAsset asset = createAsset(path);
        store.put(path, asset);
        return asset;
    }

    public abstract ISpriteAsset createAsset(String path);

    public ISpriteAsset loadSpriteAsset(String path) {
        if (store.containsKey(path)) {
            return store.get(path);
        } else {
            return innerLoadSpriteAsset(path);
        }
    }
}
