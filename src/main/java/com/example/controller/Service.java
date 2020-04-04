package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Notification_types;
import com.example.repository.NotificationTypeRepository;

@RestController
@RequestMapping("NGW")
public class Service 
{

	
	@Autowired
	NotificationTypeRepository NotiType;
	
	@GetMapping("notificationTypes")
	public List<Notification_types> getNotificationTypes()
	{
		List<Notification_types> notiType = (List<Notification_types>) NotiType.findAll();
				
		return notiType;
		
	}
	
	@GetMapping("notificationTypes/getNotificationTypes/{id}")
	public Notification_types getAlien(@PathVariable int id){
		
		System.out.println(id);
		Notification_types nt =  NotiType.findOne(id);
		
		return nt;
	}
}
