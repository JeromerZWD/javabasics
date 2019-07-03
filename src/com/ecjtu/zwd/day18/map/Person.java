package com.ecjtu.zwd.day18.map;

public class Person  {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*@Override
	public int compareTo(Object o) {
		Person person=(Person) o;

		int result=this.getAge()-person.getAge();

		if(result==0) {
			result=this.getName().compareTo(person.getName());
		}
		return result;
	}*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	/*@Override
	public int compareTo(Object o) {
		Person person=(Person) o;

		int result=this.getAge()-person.getAge();

		if(result==0) {
			result=this.getName().compareTo(person.getName());
		}
		return result;
	}*/
}
