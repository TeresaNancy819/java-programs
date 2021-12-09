package defaultpackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list=new ArrayList<>();
		Book s=new Book("war and peace","thou tuooik",55,3999);
		Book s1=new Book("vision","unkown",66,2999);
		list.add(s);
		list.add(s1);
		for(Book e:list) {
			System.out.println("the name of the book is "+e.name +", and the author  is "+e.author+" , and the id number is  "+e.getId()+", and the price of the book is "+e.getPrice());
		}
		
		

	}

}

class Book{
	String name,author;
	int  id,price;
	public Book(String name, String author, int id, int price) {
		super();
		this.name = name;
		this.author = author;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}


