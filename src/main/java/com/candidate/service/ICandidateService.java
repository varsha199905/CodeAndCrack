package com.candidate.service;

import com.candidate.model.UserDetails;

public interface ICandidateService {

    public UserDetails findByEmailId(String email);
	
	public UserDetails findByEmailIdAndPassword(String email, String password);
	
	public UserDetails saveUserData(UserDetails details);

	public UserDetails updateData(UserDetails userDetails);

	//public UserDetails updatePassword(UserDetails userDetails);
}
