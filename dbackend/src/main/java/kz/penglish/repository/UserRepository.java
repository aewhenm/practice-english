package kz.penglish.repository;

import kz.penglish.model.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfoEntity, String> {

  UserInfoEntity findByUsername(String username);

}
