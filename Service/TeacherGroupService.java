package service;

import java.util.Scanner;

import model.Teacher;
import model.User;

public class TeacherGroupService {

    private DataService dataService;
    private Scanner scanner = new Scanner(System.in);

public void modyfyFirstName(){
    System.out.println("Введите фамилию преподавателя: ");
    String consol = scanner.nextLine();
    for (User user : dataService.getListUsers()){
        if(user instanceof Teacher && user.getFirstName() == consol){
            System.out.println("Введите новую фамилию ");
            consol = scanner.nextLine();
            user.setFirstName(consol);
        }
    }
}
public void modyfySecondName(){
    System.out.println("Введите имя преподавателя: ");
    String consol = scanner.nextLine();
    for (User user : dataService.getListUsers()){
        if(user instanceof Teacher && user.getSecondName() == consol){
            System.out.println("Введите новое имя ");
            consol = scanner.nextLine();
            user.setSecondName(consol);;
        }
    }
}
public void modyfyLastName(){
    System.out.println("Введите отчество преподавателя: ");
    String consol = scanner.nextLine();
    for (User user : dataService.getListUsers()){
        if(user instanceof Teacher && user.getLastName() == consol){
            System.out.println("Введите новое отчество ");
            consol = scanner.nextLine();
            user.setLastName(consol);
        }
    }
}
    
}
