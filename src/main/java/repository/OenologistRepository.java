package repository;

import entity.Oenologist;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class OenologistRepository implements PanacheRepository<Oenologist> {

    public List<Oenologist> getOenologistsPaginated(int page, int size) {
        return findAll().page(page, size).list();
    }

    public List<Oenologist> getAllOenologists() {
        return findAll().list();
    }
}
