package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TacketsDao;
import com.domain.Tackets;
import com.service.TacketsService;

@Service
public class TacketsServiceimpl implements TacketsService {

	@Autowired
	private TacketsDao tacketsdao;
	
	@Override
	public List<Tackets> findalltackets() {
		// TODO Auto-generated method stub
		return this.tacketsdao.selectAll();
	}

	@Override
	public Integer sevaadd(Tackets tackets) {
		// TODO Auto-generated method stub
		tackets.setTotalcount(1000);
		tackets.setOrdercount(0);
		 Integer num=this.tacketsdao.insert(tackets);
		return num;
	}

	@Override
	public Tackets updateid(Integer id) {
		// TODO Auto-generated method stub
		return this.tacketsdao.selectByPrimaryKey(id);
	}

	@Override
	public Integer saveupdate(Tackets tackets) {
		// TODO Auto-generated method stub
		tackets.setTotalcount(1000);
		tackets.setOrdercount(0);
		 Integer num=this.tacketsdao.updateByPrimaryKeySelective(tackets);
		return num;
	}

	@Override
	public Integer savedelete(Integer id) {
		// TODO Auto-generated method stub
		return this.tacketsdao.deleteByPrimaryKey(id);
	}

}
