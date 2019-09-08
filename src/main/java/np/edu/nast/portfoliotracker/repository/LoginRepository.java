package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
