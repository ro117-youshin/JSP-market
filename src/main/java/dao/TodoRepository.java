package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Todo;

public class TodoRepository {
    private static long currentId = 0;

    private List<Todo> todos = new ArrayList<>();

    private static TodoRepository instance = new TodoRepository();

    public static TodoRepository getInstance() {
        return instance;
    }

    public List<Todo> getTodos() {
        return todos;
    }
    // 추가하는 로직
    public void addTodo(Todo todo) {
        todo.setId(currentId);
        currentId++;
        todos.add(todo);
    }
    // 토글 로직
    public void toggle(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setDone(!todo.isDone());
                break;
            }
        }
    }
    // 삭제하는 로직
    public void remove(long id) {
        Todo removeTodo = null;
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                removeTodo = todo;
                break;
            }
        }
        todos.remove(removeTodo);
    }
}

