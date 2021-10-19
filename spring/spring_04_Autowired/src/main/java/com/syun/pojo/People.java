package com.syun.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class People {
	
	// ���q�LbyName��۹���bean����A�p�䤣��A�q�LbyType
	//@Resource
	
	// ���q�LbyType��۹���bean����A�p�䤣��A�q�LbyName
	@Autowired
	// @Qualifier�i������bean id
	@Qualifier(value="dog2")
	private Dog dog;
	@Autowired
	private Cat cat;
	@Value("Syun")
	private String name;
	
	public People() {
		
	}
	
	public People(Dog dog, Cat cat, String name) {
		super();
		this.dog = dog;
		this.cat = cat;
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "People [dog=" + dog + ", cat=" + cat + ", name=" + name + "]";
	}
	
}
