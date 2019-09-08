package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
