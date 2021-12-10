package com.OnDemandCarWash.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.OnDemandCarWash.model.Customer;
import com.OnDemandCarWash.repository.CustomerRepository;
import com.OnDemandCarWash.services.Cutomerservice;

@SpringBootTest
public class CustomerTest {

	@Autowired
	private Cutomerservice customerservice;
	
	@MockBean
	private CustomerRepository repo;
	
	@Test
	public void saveCustomerTest() {
		Customer cust= new Customer(1,"shilpiu","singh",13244564,"patna","shilpi@gmail.com",true );
		when(repo.save(cust)).thenReturn(cust);
		assertEquals(cust,customerservice .addCustomer(cust));
	}
	
	
}
