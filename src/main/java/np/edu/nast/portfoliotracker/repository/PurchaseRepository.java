package np.edu.nast.portfoliotracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
