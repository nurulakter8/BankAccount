package bankAccount;

import static org.junit.Assert.*;

import java.lang.constant.Constable;

import org.junit.Test;
import org.junit.Assert;

public class BankAccountTest {
	 
	public double Value = 100.00;

	@Test
	public void testWithdraw() {
		BankAccount bkAccount = new BankAccount(Value);
		bkAccount.withdraw(20.00);
		double result = bkAccount.getBalance();
		assertEquals(80.00, result,0);
	}

}
