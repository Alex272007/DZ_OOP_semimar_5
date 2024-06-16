import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1","1","1");
        controller.createStudent("2", "2","2","2");  
        controller.createStudent("3", "3","3","1");
        controller.createStudent("4", "4","4","2");

        controller.createTeacher("Иванова", "Ирина", "Анреевна", "История");

        // controller.printStudents();
        // controller.printTeacher();

        controller.getStudGroup();

        // controller.modyfy();
        
    }
}