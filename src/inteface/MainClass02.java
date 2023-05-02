package inteface;
class A01{
	
}
class B01 extends A01{
	public void aa() {}
	public void test() {}
}
public class MainClass02 {
public static void main(String[] args) {
	A01 a = new B01();
	B01 b = (B01)a;
	
}
}
