package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import model.Type;

@Repository
public interface Type1_Dao {
	
	
	public List<Type> select();
	
	public Type selectById(int id);
	
	public  void insert(Type t);
	
	
	
}
