package com.vamsi.dating.dao;

import java.util.List;

import com.vamsi.dating.model.UserAccount;

public interface UserAccountDAO {

	void save(UserAccount userAccount);
	
	UserAccount findById(int id);
	
	List<UserAccount> findAll();
	
	List<UserAccount> findMatches(int age,String city);
	
	void delete(int id);

}
