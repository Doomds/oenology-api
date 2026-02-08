package repository;

import entity.Wine;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class WineRepository implements PanacheRepository<Wine> {
    public List<Wine> ListPaginated(int page, int size) {
        return findAll().page(page, size).list();
    }
}
