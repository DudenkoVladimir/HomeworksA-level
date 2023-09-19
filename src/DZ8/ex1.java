package DZ8;

class Student {
    private String firstName;
    String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return lastName.hashCode();
    }
}

class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        int averageMark = 0;
        return averageMark == 5 ? 200 : 180;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "A1", 4.5);
        Aspirant aspirant = new Aspirant("Jane", "Smith", "B2", 5, "Research paper");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println("Студент/аспірант: " + s.lastName);
            System.out.println("Стипендія: " + s.getScholarship() + " грн");
            System.out.println();
        }
    }
}
