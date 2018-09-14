package spring.ioc.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String street;
	private int zip;
	
	
	public Address(String street, int zip) {
		
		
		this.street = street;
		this.zip = zip;
		
		System.out.println("address class in default");
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + "]";
	}
	
}
