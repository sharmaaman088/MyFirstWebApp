package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<ToDo> todos = new ArrayList<>();

    static {

        todos.add(new ToDo(1, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(2, "in28minutes", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new ToDo(3, "in28minutes", "Learn Devops", LocalDate.now().plusYears(3), false));
    }

    public List<ToDo> findByUsername(String username) {
        return todos;
    }
}
