package top.zekk.userservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.zekk.userservice.dao.UserMapper;
import top.zekk.userservice.entity.User;

import javax.annotation.Resource;

@Service
public class UserService {
    @Value("${server.port}")
    private int serverPort;
    @Resource
    UserMapper userMapper;

    public void save(User user) {
        user.setUsername(serverPort + "$" + user.getUsername());
        userMapper.insert(user);
    }

}
