package homework5;

public class SwitchStatementQuestion3 {

	public static void main(String[] arg) {

		int number = 8;
		number = number % 2;

		switch (number) {

		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("ODD");
			break;
		}
	}
}
