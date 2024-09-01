package Approach4_programming;


public class MainClassBook {
	public static void usage(Book book)
	{
		book.Display();
	}
	public static void main(String[]args)
	{
		usage(new Book("The Adventure", "John Smith", 270, "Non-fiction", 12347));
	}


}
