package top.zekk.recordservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("sys_record")
@Data@AllArgsConstructor@NoArgsConstructor@Builder
@JsonIgnoreProperties(ignoreUnknown = true)

public class SysRecord {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String info;
    private String json;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recordDate;
}


/**
 *
 * create table sys_record
 * (
 *     id          bigint auto_increment
 *         primary key,
 *     info        varchar(666)  null,
 *     json        varchar(6666) null,
 *     record_date datetime      null,
 *     constraint id
 *         unique (id)
 * );
 */