package baas;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="kasutajad")
public class Kasutaja{
	@Id
	public String kasutajanimi;
	public float saldo;
	@OneToMany(mappedBy="maksja")
	Set<Arve> arved;
}