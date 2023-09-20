package top.zekk.userservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import top.zekk.userservice.dao.UserMapper;
import top.zekk.userservice.entity.User;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class KKCommandLineRunner implements CommandLineRunner {
    @Resource
    UserMapper userMapper;
    @Override
    public void run(String... args) throws Exception {
        User onlyKkRunnerTest = User.builder().username("only KKCommandLineRunner test").registerDate(new Date()).password("123456").flag(0).email("1234@qq.cc").build();

        userMapper.insert(onlyKkRunnerTest);
    }
}