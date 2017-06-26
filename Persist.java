import java.io.*;

/**
 * Files serialized data from Check objects into "connorHW4.txt".
 *
 * @Dennis Connor
 * @version June 25, 2017
 */
public class Persist {
    public static void main(String[] args) throws IOException {
        Check check1 = new Check("Dennis Connor", 1005, "Krispy Kreme", "06/25/2017", 7800.84, "doughnuts");
        try {
            FileOutputStream connorHW4 = new FileOutputStream("connorHW4.txt", true);
            ObjectOutputStream out = new ObjectOutputStream(connorHW4);
            out.writeObject(check1);
            out.flush();
            }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("unable to serialize object");
            }
        }
    }

