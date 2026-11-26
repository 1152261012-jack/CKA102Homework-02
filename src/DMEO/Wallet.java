package DMEO;

public class Wallet {
    // 1. 在這裡宣告 int money = 100;
    int money = 100;

    // 2. 賺錢的方法
    public void earn(int amount) {
        // 寫出把 money 加上 amount 的敘述
        money+= amount;
    }
    // 3. 花錢的方法
    public void spend(int amount) {
        // 寫出把 money 扣掉 amount 的敘述
        money-= amount;
    }
}