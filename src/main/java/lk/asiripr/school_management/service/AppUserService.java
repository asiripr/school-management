package lk.asiripr.school_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lk.asiripr.school_management.entity.AppUser;
import lk.asiripr.school_management.repository.AppUserRepository;

@Service
public class AppUserService {
	@Autowired 
	private AppUserRepository appUserRepo;
	
	public UserDetails loadUserByUserName(String email) throws UsernameNotFoundException{
		AppUser appUser = appUserRepo.findByEmail(email);
		
		if (appUser!=null) {
			var springUser = User.withUsername(appUser.getEmail())
					.password(appUser.getPassword())
					.roles(appUser.getRole())
					.build();
			
			return springUser;
		}
		
		return null;
	}
}
