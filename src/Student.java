public class Student implements Comparable<Student> {
    private String surname;
    private double average;
    private int age;

    public Student(String surname, double average, int age) {
        this.surname = surname;
        this.average = average;
        this.age = age;
    }

    public String getSurname() { return surname; }
    public double getAverage() { return average; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Student o) {
        return Double.compare(average, o.average);
    }

    @Override
    public int hashCode() {
        return surname.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student s)) return false;
        return surname.equals(s.surname);
    }

    @Override
    public String toString() {
        return surname + " (средний балл=" + average + ", возраст=" + age + ")";
    }
}