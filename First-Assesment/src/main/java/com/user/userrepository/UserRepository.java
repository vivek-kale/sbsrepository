package com.user.userrepository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.user.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {

User findById(int id);
//	@Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
//    @Transactional(readOnly = true)
//    Collection<User> findByMngrid(mngrid);

@Query(value = "select * from userinfo b where b.mngrid=?1", nativeQuery = true)
	Collection<User> findByMngrid(String mngrid);

	
}
