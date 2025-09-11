package com.springboot.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.productlist.component.MyApp;
import com.springboot.productlist.component.MyComponent;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProductApplication.class, args);
		//MyComponent myComponent=new MyComponent();
		MyApp myApp=context.getBean(MyApp.class);
		myApp.run();
	}

}
