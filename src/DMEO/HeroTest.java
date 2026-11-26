package DMEO;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero1= new Hero();
        Hero hero2 = new Hero();

        hero1.takeDamage (80);
        hero1.heal (20);
        hero2.takeDamage (40);
        hero2.heal (90);


        System.out.println(hero1.hp);
        System.out.println(hero2.hp);


    }
}
