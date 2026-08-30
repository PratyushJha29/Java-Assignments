
class Profile {
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException();

        if (age < 0)
            throw new IllegalArgumentException();

        if (heightMetres <= 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeightMetres() {
        return heightMetres;
    }

    public String toString() {
        return name + " " + age + " " + heightMetres;
    }
}

public class TextProfile {
    public static void main(String[] args) {
        String name = args[0];
        String ageText = args[1];
        String heightText = args[2];

        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);

        Profile p = new Profile(name, age, height);

        System.out.println(p);

        System.out.println(String.valueOf(age));
        System.out.println(Double.toString(height));
    }
}

