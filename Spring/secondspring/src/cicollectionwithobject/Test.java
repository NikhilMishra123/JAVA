package cicollectionwithobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args )
	{
		Resource r = new  ClassPathResource("cicollectionwithobject.xml");
		BeanFactory b = new XmlBeanFactory(r);
		
		Question question = (Question) b.getBean("q");
		question.displayInfo();
 	}
}
