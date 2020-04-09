package cicollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("cicollection.xml");
		BeanFactory b = new XmlBeanFactory(resource);
		
		Question q = (Question)b.getBean("q");
		q.displayInfo();
	}

}
