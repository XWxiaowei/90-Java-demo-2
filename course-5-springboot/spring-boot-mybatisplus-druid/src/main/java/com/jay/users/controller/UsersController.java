package com.jay.users.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jay.model.Users;
import com.jay.param.UserParam;
import com.jay.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jay.xiang
 * @since 2018-09-17
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/getUsers")
    public List<Users> getUsers() {
        List<Users> users = usersService.selectList(new EntityWrapper<>());
        return users;
    }

    @RequestMapping("/getList")
    public Page<Users> getList(UserParam userParam) {
        Wrapper ew = new EntityWrapper();
        ew.where("userName={0}", userParam.getUserName())
        .and("user_sex={0}",userParam.getUserSex());
        int total = usersService.selectCount(ew);
        List<Users> usersList = usersService.selectList(ew);
        Page<Users> usersPage = new Page<>(1, 10);
        usersPage.setRecords(usersList);
        usersPage.setTotal(total);
        return usersPage;
    }

    @RequestMapping("/getUser")
    public Users getUser(Long id) {
        Users user=usersService.selectOne(new EntityWrapper<Users>().where("id={0}",id));
        return user;
    }

    @RequestMapping("/add")
    public void save(Users user) {
        usersService.insert(user);
    }

    @RequestMapping(value="update")
    public void update(Users user) {
        usersService.update(user,new EntityWrapper<>());
    }

}

