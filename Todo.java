package com.rayyanshaji.rest.services.restfulwebservices.todo;

import java.util.Date;

public class Todo {
private long id;
private String username;
private String description;
private Date date;
private boolean isDone;

protected Todo() {
	
}

public Todo(long id, String username, String description, Date date, boolean isDone) {
	super();
	this.id = id;
	this.username = username;
	this.description = description;
	this.date = date;
	this.isDone = isDone;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public boolean isDone() {
	return isDone;
}
public void setDone(boolean isDone) {
	this.isDone = isDone;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Todo other = (Todo) obj;
	if (id != other.id)
		return false;
	return true;
}




}
