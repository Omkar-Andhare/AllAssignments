package CollectionFramework.Comparator.SortingBasedOnCustom;

public class Student implements Comparable<Student> {
    private int id;

    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        if (id == student.id) {
            return 0;
        } else if (id > student.id) {
            return 1;
        } else {
            return -1;
        }
    }
}
