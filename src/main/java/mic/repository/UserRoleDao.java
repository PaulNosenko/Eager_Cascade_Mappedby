package mic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mic.entity.UserRole;

@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Long> {

}
