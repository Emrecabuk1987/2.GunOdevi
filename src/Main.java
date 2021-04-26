
public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"Olasılıksız","Adam Fawer",30);
		
		Book book2 = new Book();
		book2.id = 2;
		book2.bookname = "Deşifre!";
		book2.novelist = "Mai Jia";
		book2.unitPrice = 25;
		
		Book[] books = {book1,book2};
		
		for (Book book : books) {
			System.out.println(book.bookname);
			System.out.println(book.novelist);
			System.out.println(book.unitPrice);
		}
		
		BookManager bookManager = new BookManager();
		bookManager.addToCart(book1);
		
		bookManager.deleteToCart(book1);
		
		bookManager.addToCart(book2);
		
		bookManager.deleteToCart(book2);
		

	}

}
