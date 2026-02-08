package service;

import entity.Wine;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import repository.WineRepository;

import java.util.List;

@ApplicationScoped
public class WineService {

    @Inject
    WineRepository wineRepository;

    public List<Wine> GetAllWines() {
        return wineRepository.listAll();
    }

    public List<Wine> getWinesPaginated(int page, int size)
    {
        return wineRepository.ListPaginated(page, size);
    }
}
