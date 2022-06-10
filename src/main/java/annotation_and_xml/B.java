package annotation_and_xml;

import org.springframework.stereotype.Component;

@Component
public class B {
    public B() {
        System.out.println("Creating bean B "+ this);
    }
}
