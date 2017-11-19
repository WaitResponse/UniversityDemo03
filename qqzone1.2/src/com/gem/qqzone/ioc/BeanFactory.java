package com.gem.qqzone.ioc;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BeanFactory {
	private Map<String,Object> beanMap= new HashMap<String,Object>();
	
	public Object getBean (String id){
		return beanMap.get(id);
	}
	private static BeanFactory instance=new BeanFactory();
	private static BeanFactory getInstance(){
		return instance;
	}
	
	public BeanFactory(){
		try {
			InputStream is=this.getClass().getClassLoader().getResourceAsStream("applicationContext.xml");
			DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance(); 
			DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
			Document document=builder.parse(is);
			//1.获取所有Bean对象
			NodeList beanNodeList=document.getElementsByTagName("bean");
			for(int i=0;i<beanNodeList.getLength();i++){
				//遍历节点
				Node beanNode=beanNodeList.item(i);
				//如果是元素节点
				if(beanNode.getNodeType()==Node.ELEMENT_NODE){
					//强转为元素节点
					Element beanElement=(Element)beanNode;	
					String id=beanElement.getAttribute("id");
					String beanClassName=beanElement.getAttribute("class");
					Object beanObj=createInstance(beanClassName);
					beanMap.put(id,beanObj);
				}
			}
					//2.给需要set的Bean注入依赖对象
					beanNodeList =document.getElementsByTagName("bean");
					for(int i=0;i<beanNodeList.getLength();i++){
						Node beanNode=beanNodeList.item(i);
						if(beanNode.getNodeType()==Node.ELEMENT_NODE){
							Element beanElement=(Element)beanNode;
							String id=beanElement.getAttribute("id");
							Object beanObj=beanMap.get(id);
							
							NodeList beanChildNodeList=beanElement.getChildNodes();
							for (int j = 0; j < beanChildNodeList.getLength(); j++) {
								Node beanChildNode = beanChildNodeList.item(j);
								if(beanChildNode.getNodeType()==Node.ELEMENT_NODE && "property".equals(beanChildNode.getNodeName())){
									Element beanChildElement = (Element)beanChildNode ;
									String propertyName = beanChildElement.getAttribute("name");//userDAO
									String ref = beanChildElement.getAttribute("ref");
									Object refObj = beanMap.get(ref);//userDAO
									//3.通过反射调动setter方法
									invokeSetter(beanObj, propertyName, refObj);
								}
					}
				}
				
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Object createInstance(String className){
		try {
			return Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void invokeSetter(Object obj,String propertyName,Object propertyValue){//userBiz,userDAO,userDAO
		Class clazz=obj.getClass();
		Method[] methodArr=clazz.getMethods();
		for(int i=0;i<methodArr.length;i++){
			Method m=methodArr[i];
			String methodName=m.getName();
			String propertySetter="set"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
			if(methodName.equals(propertySetter)){
				try {
					m.invoke(obj, propertyValue);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
}
