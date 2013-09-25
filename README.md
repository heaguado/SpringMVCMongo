SpringMVCMongo
==============

Spring MVC MongoDB Integration


This integrates Spring 3.2.3 with MongoDB connector for Spring 1.1.0.




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
