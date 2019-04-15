package com.jay.chapter1.mapper;

import com.jay.entity.JpaStudent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by xiang.wei on 2019/4/15
 *
 * @author xiang.wei
 */
public interface JpaStudentDao extends CrudRepository<JpaStudent,Integer>{

    /**
     * @param name
     * @return
     */
    List<JpaStudent> getByNameLike(String name);

}
