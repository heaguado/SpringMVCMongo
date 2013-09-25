package es.johnnyRey.springmvcmongo.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.johnnyRey.springmvcmongo.web.beans.UserBean;
import es.johnnyRey.springmvcmongo.web.dao.UserDAO;
import es.johnnyRey.springmvcmongo.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	/* (non-Javadoc)
	 * @see es.johnnyRey.springmvcmongo.web.service.impl.UserService#insertNewUser(es.johnnyRey.springmvcmongo.web.beans.UserBean)
	 */
	@Override
	public int insertNewUser(UserBean user) {
		
		int ret = userDAO.insertUser(user);
		
		return ret;
		
	}
	
	
}
