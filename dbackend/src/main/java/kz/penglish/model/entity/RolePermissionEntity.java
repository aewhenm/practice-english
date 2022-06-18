package kz.penglish.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import kz.penglish.model.enums.PermissionEnum;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "RolePermission")
@Table(name = "role_permission")
@Getter
@Setter
public class RolePermissionEntity extends ActualEntity {

  @Id
  @Enumerated(EnumType.STRING)
  private PermissionEnum code;

  private String name;

}
