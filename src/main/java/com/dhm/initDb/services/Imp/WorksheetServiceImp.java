package com.dhm.initDb.services.Imp;

import com.dhm.initDb.repositories.worksheet.WorksheetRepository;
import com.dhm.initDb.repositories.worksheet.entities.Worksheet;
import com.dhm.initDb.services.WorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorksheetServiceImp implements WorksheetService {

    @Autowired
    private WorksheetRepository worksheetRepository ;

    @Override
    public Worksheet addWorksheet(Worksheet worksheet) {
        return worksheetRepository.save(worksheet);
    }
}
