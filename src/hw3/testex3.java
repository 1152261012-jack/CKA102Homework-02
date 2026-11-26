package hw3;

import java.util.Scanner;

public class testex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("阿文...請輸入你討厭哪個數字?");
        int hate = sc.nextInt();
        int count = 0;

        for (int n = 1; n <= 49; n++) {
            if (n % 10 != hate && n / 10 != hate) {
                System.out.print(n + "\t");
                count++;
                if (count % 6 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("總共有" + count + "數字可選");
        sc.close();
    }
}