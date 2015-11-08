import java.io.*;

class WriteToFile
{
    public static void main (String [] args){
        File file = new File("./testing.txt");
        boolean flag = false ;
        //PrintWriter pw = new PrintWriter(f1); // true for auto-flush
        try{
            PrintWriter pw = new PrintWriter(file); // true for auto-flush
            flag = true ;

        if(flag == true){
            pw.println("Line1");
            pw.println("Line2");
            pw.println("Line3");
            pw.close();
        }
        }
        catch(FileNotFoundException f){
            System.out.println("File can't be found");
            flag = false;
        }

    }
}
