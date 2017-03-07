package baas;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface KasutajateHaldur extends CrudRepository<Kasutaja, String>{
		
}