/*
package com.dhm.initDb.services.Imp;

import com.dhm.initDb.dto.UserDTO;
import com.dhm.initDb.repositories.CRM.CustomerRepository;
import com.dhm.initDb.repositories.CRM.ProjectRepository;
import com.dhm.initDb.repositories.CRM.entities.Customer;
import com.dhm.initDb.repositories.CRM.entities.Project;
import com.dhm.initDb.repositories.user.AuthorityRepository;
import com.dhm.initDb.repositories.user.UserRepository;
import com.dhm.initDb.repositories.user.entities.Authority;
import com.dhm.initDb.repositories.user.entities.User;
import com.dhm.initDb.repositories.worksheet.WorksheetRepository;
import com.dhm.initDb.services.InitDbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@Slf4j
public class InitDbServiceImp implements InitDbService {


    @Autowired
    private WorksheetRepository worksheetRepository ;
    @Autowired
    private UserRepository userRepository ;
    @Autowired
    private ProjectRepository projectRepository ;
    @Autowired
    private CustomerRepository customerRepository ;
    @Autowired
    private AuthorityRepository authorityRepository ;






    public initDb(int n){

        for (int i=0; i<= n ; i++ ) {
            Customer customer = new Customer();
            customer.setCompanyName("Customer" + (i + 1));
            customer.setFirstCollaborationDate("2018-10-16");
            customer.setCreatedBy("Admin");

        }

    }







    private User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setFirstName(userDTO.getFirstName());
        user.setSecondName(userDTO.getSecondName());
        user.setMail(userDTO.getMail());
        user.setType(userDTO.getType());
        user.setPassword("$2a$10$ZxfWYmi/0WoICxG8vn85AeAIItJxd6R.fPFoocXxw8b7sn94KAOhW");
        if (userDTO.getAuthority() != null) {
            Authority authority = authorityRepository.findByName(userDTO.getAuthority());
            user.setAuthority(authority);
        }
        user.setActivated(false);
        User newUser = userRepository.save(user);

        log.info("Created Information for User: {}", newUser.getId());
        return newUser;
    }


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
*/
