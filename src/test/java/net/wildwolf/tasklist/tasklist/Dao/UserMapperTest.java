package net.wildwolf.tasklist.tasklist.Dao;

import net.wildwolf.tasklist.tasklist.TasklistApplicationTests;
import net.wildwolf.tasklist.tasklist.dao.UserMapper;
import net.wildwolf.tasklist.tasklist.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest extends TasklistApplicationTests{
    @Autowired
    private UserMapper mapper;
    @Test
    public void  testUserFind(){
        User user=this.mapper.selectByPrimaryKey(1);
        System.out.println(user.getAddress());
    }
}

