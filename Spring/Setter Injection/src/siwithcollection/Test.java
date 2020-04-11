package siwithcollection;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("siwithcollection.xml");
		BeanFactory fact = new XmlBeanFactory(r);
		
		Question ques = (Question) fact.getBean("question");
		System.out.println(ques.id+" "+ques.getQue());
		List<String> ans = ques.getAnswer();
		Iterator<String> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
