package homework_0410;

public class Ex {
	
public static void main(String[] args) {
		
	int fahrenheit =100;
	float pi = 3.141592f;

	float celcius = (int)((5.0f/9.0f * (fahrenheit - 32.0f))*100)/100f;
	float shortpi = (int)(pi*1000)/1000f;
	System.out.println("Fahrenheit:"+fahrenheit);

	System.out.println("Celcius:" + celcius);
	
	System.out.println(shortpi);
	}

}
