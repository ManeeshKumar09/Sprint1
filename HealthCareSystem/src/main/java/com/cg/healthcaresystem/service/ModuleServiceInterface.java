package com.cg.healthcaresystem.service;

import java.util.List;

import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.exception.UserDetailException;

public interface ModuleServiceInterface 
{
	abstract List<UserDto> displayUserService();
	abstract String addUserService(UserDto userObject) throws UserDetailException;

}
