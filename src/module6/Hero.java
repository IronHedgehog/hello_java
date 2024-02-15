package module6;

public class Hero {
    private String name;
    private int hp;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        setHp(hp);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    private void setHp(int hp) {
        if (hp >= 0 && hp <= 200) {
            this.hp = hp;
        } else {
            // Якщо hp некоректне, встановлюємо значення за межами в межах 0-200
            this.hp = Math.min(Math.max(hp, 0), 200);
        }
    }
}
