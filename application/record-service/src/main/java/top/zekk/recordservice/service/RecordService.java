//package top.zekk.recordservice.service;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(
//        name = "record-service",
//        url = "http://localhost:8080/feign/server/"
////        ,configuration = FeignInterceptor.class,
////        fallback = TestService.DefaultFallback.class
//)
//public interface RecordService {
//
//    @RequestMapping(value = "/getError/{id}", method = RequestMethod.GET)
//    public String getError(@RequestParam("id") Integer id);
//
//
//    @RequestMapping(value = "/get1", method = RequestMethod.GET)
//    public String get1();
//
//    @RequestMapping(value = "/get2/{param}", method = RequestMethod.GET)
//    public String get2(@RequestParam("param") String param);
//
//    @RequestMapping(value = "/post1", method = RequestMethod.POST)
//    public RecordService post1(@RequestBody RecordService demo);
//}