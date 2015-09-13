// Demonstrate variable length arguments 

class VarArgs
{

    // vaTest() now userse a vararg .
    void vaTest(int ... v){
        System.out.println("Number of args: "+ v.length + "\nContents are:" ) ; 
        for (int x : v ) 
            System.out.print(x + " ") ; 
        
        System.out.println() ; 
    }

    public static void main (String [] args) {
        VarArgs obj = new VarArgs () ; 
        obj.vaTest(10) ; 
        obj.vaTest(1 ,2 ,3 ) ; 
        obj.vaTest() ; 
    }
}
