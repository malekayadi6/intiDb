package com.dhm.initDb.repositories.user.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
@Data
public class User extends AbstractAuditingEntity implements Serializable {

	@Id
	private String id;

	private String userName;

	private String password;


	private String firstName;


	private String secondName;


	private String mail;

	private boolean activated = false;

	private String profilePicture;

	private String signature;

	private String type;

	private String birthDay;

	private String gender;

	private String nationality;

	private String cityOfBirth;

	private String address;

	private String city;

	private String zipCode;

	private String telephoneNumber;

	private String passportNumber;

	private String socialSecurityNumber;

	private String identityNumber;

	private String entryDate;

	private double soldeRttPris;

	private double soldeCpnPris;

	private double soldeCpn1Pris;

	private double soldeRttAcquis;

	private double soldeCpnAcquis;

	private double soldeCpn1Acquis;

	@DBRef
	private Authority authority;

	@DBRef
	private List<Skills> skills = new ArrayList<>();

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		User user = (User) o;
		return !(user.getId() == null || getId() == null) && Objects.equals(getId(), user.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", mail=" + mail + ", activated=" + activated + ", profilePicture="
				+ profilePicture + ", signature=" + signature + ", type=" + type + ", birthDay=" + birthDay
				+ ", gender=" + gender + ", nationality=" + nationality + ", cityOfBirth=" + cityOfBirth + ", address="
				+ address + ", city=" + city + ", zipCode=" + zipCode + ", telephoneNumber=" + telephoneNumber
				+ ", passportNumber=" + passportNumber + ", socialSecurityNumber=" + socialSecurityNumber
				+ ", identityNumber=" + identityNumber + ", entryDate=" + entryDate + ", soldeRttPris=" + soldeRttPris
				+ ", soldeCpnPris=" + soldeCpnPris + ", soldeCpn1Pris=" + soldeCpn1Pris + ", soldeRttAcquis="
				+ soldeRttAcquis + ", soldeCpnAcquis=" + soldeCpnAcquis + ", soldeCpn1Acquis=" + soldeCpn1Acquis
				+ ", authority=" + authority + ", skills=" + skills + "]";
	}



}
