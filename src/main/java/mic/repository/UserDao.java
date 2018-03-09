package mic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mic.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
