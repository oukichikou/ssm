package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Type;
import service.Type_Service;
import service.Type_Service;
import utils.ReturnInfo;

@Controller
@RequestMapping("Type")
public class TypeController {
	@Autowired
	Type_Service service;
	
	@Autowired
	Type_Service tservice;

	
	
	@RequestMapping("index")
	public @ResponseBody ReturnInfo  index(String txt,Integer page,Integer limit,ModelMap m) {
		if(txt!=null) txt=" where type.name like '%"+txt+"%'";
		else txt="";
		return service.select(txt,page,limit);
	}
	
	
	@RequestMapping("insert")
	public @ResponseBody String  insert(Type b,ModelMap m) {
		service.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("update")
	public  @ResponseBody String  update(Type b,ModelMap m) {
		service.update(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public  @ResponseBody Type  edit(int id,ModelMap m) {
		return service.selectById(id);
	}
	
	@RequestMapping("delete")
	public @ResponseBody String  delete(int id,ModelMap m) {
		service.delete(id);
		return "{\"status\":1}";
	}
}
