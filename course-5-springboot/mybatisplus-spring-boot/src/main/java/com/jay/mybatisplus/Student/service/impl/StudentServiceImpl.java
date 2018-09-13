package com.jay.mybatisplus.Student.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.jay.mybatisplus.model.Student;
import com.jay.mybatisplus.dao.StudentMapper;
import com.jay.mybatisplus.Student.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-13
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Page<Student> selectStudentPage(Page<Student> page) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        // 注意！！ 分页 total 是经过插件自动 回写 到传入 page 对象
        return page.setRecords(studentMapper.selectStudentList(page));
    }
}
