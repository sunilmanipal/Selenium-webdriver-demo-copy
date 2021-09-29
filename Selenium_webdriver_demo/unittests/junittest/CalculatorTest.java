package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	
  @BeforeClass
   public static void setup() throws Exception{
	   System.out.println("Before Class");
   }

  @AfterClass
  public static void after() throws Exception{
	   System.out.println("After Class");
  }
	
	
	@Before
	public void setup1(){
		calc = new Calculator();
		
		System.out.println("Before");
	}
	
	@Ignore
	@Test
	public void testAdd() {
		assertEquals(3, calc.add(2, 1));
		System.out.println("TEstAdd");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddNegative() {
		assertEquals(3, calc.add(2, 1));
	}
	
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(2, 3));
		System.out.println("TEstMul");
		
	}
	
	@After
	public void tearDown(){
		calc = null;
		System.out.println("After");
	}
}
