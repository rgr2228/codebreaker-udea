public class ConvertRoman {
	int one;
	int five;
	int ten;
	int fifty;
	
	public int romanToDecimal(String romanNumber) {
		int decimal = 0;
		int lastNumb = 0;
		one=0;
		five=0;
		ten=0;
		fifty = 0;
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
				fifty= fifty + 1;
				if(fifty>1){
					return 0;
				}
				break;
			case 'X':
				decimal = operateDecimal(10, lastNumb, decimal);
				lastNumb = 10;
				ten= ten + 1;
				if(ten>3){
					return 0;
				}
				break;
			case 'V':
				if(lastNumb==100 || lastNumb==50 ||lastNumb==10){
					return 0;
				}
				else {
					decimal = operateDecimal(5, lastNumb, decimal);
					lastNumb = 5;
					five= five + 1;
					if(five>1){
						return 0;
					}
				}
				break;
			case 'I':
				if(lastNumb==100 || lastNumb==50){
					return 0;
				}
				else
				{
					decimal = operateDecimal(1, lastNumb, decimal);
					lastNumb = 1;
					one= one + 1;
					if(one>3) {
						return 0;
					}
				}
				break;
			}
		}
		if(decimal>100) {
			return 0;
		}
		else {
			return decimal;
		}
	}

	public int operateDecimal(int decimal, int lastNumber, int lastDecimal){
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}
}
