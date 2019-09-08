package np.edu.nast.portfoliotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.edu.nast.portfoliotracker.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
