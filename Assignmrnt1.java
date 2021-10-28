
package assignmrnt1;

public class Assignmrnt1 {


    public static void main(String args[]) {
        Person person = new Person("Raafat Habib"), student = new Student("Fady Raafat"),
        employee = new Employee("Bassem Raafat"), faculty = new Faculty("Computers and Information"),
        staff = new Staff("Team of FCI"), people[] = { person, student, employee, faculty, staff };
        for (Person p : people)
        System.out.println(p);
        
    }

   static class Person {
        String name, address, phoneNumber, email;

        Person(String n) {
        name = n;
        }

        @Override
        public String toString() {
        return "Person " + name;
        }
    }

   static class Student extends Person {
        Student(String n) {
        super(n);
        }

        enum Status {
        freshman, sophomore, junior, senior
        }

        Status classStatus;

        @Override
        public String toString() {
        return "Student " + name;
        }
    }

    static class Employee extends Person {
        Employee(String n) {
        super(n);
        }

        String office, hireDate;
        double salary;

        @Override
        public String toString() {
        return "Employee " + name;
        }
    }

    static class Faculty extends Employee {
        Faculty(String n) {
        super(n);
        }

        String officeHours, rank;

        @Override
        public String toString() {
        return "Faculty " + name;
        }
    }

    static class Staff extends Employee {
        Staff(String n) {
        super(n);
        }

        String title;

        @Override
        public String toString() {
        return "Staff " + name;
        }
    }
}
