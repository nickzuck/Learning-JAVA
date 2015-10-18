//copy the code of class UPper and lower anc paste it here 
class Upper
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

    void getdata(){
        System.out.println("The elements of upper class have the value");
        System.out.println("a = " + a + " b = " + b + " c = " + c );
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
    
    void getdata(){
            System.out.println("The elements of lower class are:");
            System.out.println("a = " + a + " b = " + b + " c ="+ c +  " d = " +d) ; 
    }
}

class Main 
{
    public static void main (String [] args){
        Upper uppobj = new Upper() ;
        Lower lowobj = new Lower(10 , 11 , 12 , 13.41f);
        lowobj.getdata() ; 
        uppobj.getdata() ; 
    }
}
