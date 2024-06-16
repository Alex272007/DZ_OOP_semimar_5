package controller;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;
import view.TecherViev;

import java.util.List;

public class Controller {
    private DataService service = new DataService();
    private StudentView studentView = new StudentView();
    private TecherViev teacherView = new TecherViev();
    private StudentGroupService serviceSG = new StudentGroupService();

    public void modyfy(){
        System.out.println("Изменение данных: \n");
        service.modyfyFirstName();
        service.modyfySecondName();
        service.modyfyLastName();
    }
    public void getStudGroup(){
        List<Student> listUserST = service.getAllStudent();
        printTeacher();
        Teacher teacher = service.getTeacher();
        serviceSG.createStudentGroup(teacher,listUserST);
        System.out.println(teacher);
        printStudents();
        

   }

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.Student);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.Teacher);
    }

    public void printStudents(){
        for (User user : service.getAllStudent()) {
            studentView.printOnConsole((Student)user);
        }
    }

    public void printTeacher(){
        for(User user: service.getAllTeacher()){
            teacherView.printTeacher((Teacher)user);
        }
    }
}