package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * a happy start
 * </p>
 *
 * @author thg
 * @version 0.0.1
 * @since 2023/4/13  23:14
 */

@Data
@TableName(value="tb_announcement")
public class Announcement {
    @TableId( type = IdType.ASSIGN_ID)
    private String id;
    private String title;
    private String content;
}
