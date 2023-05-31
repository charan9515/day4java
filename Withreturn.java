package day4.a;
import java.util.Scanner;
public class Withreturn {
	
// method creation by user input
	public int ret() {
		int n1=10;
		int n2=20;
		int sum=n1+n2;
		return sum;
		
	}
	public int add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a;
		int d=b;
		int sum1=c+d;
		return sum1;
		
	}
//     main method
	public static void main(String[] args) {
		
		
		Withreturn result=new Withreturn();
	int a1=result.ret();
	System.out.println(a1);
	int a2=result.add();
	System.out.println(a2);


	}

}
