abstract class Demo
{
    int a  ;
    float b ;
    void callme(){
        System.out.println("Call mee of Demo Class");
    }
    
}

class Subclass extends Demo
{
    float c ;
    void callme(){
        System.out.println("Subclass");
    }
}

class MainClass
{
    
    public static void main(String [] args){
        Subclass obj = new Subclass();
        obj.callme();    
    }
}
