package com.example.plantback.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification

@ActiveProfiles("test")
@WebMvcTest(PlantController)
class PlantControllerSpec extends Specification {

    @Autowired
    private MockMvc mvc

    def "GET /test should return 'Hello world'"() {
        when:
        def response = mvc.perform(MockMvcRequestBuilders.get("/test"))

        then:
        response.andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string('Hello world'))

    }
}
