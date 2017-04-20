package Part1programmingTwo;
import java.util.*;
import java.io.*;

class Contact{
	//properties of contact class declared private for data encapsulation
	private int id;
	private String name;
	private String phone;
	private String address;
	public Contact(){
		
		this.name=null;
		this.phone= null;
		this.address=null;
	}
	
	public Contact(int id_value,String name, String phone,String address){
		this.id= id_value;
		this.name= name;
		this.phone= phone;
		this.address= address;
	}
	
	//get data method as per requirement which returns the data
	public String getdata(){
		return String.format("ID: %d  NAME: %s  PHONE: %s  ADDRESS: %s",this.id,this.name,this.phone,this.address);
	}
}
public class ContactClass{
	public static void main(String args[])throws IOException{
		ArrayList<Contact> contact= new ArrayList();
		Contact c1= new Contact(11,"Vikrant","8572947714","75 Gardner St, Allston");
		Contact c2= new Contact(100,"John","8572947715","76 Gardner St, Boston");
		Contact c3= new Contact(113,"Sam","8572947717","77 Gardner St, California");
		
		contact.add(c1);
		contact.add(c2);
		contact.add(c3);
		
		Iterator<Contact> i = contact.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next().getdata());
		}
	}
}

