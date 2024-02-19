package module6.TexturePool;

import module6.LevelLoader.LevelLoader;

public class TexturePool {
    private static TexturePool instance = new TexturePool();

    static public TexturePool getInstance() {
        return instance;
    }

    private TexturePool() {
    }
    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}
