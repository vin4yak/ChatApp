package com.chatapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.chatapp.domain.User;

@Repository
public class UserRepository {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public void createUser(User user){
		mongoOperations.save(user);
	}
	
	public void updateUser(User user){
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(user.getMobileNo()));
		Update update = new Update();
		if(user.getName() != null){
			update.set("name", user.getName());
		}
		if(user.getStatus() != null){
			update.set("status", user.getStatus());
		}
		mongoOperations.updateFirst(query, update, User.class);
	}

}
