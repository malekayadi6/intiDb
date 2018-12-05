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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;
    private String projectName;
    private String startDate;
    private String endDate;
    private String description;
    private Contact contact = new Contact();
    private List<String> webDevIds = new ArrayList<String>();
    private List<String> skillsIds = new ArrayList<String>();
    @DBRef
    private Customer customer;



    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", projectName='" + projectName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", description='" + description + '\'' +
                ", contact=" + contact +
                ", webDevIds=" + webDevIds +
                ", skillsIds=" + skillsIds +
                ", customer=" + customer +
                '}';
    }
}
