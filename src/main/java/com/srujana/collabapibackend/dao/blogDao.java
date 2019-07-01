package com.srujana.collabapibackend.dao;

import java.util.List;

import com.srujana.collabapibackend.model.Blog;

public interface blogDao {

	void addBlog(Blog blog);
	List<Blog>  getAllBlogs();
	void editBlog(Blog blog); //editBlog(int blogId);
	void deleteBlog(Blog blog);
	Blog getBlog(int blogId);
}
