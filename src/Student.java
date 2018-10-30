public class Student extends Person implements Scientist{

    private String group;
    private int amountOfDiscipline;
    private int pairs=0;

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

    private int shedule(){
        int pairs=0;
        pairs=(2*amountOfDiscipline)/5;
        return pairs;
    }

    @Override
    public String tellAboutPerson() {
        System.out.println("This student has " + pairs + "every work day.");
        return super.tellAboutPerson();
    }

    public void learn(){

    }
    public void teach(){

    }
}
