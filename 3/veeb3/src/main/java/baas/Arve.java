package baas;

import javax.persistence.*;

@Entity
@Table(name="arved")
public class Arve{
	@Id
	@GeneratedValue
	public int id;
	public float summa;
	@ManyToOne
	@JoinColumn(name="knimi")
	public Kasutaja maksja;
}