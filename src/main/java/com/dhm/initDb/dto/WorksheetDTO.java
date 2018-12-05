package com.dhm.initDb.dto;


import com.dhm.initDb.repositories.worksheet.entities.WorksheetStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorksheetDTO {

    private String id;
    private String projectId;
    private String webDevId;
    private int month;
    private int year;
    private WorksheetStatus worksheetStatus;
    private Map<String, String> absence;
    private Map<String, String> interne;
    private Map<String, String> projects;
    private Map<String, String> abscenceDetails;
    private String projectResponsableComment;
    private String salaryManagementComment;
    private int ticketResto;
    private String prime;
    private String dateOfSignByDev;
    private String dateOfSignByCustomer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorksheetDTO that = (WorksheetDTO) o;
        return month == that.month &&
                year == that.year &&
                ticketResto == that.ticketResto &&
                Objects.equals(id, that.id) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(webDevId, that.webDevId) &&
                worksheetStatus == that.worksheetStatus &&
                Objects.equals(absence, that.absence) &&
                Objects.equals(interne, that.interne) &&
                Objects.equals(projects, that.projects) &&
                Objects.equals(abscenceDetails, that.abscenceDetails) &&
                Objects.equals(projectResponsableComment, that.projectResponsableComment) &&
                Objects.equals(salaryManagementComment, that.salaryManagementComment) &&
                Objects.equals(prime, that.prime) &&
                Objects.equals(dateOfSignByDev, that.dateOfSignByDev) &&
                Objects.equals(dateOfSignByCustomer, that.dateOfSignByCustomer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, projectId, webDevId, month, year, worksheetStatus, absence, interne, projects, abscenceDetails, projectResponsableComment, salaryManagementComment, ticketResto, prime, dateOfSignByDev, dateOfSignByCustomer);
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
