package com.thesis.ym.mapper;

import java.util.List;

import com.thesis.ym.pojo.Books;
import com.thesis.ym.pojo.Borrows;
import com.thesis.ym.pojo.Reserve;
import com.thesis.ym.pojo.Users;

public interface BooksMapper {
	// 查询所有书籍
	List<Books> getAllBooks(Books book);

	// 根据图书名称和类别查询图书的数量
	int getCount(Books book);

	// 借阅书籍信息
	Books getBook(Integer id);

	// 确认借阅书籍
	void insertBorrow(Borrows borrow);

	// 查询借阅的书籍
	List<Borrows> getBorrows(Integer uid);

	// 查询需要归还的书籍
	List<Borrows> getBacks(Integer id);

	// 申请归还
	void updateBacks(Integer id);

	// 预定信息
	void insertReserve(Reserve reserve);

	// 查询预定书籍信息
	List<Reserve> getReserveBook(Integer id);

	// 查询是否存在用户
	Users selectUser(Users user);
}
