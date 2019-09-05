import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertRomanTest {
	// I debe equivaler a 1
	@Test
	public void iEqualsToOne() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("I");
		assertEquals(1, result);
	}

	// V debe equivaler a 5
	@Test
	public void vEqualsToFive() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("V");
		assertEquals(5, result);
	}

	// X debe equivaler a 10
	@Test
	public void xEqualsToTen() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("X");
		assertEquals(10, result);
	}

	// L debe equivaler a 50
	@Test
	public void lEqualsToFifty() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("L");
		assertEquals(50, result);
	}

	// C debe equivaler a 100
	@Test
	public void cEqualsToOneHundred() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("C");
		assertEquals(100, result);
	}

	// V no puede estar a la izquierda de un número más grande
	// Da 0 si el resultado es un número no válido
	@Test
	public void vBeforeGreater() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("VC");
		assertEquals(0, result);
	}

	// V no puede aparecer más de 1 vez
	// Da 0 si el resultado es un número no válido
	@Test
	public void vTwoTimes() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("VIV");
		assertEquals(0, result);
	}

	// L no puede aparecer más de 1 vez
	// Da 0 si el resultado es un número no válido
	@Test
	public void lTwoTimes() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("LIL");
		assertEquals(0, result);
	}

	// I sólo puede aparecer máximo 3 veces
	// Da 0 si el resultado es un número no válido
	@Test
	public void iMoreThanThreeTimes() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("IIII");
		assertEquals(0, result);
	}

	// I sólo puede aparecer a la izquierda de V o X
	// Da 0 si el resultado es un número no válido
	@Test
	public void iBeforeLOrC() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("IL");
		assertEquals(0, result);
	}

	// X sólo puede aparecer máximo 3 veces
	// Da 0 si el resultado es un número no válido
	@Test
	public void xMoreThanThreeTimes() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("XXXX");
		assertEquals(0, result);
	}

	// Los números válidos van del 1 al 100
	// Da 0 si el resultado es un número no válido
	@Test
	public void greaterThanOneHundred() {
		ConvertRoman convertRoman = new ConvertRoman();
		int result = convertRoman.romanToDecimal("CI");
		assertEquals(0, result);
	}
}
