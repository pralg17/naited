package baas;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface KasutajateHaldur extends CrudRepository<Kasutaja, String>{
	public List<Kasutaja> findAllByOrderBySaldo();
	public List<Kasutaja> findTop2ByOrderBySaldoDesc();
	public List<Kasutaja> findByKasutajanimiLike(String algus);
	public List<Kasutaja> findBySaldoLessThan(float kogus);
	public List<Kasutaja> findBySaldoGreaterThan(float kogus);
	//Lisage käsk sorteerimaks saldo järgi kahanevalt
}