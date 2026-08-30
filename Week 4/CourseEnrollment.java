
class Course {
    private String code;
    private String title;
    private int capacity;
    private int enrolled;

    Course(String code, String title, int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException();

        this.code = code;
        this.title = title;
        this.capacity = capacity;
        enrolled = 0;
    }

    boolean enroll() {
        if (enrolled >= capacity)
            return false;

        enrolled++;
        return true;
    }

    boolean withdraw() {
        if (enrolled == 0)
            return false;

        enrolled--;
        return true;
    }

    boolean isFull() {
        return enrolled == capacity;
    }

    int getAvailableSeats() {
        return capacity - enrolled;
    }

    public String toString() {
        return code + " " + title + " Enrolled: " + enrolled + " Available: " + getAvailableSeats();
    }
}

public class CourseEnrollment {
    public static void main(String[] args) {
        Course c = new Course("C101", "Java", 2);

        System.out.println(c);
        System.out.println(c.withdraw());

        System.out.println(c.enroll());
        System.out.println(c);
        System.out.println(c.enroll());
        System.out.println(c);

        System.out.println(c.isFull());
        System.out.println(c.enroll());

        System.out.println(c.withdraw());
        System.out.println(c);
    }
}

