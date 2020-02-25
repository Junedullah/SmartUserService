/**SmartSoftware User - Service */
/**
 * Description: Interface for RepositoryUserSession 
 * Name of Project: SmartSoftware
 * Created on: March 23, 2020
 * Modified on: March 23, 2020 10:19:38 AM
 * @author Juned
 * Version: 
 */
package com.ss.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.model.UserSession;

@Repository("repositoryUserSession")
public interface RepositoryUserSession extends JpaRepository<UserSession, Integer> {

	/**
	 * @param userId
	 * @param deleted
	 * @return
	 */
	public UserSession findByUserUserIdAndIsDeleted(int userId, boolean deleted);

	/**
	 * @param userId
	 * @param session
	 * @param deleted
	 * @return
	 */
	public UserSession findByUserUserIdAndSessionAndIsDeleted(int userId, String session, boolean deleted);

	/**
	 * @param session
	 * @param deleted
	 * @return
	 */
	public UserSession findBySessionAndIsDeleted(String session, boolean deleted);
	
	/*List<UserSession> findByUserRoleRoleId(int roleId);
	
	List<UserSession> findByUserRoleRoleId(int roleId,Pageable pageable);*/
   
}
