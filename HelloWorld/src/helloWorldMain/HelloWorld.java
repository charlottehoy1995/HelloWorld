package helloWorldMain;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		printHelloWorld("Charlotte");
		
		 System.out.println(returnTypes());
		 System.out.println(parameters(2, 3, false));
		 
		 for (int x=1; x<10; x++) {
			 System.out.println(parameters(x, Array[x-1], true));
		 }
		 
	}
	
	public static void printHelloWorld(String name) { 
		String helloWorld;
		 helloWorld = "Hello World!";
				System.out.println("Hello " + name);
	}
	
	public static String returnTypes() {
		return "Hello World!";
	}
	
	public static int parameters(int a , int b, boolean parameters) {
		 if (parameters == true) {
			 return (a + b); 
			 }
		 else if (a == 0  || b == 0) {
			 return (2); 
		 }
		 else {
			 return (a * b); 
			 }
		}
	
	public static int [] Array = {1,2,3,4,5,6,7,8,9,10}; 
	
	}
