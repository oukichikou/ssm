package model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Type implements TypeInterface {
	private int id;
	private String name;
	public Type() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		System.out.println(111);
	}
	
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
