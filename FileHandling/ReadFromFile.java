import java.io.*;

class ReadFromFile
{
    public static void main(String [] args){
        try{
            File file = new File("./testing.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            try{
                String a = br.readLine() ;
                while(a != null){
                    System.out.println(a);
                    a = br.readLine();
                }
                br.close();
            }
            catch(IOException c){
                System.out.println("Error " + c);
            }
        }
        catch(FileNotFoundException f){
            System.out.println("Exception occured`");
        }
    }
}
