package es.johnnyRey.springmvcmongo.web.dao;

import org.springframework.stereotype.Component;

import es.johnnyRey.springmvcmongo.web.beans.UserBean;

public interface UserDAO {

	public abstract int insertUser(UserBean user);


	
}