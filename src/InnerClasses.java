
/*Inner class
 * java inner classes or nested classes is that classes that declared inside the class
 * and if you want to call that inner class so you have to call first outer class then you can call it.
 * 
 * Additionally, it can access all the members of the outer class,
 *  including private data members and methods.
 * 
 * */





class A
{
	  protected static class OnlySubtypesCanSeeMe {
	    }
	  private static class Inner {
	    }
class B
{
public void InnerB()
{
	
System.out.println("its an inner class ");	
}
public void printsomething (String str)
{
System.out.println("Inner Class method"+str);	
}

}
public void printsomething (String msg)
{
System.out.println("Outer Class method"+msg);


}
}



public class InnerClasses {

	public static void main(String[] args)
	{
		System.out.println("Innerclasses");
		
		A a= new A();
		a.printsomething("Message for Outer Class");
		
		A.B b= a.new B();
		b.InnerB();
		b.printsomething( "Message for Inner class");
		



	}

}
