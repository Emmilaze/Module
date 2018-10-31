public class Teacher extends Person implements Scientist{

    private String specialization;
    private int amountOfStudents;
    private Student[] students = new Student[5];
    private Dean dean;

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

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public void tellAboutPerson() {
        System.out.println("This teacher has " + specialization + "specialization, and " + amountOfStudents +
                " students.");
    }

    @Override
    public void learn() throws NotLearning {
        throw new NotLearning();
    }

    @Override
    public void teach(){
        System.out.println("My students are \n");
        for (Student s: students) {
            System.out.println(s.getName());
        }
        System.out.println("My ex-teacher was " + dean);
    }
}
