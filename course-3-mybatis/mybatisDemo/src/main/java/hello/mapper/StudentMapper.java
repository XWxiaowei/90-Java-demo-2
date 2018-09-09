package hello.mapper;

import hello.entity.Student;

public interface StudentMapper {

    Student selectOneById(Long id);
}
