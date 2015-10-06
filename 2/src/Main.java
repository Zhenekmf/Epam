import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Start value:");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		System.out.println("End value:");
		float b=sc.nextFloat();
		System.out.println("Step:");
		float h=sc.nextFloat();
		sc.close();
		
		while(a<=b)
		{  
			System.out.println("x="+a+"  f(x)="+Math.tan(a));
			a+=h;
		}
		

	}

	

}
