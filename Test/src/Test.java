
public class Test {
	int a =10;
	int b=20;
	static int c =30;
	static int d=40;
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.c);
		System.out.println(Test.d);
		System.out.println(c*d);
		
	}
	static void m2(){
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test.c);
		System.out.println(Test.d);
	}

	public static void main(String[] args) {
		Test t1= new Test();
		t1.m1();
		Test.m2();
		

	}

}
