package com.ss.util;
/**SmartSoftware User - Service */
/**
 * Description: CodeGenerator
 * Name of Project: SmartSoftware
 * Created on: Feb 10, 2020
 * Modified on: Feb 10, 2020 4:19:38 PM
 * @author Juned
 * Version: 
 */

/*package com.smartsoft.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smartsoft.constant.SmartCodeType;
import com.smartsoft.model.AccessRole;
import com.smartsoft.model.Company;
import com.smartsoft.model.RoleGroup;
import com.smartsoft.model.User;
import com.smartsoft.model.UserGroup;
import com.smartsoft.repository.RepositoryAccessRole;
import com.smartsoft.repository.RepositoryCompany;
import com.smartsoft.repository.RepositoryRoleGroup;
import com.smartsoft.repository.RepositoryUser;
import com.smartsoft.repository.RepositoryUserGroup;



@Component
public class CodeGenerator {

	@Autowired
	RepositoryUserGroup repositoryUserGroup;

	@Autowired
	RepositoryAccessRole repositoryAccessRole;

	@Autowired
	RepositoryRoleGroup repositoryRoleGroup;

	@Autowired
	RepositoryUser repositoryUser;

	@Autowired
	RepositoryCompany repositoryCompany;

	*//**
	 * @param codeType
	 * @return
	 *//*
	public String getGeneratedCode(String codeType) {
		String generatedCode = null;
		int codeId = 1000;
		//User Group Code
		if (SmartCodeType.USERGROUP.name().equalsIgnoreCase(codeType)) {
			UserGroup userGroup = repositoryUserGroup.findTop1ByOrderByUserGroupIdDesc();
			if (userGroup != null) {
				String[] codeList = userGroup.getGroupCode().split("-");
				codeId = Integer.parseInt(codeList[1]) + 1;
				generatedCode = "UG-" + codeId;
			} else {
				generatedCode = "UG-" + codeId;
			}
		}
		//Role Code
		if (SmartCodeType.ROLE.name().equalsIgnoreCase(codeType)) {
			AccessRole applicationRole = repositoryAccessRole.findTop1ByOrderByAccessRoleIdDesc();
			if (applicationRole != null) {
				if (applicationRole.getRoleCode() != null && applicationRole.getRoleCode().contains("-")) {
					String[] codeList = applicationRole.getRoleCode().split("-");
					codeId = Integer.parseInt(codeList[1]) + 1;
					generatedCode = "R-" + codeId;
				} else {
					generatedCode = "R-" + codeId;
				}
			} else {
				generatedCode = "R-" + codeId;
			}
		}
		//Role Group Code
		if (SmartCodeType.ROLEGROUP.name().equalsIgnoreCase(codeType)) {
			RoleGroup roleGroup = repositoryRoleGroup.findTop1ByOrderByRoleGroupIdDesc();
			if (roleGroup != null) {
				String[] codeList = roleGroup.getRoleGroupCode().split("-");
				codeId = Integer.parseInt(codeList[1]) + 1;
				generatedCode = "RG-" + codeId;
			} else {
				generatedCode = "RG-" + codeId;
			}
		}
				
		//Employee Id Code
		if (SmartCodeType.EMPLOYEECODE.name().equalsIgnoreCase(codeType)) {
			User user = repositoryUser.findTop1ByOrderByUserIdDesc();
			if (user != null) {
				if (user.getEmployeeCode() != null && user.getEmployeeCode().contains("-")) {
					String[] codeList = user.getEmployeeCode().split("-");
					codeId = Integer.parseInt(codeList[1]) + 1;
					generatedCode = "E-" + codeId;
				} else {
					generatedCode = "E-" + codeId;
				}
			} else {
				generatedCode = "E-" + codeId;
			}
		}
		//Company Code
		if (SmartCodeType.COMPANYCODE.name().equalsIgnoreCase(codeType)) {
			Company company = repositoryCompany.findTop1ByOrderByCompanyIdDesc();
			if (company != null) {
				if (company.getCompanyCode() != null && company.getCompanyCode().contains("_")) {
					String[] codeList = company.getCompanyCode().split("_");
					codeId = Integer.parseInt(codeList[1]) + 1;
					generatedCode = "C_" + codeId;
				} else {
					generatedCode = "C_" + codeId;
				}
			} else {
				generatedCode = "C_" + codeId;
			}
		}
		 
		return generatedCode;
	}
}
*/