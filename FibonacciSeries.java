package week1.day1Task1;

public class FibonacciSeries {
	public void shortcut() {
		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum+" ");
		
		for(int i=1;i<=11;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
		System.out.println(sum+" ");
		
	}
	}

	public static void main(String[] args) {
	 FibonacciSeries series = new FibonacciSeries();
	 series.shortcut();
	}
}


