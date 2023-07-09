package com.faizan.todo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;

import java.time.LocalDateTime;

@Data
@Collation
public class Todo {

    @Id
    private String id;
    private String title;
    private String description;
    private LocalDateTime created;

    public Todo(String title, String description, LocalDateTime created) {
        this.title = title;
        this.description = description;
        this.created = created;
    }



}

