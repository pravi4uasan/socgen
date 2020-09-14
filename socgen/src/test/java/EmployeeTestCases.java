

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.socgen.entity.Employee;

import lombok.SneakyThrows;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeTestCases {
	
	@Test
	void contextLoads() {
	}
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	@SneakyThrows
	public void EmloyeTest() {
		
		Employee employe = new Employee();
		
		employe.setFirstName("praveen");
		employe.setLastName("vk");
		employe.setDepartment("IT");
		MvcResult result=mvc.perform(
				MockMvcRequestBuilders.post("/employee").content(asJsonString(employe))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status=result.getResponse().getStatus();
		assert(200 == status);
		
	}
	
	private static String asJsonString(final Object obj) {
		try {
			String jsonString=new ObjectMapper().writeValueAsString(obj);
			//log.info("jsonString>>"+jsonString);
			return new ObjectMapper().writeValueAsString(obj);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
