package lk.asiripr.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.asiripr.school_management.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
	public AppUser findByEmail(String email);

}
