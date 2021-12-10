package com.OnDemandCarWash.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.AuthenticationRequest;
import com.OnDemandCarWash.model.AuthenticationResponse;
import com.OnDemandCarWash.model.UserModel;
import com.OnDemandCarWash.repository.UserRepository;
import com.OnDemandCarWash.services.UserService;
import com.OnDemandCarWash.utils.JwtUtil;


@RestController
public class Admin {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserService userService;
	@Autowired
	private JwtUtil jwtUtil;
	
//To Subscribe for admin
	@PostMapping("/subs")
	private ResponseEntity<?> subscibeCustomer(@RequestBody AuthenticationRequest authenticationRequest){
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();
	
		UserModel userModel = new UserModel();
		userModel.setUsername(username);
		userModel.setPassword(password);
		
		try {
			userRepository.save(userModel);
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error creating user with username: "+ username));
		}
		return ResponseEntity.ok(new AuthenticationResponse("Created user with username: "+ username));
	}
	
//For authentication
	@PostMapping("/auth")
	private ResponseEntity<?> authenticateCustomer(@RequestBody AuthenticationRequest authenticationRequest){
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}catch(Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("No user found with username: "+ username));
		}
		UserDetails loadedUser =userService.loadUserByUsername(username);
		String generatedToken = jwtUtil.generateToken(loadedUser);
		
		return ResponseEntity.ok(new AuthenticationResponse(generatedToken));
	}
	
//For home
	@GetMapping("/")
	public String home() {
		return ("<h1>GREEN CAR WASH</h1>"
				+ "Welcome " + SecurityContextHolder.getContext().getAuthentication().getName());

}
}
