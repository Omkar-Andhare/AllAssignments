package CollectionFramework.Comparator.SortByMoreThanOneField;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<Student> {
    /**
     * It takes two object and first sort on the basis of name and then age
     * @param student1
     * @param student2
     * @return
     */
    @Override
    public int compare(Student student1, Student student2) {
        int nameCompare = student1.getName().compareTo(student2.getName());
        int ageCompare = student1.getAge().compareTo(student2.getAge());
        return (nameCompare == 0) ? ageCompare : nameCompare;
    }
}