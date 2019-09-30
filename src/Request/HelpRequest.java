package Request;

public class HelpRequest {
	static String[] arguments;
	public static final String INVALID = "INVALID COMMAND LINE ARGUMENTS\n\n"
			+ "For information about usage type \"httpc help\"";
			
	public HelpRequest(String[] args) {
		arguments = args;
	}

	public static void helpDriver() {
		if (arguments.length == 3)
			if (arguments[2].equals("post"))
				System.out.println(
						"httpc help post\n" + "usage: httpc post [-v] [-h key:value] [-d inline-data] [-f file] URL\n"
								+ "Post executes a HTTP POST request for a given URL with inline data or from file.\n"
								+ "-v\tPrints the detail of the response such as protocol, status, and headers.\n"
								+ "-h key:value\tAssociates headers to HTTP Request with the format 'key:value'.\n"
								+ "-d string\tAssociates an inline data to the body HTTP POST request.\n"
								+ "-f file\tAssociates the content of a file to the body HTTP POST request.\n\n"
								+ "Either [-d] or [-f] can be used but not both.");
			else if (arguments[2].equals("get"))
				System.out.println("httpc help get\n" + "usage: httpc get [-v] [-h key:value] URL\n"
						+ "Get executes a HTTP GET request for a given URL.\n"
						+ "-v\tPrints the detail of the response such as protocol, status, and headers.\n"
						+ "-h key:value\tAssociates headers to HTTP Request with the format 'key:value'.");
			else
				System.out.println("INVALID COMMAND LINE ARGUMENTS\n\n");
		else if (arguments.length == 1 && arguments[1].equals("help"))
			System.out.println("httpc is a curl-like application but supports HTTP protocol only.\n"
					+ "Usage:\nhttpc command [arguments]\n" + "The commands are:\n"
					+ "get\texecutes a HTTP GET request and prints the response.\n"
					+ "post\texecutes a HTTP POST request and prints the response.\n" + "help\tprints this screen.\n\n"
					+ "Use \"httpc help [command]\" for more information about a command.");
		else
			System.out.println("INVALID COMMAND LINE ARGUMENTS\n\n");
	}

}
