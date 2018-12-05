package com.dhm.initDb.repositories.user.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Holiday implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private HolidayType type;
	private HolidayStatus status;
	private String comment;
	private int nbrDays;
	private String startDate;
	private String endDate;
	private String userId;
	private boolean adminNotif;
	private boolean userNotif;
	private String creationDate;
	private boolean checkedByJob;

	public Holiday(String id, HolidayType type, HolidayStatus status, String comment, int nbrDays, String startDate,
			String endDate, String userId, boolean adminNotif, boolean userNotif, String creationDate,
			boolean checkedByJob) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.comment = comment;
		this.nbrDays = nbrDays;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = userId;
		this.adminNotif = adminNotif;
		this.userNotif = userNotif;
		this.creationDate = creationDate;
		this.checkedByJob = checkedByJob;
	}

	public Holiday() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HolidayType getType() {
		return type;
	}

	public void setType(HolidayType type) {
		this.type = type;
	}

	public HolidayStatus getStatus() {
		return status;
	}

	public void setStatus(HolidayStatus status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getNbrDays() {
		return nbrDays;
	}

	public void setNbrDays(int nbrDays) {
		this.nbrDays = nbrDays;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isAdminNotif() {
		return adminNotif;
	}

	public void setAdminNotif(boolean adminNotif) {
		this.adminNotif = adminNotif;
	}

	public boolean isUserNotif() {
		return userNotif;
	}

	public void setUserNotif(boolean userNotif) {
		this.userNotif = userNotif;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isCheckedByJob() {
		return checkedByJob;
	}

	public void setCheckedByJob(boolean checkedByJob) {
		this.checkedByJob = checkedByJob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (adminNotif ? 1231 : 1237);
		result = prime * result + (checkedByJob ? 1231 : 1237);
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + nbrDays;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + (userNotif ? 1231 : 1237);
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
		Holiday other = (Holiday) obj;
		if (adminNotif != other.adminNotif)
			return false;
		if (checkedByJob != other.checkedByJob)
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nbrDays != other.nbrDays)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userNotif != other.userNotif)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Holiday [id=" + id + ", type=" + type + ", status=" + status + ", comment=" + comment + ", nbrDays="
				+ nbrDays + ", startDate=" + startDate + ", endDate=" + endDate + ", userId=" + userId + ", adminNotif="
				+ adminNotif + ", userNotif=" + userNotif + ", creationDate=" + creationDate + ", checkedByJob="
				+ checkedByJob + "]";
	}

}