package inteface;
/*
 up casting()
 - 부모 형태로 변환하는 것
 down casting
 - 부모 -> 자기자신으로 형 변환하는 것
 */
class Parents{
	public void familyNmae() {
		System.out.print("이 ");
	}
	public void name() {
		familyNmae();
		System.out.println("순신");
	}
}
class Daugther extends Parents{
	public void name() {
		familyNmae();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyNmae();
		System.out.println("기광");
	}
}
public class MainClass01 {
public static void main(String[] args) {
	Parents par = new Parents();
	par.name();
	par = new Daugther();
	par.name();
	par = new Son();
	par.name();
	
//	Parents par = new Parents();
//	par.name();
//	
//	Daugther dau = new Daugther();
//	dau.name();
//	
//	Son son = new Son();
//	son.name();
}
}
