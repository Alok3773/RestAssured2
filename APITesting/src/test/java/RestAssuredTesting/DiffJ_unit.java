package RestAssuredTesting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiffJ_unit {

	@Before 
	public void BT()
	{
		String Name = "Saksham";
		String SName = "Agrawal";
		Assert.assertEquals(SName, Name);
		System.out.println("Kaju");
		
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is my first teestcase1");
	}
	
	@After
	public void AT()
	{
		System.out.println("This is After test");
	}
}
