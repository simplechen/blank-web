package com.yourdomain.po;

import java.io.Serializable;

public class User implements Serializable {  
	private static final long serialVersionUID = 8682789025463943721L;
	private Long id;  
    private String name;  
    //省略getter/setter等  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
} 
