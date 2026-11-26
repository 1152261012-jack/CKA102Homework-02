package DMEO;

public class Hero {
    int hp = 100;
    int mp = 100;

    public void takeDamage(int damage){
        hp= hp - damage;

    }
    public void heal(int potion){
        hp=hp + potion;
    }
}

