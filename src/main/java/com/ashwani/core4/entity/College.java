package com.ashwani.core4.entity;


public class College {
	private long collegeId;
	private String collegeName;

	public College(long collegeId, String collegeName) {
		super();
		this.collegeId =  collegeId;
		this.collegeName = collegeName;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}

}
