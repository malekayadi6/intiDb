package com.dhm.initDb;

import com.dhm.initDb.dto.UserDTO;
import com.dhm.initDb.repositories.CRM.entities.Contact;
import com.dhm.initDb.repositories.CRM.entities.Customer;
import com.dhm.initDb.repositories.CRM.entities.Project;
import com.dhm.initDb.repositories.user.SkillsRepository;
import com.dhm.initDb.repositories.user.entities.Skills;
import com.dhm.initDb.repositories.user.entities.User;
import com.dhm.initDb.repositories.worksheet.WorksheetRepository;
import com.dhm.initDb.repositories.worksheet.entities.Worksheet;
import com.dhm.initDb.services.CustomerService;
import com.dhm.initDb.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;



@Slf4j
@SpringBootApplication
public class InitDbApplication implements CommandLineRunner {


	@Autowired
	private UserService userService ;

	@Autowired
	private CustomerService customerService ;

	@Autowired
    WorksheetRepository worksheetRepository ;

	@Autowired
    SkillsRepository skillsRepository ;

/*
	@Autowired
	SecondaryRepository secondaryRepository ;*/

	public static void main(String[] args) {
		SpringApplication.run(InitDbApplication.class, args);
	}




	@Override
	@Transactional
	public void run(String... args) throws Exception{
          int n = 8 ;

        log.info("start spring init db ");
          if (args != null && args.length > 0 ) {
              try {
                  n = Integer.parseInt(args[0]);
              } catch (NumberFormatException e) {
                  log.error(e.getMessage());// new NumberFormatException("argument error");
              }
          }
            Map<String, String> projects = new LinkedHashMap<String, String>();

            Map<String, String> absence = new LinkedHashMap<String, String>();
            Map<String, String> interne = new LinkedHashMap<String, String>();
            Map<String, String> abscenceDetails = new LinkedHashMap<String, String>();


        Skills skillsJva =new Skills() ;
        skillsJva.setName("JAVA");
        skillsRepository.save(skillsJva) ;
        Skills skillsAngular =new Skills() ;

        skillsAngular.setName("Angular");
        skillsRepository.save(skillsAngular) ;
        Skills skillsNode =new Skills() ;

        skillsNode.setName("NodeJs");
        skillsRepository.save(skillsNode) ;


        for (int i=1 ; i<=31 ; i++ ){
            projects.put(String.valueOf(i) , "1") ;
        }
        for (int i=1 ; i<=31 ; i++ ){
            absence.put(String.valueOf(i) , "0") ;
        }
        for (int i=1 ; i<=31 ; i++ ){
            interne.put(String.valueOf(i) , "0") ;
        }
        for (int i=1 ; i<=31 ; i++ ){
            interne.put(String.valueOf(i) , "0") ;
        }
	    for (int i=0; i< n ; i++ ) {
            Customer customer = new Customer();
            customer.setCompanyName("Customer " + RandomStringUtils.random(8, true, false));
            customer.setFirstCollaborationDate("2018-10-16");
            customer.setCreatedBy("Admin");

            List<Contact> contacts = new ArrayList<>();
            List<Project> projectList = new ArrayList<>();

            List<String> webdDev = new ArrayList<String>();
            List<String> bizDev = new ArrayList<String>();

            for (int j = 0; j <= (n/2) +1; j++) {
                Contact contact = new Contact();
                contact.setEmail( RandomStringUtils.random(10, true, false)+"@dhm.com");
                contact.setFirstName(RandomStringUtils.random(10, true, false));
                contact.setLastName(RandomStringUtils.random(10, true, false));
                contact.setTelephoneNumber(RandomStringUtils.random(8, false, true));
                contacts.add(contact);
            }
            customer.setContactList(contacts);


            for (int j = 0; j <= (n/2) +1; j++) {
                Project project = new Project();
                Contact contact = new Contact();
                contact.setEmail(RandomStringUtils.random(10, true, false)+"@dhm.com");
                contact.setFirstName(RandomStringUtils.random(10, true, false));
                contact.setLastName(RandomStringUtils.random(10, true, false));
                contact.setTelephoneNumber("00000000000");
                project.setContact(contact);
                project.setDescription(" Description DescriptionDescription                       DescriptionDescriptionDescription DescriptionDescription" +
                        " DescriptionDescriptionDescriptionDescriptionDescription" +
                        "DescriptionDescriptionDescriptionDescriptionDescription" +
                        "DescriptionDescriptionDescriptionDescriptionDescription" +
                        "DescriptionDescriptionDescriptionDescriptionDescription" +
                        "DescriptionDescriptionDescriptionDescriptionDescription" +
                        " DescriptionDescriptionDescriptionDescriptionDescription" +
                        " DescriptionDescriptionDescriptionDescriptionDescription" +
                        " DescriptionDescriptionDescriptionDescriptionDescriptionDescription");


                project.setProjectName("project " + RandomStringUtils.random(10, true, true));
                project.setStartDate("2018-05-01");
                project.setEndDate("2020-05-01");

                for (int k = 0; k < (n/2)+1;  k++ ) {
                    UserDTO userDTO = new UserDTO();

                    userDTO.setActivated(true);
                    userDTO.setAddress("my address ");
                    userDTO.setBirthDay("2018-01-11");
                    userDTO.setCity("paris");
                    userDTO.setEntryDate("2018-01-10");
                    userDTO.setMail(RandomStringUtils.random(10, true, false)+"@dhm.com");
                    userDTO.setAuthority("WEBDEV");
                    userDTO.setSecondName(RandomStringUtils.random(10, true, false));
                    userDTO.setFirstName( RandomStringUtils.random(10, true, false));
                    userDTO.setUserName(RandomStringUtils.random(10, true, false) + k);

                    webdDev.add(userService.createUser(userDTO).getId() ) ;


                }
                project.setWebDevIds(webdDev);
                projectList.add(project);
            }
            customer.setProjects(projectList);
            for (int j = 0; j <= (n/2) +1; j++) {
                UserDTO userDTO = new UserDTO();
                userDTO.setActivated(true);
                userDTO.setAddress("my address ");
                userDTO.setBirthDay("2018-01-11");
                userDTO.setCity("paris");
                userDTO.setEntryDate("2018-01-10");
                userDTO.setMail(RandomStringUtils.random(10, true, false)+"@dhm.com");
                userDTO.setAuthority("BIZDEV");
                userDTO.setFirstName(RandomStringUtils.random(10, true, false) + j);
                userDTO.setSecondName(RandomStringUtils.random(10, true, false));
                User user = userService.createUser(userDTO);
                bizDev.add(user.getId());
            }



            customer.setBizDevsIds(bizDev);



          Customer customerSave =  customerService.addCustomer(customer);
            Worksheet workSheet;



            for (Project customerProject : customerSave.getProjects()) {

                for (String webdDevId : customerProject.getWebDevIds()) {

                    workSheet = new Worksheet();
                    workSheet.setProjectId(customerProject.getId());
                    workSheet.setWebDevId(webdDevId);
                    workSheet.setTicketResto(22);
                    workSheet.setProjectResponsableComment(RandomStringUtils.random(10, true, false));
                    workSheet.setYear(2018);
                    workSheet.setMonth(10);
                    workSheet.setProjects(projects);
                    workSheet.setAbsence(absence);
                    workSheet.setAbscenceDetails(abscenceDetails);
                    workSheet.setInterne(interne);


                    worksheetRepository.save(workSheet);

                }


            }


        }

    /**/


	}
}
