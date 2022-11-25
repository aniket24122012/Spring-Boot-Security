package auth.com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import auth.com.entity.User;

public interface userRepo extends JpaRepository<User, Long> {
  Optional<User>findByEmail(String email);
}
