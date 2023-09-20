package top.zekk.userservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zekk.commonfeignparams.param.RecordVO;
import top.zekk.userservice.entity.User;
import top.zekk.userservice.service.RecordService;
import top.zekk.userservice.service.UserService;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    RecordService recordService;
    @Value("${server.port}")
    private int serverPort;
    @RequestMapping("/save")
    public void save(@RequestBody User user) throws JsonProcessingException {
        userService.save(user);
        RecordVO recordVO = RecordVO.builder().recordDate(new Date()).info("用户注册-用户名:" + user.getUsername())
                .json(new ObjectMapper().writeValueAsString(user)).build();

        recordService.save(recordVO);
    }
}
