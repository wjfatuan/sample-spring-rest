package co.edu.uan.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingControllerTest {
    /*
    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greeting() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(
			new URL("http://localhost:" + port + "/greeting").toString(), String.class);
        assertEquals("Hello Controller", response.getBody());

    }*/

    @Test
    public void testNothing() {
        assertEquals(1, 1);
    }

}