package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Notification_types;

public interface NotificationTypeRepository extends CrudRepository<Notification_types, Integer> {

}
