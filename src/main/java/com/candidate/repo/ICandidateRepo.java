package com.candidate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.candiate.vo.UserDetailsVo;
import com.candidate.model.UserDetails;

public interface ICandidateRepo extends JpaRepository<UserDetails, Integer> {

	public UserDetails findByEmail(String email);

	public UserDetails findByEmailAndPassword(String email, String password);

	

}
