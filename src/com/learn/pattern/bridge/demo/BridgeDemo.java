package com.learn.pattern.bridge.demo;

public class BridgeDemo {

	public static void main(String[] args) {

		Movie movie = new Movie("Action", "2:15", "John Wick", "2004");
		
		Formatter formatter = new PrintFormatter();
		Printer printer = new MoviePrinter(movie);
		String printMaterial = printer.print(formatter);
		System.out.println(printMaterial);
		
		Formatter htmlFormatter = new HtmlFormatter();
		String htmlMaterial = printer.print(htmlFormatter);
		System.out.println(htmlMaterial);
		
		Book book = new Book("Fiction", "Homo Sapiens", "Yugo Harari", "400", "643");
		Printer printer2 = new BookPrinter(book);
		
		String bookPrint = printer2.print(formatter);
		System.out.println(bookPrint);
		
	}

}
