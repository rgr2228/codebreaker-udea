public class ConvertRoman {
	
	public int romanToDecimal(String romanNumber) {
		int decimal = 0;
		int lastNumb = 0;
		String romanNumeral = romanNumber.toUpperCase();
		for (int i = romanNumeral.length() - 1; i >= 0; i--){
			char romanChar = romanNumeral.charAt(i);
			switch (romanChar) {
			case 'C':
				decimal = operateDecimal(100, lastNumb, decimal);
				lastNumb = 100;
				break;
			case 'L':
				decimal = operateDecimal(50, lastNumb, decimal);
				lastNumb = 50;
				break;
			case 'X':
				decimal = operateDecimal(10, lastNumb, decimal);
				lastNumb = 10;
				break;
			case 'V':
				decimal = operateDecimal(5, lastNumb, decimal);
				lastNumb = 5;
				break;
			case 'I':
				decimal = operateDecimal(1, lastNumb, decimal);
				lastNumb = 1;
				break;
			}
		}
		return decimal;
	}

	public int operateDecimal(int decimal, int lastNumber, int lastDecimal){
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}
}
