package com.dhm.initDb.dto;

import com.dhm.initDb.repositories.user.entities.ModuleAction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
;
import java.util.List;
import java.util.Set;


@Data
@NoArgsConstructor @AllArgsConstructor
public class UserDTO {
    @Id
    private String id;
    private String userName;
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
    private String authority;
    private Set<ModuleAction> permissions;
    private List<String> skills;
    private String entryDate;
    private double soldeRttPris;
    private double soldeCpnPris;
    private double soldeCpn1Pris;
    private double soldeRttAcquis;
    private double soldeCpnAcquis;
    private double soldeCpn1Acquis;


}
