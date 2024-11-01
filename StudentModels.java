package com.example.exam_studentinfo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentModels {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int marks;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id=id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks) 
	{
		this.marks=marks;
	}
	