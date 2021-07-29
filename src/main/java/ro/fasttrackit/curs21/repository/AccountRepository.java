package ro.fasttrackit.curs21.repository;

import ro.fasttrackit.curs21.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
