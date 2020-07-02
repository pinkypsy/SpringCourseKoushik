package main.ua.alvin;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

Triangle triangle = (Triangle) context.getBean("triangle");
        	// write your code herorigine
        triangle.draw();
    }
}
