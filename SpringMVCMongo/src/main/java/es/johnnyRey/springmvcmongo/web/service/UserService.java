package es.johnnyRey.springmvcmongo.web.service;

import es.johnnyRey.springmvcmongo.web.beans.UserBean;
import es.johnnyRey.springmvcmongo.web.dao.UserDAO;

public interface UserService {

	public abstract int insertNewUser(UserBean user);


}