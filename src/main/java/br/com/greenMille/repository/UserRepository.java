package br.com.greenMille.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.greenMille.models.Users;
 
public interface UserRepository extends JpaRepository<Users, Long> {
 
}