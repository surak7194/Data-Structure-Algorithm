public class Book
{
   private int bookId;
   private String bookName;
   private String authorName;
   private int price;
   
   public Book()
   {
	   this.bookId=0;
	   this.bookName="null";
	   this.authorName="null";
	   this.price=0;
   }
   
   public Book(int id, String bookName, String authorName, int price)
   {
	   this.bookId=id;
	   this.bookName=bookName;
	   this.authorName=authorName;
	   this.price=price;  
   }
   
   public String toString()
   {
	   String str="\nBook id="+this.bookId + "\nBook name="
   +this.bookName+"\nAuthor="+this.authorName+"\nPrice="+this.price+"\n\n";
	   return str;
   }

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
   
   
   
}