package io.security.basicsecurity.repository;

import io.security.basicsecurity.domain.Account;
import io.security.basicsecurity.domain.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}