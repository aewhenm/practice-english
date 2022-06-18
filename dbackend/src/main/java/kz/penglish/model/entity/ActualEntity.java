package kz.penglish.model.entity;

import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class ActualEntity {

  protected boolean actual;

}
