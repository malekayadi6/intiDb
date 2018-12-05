package com.dhm.initDb.repositories.CRM.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer extends AbstractAuditingEntity implements Serializable {

	@Id
	private String id;
	private String companyName;
	private String firstCollaborationDate;
	private String firstContactDate;
	private List<Contact> contactList = new ArrayList<>();
	private List<String> bizDevsIds = new ArrayList<String>();
	@DBRef
	private List<Project> projects = new ArrayList<Project>();


}