package day4.a;
import java.util.Scanner;
public class Withparameters {
	
	   public void pri(String name,int num) {
		   System.out.println(name+" is "+num+" old");
		   
	   }
		   public void scc(int a,int b){
		   int c=a+b;
		   System.out.println(c);
		   
		   
	   }
//main method
	public static void main(String[] args) {
		 Withparameters ret=new Withparameters();
		 Scanner sc=new Scanner(System.in);
		 ret.pri("CBIT PRODDATUR",20);
		 System.out.println("enter two numbers:");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		ret.scc(a,b);

	}

}
