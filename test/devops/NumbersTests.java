package devops;
import org.junit.*;

public class NumbersTests {
	private Numbers fizzBuzz ;
	
	@Before
	public void setup() {
		fizzBuzz = new Numbers() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", fizzBuzz.convert(-1)) ;
	}
	
	@Test
	public void Test249()
	{
		int input=249;
		String output = fizzBuzz.convert(input);
		
		Assert.assertEquals("Two Hundred Fourty Nine", output);
	}
	
	@Test
	public void Test10()
	{
		int input=10;
		String output = fizzBuzz.convert(input);
		
		Assert.assertEquals("Ten", output);
	}
	
	@Test
	public void Test88()
	{
		int input=88;
		String output = fizzBuzz.convert(input);
		
		Assert.assertEquals("Eighty Eight", output);
	}


}
