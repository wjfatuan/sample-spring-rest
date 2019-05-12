package co.edu.uan.app.rest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import co.edu.uan.rest.PersonRepository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryIntegrationTest {
 
    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private PersonRepository employeeRepository;
 
    // write test cases here

    public Object deleteThis() {
        if(entityManager==null) {
            return employeeRepository;
        }
        else {
            return entityManager;
        }
    }
 
}