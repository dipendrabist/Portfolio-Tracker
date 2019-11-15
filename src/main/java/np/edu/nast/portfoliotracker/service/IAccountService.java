package np.edu.nast.portfoliotracker.service;

import java.util.List;

import np.edu.nast.portfoliotracker.entities.Demats;

public interface IAccountService {
	List<Demats> findBankByUid(Integer user_id);


}
