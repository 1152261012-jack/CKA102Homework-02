package hw1;

public  class EX3 {
   //請設計出程式計算出256995秒是多少天、多少時、多少分、多少秒。
     public static void main(String[] args){
//	    long totalSeconds = 256995;
//
//    	 long days = totalSeconds / (24 * 3600);
//         long remainingSecondsAfterDaysd扣除天數後剩餘的秒數 = totalSeconds % (24 * 3600);
//
//         long hours = remainingSecondsAfterDays / 3600;
//         long remainingSecondsAfterHours = remainingSecondsAfterDays % 3600;
//
//         long minutes = remainingSecondsAfterHours / 60;
//         long seconds = remainingSecondsAfterHours % 60;
//
//         System.out.printf("%d秒等於： %d天  %d小時  %d分  %d秒%n", 
////        		 //不用println 是因 f 代表 Format（格式）。
////               // 它可以讓你先寫好完整的句子骨架（樣板），
//////        		 再把變數按順序填進去
//             totalSeconds, days, hours, minutes, seconds);
//                 // %d 的應用 可以不使用+號串接 自動按照後面給的數值的順序塞入
////                我下面想練習換行
//         System.out.printf("%d秒等於%n",totalSeconds);
//         System.out.printf("%d天%n", days);
//         System.out.printf("%d小時%n", hours);
//         System.out.printf("%d分%n", minutes);
//         System.out.printf("%d秒%n", seconds);
         
         long totalSeconds = 256995;
                 //1天=86400秒(24*3600)
        		 long day = totalSeconds /(24*3600);
        		 long remainingSecondsAfterDays = totalSeconds % (24*3600);
        		 //用剛剛算出來剩餘的秒數算[小時]     
//        		 long hours =remainingSecondsAfterDays/3600;
//        		 long remainingSecondsAfterHours = remainingSecondsAfterDays % 3600 ;
//        		用剩下的秒數算[分鐘]與[秒] 
//        		 long minutes = remainingSecondsAfterHours /60;
//        		 long seconds = remainingSecondsAfterHours & 60;
//        		 System.out.printf(" %d秒等於: %d天 %d時 %d分 %d秒%n ",totalSeconds,day,hours,minutes,seconds);
        		
        				 
        		
         
         
         
         
	  
     }
}
