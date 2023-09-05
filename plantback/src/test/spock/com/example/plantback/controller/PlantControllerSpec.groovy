package com.example.plantback.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PlantControllerSpec extends Specification {

    @Autowired
    private TestRestTemplate restTemplate

    @LocalServerPort
    private int port

    def "GET /basic should return 'Hello world'"() {
        when:
        def responseEntity = restTemplate.getForEntity("http://localhost:$port/basic", String)

        then:
        responseEntity.statusCode.value() == 200
        responseEntity.body == "Hello world"
    }
}
