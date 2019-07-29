package me.tony.school.person;

import me.tony.school.person.contructors.Person;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Josh", 35);
		
		System.out.println(person.getName() + " has " + person.getAge() + " years old. His CPF: " + person.getCPF());
	}

}
