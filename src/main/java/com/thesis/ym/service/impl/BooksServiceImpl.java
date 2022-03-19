package com.thesis.ym.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thesis.ym.constant.PageConstant;
import com.thesis.ym.mapper.BooksMapper;
import com.thesis.ym.pojo.Books;
import com.thesis.ym.pojo.Borrows;
import com.thesis.ym.pojo.Reserve;
import com.thesis.ym.pojo.Users;
import com.thesis.ym.service.BooksService;
import com.thesis.ym.vo.Page;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class BooksServiceImpl implements BooksService {
	@Autowired
	private BooksMapper booksMapper;

	@Override
	public Page getAllBooks(Books book) {
		// 开始
		Page page = new Page();
		if (book.getCurrentPage() == 0) {
			book.setCurrentPage(PageConstant.PAGE_NUM);
		}
		int start = (book.getCurrentPage() - 1) * PageConstant.PAGE_SIZE;
		book.setStart(start);
		// List集合
		List<Books> list = booksMapper.getAllBooks(book);
		page.setList(list);
		int count = booksMapper.getCount(book);
		int counPage = count / PageConstant.PAGE_SIZE;
		if (count % PageConstant.PAGE_SIZE != 0) {
			counPage++;
		}
		// 总页数
		page.setTotalPage(counPage);
		// 总记录数
		page.setCount(count);
		return page;
	}

	@Override
	public Books getBook(Integer id) {
		return booksMapper.getBook(id);
	}

	@Override
	public void insertBorrow(Borrows borrow) {
		booksMapper.insertBorrow(borrow);
	}

	@Override
	public List<Borrows> getBorrows(Integer uid) {
		return booksMapper.getBorrows(uid);
	}

	@Override
	public List<Borrows> getBacks(Integer id) {
		// TODO Auto-generated method stub
		return booksMapper.getBacks(id);
	}

	@Override
	public void updateBacks(Integer id) {
		// TODO Auto-generated method stub
		booksMapper.updateBacks(id);
	}

	@Override
	public void insertReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		booksMapper.insertReserve(reserve);
	}

	@Override
	public List<Reserve> getReserveBook(Integer id) {
		// TODO Auto-generated method stub
		return booksMapper.getReserveBook(id);
	}

	@Override
	public Users selectUser(Users user) {
		// TODO Auto-generated method stub
		return booksMapper.selectUser(user);
	}

}
