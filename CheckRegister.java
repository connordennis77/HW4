/**
 * A check register for a checking account. 
 * This register will only accept debits, not credits.
 * This register will only contain up to 50 checks.
 * The register will maintain a running balance.
 * 
 * @author Dennis Connor
 * @version 5 June 2017
 */
public class CheckRegister
{
    // The running balance of the account.
    private double balance;
    // Creates a list of checks from objects of class Check.
    private Check[] checks;
    /**
     * Create a check register for this checking account. 
     */
    public CheckRegister()
    {
        balance = 0;
        checks = new Check[50];
    }
    
    /**
     * Add a check to this check register.
     */
    public void registerCheck(Check newCheck)
    {
            checks.add(newCheck);
    }
    
    /**
     * Calculate the running balance of the check register.
     */
    public void calculateBalance(int amount)
    {
        balance = balance + amount;
    }
    
}


