package es.johnnyRey.springmvcmongo.web.dao.impl;

/**
 * Parent DAO
 * @author johnnyRey
 *
 */
public class AbstractMongoDBDAO {

	protected String collection;

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	
	
}
