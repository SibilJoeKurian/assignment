package Request;

public class HelpRequest {
	String[] arguments;

	public HelpRequest(String[] args) {
		arguments = args;

	}

	public void displayArguments() {
		for (int i = 0; i < arguments.length; i++)
			System.out.println(arguments[i]);
	}
}
