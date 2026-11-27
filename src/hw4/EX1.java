package hw4;

public class EX1 {
//寫出一隻程式能輸出此陣列
//所有元素的平均值與大於平均值的元素
//{29,100,39,41,50,8,66,77,95,15}	
	public static void main(String[] args) {
		int [] arr = {29,100,39,41,50,8,66,77,95,15};
		
		double sum = 0;
		for(int i = 0; i< arr.length;i++){
			sum=sum+arr[i];
		}
		double avg = (double) sum /arr.length;
		System.out.println("平均值是:"+avg);
		
		System.out.println("大於平均值的是元素:");
		for(int i = 0 ;i<arr.length;i++) {
			if (arr[i]>avg) {
				System.out.print(arr[i]+" ");
//				System.out.println("大於平均值的是元素:"+arr[i]);
			}
	
		}
				System.out.println();
	}		

}
