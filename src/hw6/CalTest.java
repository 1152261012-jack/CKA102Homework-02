package hw6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();   // 改成你自己的 Calculator 類別

		while (true) {
			try {
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();

				System.out.println("請輸入y的值：");
				int y = sc.nextInt();

				int result = cal.powerXY(x, y);
				System.out.println(x + "的" + y + "次方等於" + result);
				break;

			} catch (CalException e) {
				System.out.println(e.getMessage());

			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				sc.next();   // 清掉錯誤輸入，避免無限迴圈
			}
		}

		sc.close();
	}
}