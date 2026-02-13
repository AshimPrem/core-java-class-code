package p1; 
import p2.A;
/*class A{
//			void m1(){								//				System.out.println("from CL outer class A " );
				}
		}*/
public class Test {
	/*static class A{
			void m1(){												System.out.println("from CL inner class A " );
				}
		}*/
	public static void main( String [] args ){
		//class A{
		//	void m1(){										//		System.out.println("from main method class A " );
		//		}
		//}
		 A a1 = new A();
		 a1.m1();
		
		}
	}