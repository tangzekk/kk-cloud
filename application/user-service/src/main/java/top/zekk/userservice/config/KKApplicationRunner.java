package top.zekk.userservice.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import top.zekk.userservice.dao.UserMapper;
import top.zekk.userservice.entity.User;

import javax.annotation.Resource;

/**
 * springboot 启动完成后立即执行
 * 默认是 ApplicationRunner  , CommandLineRunner的顺序
 */
@Component
public class KKApplicationRunner  implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
