package me.tony.school.person.contructors;

import me.tony.school.person.manager.CpfManager;

public class Person {
	
	private String name, cpf;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.cpf = CpfManager.generateCpf();
		this.age = age;
	}
	
	public Person(String name, String cpf, int age) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public int getAge() {
		return age;
	}
}
