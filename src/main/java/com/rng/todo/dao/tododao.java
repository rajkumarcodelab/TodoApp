package com.rng.todo.dao;

import java.util.List;

import com.rng.todo.models.Todo;

public interface tododao {

	public int adddata(Todo todo);

	public List<Todo> getalllist();

	public Todo gettododao(int id);

	public void deleteid(int id);

}
