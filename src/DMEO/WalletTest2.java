package DMEO;

public class WalletTest2 {
    public static void main(String[] args) {
            // 1. 建立 Wallet 物件
            Wallet myWallet = new Wallet();

            // 2. 賺 50 元
            myWallet.earn(50);


            // 3. 花 30 元
            myWallet.spend(30);


            // 4. 印出最終金額
            System.out.println(myWallet.money);
        }
    }