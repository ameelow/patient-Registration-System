public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String disease;

    public Patient(int id, String name, int age, String gender, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nDisease: " + disease;
    }
}
