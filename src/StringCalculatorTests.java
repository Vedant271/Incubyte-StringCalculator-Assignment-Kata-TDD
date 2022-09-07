import java.lang.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {

	@Test
	void empty_string() {
		Assert.assertEquals(StringCalculator.add(""),0);
	}
	
	@Test
	void single_integer() {
		Assert.assertEquals(StringCalculator.add("1"),1);
	}
	
	@Test
	void multiple_integer_in_string() {
		Assert.assertEquals(StringCalculator.add("1,3"),4);
	}
	
	@Test
	void with_characters() {
		Assert.assertEquals(StringCalculator.add("1,2,a,c"),7);
	}
	
	@Test
	void negatives() {
		Assert.assertThrows("Negative not allowed -1",ArithmeticException.class, ()->StringCalculator.add("-1"));
	}
	
	@Test
	void multiple_negatives() {
		Assert.assertThrows("Negative not allowed -12",ArithmeticException.class, ()->StringCalculator.add("1000,-12, a, b"));
	}
	
	@Test
	void number_bigger_than_1000() {
		Assert.assertEquals(StringCalculator.add("1001,1,3"),4);
	}
	
}
