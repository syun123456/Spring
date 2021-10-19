package com.syun.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class People {
	
	// 先通過byName找相對應bean物件，如找不到再通過byType
	//@Resource
	
	// 先通過byType找相對應bean物件，如找不到再通過byName
	@Autowired
	// @Qualifier可對應至bean id
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
