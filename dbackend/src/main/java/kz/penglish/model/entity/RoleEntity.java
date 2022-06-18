package kz.penglish.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import kz.penglish.model.enums.RoleEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Role")
@Table(name = "role")
public class RoleEntity extends ActualEntity {

  @Id
  @Enumerated(EnumType.STRING)
  private RoleEnum code;

  private String name;

}
