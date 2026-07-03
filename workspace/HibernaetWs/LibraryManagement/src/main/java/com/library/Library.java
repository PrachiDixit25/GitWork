package com.library;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Library")
public class Library {
	@Id
	int bookid;
	@Column
	String bname;
	boolean availability;
	String author;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Library [bookid=" + bookid + ", bname=" + bname + ", availability=" + availability + ", author="
				+ author + "]";
	}
	public Library(int bookid, String bname, boolean availability, String author) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.availability = availability;
		this.author = author;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
