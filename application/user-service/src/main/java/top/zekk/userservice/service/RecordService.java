package top.zekk.userservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.zekk.commonfeignparams.param.RecordVO;

/**
 * v0.1 有点问题,同样的参数类每个服务都得自己建一个,一个服务改了,每个服务都要改
 */
@FeignClient(
        name = "record-service",contextId = "record-service"
//        ,url = "http://localhost:8222/record/" //开始测试的时候给的ip 使用nacos后使用服务名调用
//        ,configuration = FeignInterceptor.class,
//        fallback = TestService.DefaultFallback.class
)
//@LoadBalancerClient  //Either 'name' or 'value' must be provided in @LoadBalancerClient
public interface RecordService {

    @RequestMapping(value = "/getError/{id}", method = RequestMethod.GET)
    public String getError(@RequestParam("id") Integer id);


    @RequestMapping(value = "/get1", method = RequestMethod.GET)
    public String get1();

    @RequestMapping(value = "/get2/{param}", method = RequestMethod.GET)
    public String get2(@RequestParam("param") String param);

    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    public RecordService post1(@RequestBody RecordService demo);
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RecordVO save(@RequestBody RecordVO demo);
}