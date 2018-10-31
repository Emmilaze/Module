public class Main {
    public static void main(String[] args) {

        int amountOfStudents=5;
        int amountOfTeacher=2;

        Student[] studentt1 = new Student[amountOfStudents];
        Student[] studentt2 = new Student[amountOfStudents];

        for (int i = 0; i<amountOfStudents; i++){
            studentt1[i] = new Student("Student" + i, 17 + i, "1" + i, 3 + i);
            studentt2[i] = new Student("Student1" + i, 18 + i, "2" + i, 2 + i);
        }

        Teacher[] teachers = new Teacher[amountOfTeacher];

        for (int i = 0; i<amountOfTeacher; i++){
            teachers[i] = new Teacher("Teacher" +i,i+1, "rank"+i, i+2);
        }

        Dean dean = new Dean("Peter", 58, 25, true);

        dean.setTeachers(teachers);

        teachers[0].setStudents(studentt1);
        teachers[1].setStudents(studentt2);
        teachers[0].setDean(dean);
        teachers[1].setDean(dean);

        for (int i = 0; i<amountOfStudents; i++){
            studentt1[i].setTeacher(teachers[0]);
            studentt2[i].setTeacher(teachers[1]);
        }
    }
}