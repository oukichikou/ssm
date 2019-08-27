package test.ssm;

import java.io.FileInputStream;
import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Type;

public class sp1 {

	@Test
	public void t1() throws Exception{
		DocumentBuilderFactory f =  DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document d = b.parse(new FileInputStream("c:/applicationContext.xml"));
		
		Node n1=d.getFirstChild();
		NodeList ns=n1.getChildNodes();
		for(int i=0;i<ns.getLength();i++) {
			if(ns.item(i).getNodeName().equals("bean")) {
				Element e= (Element) ns.item(i);
				String cname= e.getAttribute("class");
			Class<?> cls=	Class.forName(cname);
			Object obj=cls.newInstance();
			//获取子节点
			NodeList ns1=e.getChildNodes();
			for(int ii=0;ii<ns.getLength();ii++) {
				if(ns1.item(ii).getNodeName().equals("property")) {
					Element e1= (Element) ns1.item(ii);
					String name=e1.getAttribute("name");
					String val=e1.getAttribute("value");
					Field f1=cls.getDeclaredField(name);
					f1.setAccessible(true);
					f1.set(obj, val);
				}
			}
			
			Type o=(Type) obj;
			System.out.println(o.getName());
			}
		}
	}
	
}
