package academy.devdojo.youtube.core.repository;

import academy.devdojo.youtube.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUserRepository, Long> {

     ApplicationUser findByUsername(String username);
}
