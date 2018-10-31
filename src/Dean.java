
public class Dean extends Person implements Scientist{

    private int experience;
    private boolean doctor_degree;
    private Teacher[] teachers = new Teacher[2];


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

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public void tellAboutPerson() {
        System.out.println("Do this dean has doctor degree? " + doctor_degree + ". This dean has " + experience +
                "years of expierence.");
    }

    @Override
    public void learn() throws NotLearning {
        throw new NotLearning();

    }

    @Override
    public void teach(){
        System.out.println("My subordinates are \n");
        for (Teacher s: teachers) {
            System.out.println(s.getName());
        }
    }
}
