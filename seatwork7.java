class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}
}

public class Main {
	
	static void checkPassword(String password) throws PasswordException {
		if (password.length() > 10) {
		throw new PasswordException("Password must be lower than 10 characters");
		} else {
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[]args) {
		try {
			checkPassword("moskovuserpela"); 
		} catch (PasswordException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
