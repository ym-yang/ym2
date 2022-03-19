package com.thesis.ym.service;

import java.util.List;

import com.thesis.ym.pojo.Books;
import com.thesis.ym.pojo.SysAdmin;
import com.thesis.ym.pojo.Users;
import com.thesis.ym.vo.Page;

public interface SysAdminService
{
	//查询所有图书
	Page getBooks(Books book);
	//增加图书
	void addBooks(Books book);
	//查询图书根据id
	Books getBookById(Integer id);
	//修改图书
	void updateBooks(Books book);
	//删除图书
	void deleteBooks(Integer id);
	//查询所有用户
	List<Users> getUsers(Users user);
	//增加用户
	void addUsers(Users user);
	//根据id查用户
	Users getUserById(Integer id);
	//修改用户
	void updateUser(Users user);
	//删除用户
	void deleteUser(Integer id);
	//查询系统管理员
	SysAdmin getSysAdmin(Users user);
	//查询用户是否存在
	int selectUsers(String code);
}
