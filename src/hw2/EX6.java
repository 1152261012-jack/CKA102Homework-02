package hw2;
//        請設計一隻Java程式，輸出結果為以下：
//        1 2 3 4 5 6 7 8 9 10
//        1 2 3 4 5 6 7 8 9
//        1 2 3 4 5 6 7 8
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
public class EX6 {

        public static void main(String[] args) {
            // 外層迴圈：控制行數與上限 (從 10 倒數到 1)
            for (int i = 10; i >= 1; i--) {

                // 內層迴圈：印出 1 到當前上限 i 的數字
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " "); // 用 print 不換行
                }

                // 內層迴圈跑完一整行後，執行換行
                System.out.println();
            }
        }
    }