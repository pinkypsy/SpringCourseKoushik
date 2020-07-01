package ua.alvin;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {

    public static void main(String[] args) {
BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));

Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        	// write your code herorigine
        triangle.draw();
    }
    public void m (Triangle triangle){
        System.out.println(triangle);
    }
}
