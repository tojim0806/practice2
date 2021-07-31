public class Book extends TangibleAsset{
	private String isbl;

	public Book (String name, int price, String color, String isbl){
		super(name,price,color);
		this.isbl = isbl;
	}	


	public String getIsbn (){
		System.out.println("This is a little difference")
		return this.isbn;

	}
}
