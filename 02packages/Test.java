package p2;

	// class A {
	//	public void m1(){
	//			System.out.println("hello from source file  ");
	//	}
	//}
public class Test {
	//static class A {
	//	public static void m1(){
	//			System.out.println("hello from Class level inner class ");
	//	}
	//	}
	public static void main (  String [] args ){
	 //class A {
	//	public void m1(){
	//			System.out.println("hello main ");
	//	}
	//	}
		p1.A a1 = new p1.A();
		a1.m1();
		}
}