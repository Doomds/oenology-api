package service;

import entity.Oenologist;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import repository.OenologistRepository;

import java.util.List;

@ApplicationScoped
public class OenologistService {

    @Inject
    OenologistRepository oenologistRepository;

    public List<Oenologist> getOenologistsPaginated(int page, int size) {
        return oenologistRepository.getOenologistsPaginated(page, size);
    }

    public List<Oenologist> getAllOenologists() {
        return oenologistRepository.getAllOenologists();
    }

}
