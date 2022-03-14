package Practice;
class shapes{
	public static void main(String[] args){
		shapes sh= new shapes();
		sh.method1();
		color ch = new color();
		ch.method2();
		size sz=new size();
		sz.method3();
		book bk = new book();
		bk.method4(); 
	}
	void method1(){
		System.out.println("method 1");
		}
}

class color extends shapes {
 
	
	void method2() {
		System.out.println("color");
		
	}
}
class size extends color{
	void method3() {
		System.out.println("size");
	}
}
class book extends shapes{
	void method4() {
		System.out.println("novel");
	}
	
}