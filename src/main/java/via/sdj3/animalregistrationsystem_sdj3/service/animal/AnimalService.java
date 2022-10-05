package via.sdj3.animalregistrationsystem_sdj3.service.animal;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;

import java.util.List;
import java.util.Optional;

@Service // shorthand for @Bean to register OrderService interface as a bean
public interface AnimalService {
    Animal create(Animal animal);
    List<Animal> findAll();
    Iterable<Animal> findAllItr();
    Optional<Animal> findByID(Long id);
    Animal update(Animal animal);
    void deleteById(Long id);
}
