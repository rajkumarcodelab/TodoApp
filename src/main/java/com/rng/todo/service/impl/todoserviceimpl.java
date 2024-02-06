package com.rng.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rng.todo.models.Todo;
import com.rng.todo.service.todoservice;

@Service
public class todoserviceimpl implements todoservice {
	@Autowired
	public com.rng.todo.dao.tododao tododao;

	@Override
	public int addtodoservice(Todo todo) {

		tododao.adddata(todo);

		return 0;
	}

	@Override
	public List<Todo> getalldata() {

		List<Todo> list = tododao.getalllist();

		return list;
	}

	@Override
	public void deleteservice(int id) {

		tododao.deleteid(id);

	}

	@Override
	public Todo gettodo(int id) {

		Todo todo = tododao.gettododao(id);

		return todo;
	}

}
