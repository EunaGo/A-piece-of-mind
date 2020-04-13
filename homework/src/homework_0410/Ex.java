package homework_0410;

public class Ex {

	public static void main(String[] args) {

		int fahrenheit = 100;

		float celcius = ((int) ((5.0f / 9.0f * (fahrenheit - 32.0f)) * 100+0.5) / 100f);

		System.out.println("Fahrenheit:" + fahrenheit);

		System.out.println("Celcius:" + celcius);

	}
}
