//Implementing thread by using Thread class

/*
    Implementation of threads using the Thread class can be achieved by overriding the run()  method of the Thread class which acts as the entry point for the new thread, 
    It must call start() to begin execution of the new thread
*/


class ExtendingThreadClass extends Thread
{
    ExtendingThreadClass(){
        super("Demo Thread") ; //calls the thread constructor which is of the form "public Thread (String threadname)"
        System.out.println("New Thread " + this);
        start();
    }   

    public void run(){
        try{
            for(int i= 0 ;i<5 ;i++){
                System.out.println("Demo thread counter" + i);  
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(this +"interrupted");
        }
        System.out.println("Exiting" + this);
    }
}

class MainClass
{
    public static void main (String [] args){
        new ExtendingThreadClass() ; //create a new thread
        try{
            for(int i= 0; i<5 ;i++){
                System.out.println("Main Thread  counter" + i);
                Thread.sleep(1000); 
            }
        }
    
        catch(InterruptedException  e){
            System.out.println("Main thread interrupted") ;
        }
        System.out.println("Exiting Main Thread");
    }
}
