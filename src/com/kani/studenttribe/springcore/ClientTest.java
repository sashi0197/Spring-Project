package com.kani.studenttribe.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientTest {

	public static void main(String[] args) { //1.
		                                                 //2
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ProductServiceImpl productService1=new ProductServiceImpl();
		                            
	ProductService ps1=(ProductService)factory.getBean("productService1"); //3
		   //9
		ps1.allProducts();
		
		//11
		ProductService ps2=(ProductService)factory.getBean("productService2");
		
		//17
		ps2.allProducts();
		
		ProductService ps3 = (ProductService)factory.getBean("productServic3");
		ps3.allProducts();
		
		
				
	}  //19
} //20
