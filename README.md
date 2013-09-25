SpringMVCMongo
==============

Spring MVC MongoDB Integration


Web application that integrates Spring 3.2.3 with MongoDB connector for Spring 1.1.0. 

I will be uploading new patches over time, extending functionality.



A simply use of MongoDB connector in this project:

Bean definition:
------------------

public class UserBean {

	private String id;
	private String name;
	private String surname;
	private String age;
	
	
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}



DAO:
---------

MongoTemplate will be automatically injected by Spring, so you can use it in your DAO, for example:

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
