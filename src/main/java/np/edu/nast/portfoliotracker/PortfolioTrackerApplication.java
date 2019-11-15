package np.edu.nast.portfoliotracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class PortfolioTrackerApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(PortfolioTrackerApplication.class, args);
	}

}
