import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertRomanTest {

	@Test
	public void equalFive() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("vi");
		assertEquals(6,result);
	}
	
}
