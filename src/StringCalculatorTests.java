import java.lang.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {

	
	@Test
	void null_value() {
		Assert.assertEquals( 0 , StringCalculator.add(null) );
	}
	
	@Test
	void empty_string() {
		Assert.assertEquals(0,StringCalculator.add(""));
	}
	
	@Test
	void single_integer() {
		Assert.assertEquals(1,StringCalculator.add("1"));
	}
	
	@Test
	void multiple_integer_in_string() {
		Assert.assertEquals(4,StringCalculator.add("1,3"));
	}
	
	@Test
	void with_characters() {
		Assert.assertEquals(7,StringCalculator.add("1,2,a,c"));
	}
	
	@Test
	void negatives() {
		Throwable thrown = Assert.assertThrows(RuntimeException.class, ()->StringCalculator.add("-1"));
		Assert.assertEquals("Negatives not allowed: -1", thrown.getMessage());
	}
	
	@Test
	void multiple_negatives() {
		Throwable thrown = Assert.assertThrows(RuntimeException.class, ()->StringCalculator.add("1000,-2, -12, a, -4, b"));
		Assert.assertEquals("Negatives not allowed: -2,-12,-4",thrown.getMessage());
	}
	
	@Test
	void number_bigger_than_1000() {
		Assert.assertEquals(4,StringCalculator.add("1001,1,3"));
	}
	
	@Test
	void new_lines_between_numbers() {
		Assert.assertEquals(6,StringCalculator.add("1\n2,3"));
	}
	
	@Test
	void support_different_delimiters() {
		Assert.assertEquals(3,StringCalculator.add("//;\n1;2"));
	}
}
