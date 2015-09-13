class StaticAndFinal
{
    static int a  = 0 ; 
    final int INITIAL = 20 ; 
    
    int x ; 

    StaticAndFinal(){
        a ++ ; 
        x = INITIAL; 
    }

    StaticAndFinal(int b) {
        a++;
        x = b ; 
    }

    public static void main (String [] args ) 
    {
        System.out.println("No of objects "+ a) ; 
        StaticAndFinal a1 = new StaticAndFinal() ; 
        System.out.println("No of objects " + a) ; 
        System.out.println("Value of object variable " + a1.x) ; 
        
        StaticAndFinal a2 = new StaticAndFinal(10) ; 
        System.out.println("No of objects " + a) ; 
        System.out.println("Value of object variable " + a1.x) ; 
       
    }
    
}

