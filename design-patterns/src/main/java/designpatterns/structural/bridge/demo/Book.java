package designpatterns.structural.bridge.demo;

public class Book {
	private String genre;
	private String title;
	private String author;
	private String price;
	private String pages;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public Book(String genre, String title, String author, String price, String pages) {
		super();
		this.genre = genre;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

}
