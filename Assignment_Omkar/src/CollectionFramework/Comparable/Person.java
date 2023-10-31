package CollectionFramework.Comparable;

public class Person implements Comparable<Person> {

    private String name;

    private int age;

    private long mobNo;

    public Person(String name, int age, long mobNo) {
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobNo=" + mobNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getMobNo() {
        return mobNo;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.getAge();
    }
}
