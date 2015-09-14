class Wrapper 
{

        int i = 10 ; 
        char c = 'a'; 
        boolean b = true ; 
        double d = 20.32 ; 
        float f = 12.3f ; 
        long l = 132 ; 
        short s = 3 ;
        byte byt = 3; 
        
    public static void main (String[] args){
        Wrapper object = new Wrapper() ; 
        object.print();
        UnboxingError test= new UnboxingError() ; 
        test.function () ; 
    }
    void print(){
        System.out.println("Integer = " + i ) ; 
        System.out.println("Character = " + c );
        System.out.println("Boolean = " + b);
        System.out.println("Double = " + d );
        System.out.println("Float = " + f); 
        System.out.println("Long = " + l);
        System.out.println("Short = "+ s);        
        System.out.println("Byte = "+ byt);
        Character ch = new Character(c) ; 
        System.out.println ("\nWrapper Objects\n"); 
        System.out.println (ch) ;
        System.out.println(ch.charValue()) ;
    } 
}

class UnboxingError
{
    void function () {
        Integer iob = 1002; 
        int i = iob.byteValue() ; 
        System.out.println (i); 
    }
}
