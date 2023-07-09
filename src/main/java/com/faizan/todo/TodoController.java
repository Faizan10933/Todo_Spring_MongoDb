package com.faizan.todo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.SimpleTimeZone;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/todo")
public class TodoController {
    private final TodoRepository todoRepository;

    @GetMapping
    public List<Todo> fetalltodo(){
        return todoRepository.findAll();


    }

    @PostMapping
    public void addTodo(@RequestBody newtodo request){
        Todo todo = new Todo(request.title, request.description, LocalDateTime.now());
        todoRepository.save(todo);
    }


    @DeleteMapping("{todoId}")
    public void deleteTodo(@PathVariable("todoId") String id){
        todoRepository.deleteById(id);
    }

    @PutMapping("{todoId}")
    public void updateTodo(@PathVariable("todoId") String id,@RequestBody newtodo request){
        Optional<Todo> tId = todoRepository.findById(id);
        Todo todo = tId.orElseThrow(() ->new IllegalArgumentException("Invalid todo is"+id) );
        todo.setTitle(request.title);
        todo.setDescription(request.description);
        todo.setCreated(LocalDateTime.now());
        todoRepository.save(todo);
    }

    public static record newtodo(String title,String description){}

}
