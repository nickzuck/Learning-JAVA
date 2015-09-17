/*
    If a class include an interface but does not fully implement the method define by that interface then that class must be declared a abstract ..In the below example the class doesn't implement  callback()  so it must be declared abstract
*/

abstract class Incomplete implements Callback{
    int a , b ; 
    void show () {
        System.out.println (a + " " + b) ; 
    }
}
