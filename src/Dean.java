import java.sql.SQLOutput;

public class Dean extends Person {

    private int experience;
    private boolean doctor_degree;


    public Dean(String name, int age, int experience, boolean doctor_degree) {
        super(name, age);
        this.experience = experience;
        this.doctor_degree = doctor_degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isDoctor_degree() {
        return doctor_degree;
    }

    public void setDoctor_degree(boolean doctor_degree) {
        this.doctor_degree = doctor_degree;
    }

    @Override
    public String tellAboutPerson() {
        System.out.println("Do this dean has doctor degree? " + doctor_degree + ". This dean has " + experience +
                "years of expierence.");
        return super.tellAboutPerson();
    }
}
