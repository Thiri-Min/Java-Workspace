public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Elsa";
		int age = 16;
		
		String name1= "John";
		int age1= 17;
		
		mySelf(name,age);
		mySelf(name1,age1);
		
		String des = "We are learning about Java from Road to Coding";
		System.out.println(rtc(des));
		
		
	}
	public static void mySelf(String name, int age){
		System.out.println("My name is "+ name);
		System.out.println("I am "+ age+ " years old!");
	}
	
	public static String rtc(String des){
		return des;
	}
}
