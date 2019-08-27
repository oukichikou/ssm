package service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.Type_Dao;
import model.Type;
import service.Type_Service;
import utils.ReturnInfo;

@Service
public class Type_Service_Impl implements Type_Service{
	@Autowired
	Type_Dao dao;
	
	@Transactional(propagation=Propagation.REQUIRED) 
	public void insert(Type t) {
		dao.insert(new Type(12, "1212"));
		dao.insert(new Type(12, "133"));
	}

	public void update(Type t) {
		dao.update(t);
		
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Type selectById(int id) {
		// TODO Auto-generated method stub
		return dao.selectById(id);
	}

	public ReturnInfo select(String txt, Integer page, Integer limit) {
		ReturnInfo info = new ReturnInfo();
		String limitstr="";
		if(page!=null) {
			limitstr=" limit "+((page-1)*limit)+","+limit;
			info.setCount(dao.selectCount(txt));
		}
		info.setList(dao.select(txt,limitstr)); 
		return info;
	}

}
