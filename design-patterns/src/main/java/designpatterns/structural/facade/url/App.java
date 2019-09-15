package designpatterns.structural.facade.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

//the below example shows Decorator pattern as well. Input Stream inside of a buffered reader.
// Also url class shows facade pattern. it handles all the things like opening a url, opening/closing connections, handling streams but exposes only few methods.
public class App {

	public static void main(String[] args) throws IOException {
		// URL url = new URL("http", "www.google.com", 80,
		// "/author/rohitahuja");
		URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
	}

}
