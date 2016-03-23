/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

/**
 *
 * @author wetteb
 */
class CheckingAccount extends Account
{
   CheckingAccount(long amount)
   {
      super("checking");
   }

   @Override
   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}