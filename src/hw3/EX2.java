package hw3;

import java.util.Scanner;

public class EX2 {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息，如圖示結果：
	public static void main(String[] args) {
      int game = (int)(Math.random()*10);//在遊戲開始前，先產生一個 0～9 的亂數答案
      Scanner sc = new Scanner(System.in);
      
      System.out.println("開始猜數字吧！");

      while (true) {
          // 1. 讀取玩家輸入的整數（變數名稱 guess 可以自己取）
          int guess = sc.nextInt();

          // 2. 判斷有沒有猜對
          if (guess == game) {
              System.out.println("答對了！答案就是" + game);
             break; // 猜對了，用哪個關鍵字跳出迴圈？
          } else {
              System.out.println("___"); // 猜錯要印出的提示字
          }
      }

      sc.close();
      

	}

}
