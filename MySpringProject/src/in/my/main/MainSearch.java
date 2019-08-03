package in.my.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainSearch {
	
	public static void main(String args[]) {	
		
		 Resource resource=new ClassPathResource("applicationContext.xml");
		 BeanFactory beanfactory=new XmlBeanFactory(resource); 
		 MyApp searchapp = (MyApp)beanfactory.getBean("searchApp");  
		 searchapp.mainSearch();  
	}

}
