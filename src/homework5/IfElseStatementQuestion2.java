package homework5;

public class IfElseStatementQuestion2 {

	public static void main (String[] args) {
		
		char gender = 'f';
		String sex;
		
		if (gender == 'M') {
			sex = "Male";
			
		} else if (gender == 'm') {
			sex= "Male";
			
		} else if ( gender == 'F') {
			sex = "Female";
			
		} else if ( gender == 'f') {
			sex = "Female";
		} else {
			sex = "Invalid Choice";
		}
		
		System.out.println(sex);

	}
}
