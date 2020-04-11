package intro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("intro.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		B b = (B) factory.getBean("b");
		b.printB();
	}
}
//
//import org.springframework.context.ApplicationContext;  
//import org.springframework.context.support.ClassPathXmlApplicationContext;  
//public class Test {  
//public static void main(String[] args) {  
//    ApplicationContext context=new ClassPathXmlApplicationContext("intro.xml");  
//    B b=(B)context.getBean("b");  
//    b.printB();
//}  
//}  