import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest{
	String message = "Don't do that";	
	Divider divutil = new Divider();
	Divider2 divutil2 = new Divider2();

	@Test
	public void testDivideByZero() {
		assertNotEquals(message,divutil.divideByZero(2.0));
	}
	@Test
	public void testDivideByNegative(){
		assertNotEquals(message,divutil.divideByNegative(-2.0,-3.0));
	}
	@Test
	public void testDivideByPositive(){
			assertNotEquals(message,divutil.divideByPositive(2.0,3.0));
	}

	@Test
	public void testDivideByZero2() {
		assertNotEquals(message,divutil2.divideByZero(2.0));
	}

}