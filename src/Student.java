public class Student extends Person implements Scientist{

    private String group;
    private int amountOfDiscipline;
    private int pairs=0;
    private Teacher teacher;

    public Student(String name, int age, String group, int amountOfDiscipline){
        super(name, age);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAmountOfDiscipline() {
        return amountOfDiscipline;
    }

    public void setAmountOfDiscipline(int amountOfDiscipline) {
        this.amountOfDiscipline = amountOfDiscipline;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private int shedule(){
        int pairs=0;
        pairs=(2*amountOfDiscipline)/5;
        return pairs;
    }

    @Override
    public void tellAboutPerson() {
        System.out.println("This student has " + pairs + "every work day.");
    }

    public void learn(){
        System.out.println("I am learning now! My teacher is " + teacher);
    }
    public void teach() throws NotTeaching {
        throw new NotTeaching();
    }
}
