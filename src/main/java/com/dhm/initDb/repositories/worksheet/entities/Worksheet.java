package com.dhm.initDb.repositories.worksheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;


@Data
@AllArgsConstructor @NoArgsConstructor
@Document
public class Worksheet implements Serializable {
    @Id
    private String id;
    private String projectId;
    private String webDevId;
    private int month;
    private int year;
    private WorksheetStatus worksheetStatus;
    private Map<String, String> absence = new LinkedHashMap<String, String>();
    private Map<String, String> interne = new LinkedHashMap<String, String>();
    private Map<String, String> projects = new LinkedHashMap<String, String>();
    private Map<String, String> abscenceDetails = new LinkedHashMap<String, String>();
    private String projectResponsableComment;
    private String salaryManagementComment;
    private int ticketResto;
    private String prime;
    private String dateOfSignByDev;
    private String dateOfSignByCustomer;


    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Worksheet worksheet = (Worksheet) object;
        return month == worksheet.month &&
                year == worksheet.year &&
                ticketResto == worksheet.ticketResto &&
                Objects.equals(id, worksheet.id) &&
                Objects.equals(projectId, worksheet.projectId) &&
                Objects.equals(webDevId, worksheet.webDevId) &&
                Objects.equals(worksheetStatus, worksheet.worksheetStatus) &&
                Objects.equals(absence, worksheet.absence) &&
                Objects.equals(interne, worksheet.interne) &&
                Objects.equals(projects, worksheet.projects) &&
                Objects.equals(abscenceDetails, worksheet.abscenceDetails) &&
                Objects.equals(projectResponsableComment, worksheet.projectResponsableComment) &&
                Objects.equals(salaryManagementComment, worksheet.salaryManagementComment) &&
                Objects.equals(prime, worksheet.prime) &&
                Objects.equals(dateOfSignByDev, worksheet.dateOfSignByDev) &&
                Objects.equals(dateOfSignByCustomer, worksheet.dateOfSignByCustomer);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), id, projectId, webDevId, month, year, worksheetStatus, absence, interne, projects, abscenceDetails, projectResponsableComment, salaryManagementComment, ticketResto, prime, dateOfSignByDev, dateOfSignByCustomer);
    }

    @Override
    public String toString() {
        return "Worksheet{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", webDevId='" + webDevId + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", worksheetStatus=" + worksheetStatus +
                ", absence=" + absence +
                ", interne=" + interne +
                ", projects=" + projects +
                ", abscenceDetails=" + abscenceDetails +
                ", projectResponsableComment='" + projectResponsableComment + '\'' +
                ", salaryManagementComment='" + salaryManagementComment + '\'' +
                ", ticketResto=" + ticketResto +
                ", prime='" + prime + '\'' +
                ", dateOfSignByDev='" + dateOfSignByDev + '\'' +
                ", dateOfSignByCustomer='" + dateOfSignByCustomer + '\'' +
                '}';
    }
}