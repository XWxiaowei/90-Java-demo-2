package com.jay.mybatisplus.dao;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.jay.mybatisplus.model.Student;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-13
 */
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @param page
     * @return
     */
    List<Student> selectStudentList(Pagination page);

}
