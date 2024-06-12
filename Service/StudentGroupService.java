package Service;

import java.util.List;

import Model.Student;
import Model.StudentGroup;
import Model.Teacher;

public class StudentGroupService {
    
    public StudentGroup studentGroup;

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public StudentGroup creaStudentGroup(Teacher teacher, List<Student> listStudents){
        studentGroup = new StudentGroup(teacher, listStudents);
        return studentGroup;
    }
}
