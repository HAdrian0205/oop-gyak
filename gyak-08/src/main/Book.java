package main;

public class Book extends Product {
	java.time.LocalDate currentDate = java.time.LocalDate.now(); // mai dátum
	int year = currentDate.getYear(); //mai dátumból az év
	
	private String author;
	private String title;
	private String style;
	private final int yearOfPublication = year;
	private int price = 0;
	private int pages = 0;
	
	public Book() {
		
	}
	
	public Book (String author, String title, int price, int pages, String style) {
		super();
		this.author = author;
		this.title = title;
		this.style = style;
		if (price > 0){
			this.price = price;
		}
		if (pages > 0){
			this.pages = pages;
		}
	}
	
	public Book (String author, String title, String style) {
		super();
		this.author = author;
		this.title = title;
		this.style = style;
		this.price = 2500;
		this.pages = 100;
	}
	
	@Override
	public double calcUnitPrice() {
		return (price / pages);
	} 
	
	public static Book getLonger(Book BookA, Book BookB) {
		if (BookA.getPages() > BookB.getPages() || BookA.getPages() == BookB.getPages()) {
			return BookA;
		} else {
			return BookB;
		}
	}
	
	public boolean hasEvenPages() {
		Book konyv = new Book(author, title, price, pages, style);
		
		if (konyv.getPages() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void listBookArray(Book[] tomb) {
		for(Book bok : tomb) {
			System.out.println(bok.toString());
		}
	}
	
	public static Book getLongestBook(Book[] tomb) {
		int max = 0;
		String author = "";
		String title = "";
		String style = "";
		int price = 0; 
		int pages = 0;
		
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].pages > max) {
				max = tomb[i].pages;
			}
		}
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].pages == max) {
				author = tomb[i].author;
				title = tomb[i].title;
				price = tomb[i].price;
				pages = tomb[i].pages;
			}
		}
		
		Book konyv = new Book(author, title, price, pages, style);
		return konyv;
	}
	
	public static Book getLongestEvenPagesBook(Book[] tomb) {
		Book maxBook = null;
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i].pages % 2 == 0) {
				maxBook = tomb[i];
			}
		}
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i].pages % 2 == 0 && tomb[i].pages > maxBook.pages) {
				maxBook = tomb[i];
			}
		}
		return maxBook;
	}
	
	public static void authorStatistics(Book[] tomb) {
		int i;
		int szamlalo = 0;
		for (i = 1; i <= tomb.length; i++) {
			int seged = 0;
			Belso:
			for (int j = i-1; j != 0; j--) {
				if (tomb[i].author.equals(tomb[j].author)) {
					break Belso;
				}
				seged++;
			}
			if (seged == (i+1)) {
				szamlalo = 1;
				System.out.println(tomb[i].author);
			} 
		}
		for (i = 1; i <= tomb.length; i++) {

			Belso:
			for (int j = i-1; j != 0; j--) {
				if (tomb[i].author.equals(tomb[j].author)) {
					szamlalo++;
					break Belso;
				}
			}
		}
		System.out.println(szamlalo);
	}
	
	public static int countStyles(Book[] books) {
		int n = 0;
		
		for (int i = 0; i < books.length; i++) {
			for (int j = i; j < books.length; j++) {
				if (i!=j && !books[i].style.equals(books[j].style)) {
					n++;
				}
			}
		}
		return n;
	}
	
	public static void discountBooks(Book[] books, String style) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].style.equals(style)) {
				books[i].price -= books[i].price*0.1;
			}
		}
	}
	
	public static int listBooksWithStyle(Book[] books, String style) {
		int n = 0;
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].style.equals(style)) {
				System.out.println(books[i].toString());
				n++;
			}
		}
		return n;
	}
	
	public static int avgPrice(Book[] books, String style) {
		int n = 0;
		int sum = 0;
		double avg;
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].style.equals(style)) {
				sum += books[i].price;
				n++;
			}
		}
		avg = (double)sum/n;
		if (n == 0) {
			return 0;
		} else {
			return (int)Math.round(avg);
		}
	}
	
	/*@Override
	public void decreasePrice(int percent) {
		super.setPrice(this.price);
		if (style.equals("children")) {
			super.decreasePrice(percent+7);
		} else if (style.equals("guide")) {
			super.decreasePrice(percent+5);
		}
		price = super.getPrice();
	}*/
	
	@Override
	
	public String toString() {
		return author + ": " + title + ", Style: " + style + " Year of publication: " + yearOfPublication + ", Price: " + price + " Ft" + ", Pages: " + pages + " Unit Price: " + calcUnitPrice();
	}
	
	public static int comparePublicationDate (Book bookA, Book bookB) {
		if (bookA.getYearOfPublication() > bookB.getYearOfPublication()) {
			return 1;
		} else if (bookB.getYearOfPublication() > bookA.getYearOfPublication()) {
			return 2;
		} else {
			return 0;
		}
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages > 0) {
			this.pages = pages;
		}
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000)
			this.price = price;
		else
			this.price = 1000;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
