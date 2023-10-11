//problem statement :- count the no. of employees after adding employee info by using one variable
//explainantion :-
// 1. here we keep "noOfEmployee" variable static because
// 2. if we dont keep it static, after adding employee info "noOfEmployee" is incremented by 1
// 3. but each employee's object get separate memory for "noOfEmployee" and it will remains 1 even after
//    adding more employee
//4.  so for keep previous incremented count memory should common for all object That's why we keep
//    "noOfEmployee" as a static.



package Keywords.KeywordAssignmentOne;


import static Keywords.KeywordAssignmentOne.Employee.noOfEmployee;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Omkar Andhare", "17/12/1999", "Java Developer");
        Employee e2 = new Employee(2, "Vaibhav Bokade", "28/04/1998", "Java Developer");
        Employee e3 = new Employee(3, "Kuldeep Kambale", "01/06/1997", "Java Developer");
        System.out.println("No of Employees are : " + noOfEmployee);
    }
}
