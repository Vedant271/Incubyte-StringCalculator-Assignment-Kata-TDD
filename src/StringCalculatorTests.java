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
		Assert.assertThrows("Negative not allowed: [-1]",RuntimeException.class, ()->StringCalculator.add("-1"));
	}
	
	@Test
	void multiple_negatives() {
		Assert.assertThrows("Negatives not allowed: [-2, -4, -12]",RuntimeException.class, ()->StringCalculator.add("1000,-2, -12, a, -4, b"));
	}
	
	@Test
	void number_bigger_than_1000() {
		Assert.assertEquals(StringCalculator.add("1001,1,3"),4);
	}
	
	@Test
	void new_lines_between_numbers() {
		Assert.assertEquals(StringCalculator.add("1\n2,3"),6);
	}
	
}
