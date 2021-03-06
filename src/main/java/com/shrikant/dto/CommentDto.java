package com.shrikant.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
@NoArgsConstructor
public class CommentDto {

    private int id;
    private int  answerId;
    private int  userId;
    private String text;
}
