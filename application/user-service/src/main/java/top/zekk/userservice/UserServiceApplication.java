package top.zekk.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients


@MapperScan("top.zekk.userservice.dao")
//报错 feign.FeignException$NotFound: [404] during [POST]
// to [http://record-service/save] [RecordService#save(RecordVO)]:
// [{"timestamp":"2023-09-20T09:20:37.191+00:00","status":404,"error":"Not Found","path":"/save"}]
//
@EnableDiscoveryClient



public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
