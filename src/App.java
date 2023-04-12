import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("src/input.txt"); //Creation of File Descriptor for input file
      String[] words=null;    //Intialize the word Array
      int wc=0;     //Intialize word count to zero
      FileReader fr = new FileReader(f1);    //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
      String s;
      while((s=br.readLine())!=null)    //Reading Content from the file
      {
         words=s.split(" ");   //Split the word using space
         wc=wc+words.length;   //increase the word count for each word
      }
      fr.close();

      FileWriter fileWriter;
      try {
        fileWriter = new FileWriter("src/output.txt");
        // for (int i : array) {
        //     fileWriter.write(i + "\n");
        // }
        fileWriter.write(wc + "\n");
        fileWriter.close();
    } catch (IOException e) {
        System.out.println("Encountered an IOException.");
        e.printStackTrace();
    }
      System.out.println("Number of words in the file:" +wc);    //Print the word count
   }
}