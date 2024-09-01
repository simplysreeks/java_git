package Approach2_programming_Readability_v2;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookGenre;
	private int bookId;
	
	public void provideBookDetails(String bookTitle,String bookAuthor,int bookPrice, String bookGenre,int bookId)
	{
		if(validateBookTitle(bookTitle)==1) {
			this.bookTitle=bookTitle;
			
		}
		else {
			System.err.println("Invalid Book Title");
		}
		if(validateBookAuthor(bookAuthor)==1) {
			this.bookAuthor=bookAuthor;
		}
		else {
			System.err.println("Invalid Book Author");
		}
		if(validateBookPrice( bookPrice)==1) {
			this.bookPrice=bookPrice;
		}
		else {
			System.err.println("Invalid Book Price");
		}
		if(validateBookGenre(bookGenre)==1 ) {
			this.bookGenre=bookGenre;
		}
		else {
			System.err.println("Invalid Book Genre");
		}
		if(validateBookId(bookId)==1) {
			this.bookId=bookId;
		}
		else {
			System.err.println("Invalid book id");
		}
		
	
	}
	public int validateBookTitle(String bookTitle) {
		 for (int i = 0; i < bookTitle.length(); i++) {
             char ch = bookTitle.charAt(i);
             if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                 return 1;
             }
         }
         return 0;
     }
		
		
		
	public int validateBookAuthor(String bookAuthor) {
	    if (bookAuthor == null ) {
	        return 0; // Invalid: Null or no comma
	    }

	    String[] parts = bookAuthor.split(" ");
	    if (parts.length != 2 || parts[0].trim().isEmpty() || parts[1].trim().isEmpty()) {
	        return 0; // Invalid: Not exactly two parts or one part is empty
	    }

	    return 1; // Valid
	}

	public int validateBookPrice(int bookPrice) {
		if(bookPrice>=250 && bookPrice<=350) {
			
		
		return 1;
		}
		else
		return 0;
		
	}
	public int validateBookGenre(String bookGenre) {
		if(bookGenre.equals("Biography") || bookGenre.equals("Autobiography") || bookGenre.equals("self help books")|| bookGenre.equals("Marketing") || bookGenre.equals("Non-fiction")) {
			return 1;
		}
		
		return 0;
		
	}
	public int validateBookId(int bookId) {
		 String bookIdStr = String.valueOf(bookId);
		if(bookIdStr.length()==5)
		{
			int temp=bookId%10;
			if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {
		        return 1;
		    }
			
		}return 0;
	}
	public void Display() {
		System.out.println("Book Title : "+bookTitle);
		System.out.println("Book Author : "+bookAuthor);
		System.out.println("Book  Price: "+bookPrice);
		System.out.println("Book Genre : "+bookGenre);
		System.out.println("Book id : "+bookId);
		
	}
	
	
	
	
	
	

}
