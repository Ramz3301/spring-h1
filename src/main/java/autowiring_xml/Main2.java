package autowiring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");
    }
}
