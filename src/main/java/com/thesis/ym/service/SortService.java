package com.thesis.ym.service;

import java.util.List;

import com.thesis.ym.exception.SortException;
import com.thesis.ym.pojo.Sort;

public interface SortService {
	public List<Sort> findAll();

	public Sort findById(Integer id);

	public void add(String sname);

	public List<Sort> findBySname(String sname);

	public void modify(Integer id,String sname);
	
	public void remove(Integer id) throws SortException;
}
