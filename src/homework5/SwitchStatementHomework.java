package homework5;

public class SwitchStatementHomework {

	public static void main(String[] args) {

		String colorOption = "Pink";
		String color;

		switch (colorOption) {

		case "Red":
			color = "Red color";
			break;

		case "Orange":
			color = "Orange color";
			break;
		case "Black":
			color = "Black color";
			break;
		default:
			color = "Wrong color, not availabe";
			break;
		}

		System.out.println(color);
	}

}
