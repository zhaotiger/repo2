package com.cookie312.dao;

import org.apache.ibatis.annotations.Select;

import com.cookie312.domain.Items;

public interface ItemsDao {

	@Select("select * from items where id =#{id}")
	public Items findById(Integer id);
	
	
}
