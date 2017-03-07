package baas;

import javax.persistence.*;

@Entity
@Table(name="kasutajad")
public class Kasutaja{
	@Id
	public String kasutajanimi;
	public float saldo;
}