package hw4;

public class EX2 {
//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
	public static void main(String[] args) {
		String s = "Helle World";
		String result = "";
			
	for(int i =s.length()-1;i>=0;i--) {
		result=result+s.charAt(i);
	}	
		System.out.println(result);
		
	}
}


