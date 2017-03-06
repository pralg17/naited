package jaagup;

import javax.persistence.*;

@Entity
@Table(name="lugejad")
public class Lugeja{
  @Id
  public String email;
  public int laenutusi;
  
  @OneToMany(mappedBy="lugeja")
  public java.util.Set<Raamat> raamatud;
  
  @Override
  public String toString(){
    return email+"-"+laenutusi+"; ";
  }
}