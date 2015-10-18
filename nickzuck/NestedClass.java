class NestedClass
{
    int a = 1 ; 

    class Inner
    {
        int b = 2 ; 
        double c = 1.1 ; 
            
        void display(){
            System.out.println ("The elements accessible to inner class with their values are :");
            System.out.println ("a = "+ a + " b = " + b + " c = " + c);
        }
    }
    public static void main (String [] args){
        NestedClass obj = new NestedClass (); 
        obj.i.display() ; 
    }

    Inner i = new Inner () ; 
}
