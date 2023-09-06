package testNG;

import org.testng.annotations.Test;

public class TestNGPractice {
	@Test(invocationCount = -2)
	public void createCustomer()
	{
		System.out.println("customer created");
	}
	
	@Test(priority = -2)
	public void modifyCustomer()
	{
		System.out.println("customer modified");
	}
	

	@Test(priority = 3)
	public void DeleteCustomer()
	{
		System.out.println("customer deteled");
	}
	
	
}
