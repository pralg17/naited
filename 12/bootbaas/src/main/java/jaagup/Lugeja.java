package jaagup;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lugejad")
public class Lugeja{
  @Id
  public String email;
  public int laenutusi;
}