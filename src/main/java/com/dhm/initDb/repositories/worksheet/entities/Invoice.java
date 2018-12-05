package com.dhm.initDb.repositories.worksheet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Invoice implements Serializable {

    @Id
    private String id;
    private String number;
    private String date;
    private String label;
    private float quantity;
    private float unitPriceExclTax;
    private float discount;
    private float amountExcelTax;
    private float vat;
    private String dueDate;
    private InvoiceStatus invoiceStatus;
    private String customerId;
    private String projectId;
    private String webDevId;
    private String worksheetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return quantity == invoice.quantity &&
                Float.compare(invoice.unitPriceExclTax, unitPriceExclTax) == 0 &&
                Float.compare(invoice.discount, discount) == 0 &&
                Float.compare(invoice.amountExcelTax, amountExcelTax) == 0 &&
                Float.compare(invoice.vat, vat) == 0 &&
                Objects.equals(id, invoice.id) &&
                Objects.equals(date, invoice.date) &&
                Objects.equals(label, invoice.label) &&
                Objects.equals(dueDate, invoice.dueDate) &&
                invoiceStatus == invoice.invoiceStatus &&
                Objects.equals(customerId, invoice.customerId) &&
                Objects.equals(projectId, invoice.projectId) &&
                Objects.equals(webDevId, invoice.webDevId) &&
                Objects.equals(worksheetId, invoice.worksheetId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, label, quantity, unitPriceExclTax, discount, amountExcelTax, vat, dueDate, invoiceStatus, customerId, projectId, webDevId, worksheetId);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", label='" + label + '\'' +
                ", quantity=" + quantity +
                ", unitPriceExclTax=" + unitPriceExclTax +
                ", discount=" + discount +
                ", amountExcelTax=" + amountExcelTax +
                ", vat=" + vat +
                ", dueDate='" + dueDate + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                ", customerId='" + customerId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", webDevId='" + webDevId + '\'' +
                ", worksheetId='" + worksheetId + '\'' +
                '}';
    }
}