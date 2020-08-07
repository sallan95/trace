package com.rubix.trace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubix.trace.Entities.Risk;
import com.rubix.trace.repository.RiskRepository;

@SpringBootTest
class TraceApplicationTests {

	@Autowired
	RiskRepository riskRepository;
	
	@Test
	void contextLoads() {
	}
	
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Risk riskA = riskRepository.findByName("low");
        assertNotNull(riskA);
        assertEquals(1, riskA.getRiskScore());

    }

}
