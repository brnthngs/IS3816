/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.util.Date;

/**
 *
 * @author wetteb
 */
class Transaction
{
    private double amount;
    private Date timestamp;
    private String memo;
    private Account inAccount;
    
    public Transaction(double amount, Account inAccount)
    {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    
    public String getSummaryLine()
    {
        if (this.amount >=0)
        {
            return String.format("%s : $%.02f : %s", this.timestamp.toString(),
                    this.amount,this.memo);
        }
        else
        {
            return String.format("%s : $(%.02f) : %s", this.timestamp.toString(), 
                    -this.amount, this.memo);
        }
    }

    /**
     * @return the amount
     */
    public double getAmount()
    {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    /**
     * @return the timestamp
     */
    public Date getTimestamp()
    {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

    /**
     * @return the memo
     */
    public String getMemo()
    {
        return memo;
    }

    /**
     * @param memo the memo to set
     */
    public void setMemo(String memo)
    {
        this.memo = memo;
    }

    /**
     * @return the inAccount
     */
    public Account getInAccount()
    {
        return inAccount;
    }

    /**
     * @param inAccount the inAccount to set
     */
    public void setInAccount(Account inAccount)
    {
        this.inAccount = inAccount;
    }
}
