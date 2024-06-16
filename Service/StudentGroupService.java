package service;

import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;

public class StudentGroupService {
    
    public StudentGroup studentGroup;

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> listStudents){
        studentGroup = new StudentGroup(teacher, listStudents);
        return studentGroup;
    }
}
