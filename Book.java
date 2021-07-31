public class Book extends TangibleAsset{
	private String isbn;

	public Book (String name, int price, String color, String isbl){
		super(name,price,color);
		this.isbn = isbn;
	}	


	public String getIsbn (){
		System.out.println("This is a little difference")
		return this.isbn;

	}
}
