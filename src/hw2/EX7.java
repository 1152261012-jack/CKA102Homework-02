package hw2;
//請設計一隻Java程式，輸出結果為以下：
            //A
            //BB
            //CCC
            //DDDD
            //EEEEE
            //FFFFFF

public class EX7 {
    public static void main(String[] args) {
        // 設定結束的字元為 'F'
        char endChar = 'F';

        // 外層迴圈：控制目前的字元（從 'A' 開始，每一行換下一個字元）
        for (char i = 'A'; i <= endChar; i++) {

            // 計算目前字元需要印出的次數
            // 'A' 的次數為 1 ('A' - 'A' + 1)
            // 'B' 的次數為 2 ('B' - 'A' + 1)，依此類推
            int count = i - 'A' + 1;

            // 內層迴圈：控制該行字元要印出幾次
            for (int j = 0; j < count; j++) {
                System.out.print(i); // 印出字元，不換行
            }

            // 該行印完後，換行
            System.out.println();
        }
    }
}