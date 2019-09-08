package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
