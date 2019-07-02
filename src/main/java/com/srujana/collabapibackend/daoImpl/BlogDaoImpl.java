package com.srujana.collabapibackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srujana.collabapibackend.dao.blogDao;
import com.srujana.collabapibackend.model.Blog;

@Component("blogDaoImpl")
public class BlogDaoImpl implements blogDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addBlog(Blog blog) {
		
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();
		session.save(blog);
		Transaction transaction=session.beginTransaction();
		transaction.commit();	
		session.close();	
			
	}

	@Override
	public List<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Blog getBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

}
