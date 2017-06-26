import java.io.*;

/**
 * Write a description of class FileHW4 here.
 *
 * @author Dennis Connor
 * @version 6/25/2017
 */
public class FileCreate
{
    public static void main(String []args) throws IOException {
       File connorHW4 = new File("connorHW4.txt");
       FileWriter fileWriter = new FileWriter(connorHW4, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       
       try {
           if(connorHW4.createNewFile()) {
               System.out.println("file created");
            }else{
               System.err.println("filename already exists");   
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     
}
