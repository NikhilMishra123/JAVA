package intro;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("intro.xml");
		BeanFactory b = new XmlBeanFactory(r);
		
		Employee emp = (Employee) b.getBean("e");
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getCity());
		
	}
}
