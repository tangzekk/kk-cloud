package top.zekk.userservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@JsonIgnoreProperties(ignoreUnknown = true)

public class User {
    @TableId(type=IdType.AUTO) //使用数据库自增,不然是 1704376627159912449
    private Long id;
    private String username;
    private String password;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerDate;
    private Integer flag; // default 0 deleted 1

}

/**
 *
 * create table user
 * (
 *     id            bigint auto_increment
 *         primary key,
 *     username      varchar(666) null,
 *     password      varchar(666) null,
 *     email         varchar(666) null,
 *     register_date datetime     null,
 *     flag          int          null
 * );
 */
