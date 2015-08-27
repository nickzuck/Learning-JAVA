class A
{
	int x ; 
	int y ;
	
	void show (){
		System.out.println("IN class A ") ;
	} 

	A(){
		x = y = 1 ;
		System.out.println("IN constructor of A ") ;
	}
	A(int x , int y){
		this.x = x ; 
		this.y = y ;
		System.out.println("In the parametrerized constructor of A");
	}

}

class B extends A
{
	int z ; 
	void display () {
		System.out.println("In class b") ;
	}

	B(){
		z = 10 ;
		System.out.println("In constructor of B") ;
	}

	B(int m , int  n , int p){
		super(m,n);
		z = p ;
		System.out.println("In the parameterized constructor of B");
	}
}


class C extends B
{
	int p ; 
	C(){
		p = 20 ;
		System.out.println("In the constructor of C") ;
	}
	C(int a , int b , int c , int d){
		super (a , b ,c) ;
		p = d ;
		System.out.println("In the parameterized constructor of C");
	}
}


class D 
{
	public static void main (String [] args )
	{
		C c1 = new C() ;
		C c2 = new C(99 , 98 , 97 , 96) ;
	}
}
