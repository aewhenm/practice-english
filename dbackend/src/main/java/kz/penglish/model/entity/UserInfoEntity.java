package kz.penglish.model.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "User")
@Table(name = "user_info")
public class UserInfoEntity extends ActualEntity {

  @Id
  private String id;

  private String username;

  private String password;

  @ManyToMany
  @JoinTable(
      name = "user_info_roles",
      joinColumns = @JoinColumn(name = "user_info_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "code")
  )
  private List<RoleEntity> roles;

}
