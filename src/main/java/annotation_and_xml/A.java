package annotation_and_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B bbb;
    private C ccc;

    public A() {
        System.out.println("Creating bean A: " + this);
    }

    @Autowired
    public void setBbb(B bbb) {
        System.out.println("setting A.bbb with " + bbb);
        this.bbb = bbb;
    }

    @Autowired
    public void setCcc(C ccc) {
        System.out.println("Setting A.ccc with " + ccc);
        this.ccc = ccc;
    }
}
