package siwithDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("depententobject.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee emp  = (Employee) factory.getBean("emp");
		System.out.println(emp.id+" "+emp.name+" "+emp.address);
	}
}
