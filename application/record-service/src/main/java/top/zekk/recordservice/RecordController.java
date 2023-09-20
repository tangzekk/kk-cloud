package top.zekk.recordservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zekk.commonfeignparams.param.RecordVO;
import top.zekk.recordservice.dao.SysRecordMapper;
import top.zekk.recordservice.entity.SysRecord;

import javax.annotation.Resource;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Resource
    SysRecordMapper recordMapper;
    @Value("${server.port}")
    private int serverPort;
@RequestMapping("/save")
    public void record(@RequestBody RecordVO recordVO) {
        SysRecord sysRecord = new SysRecord();
        BeanUtils.copyProperties(recordVO, sysRecord);

    sysRecord.setInfo(serverPort + "$$" + recordVO.getInfo());
        recordMapper.insert(sysRecord);

    }

}
