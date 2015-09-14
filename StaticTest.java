class StaticTest
{
    static {
        System.out.println("we are printing this from static without main");
        System.out.println("Actually you can't do anything without main method int  the program ...It compiles successfully but doesn't run");
        System.out.println("Static block is accessed first..Although main is also static so we must take care of the order in which the static blocks appear") ; 
    }
    public static void main (String [] args) {
        
    }
}
