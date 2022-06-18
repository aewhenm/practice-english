package kz.penglish.service.impl;

import kz.penglish.service.AuthUserDetailsService;
import kz.penglish.exception.UserIsNotActualException;
import kz.penglish.model.User;
import kz.penglish.model.entity.UserInfoEntity;
import kz.penglish.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthUserDetailsServiceImpl implements AuthUserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserInfoEntity user = userRepository.findByUsername(username);

    if (user == null) {
      throw new UsernameNotFoundException(username);
    }
    if (!user.isActual()) {
      throw new UserIsNotActualException(username);
    }

    return new User(user);
  }

}
