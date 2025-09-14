package com.springboot.product.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
	//field injection not best practice
	//@Autowired      
	private MyComponent myComponent;
	
	
	//constuctor injection(best practice)
	@Autowired
	public MyApp(MyComponent myComponent) {
		this.myComponent=myComponent;
	}
	public void run() {
		myComponent.getMessage();
	}
}
