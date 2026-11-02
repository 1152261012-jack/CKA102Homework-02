package hw1;

public class EX4 {

	public static void main(String[] args) {
		final double pi = 3.1415;
		double radius = 5.0;

        // 2. 套用公式進行計算
        double area = radius * radius * pi;       // 圓面積
        double circumference = 2 * radius * pi;   // 圓周長

        // 3. 輸出結果
        System.out.printf("圓半徑：%f%n", radius);
        System.out.printf("圓面積：%f%n", area);
        System.out.printf("圓周長：%f%n", circumference);

	}

}
