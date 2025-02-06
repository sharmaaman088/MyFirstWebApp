package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<ToDo> todos = new ArrayList<>();

    private static int todosCount = 0;


    static {

        todos.add(new ToDo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++todosCount, "in28minutes", "Learn Devops", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++todosCount, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(1), false));
    }

    public List<ToDo> findByUsername(String username) {
        return todos;
    }

    public void addTodo (String Username, String description, LocalDate targetDate, boolean done) {
        ToDo todo = new ToDo(++todosCount, Username, description, targetDate, done);
        todos.add(todo);
        ++todosCount;
    }
}
