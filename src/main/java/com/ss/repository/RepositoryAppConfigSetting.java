/**
 * SST - SMART SOFTWARE TECH.
 * Copyright @ 2020 SST.
 *
 * All rights reserved.
 *
 * THIS PRODUCT CONTAINS CONFIDENTIAL INFORMATION  OF SST.
 * USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE
 * PRIOR EXPRESS WRITTEN PERMISSION OF SST.
 */
package com.ss.repository;

import com.ss.model.AppConfigSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description: Interface for RepositoryAppConfigSetting 
 * Name of Project:SST
 * Created on: FEB 18, 2020
 * Modified on: FEB 19, 2020 11:19:38 AM
 *
 * @author Tehmina ALi
 * Version:
 */
@Repository("repositoryAppConfigSetting")
public interface RepositoryAppConfigSetting extends JpaRepository<AppConfigSetting, Integer> {

	/**
	 * @param appConfigName
	 * @param deleted
	 * @return
	 */
	AppConfigSetting findByConfigNameAndIsDeleted(String appConfigName, Boolean deleted);

}
