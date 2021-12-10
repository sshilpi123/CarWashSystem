package com.OnDemandCarWash.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.CarWashService;
import com.OnDemandCarWash.repository.CarWashServiceRepository;

//To manage the services

@RestController
public class CarWashServiceController {
	
	@Autowired
	private CarWashServiceRepository repository;
	
//To Add the services
	@PostMapping("/addService")
	public int saveBook(@RequestBody CarWashService cars) {
		repository.save(cars);
		return cars.getId();
	}
//To find the single service
	@GetMapping("/findSingleService/{id}")
	public Optional<CarWashService> getCarWashService(@PathVariable int id){
		return repository.findById(id);
	}
//To remove the service
	@DeleteMapping("/deleteService/{id}")
	public String deleteCarWashService(@PathVariable int id) {
		repository.deleteById(id);
		return "service deleted with id: "+id;
	}
	
//To find all the services
	@GetMapping("/findAllServices")
	public List<CarWashService> getBooks(){
		return repository.findAll();
	}
}
