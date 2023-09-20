package top.zekk.recordservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("sys_record")
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class SysRecord {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String info;
    private String json;
    private Data recordDate;
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