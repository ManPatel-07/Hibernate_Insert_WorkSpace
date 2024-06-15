package org.mm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marksheet")
public class Marksheet 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true)
	private int rollno;
	
	@Column(length = 100)
	private String name;
	
	@Column
	private int maths;
	
	@Column
	private int science;
	
	@Column
	private int english;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public Marksheet(int id, int rollno, String name, int maths, int science, int english) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public Marksheet(int rollno, String name, int maths, int science, int english) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public Marksheet() {
		super();
	}
	
}
