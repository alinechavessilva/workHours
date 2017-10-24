package br.com.greenMille.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import antlr.collections.List;
import br.com.greenMille.models.RegisterHours;
 
public interface RegisterHoursRepository extends JpaRepository<RegisterHours, Long> {
	
	@Modifying
	@Query("Select * from register_hours where time_final between ?1 and ?2")
	List findByTime(String time_initial, String time_final);
	
	@Modifying
	@Query("Select * from register_hours where userId = ?1")
	List findByUserId(Long userId);


}
