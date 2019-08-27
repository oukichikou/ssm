package test.ssm;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.annotation.JacksonInject;

import dao.Type1_Dao;
import dao.Type_Dao;
import model.Type;
import model.Type2;
import model.TypeInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class junit_test {
	@Autowired
	Type_Dao t;
	@Test
	public void ee() throws InterruptedException{
		List<Type> list=t.select("","");
		System.out.println(list.size());
		Thread.sleep(20000);
		list=t.select("","");
		System.out.println(list.size());
		
		t.insert(new Type(112, "dfwdf"));
		list=t.select("","");
		System.out.println(list.size());
	}
}
