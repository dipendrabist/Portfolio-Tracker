package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);

}
