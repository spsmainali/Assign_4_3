/*
Assume that class A extends class B, which extends class C. Also all the three classes implement
the method test(). How can a method in a class A invoke the test() method defined in class C
(without creating a new instance of class C).
*/

class A extends B{
	public void test(){
		System.out.println("Hello A");
		super.test();// this method invokes the method immidiate super class i.e B an invokes the method test of class B
	}
	public static void main(String[] args){
		A obj = new A();
		obj.test(); //object of current class  to call function test of current class 
		
	}
}
class B extends C {
		public void test(){
		System.out.println("Hello B");
		super.test(); //this method invokes the method immidiate super class i.e C an invokes the method test of class C Prints Hello C
	
	}
}
class C {
	public void  test(){
		System.out.println("Hello C");
	}
}