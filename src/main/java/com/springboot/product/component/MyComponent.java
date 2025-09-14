package com.springboot.product.component;

import org.springframework.stereotype.Component;

import lombok.Data;

//@Component
@Data
public class MyComponent {
	
	public MyComponent(){
		System.out.println("----Result for my component----");
	}
	public void getMessage() {
		System.out.println("----Result from getmessage-----");
	}
}
