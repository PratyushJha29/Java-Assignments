
class Student {
    private String name;
    private String studentId;
    private int mark;

    Student(String name, String studentId, int mark) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException();

        if (studentId == null || studentId.isBlank())
            throw new IllegalArgumentException();

        if (mark < 0 || mark > 100)
            throw new IllegalArgumentException();

        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100)
            return false;

        mark = newMark;
        return true;
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public String getClassification() {
        if (mark >= 80)
            return "Distinction";
        else if (mark >= 70)
            return "First Class";
        else if (mark >= 50)
            return "Pass";
        else
            return "Fail";
    }

    public String toString() {
        return name + " " + studentId + " " + mark + " " + getClassification();
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", "S101", 49);
        Student s2 = new Student("Aman", "S102", 50);
        Student s3 = new Student("Priya", "S103", 79);
        Student s4 = new Student("Riya", "S104", 80);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println("Passed: " + s1.hasPassed());
        System.out.println("Passed: " + s2.hasPassed());

        System.out.println("Invalid update: " + s1.setMark(120));
        System.out.println(s1);
    }
}


