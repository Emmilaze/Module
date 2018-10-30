public class Person {

    private String name;
    private int age;
    private Person dean;
    private Person teacher;
    private Person student;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String tellAboutPerson(){
        String info="Name - " + name + ", age - " + age + ".";
        return "";
    }
}
