package ex;

public class A {
	private int data=0;
	private int check =0;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public void display() {
		System.out.println("In Display method\ndata: "+data+" Check: "+check);
	}

}
