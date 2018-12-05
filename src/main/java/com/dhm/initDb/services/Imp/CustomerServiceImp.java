package com.dhm.initDb.services.Imp;

import com.dhm.initDb.repositories.CRM.CustomerRepository;
import com.dhm.initDb.repositories.CRM.ProjectRepository;
import com.dhm.initDb.repositories.CRM.entities.Customer;
import com.dhm.initDb.repositories.CRM.entities.Project;
import com.dhm.initDb.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository ;

    @Autowired
    private ProjectRepository projectRepository ;

    @Override
    public Customer addCustomer(Customer customer) {
        Customer customerToSave = customerRepository.save(new Customer(null, customer.getCompanyName(),
                customer.getFirstCollaborationDate(), customer.getFirstContactDate(), customer.getContactList(),
                customer.getBizDevsIds(), new ArrayList<Project>()));
        if ((customer.getProjects() != null) && (customer.getProjects().size() > 0)) {
            customer.getProjects().forEach(project -> {
                project.setCustomer(customerToSave);
                customerToSave.getProjects().add(projectRepository.save(project));
            });
        }

        customerRepository.save(customerToSave);
        return customerToSave;
    }
}
