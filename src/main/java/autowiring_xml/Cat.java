package autowiring_xml;

public class Cat {

    private String name;

    public Cat() {
        System.out.println("Meow-meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
