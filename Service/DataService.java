package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
public class DataService {
    
    private List<User> listUsers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public List<User> getListUsers() {
        return listUsers;
    }
    
    public void create(String firstName, String secondName,
                       String lastName, String dateB, Type type){
        int id = getId(type);
        if(Type.Student == type){
            Student student = new Student(firstName,secondName,lastName,dateB,id);
            listUsers.add(student);
        }
        if(Type.Teacher == type){
            Teacher teacher = new Teacher(firstName,secondName,lastName,dateB,id);
            listUsers.add(teacher);
        }
    }

    private int getId(Type type){
        int id = 0;
        for (User user : listUsers) {
            if(user instanceof Teacher && Type.Teacher == type){
                id = ((Teacher) user).getTeacherId();
            }
            if(user instanceof Student && Type.Student == type){
                id = ((Student) user).getStudentId();
            }
        }
        return ++id;
    }

    public List<Student> getAllStudent(){
        List<Student> listUser = new ArrayList<>();
        for(User user : listUsers){
            if (user instanceof Student){
                listUser.add((Student)user);
            }
        }
        return listUser;
    }

    public Teacher getTeacher(){
        for (Teacher teacher: getAllTeacher()) {
            System.out.println("Введите ID преподавателя: ");
            int id = scanner.nextInt();
            if(teacher.getTeacherId() == id){
                return teacher;
            } 
        }return null;
    }

    public List<Teacher> getAllTeacher(){
        List<Teacher> listTeacher = new ArrayList<>();
        for (User user : listUsers) {
            if (user instanceof Teacher) {
                listTeacher.add((Teacher)user);
            }  
        }return listTeacher;
    } 

    public void modyfyFirstName(){
        System.out.println("Введите фамилию преподавателя: ");
        String consol = scanner.nextLine();
        for (User user : listUsers){
            if(user instanceof Teacher && user.getFirstName().equalsIgnoreCase(consol)){
                String newFirstName = "";
                System.out.println("Введите новую фамилию ");
                newFirstName = scanner.nextLine();
                user.setFirstName(newFirstName);
            }
        }
    }
    public void modyfySecondName(){
        System.out.println("Введите имя преподавателя: ");
        String consol = scanner.nextLine();
        for (User user : listUsers){
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
        for (User user : listUsers){
            if(user instanceof Teacher && user.getLastName() == consol){
                System.out.println("Введите новое отчество ");
                consol = scanner.nextLine();
                user.setLastName(consol);
            }
        }
    }    
}