package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Sell;

public interface SellRepository extends JpaRepository<Sell, Long>{

}
