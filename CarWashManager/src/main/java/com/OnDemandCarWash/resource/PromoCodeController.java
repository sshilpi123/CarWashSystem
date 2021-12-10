package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.PromoCode;
import com.OnDemandCarWash.repository.PromoCodeRepository;

@RestController
public class PromoCodeController {
	
	@Autowired
	private PromoCodeRepository repository;
	
//To Add the Promo codes
	@PostMapping("/addPromoCode")
	public int saveBook(@RequestBody PromoCode promo) {
		repository.save(promo);
		return promo.getId();
	}
	
//To Delete the Promo Codes
	@DeleteMapping("/deletePromoCode")
	public String deletePromoCode(@PathVariable int id) {
		repository.deleteById(id);
		return "PromoCode deleted with id: "+id;
	}
//To Find all the Promo Codes
	@GetMapping("/findAllPromoCodes")
	public List<PromoCode> getBooks(){
		return repository.findAll();
	}
}
