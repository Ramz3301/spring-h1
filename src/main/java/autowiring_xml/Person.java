package autowiring_xml;

public class Person {
    private Cat cat;
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        System.out.println("Setting Cat to Person");
        System.out.println(cat.getName());
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        System.out.println("Setting Dog to Person");
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                '}';
    }
}
