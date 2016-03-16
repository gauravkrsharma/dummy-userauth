package org.dummy.repo;

import java.security.InvalidParameterException;
import java.util.List;

import org.dummy.model.DomainUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<DomainUser,Integer> {

	public List<DomainUser> findAll();
	public DomainUser findOne(Integer Id) throws InvalidParameterException;
	public <S extends DomainUser> S save(S arg0);
	
}
