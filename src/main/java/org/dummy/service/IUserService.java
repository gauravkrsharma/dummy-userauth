package org.dummy.service;

import org.dummy.model.DomainUser;

public interface IUserService {

	Iterable<DomainUser> listAllUsers();
	DomainUser getUserbyId(Integer id);
	DomainUser saveUser(DomainUser newUser);

}
