package org.dummy.service;

import java.util.ArrayList;
import java.util.List;

import org.dummy.model.DomainUser;
import org.dummy.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	static List<DomainUser> dummyUsers;
	static {
		DomainUser user1 = new DomainUser(1,"gaurav");
		DomainUser user2 = new DomainUser(2,"gaurav");
		DomainUser user3 = new DomainUser(3,"gaurav");
		dummyUsers = new ArrayList<DomainUser>();
		dummyUsers.add(user1);
		dummyUsers.add(user2);
		dummyUsers.add(user3);
		
	}
	
	@Autowired
	IUserRepo userRepo;
	@Override
	public Iterable<DomainUser> listAllUsers() {
			return userRepo.findAll();
	}

	@Override
	public DomainUser getUserbyId(Integer id) {
		return userRepo.findOne(id);
	}

	@Override
	public DomainUser saveUser(DomainUser newUser) {
		return userRepo.save(newUser);
	}

}
