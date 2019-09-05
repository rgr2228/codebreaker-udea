import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertRomanTest {
	// I debe equivaler a 1
	@Test
	public void iEqualsToOne() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("I");//Act
		assertEquals(1, result);//Assert
	}

	// V debe equivaler a 5
	@Test
	public void vEqualsToFive() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("V");//Act
		assertEquals(5, result);//Assert
	}

	// X debe equivaler a 10
	@Test
	public void xEqualsToTen() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("X");//Act
		assertEquals(10, result);//Assert
	}

	// L debe equivaler a 50
	@Test
	public void lEqualsToFifty() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("L");//Act
		assertEquals(50, result);//Assert
	}

	// C debe equivaler a 100
	@Test
	public void cEqualsToOneHundred() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("C");//Act
		assertEquals(100, result);//Assert
	}

	// V no puede estar a la izquierda de un número más grande
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void vBeforeGreater() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("VC");//Act
		assertEquals(0, result);//Assert
	}

	// V no puede aparecer más de 1 vez
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void vTwoTimes() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("VIV");//Act
		assertEquals(0, result);//Assert
	}

	// L no puede aparecer más de 1 vez
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void lTwoTimes() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("LIL");//Act
		assertEquals(0, result);//Assert
	}

	// I sólo puede aparecer máximo 3 veces
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void iMoreThanThreeTimes() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("IIII");//Act
		assertEquals(0, result);//Assert
	}

	// I sólo puede aparecer a la izquierda de V o X
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void iBeforeLOrC() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("IL");//Act
		assertEquals(0, result);//Assert
	}

	// X sólo puede aparecer máximo 3 veces
	// Da 0 si el resultado es un número romano no válido
	@Test
	public void xMoreThanThreeTimes() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("XXXX");//Act
		assertEquals(0, result);//Assert
	}

	// Los números válidos van del 1 al 100
	// Da 0 si el resultado se sale del intervalo anterior
	@Test
	public void greaterThanOneHundred() {
		ConvertRoman convertRoman = new ConvertRoman();//Arrange
		int result = convertRoman.romanToDecimal("CI");//Act
		assertEquals(0, result);//Assert
	}
}
