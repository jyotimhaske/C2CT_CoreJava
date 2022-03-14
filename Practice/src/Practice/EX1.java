package Practice;

public class EX1 {
	public static void main(String[] args) {
		EX2 object=new EX2();
			object.add();
		EX3 object1=new EX3();
			object1.sub();
		EX4 object2=new EX4();
			object2.mod();
		
	}
	
}
class EX2  extends  EX1{
	void add(){
		System.out.println("method1");
	}
}
class EX3 extends  EX2{
	void sub(){
		System.out.println("method 2");
		
	}
}
class EX4 extends  EX1{
	void mod (){
		System.out.println("method3");
	}
}