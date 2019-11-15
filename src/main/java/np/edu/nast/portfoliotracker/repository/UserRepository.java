package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
