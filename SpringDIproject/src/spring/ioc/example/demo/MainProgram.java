package spring.ioc.example.demo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



import org.springframework.beans.factory.BeanFactory;


public class MainProgram {

	public static void main(String[] args) {
		
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
	
		
		//on demand object creation - lazy loading 
		   Employee emp =(Employee) beanFactory.getBean("emp");
		   //if we call getBean then only corresponding object will be created.
		   System.out.println(emp);
		
	}
}
