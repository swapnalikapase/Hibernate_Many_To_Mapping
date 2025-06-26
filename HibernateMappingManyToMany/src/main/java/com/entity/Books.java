package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Books {
	@Id
	int b_id;
	String b_name;
	String b_author;
	@ManyToMany(mappedBy = "book")
    private List<Student> student;
	public Books() {
		
	}
	public Books(int b_id, String b_name, String b_author, List<Student> student) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_author = b_author;
		this.student = student;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Books [b_id=" + b_id + ", b_name=" + b_name + ", b_author=" + b_author + ", student=" + student + "]";
	}
}
