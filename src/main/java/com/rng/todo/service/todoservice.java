package com.rng.todo.service;

import java.util.List;

import com.rng.todo.models.Todo;

public interface todoservice {
	public int addtodoservice(Todo todo);

	public List<Todo> getalldata();

	public Todo gettodo(int id);

	public void deleteservice(int id);

}
