package hw3;

import java.util.Scanner;
public class testex2 {
	public static void main (String[]args) {
   int game= (int)(Math.random()*10);// 這邊要轉型因為Math.randow是浮點數
	  Scanner sc = new Scanner(System.in);
	  System.out.println("開始猜數字吧！");
	  
	  while(true) {
		  int guess =sc.nextInt();
		  if  (guess ==game){
			  System.out.println("答對了！你很勇喔!讓我看看答案就是"+game);
			  break;
		  } else {
			  System.out.println("猜錯啦!! 你這小王八蛋 想不到吧!!");
		  }
		   
	  }
	  sc.close();
   
	
	}

}