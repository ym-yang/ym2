package com.thesis.ym.pojo;

import java.io.Serializable;

/**
 * 书籍类别
 */
public class Sort implements Serializable {
	private Integer id;
	private String sname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
