package es.johnnyRey.springmvcmongo.web.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import es.johnnyRey.springmvcmongo.web.beans.UserBean;
import es.johnnyRey.springmvcmongo.web.dao.UserDAO;

/**
 * Abstract
 * @author johnnyRey
 *
 */

@Component
public final class UserDAOImpl extends AbstractMongoDBDAO implements UserDAO {

	@Autowired
	private MongoTemplate appMongoTemplate;
	
	/* (non-Javadoc)
	 * @see es.johnnyRey.springmvcmongo.web.dao.impl.UserDAO#insertUser(es.johnnyRey.springmvcmongo.web.beans.UserBean)
	 */
	@Override
	public int insertUser(UserBean user) {
		
		appMongoTemplate.insert(user, collection);
	
		return 0;
	}
	
	
	
}
