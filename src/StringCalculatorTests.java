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
	
}
