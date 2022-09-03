package rmit.mystery.springbootfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rmit.mystery.springbootfullstack.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
