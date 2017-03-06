package jaagup;

import javax.persistence.*;

@Entity
@Table(name="raamatud")
public class Raamat{
  @Id
  @GeneratedValue
  public int id;
  public String pealkiri;
  
  @ManyToOne
  @JoinColumn(name="lugeja_email")
  public Lugeja lugeja;
  
  @Override
  public String toString(){
    return id+"-"+pealkiri+"-"+lugeja.email+"; ";
  }
}