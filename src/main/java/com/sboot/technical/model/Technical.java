package com.sboot.technical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Technical {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String tName;

	public Technical(String tName) {
		this.tName = tName;
	}
	
	public Technical() {
		
	}

	@Override
	public String toString() {
		return "Clinical [id=" + id + ", cName=" + tName + "]";
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}
	
	

}
