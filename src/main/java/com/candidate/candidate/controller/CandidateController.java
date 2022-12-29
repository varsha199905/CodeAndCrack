package com.candidate.candidate.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.candidate.model.UserDetails;
import com.candidate.service.ICandidateService;
import com.candidate.vo.UserDetailsVo;

@RestController

public class CandidateController {

	@Autowired
	ICandidateService candidateService;

	//Registration 
	@PostMapping(value = "/register-user", produces = "application/json") // REST API
	public ResponseEntity<UserDetails> userRegister(@RequestBody UserDetails userDetails) {

		return new ResponseEntity<UserDetails>(candidateService.saveUserData(userDetails), HttpStatus.OK);
	}

	
	
	// login User
	@PostMapping(value = "/login-user", produces = { "*/*" }, consumes = { "*/*" })
	//@PostMapping("/login-user")
	public ResponseEntity<?> loginUser(@RequestBody List<String> userParams) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		UserDetails userDetails = (candidateService.findByEmailIdAndPassword(userParams.get(0), userParams.get(1)));
		if (null != userDetails && null != userDetails.getEmail())
			return new ResponseEntity<>(userDetails, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(userDetails, headers, HttpStatus.OK);
	}

	
	// Forgot password
	@GetMapping(value = "/forgotpwd-passE", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loadQuestion(@RequestParam String email) {
		UserDetails userDetails = candidateService.findByEmailId(email);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setSkipNullEnabled(true);
		UserDetailsVo userVo = new UserDetailsVo();
		if (null != userDetails)
			userVo = mapper.map(userDetails, UserDetailsVo.class);
		return new ResponseEntity<>(userVo, HttpStatus.OK);

	}

	
	// update password
	
	@PostMapping("/update-pass")
	public ResponseEntity<?> rstPassword(@RequestBody List<String> paramList) {
		UserDetails userDetails = candidateService.findByEmailId(paramList.get(0));
		userDetails.setPassword(paramList.get(1));
		candidateService.updateData(userDetails);
		return new ResponseEntity<>(userDetails, HttpStatus.OK);

	}

}
