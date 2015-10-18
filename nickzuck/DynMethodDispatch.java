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
}

class Lower extends Upper 
{
   int d ; 
    Lower(){
        d = 6 ; 
    } 
    Lower (int a , int b , int c , float d){
        super  (a , b , d); 
        d = c ; 
    }
    
    void display(){
        System.out.println("You are in display of lower class");
    }
    
}

class Main 
{
    public static void main(String args []){
        Lower lowobj = new Lower() ; 
        Upper ref ; 
        Upper uppobj = new Upper() ;
        ref = new Lower();
        lowobj.display() ; 
        uppobj.display() ;
        System.out.println ("With reference to lower class");
        ref.display() ; 
        System.out.println("With reference to Upper class");
        ref = new Upper() ; 
        ref.display() ;
        
    }
}

