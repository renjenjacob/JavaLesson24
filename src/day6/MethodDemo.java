package day6;

/*
 * 1. Method name is a user defined name
 * but it should display the intent of performing an action
 * 2. Method may or may not return any value
 * 3. Method mayy
 */
public class MethodDemo {
		
		//1) No params and no return
		
		public void methodOne() {
			System.out.println("Hey, we are learning method!");
		}
		
		//2) No params Return value
		public String methodTwo() {
			String a = "Hello.";
			String b = " How are you?";
			return a + b;
		}
		
		//3) Accepts a param, but does not return
		public void methodThree(String name) {
			System.out.println(name + ", how are you? ");
		}
		
		public int add(int a, int b) {
			return(a + b);
		}

}
