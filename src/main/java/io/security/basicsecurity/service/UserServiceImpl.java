package io.security.basicsecurity.service;

import io.security.basicsecurity.domain.Account;
import io.security.basicsecurity.repository.UserRepository;
import io.security.basicsecurity.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(Account account) {

        userRepository.save(account);

    }
}
