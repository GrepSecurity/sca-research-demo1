package com.loginsoft.research.nc_java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class NcJavaApplicationTests {

	@Test
	void contextLoads() {
	}

}
