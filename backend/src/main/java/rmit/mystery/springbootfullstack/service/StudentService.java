package rmit.mystery.springbootfullstack.service;

import rmit.mystery.springbootfullstack.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
