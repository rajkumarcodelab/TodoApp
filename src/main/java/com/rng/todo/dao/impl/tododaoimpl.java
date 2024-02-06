package com.rng.todo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rng.todo.dao.tododao;
import com.rng.todo.models.Todo;



@Repository
public class tododaoimpl implements tododao {
	@Autowired
	SessionFactory factory;

	@SuppressWarnings("deprecation")
	public int adddata(Todo todo) {

		Session session = factory.openSession();
		session.saveOrUpdate(todo);
		session.beginTransaction().commit();

		session.close();

		return 0;
	}

	public List<Todo> getalllist() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Todo");
		List<Todo> list = query.list();

		session.close();
		return list;
	}

	@Override
	public void deleteid(int id) {
		Session session = factory.openSession();
		Query query = session.createQuery("delete Todo where id=:x ");
		query.setParameter("x", id);
		Transaction tx = session.beginTransaction();
		query.executeUpdate();
		tx.commit();

		session.close();

	}

	@Override
	public Todo gettododao(int id) {
		Session session = factory.openSession();
		Todo todo = session.get(Todo.class, id);

		session.close();

		return todo;
	}

}
