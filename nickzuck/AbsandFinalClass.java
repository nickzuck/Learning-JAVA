abstract class Upper
{
    int a , b ;
    float c ;
    Upper(){
        a = 0 ; 
        b =1 ; 
        c = 2 ; 
    }     

    Upper (int a  , int b , float c )
    {   
        this.a = a ; 
        this.b = b ;
        this.c = c ; 
    }
    
    void display(){
        System.out.println ("You are in display of upper class");
    }
}

class Lower extends Upper 
{
   int d ; 
    Lower(){
        d = 6 ; 
    } 
    Lower (int a , int b , int c , float d){
        super  (a , b , d); 
        this.d = c ; 
    }
    
    void display(){
        System.out.println("You are in display of lower class");
    }
    
}

final class FinalClass
{
    int a , b ; 
    FinalClass(){
        System.out.println("Creating the object of final class.this class can't be inherited");
        a = 2 ; 
        b = 4 ;
    }
    void display(){
        System.out.println("In the display of final class");
        System.out.println("The elements a and b has value "+a +" "+b);
    }
}

 
class Main 
{
    public static void main (String [] args){
        //Upper uppclass  = Upper () ;
        Lower lowclass = new Lower () ; 
        lowclass.display() ; 
        //uppclass.display() ; 
        FinalClass finclass =new FinalClass() ; 
        finclass.display() ;
    }
}
