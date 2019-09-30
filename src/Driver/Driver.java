package Driver;


import Request.GetRequest;
import Request.HelpRequest;
import Request.PostRequest;

public class Driver {
	public static void main(String[] args) {
		System.out.println(args[1]);
		String request = args[1];
		switch (request) {
		case "get":
			GetRequest get = new GetRequest(args);
			break;
		case "post":
			PostRequest post=new PostRequest(args);
			break;
		case "help":
			HelpRequest help=new HelpRequest(args);
		}
	}
}
