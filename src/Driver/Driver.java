package Driver;

import Request.GetRequest;
import Request.HelpRequest;
import Request.PostRequest;

public class Driver {
	public static void main(String[] args) {
		if (args.length > 1)
			switch (args[1]) {
			case "get":
				GetRequest get = new GetRequest(args);
				break;
			case "post":
				PostRequest post = new PostRequest(args);
				break;
			case "help":
				HelpRequest help = new HelpRequest(args);
				help.helpDriver();
				break;
			default:
				System.out.println(HelpRequest.INVALID);
				break;
			}
		else
			System.out.println(HelpRequest.INVALID);
	}
}
