package com.example.mybatispractice.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
}
