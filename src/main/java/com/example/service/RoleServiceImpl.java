package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Role;
import com.example.repository.RoleRepository;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
    private RoleRepository roleRepository;
	
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role findByRole(String role) {
		// TODO Auto-generated method stub
		Role userRole = roleRepository.findByRole(role);
		return userRole;
	}

}
