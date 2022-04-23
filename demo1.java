public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Thiri";
		int age = 27;
		mySelf(name, age);
		
		String des = "You can learn about Java from Road To Coding";
		System.out.println(rtc(des));
		
	}
		public static void mySelf(String name, int age){
			System.out.println("My name is "+ name);
			System.out.println("I'm "+ age + " years old!");
		}
		
		public static String rtc(String des){
			return des;
			
			
		}
}
