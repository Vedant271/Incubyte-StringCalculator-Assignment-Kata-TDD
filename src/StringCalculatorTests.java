import java.lang.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {

	@Test
	void empty_string() {
		Assert.assertEquals(StringCalculator.add(""),0);
	}
	
}
