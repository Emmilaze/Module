public class Teacher extends Person implements Scientist{

    private String specialization;
    private int amountOfStudents;


    public Teacher(String name, int age, String specialization, int amountOfStudents) {
        super(name, age);
        this.specialization = specialization;
        this.amountOfStudents = amountOfStudents;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    @Override
    public String tellAboutPerson() {
        System.out.println("This teacher has " + specialization + "specialization, and " + amountOfStudents +
                " students.");
        return super.tellAboutPerson();
    }

    public void learn(){

    }
    public void teach(){

    }
}
