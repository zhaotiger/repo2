package com.cookie312.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cookie312.dao.ItemsDao;
import com.cookie312.domain.Items;
import com.cookie312.service.ItemsService;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsDao itemDao;
	
	
	public Items findById(Integer id) {
		
		System.out.println("我是server中的方法");
		return itemDao.findById(id);
	}

}
