package hw2;

public class EX5 {
    static void main(String[] args) {
        //• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，
        // 不論是個位數或是十位數。請設計一隻程式，
        //輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
        int count = 0;
        for (int i = 1; i <= 49; i++) {
               // 判斷：十位數不是 4 且 個位數不是 4
            if (i / 10 != 4 && i % 10 != 4) {
                System.out.print(i + " ");
                count++; // 符合條件，計數器 +1
            }
        }

        // 換行後印出總數
        System.out.println();
        System.out.println("總共有 " + count + " 個號碼");
//        // 合併後的寫法（使用 \n 在文字前強制換行）：
//        System.out.println("\n總共有 " + count + " 個號碼");好難挫折感好大
    }
}
