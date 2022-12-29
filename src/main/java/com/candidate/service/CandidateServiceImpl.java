package com.candidate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candidate.model.UserDetails;
import com.candidate.repo.ICandidateRepo;

@Service
public class CandidateServiceImpl implements ICandidateService {

	@Autowired
	ICandidateRepo candidateRepo;

	@Override
	public UserDetails findByEmailId(String email) {
		return candidateRepo.findByEmail(email);
	}

	@Override
	public UserDetails findByEmailIdAndPassword(String email, String password) {
		
//		UserDetails uDetails=candidateRepo.findByEmailAndPassword(email, password);
//		ModelMapper mapper= new ModelMapper();
//		mapper.getConfiguration().setSkipNullEnabled(true);
//		UserDetailsVo userVo=new UserDetailsVo();
//		if(null != uDetails)
//			userVo=mapper.map(uDetails,UserDetailsVo.class);
//		return userVo;
		return candidateRepo.findByEmailAndPassword(email, password);
		
	}

	@Override
	public UserDetails saveUserData(UserDetails details) {
		return candidateRepo.save(details);
	}

	@Override
	public UserDetails updateData(UserDetails userDetails) {
		return candidateRepo.save(userDetails);
	}

	

//	@Override
//	public UserDetails updatePassword(UserDetails userDetails) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
