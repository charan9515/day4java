package day4.a;

public class Constructor {
	private String name;
	private int age;
	
//	constructor
	public Constructor(int a,String b) {
		age=a;
		name=b;
	}
	
//	another method for getting data
	public int getAge() {
		return age;
	}
    public String nam() {
    	return name;
    }
//    main method
    
	public static void main(String[] args) {
		Constructor con=new Constructor(23,"cbit");
		Constructor con1=new Constructor(20,"charan");
		int ag=con.getAge();
		String name=con.nam();
		System.out.println(ag);
		System.out.println(name);
		System.out.println("my name is "+con1.name+" and age is "+con1.age +" ");
		

	}

}
