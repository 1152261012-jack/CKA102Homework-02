package hw1;

public class EX5 {

	public static void main (String[] args) {
		
		    
		        // 1. 設定已知條件
		        double principal = 1500000; // 本金 150 萬
		        double rate = 0.02;         // 年利率 2%
		        int years = 10;             // 10 年

		        // 2. 套用複利公式計算：本金 * (1 + 利率)^年數
		        double totalAmount = principal * Math.pow(1 + rate, years);

		        // 3. 輸出結果（保留整數與小數點前兩位對比）
		        System.out.printf("本金：%.0f 元%n", principal);
		        System.out.printf("10年後本利和（精確）：%.2f 元%n", totalAmount);
		        System.out.printf("10年後本利和（四捨五入至整數）：%.0f 元%n", totalAmount);
		    }
		

	}


