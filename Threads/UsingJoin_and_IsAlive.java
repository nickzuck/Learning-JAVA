class NewThread extends Thread{
    String name ; 
    Thread t  ; 
    
    NewThread(String threadname){
        super(threadname);
        name = threadname ;
        t = this ;
        System.out.println("New Thread: " + name);
        start() ; 
    }

    public void run(){
        try{
            for(int i = 5 ; i>0 ;i--){
                System.out.println(name + " : " + i);
            }
        }
        catch(Exception e){
            System.out.println(name + "interrupted");
        }
    
        System.out.println(name + "exiting");
    }
}

class MainClass{
    public static void main(String args[]){
        //Initializing the new Threads
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        NewThread obj3 = new NewThread("Three");

        //Checking the status of all the threads 
        System.out.println("obj1.t.isAlive(): " + obj1.t.isAlive());
        System.out.println("obj2.t.isAlive(): " + obj2.t.isAlive());
        System.out.println("0bj3.t.isAlive(): " + obj3.t.isAlive());

        //Wait for the thread to finish
        try{
            System.out.println("Waiting for threads to finish...");
            obj1.t.join() ; 
            obj2.t.join() ; 
            obj3.t.join() ;
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        
        System.out.println("Status check of all threads again");
        //Checking the status of all the threads again
        System.out.println("obj1.t.isAlive(): " + obj1.t.isAlive());
        System.out.println("obj2.t.isAlive(): " + obj2.t.isAlive());
        System.out.println("0bj3.t.isAlive(): " + obj3.t.isAlive());
        
        //Exiting the main thread
        System.out.println("Main Thread Exiting");
    }
}
