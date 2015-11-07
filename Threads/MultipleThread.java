class NewThread implements Runnable {
    String name ; 
    Thread t ;
    
    NewThread(String threadname){
        name = threadname ; 
        t = new Thread(this , name);
        System.out.println("New Thread :" + t ); 
        t.start() ;
    }
    
    public void run (){
        try{
            for (int i = 5 ; i>0 ; i--){
                System.out.println(name + ":"+ i) ;
            }
        }
        catch (Exception e){
            System.out.println(name + "Interrupted"); 
        }

        System.out.println(name + " exiting ") ;
    }
}


class MultipleThread {
    public static void main (String []args){
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        
        System.out.println("Main Thread Exiting");
    }
}
