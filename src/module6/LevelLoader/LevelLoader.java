package module6.LevelLoader;

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    static public LevelLoader getInstance() {
        return instance;
    }

    private LevelLoader() {
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}
