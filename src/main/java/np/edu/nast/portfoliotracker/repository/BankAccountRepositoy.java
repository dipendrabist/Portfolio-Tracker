package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.BankAccount;

public interface BankAccountRepositoy extends JpaRepository<BankAccount, Long> {

}
