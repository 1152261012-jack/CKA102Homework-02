package hw1;

public class EX0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long ts = 45678910;
    		   long day = ts/(24*3600);
    		   long remainderday = ts %(24*3600);
    		   long hours = remainderday /3600;
    		   long remainderhours = remainderday % 3600;
    		   long min = remainderhours / 60 ;
    		   long sec = remainderhours % 60 ;
    		   System.out.printf(" %d秒等於: %d天 %d時 %d分 %d秒%n ",ts,day,hours,min,sec);
	}

}
