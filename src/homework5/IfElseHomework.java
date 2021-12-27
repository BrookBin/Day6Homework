package homework5;

public class IfElseHomework {

	public static void main(String[] args) {

		String colorOption = "Red";
		String color;

		if (colorOption == "Red") {
			color = "Red Color";

		} else if (colorOption == " Orange") {
			color = " Orange color";

		} else if (colorOption == "Black") {

			color = "Black color";
		} else {

			color = " Wrong color, not available";
		}

		System.out.println(color);
	}
}
