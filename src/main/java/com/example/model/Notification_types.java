package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Notification_types")
public class Notification_types 
{
	@Id
	private int notification_type_id;
	private String name;
	private String description;
	
	public int getNotification_type_id() {
		return notification_type_id;
	}
	public void setNotification_type_id(int notification_type_id) {
		this.notification_type_id = notification_type_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
