package jaagup;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface LugejaDao extends CrudRepository<Lugeja, String> {
 
}