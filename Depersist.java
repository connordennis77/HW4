import java.io.*;

public class Depersist {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("connorHW4.txt"));
        Check check1 = (Check)in.readObject();
        System.out.println(check1.accountName + " " + check1.number + " " + check1.payee + " " + check1.date + " " + check1.amount + " " + check1.memo); 
        in.close();
    }
}
