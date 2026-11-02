package hw1;

public class EX2 {

	public static void main(String[] args) {
		//計算200顆雞蛋有幾打有幾顆?  #16打 200-16*dozen=剩下幾顆
		int egg = 200,dozen = 12;
	    int sum = (egg/dozen); //16
	    System.out.println("剩下"+sum+"打"+ (egg - 16*12)+"顆");

	    
	    //	    System.out.println(egg-16*12);
	    
//	    System.out.println(sum=200-(sum*dozen));
//		System.out.println(egg/dozen);
		
		
	}

}
