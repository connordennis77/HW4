import java.io.*;

/**
 * A bank check from a checkbook.
 *
 * @author Dennis Connor
 * @version 25 June 2017
 */
public class Check implements Serializable {
    // The name of the account holder/payer writing the check.
    public String accountName;
    // The series number of the check.
    public int number;
    // The person to whom the check is being written - the payee.
    public String payee;
    // The date of the check in the format "MM/DD/YYYY."
    public String date;
    // The amount of the check.
    public double amount;
    // The reason for the check - the memo.
    public String memo;
    /**
     * Create a printout of a check using the above information.  
     * Allow for different check numbers, check amounts, payees, and memos to be produced.
     */
    public Check(String name, int number, String payee, String date, double amount, String memo)
    {
        this.accountName = "Dennis Connor";
        this.number = number;
        this.payee = payee;
        this.date = date;
        this.amount = amount;
        this.memo = memo;    
    }
    
    /**
     * Retrieve the name of the check writer/payer.
     */
    public String getName()
    {
        return accountName;
    }
    
    /**
     * Set the series/check number for this check.
     */
    public void setNumber(int checkNumber)
    {
        this.number = checkNumber;
    }

    /**
     * Retrieve the series/check number for this check.
     */
    public int getNumber()
    {
        return number;
    }    
    
    /**
     * Set the name of the payee for this check.
     */
    public void setPayee(String payeeName)
    {
        this.payee = payeeName;
    }
    
    /**
     * Retrieve the name of the payee for this check.
     */
    public String getPayee()
    {
        return payee;
    }
    
    /**
     * Set the date for this check in the format "MM/DD/YYYY."
     */
    public void setDate(String checkDate)
    {
        this.date = checkDate;
    }
    
    /**
     * Retrieve the date for this check.
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Set the amount of the check.
     */
    public void setAmount(double checkAmount)
    {
        this.amount = checkAmount;
    } 
    
    /**
     * Retrieve the amount of this check.
     */
    public double getAmount()
    {
        return amount;
    }
    
    /**
     * Set the memo line for this check.
     */ 
    public void setMemo(String checkMemo)
    {
        this.memo = checkMemo;
        
    }
    
    /**
     * Retrieve the memo information for this check.
     */
    public String getMemo()
    {
        return memo;
    }
    
    /**
     * Print out a check with all details to the standard terminal.
     */
    public void printCheck()
    {
        System.out.println("###############################################################");
        System.out.println("# " + "                                               " + number);
        System.out.println("# " + "From: " + accountName);
        System.out.println("# " + "                                                 " + date);
        System.out.println("#");
        System.out.println("# " + "Pay to the order of: " + payee + "            $" + amount);
        System.out.println("#");                                          
        System.out.println("# " + "For: " + memo + "              " + "Sign:_______________");
        System.out.println("###############################################################");
    }    
}    