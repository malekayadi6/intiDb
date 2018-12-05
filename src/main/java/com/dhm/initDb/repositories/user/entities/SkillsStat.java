package com.dhm.initDb.repositories.user.entities;

public class SkillsStat {

	private Skills skills;
	private Long userCount;
	private Long totaluserCount;

	public SkillsStat() {
		super();
	}

	public SkillsStat(Skills skills, Long userCount, Long totaluserCount) {
		super();
		this.skills = skills;
		this.userCount = userCount;
		this.totaluserCount = totaluserCount;

	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public Long getUserCount() {
		return userCount;
	}

	public void setUserCount(Long userCount) {
		this.userCount = userCount;
	}

	public Long getTotaluserCount() {
		return totaluserCount;
	}

	public void setTotaluserCount(Long totaluserCount) {
		this.totaluserCount = totaluserCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((totaluserCount == null) ? 0 : totaluserCount.hashCode());
		result = prime * result + ((userCount == null) ? 0 : userCount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillsStat other = (SkillsStat) obj;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (totaluserCount == null) {
			if (other.totaluserCount != null)
				return false;
		} else if (!totaluserCount.equals(other.totaluserCount))
			return false;
		if (userCount == null) {
			if (other.userCount != null)
				return false;
		} else if (!userCount.equals(other.userCount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SkillsStat [skills=" + skills + ", userCount=" + userCount + ", totaluserCount=" + totaluserCount + "]";
	}

}
