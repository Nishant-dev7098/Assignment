package com.yash.collections;

import java.util.ArrayList;

public class ProductApp {

	public static void main(String[] args) {
		ArrayList<Product> p = new ArrayList<>();
		p.add(new Product(1,"Mobile",4000));
		p.add(new Product(2,"Laptop",20000));
		p.add(new Product(3,"Car",400000));
		p.add(new Product(4,"Pencil",1000));
		
		for(Product a:p) {
			if(a.getPrice()<=3000000) {
				System.out.println("id"+a.getId()+" name "+a.getP_name()+" price "
						+a.getPrice());
			}
		}
		

	}

}
