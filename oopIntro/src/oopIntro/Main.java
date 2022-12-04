package oopIntro;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		// set value	
//		product1.name = "Delonghi kahve makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.imageUrl = "bilmemne.jpg";
//		product1.unitsInStock = 3;
		product1.setName("Delonghi kahve makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setImageUrl("image.jpg");
		product1.setUnitsInStock(3);
		// get
		// System.out.println(product1.name);

		Product product2 = new Product("Smeg kahve makinesi",6500,8,"imageUrl",8);
//		product2.name = "Smeg kahve makinesi";
//		product2.unitPrice = 6500;
//		product2.discount = 8;
//		product2.imageUrl = "bilmemne.jpg";
//		product2.unitsInStock = 4;
//		product2.setName("Smeg kahve makinesi");
//		product2.setUnitPrice(6500);
//		product2.setDiscount(8);
//		product2.setImageUrl("image2.jpg");
//		product2.setUnitsInStock(4);
		//System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3 = new Product();
//		product3.name = "Smeg kahve makinesi";
//		product3.unitPrice = 4500;
//		product3.discount = 10;
//		product3.imageUrl = "bilmemne.jpg";
//		product3.unitsInStock = 15;
		product3.setName("Karaca kahve makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(10);
		product3.setImageUrl("image2.jpg");
		product3.setUnitsInStock(-3);
		//array
		Product[] products= {product1,product2,product3};
//		System.out.println("<ul>");
//		for (Product product : products) {
//			System.out.println("<li>"+product.getName()+" - " +product.getUnitsInStock()+"</li>");
//		}
//		System.out.println("<ul>");
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("05354562523");
		individualCustomer.setFirstName("Oğuz");
		individualCustomer.setLastName("Altıntaş");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0535122112");
		corporateCustomer.setTaxNumber("111111");
		corporateCustomer.setCustomerNumber("22222222");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		
		System.out.println("------------");
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Ev/Bahçe");
		
		Category category3=new Category(3,"Moda");
		
		Category[] categories= {category1,category2,category3};
//		for (Category category : categories) {
//			System.out.println(category.getName());
//		}
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		IndividualCustomer ali=new IndividualCustomer();
		ali.setCustomerNumber("1234");
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.setCustomerNumber("9999");
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.setCustomerNumber("8888");
		
		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(ali);
//		customerManager.add(abc);
		Customer[] customerss= {ali,hepsiBurada,abc};
		customerManager.addMultiple(customerss);
		
	}

}
