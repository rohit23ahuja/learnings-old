package designpatterns.structural.bridge.demo;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {
	private Book book;

	public BookPrinter(Book book) {
		this.book = book;
	}

	@Override
	protected String getHeader() {
		return book.getGenre();
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		details.add(new Detail("Author", book.getAuthor()));
		details.add(new Detail("Price", book.getPrice()));
		details.add(new Detail("Title", book.getTitle()));
		return details;
	}

}
