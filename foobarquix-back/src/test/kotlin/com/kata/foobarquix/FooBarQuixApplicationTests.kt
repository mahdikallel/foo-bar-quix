package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class FooBarQuixApplicationTests {

	@Autowired
	lateinit var mockMvc: MockMvc

	@Test
	fun  should_invoke_convert_number_api() {
		mockMvc.perform(MockMvcRequestBuilders.get("/foo-bar-quix/15"))
				.andExpect(MockMvcResultMatchers.status().isOk)
				.andExpect(MockMvcResultMatchers.content().string("{\"result\":\"FooBarBar\"}"))
	}

}
