package day4.a;
import java.util.Scanner;
public class Bothparandret {
	public int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bothparandret ccc=new Bothparandret();
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=ccc.sub(a, b);
        System.out.println(res);
	}

}
