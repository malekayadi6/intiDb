package com.dhm.initDb.repositories.worksheet;

import com.dhm.initDb.repositories.worksheet.entities.Invoice;

import java.util.List;

public interface CustomizedInvoiceRepository {

    List<Invoice> searchInvoices(String date, String customerId, String projectId, String webDevId, int from, int size);
}