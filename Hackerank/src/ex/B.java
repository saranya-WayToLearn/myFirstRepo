package ex;

public class B {
public static void main(String[] args) {
	A a = new A();
	a.setCheck(100);
	a.setData(200);
	a.display();
	System.out.println("In main method\ndata: "+a.getData()+" Check: "+a.getCheck());
}
}
