package Controller;

import Service.DataService;
import View.StudentView;

import java.util.List;

import Model.Student;
import Model.Type;
import Model.User;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
