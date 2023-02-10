import java.util.Scanner;

/*Main OOP Concept:
 * 
 * 1. class - It is a group of different type of variables & function. It is a collection of objects.
 * 2. Object - Instance of class.
 * 3. Inheritance : The object of one class aquir the properties of object of another class is called inheritance.
 * or Creating a new class from an existing class is called inheritance.
 * Types Of Inheritance : 
 * 	1.Single
 * 	2.Multilevel
 * 	3.Multiple - Not Supported
 * 	4.Hierarchie
 * 	5.Hybrid - Not SUpported
 * 4.Polymorphisam - One name multiple form
 * 
 * 		1. Compile Time(Method Overloading) - When there is a more than one method in a single class having the same name
 * 			but with different number of arguments and their data types,then it is called method overloading.
 * 		2. Run Time(Method Overriding) - When there is a same method prototype in your both base class & derived class,
 * 			and if you call that method using the object of derived class then only derived class method will be called
 * 			so you can say that method of derived class overrides the method of base class.
 * 5. Abstraction : Data hiding
 * 6. Encapsulation : To bind a data and code in toa single unit is called encapsulation.
 * 
 * */
class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void getA()
	{
		System.out.print("Enter A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	Scanner sc=new Scanner(System.in);
	void getB()
	{
		System.out.print("Enter B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C extends A
{
	int c;
	Scanner sc=new Scanner(System.in);
	void getC()
	{
		System.out.print("Enter C:");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		b1.getA();
		b1.getB();
		c1.getC();
		c1.putA();
		b1.putB();
		c1.putC();
	}
}
