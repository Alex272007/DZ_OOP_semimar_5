package Data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> listStudents;
    
    public StudentGroup(Teacher teacher, List<Student> listStudents) {
        this.teacher = teacher;
        this.listStudents = listStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }   
}
