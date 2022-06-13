/**
 * 
 */
package com.user.service.userservice.vo;

/**
 * @author mpoli
 *
 */
public class Department {
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String depatmentCode;
	
	
	
	
	
	public Department() {
		super();
	}
	public Department(Long departmentId, String departmentName, String departmentAddress, String depatmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.depatmentCode = depatmentCode;
	}
	/**
	 * @return the departmentId
	 */
	public Long getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the departmentAddress
	 */
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	/**
	 * @param departmentAddress the departmentAddress to set
	 */
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	/**
	 * @return the depatmentCode
	 */
	public String getDepatmentCode() {
		return depatmentCode;
	}
	/**
	 * @param depatmentCode the depatmentCode to set
	 */
	public void setDepatmentCode(String depatmentCode) {
		this.depatmentCode = depatmentCode;
	}
	
	
}

