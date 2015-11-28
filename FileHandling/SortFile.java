import java.io.* ; 
import java.util.Arrays;

class SortFile
{
    public static void main (String [] args){
        try{
            //opening the file
            File file = new File("./firstInput.txt");
            //let's read the file
            BufferedReader br = new BufferedReader(new FileReader(file));
            int array[] = new int[100];
            //int array[] ;
            try{
                String temp = br.readLine();
                int i = 0 ; 
                while(temp != null){
                    array[i] = Integer.parseInt(temp);
                    i++ ; 
                
                //Sort the array
                Arrays.sort(array) ; 
            }
            catch(IOException e){
                System.out.println("Exception " + e);
            } 
        
            //TIme for some priting action`
        }
        catch(FileNotFoundException f){
            System.out.println("Exception : " + f);
        }
    }
}
