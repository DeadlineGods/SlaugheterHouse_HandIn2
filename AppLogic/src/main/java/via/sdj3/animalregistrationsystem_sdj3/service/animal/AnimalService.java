package via.sdj3.animalregistrationsystem_sdj3.service.animal;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.AnimalMessage;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service // shorthand for @Bean to register OrderService interface as a bean
public interface AnimalService {
    Animal create(Animal animal) throws Exception;
    List<Animal> findAll();
    Iterable<Animal> findAllItr();
    Optional<Animal> findByID(Long id);
    Animal update(Animal animal);
    void deleteById(Long id);
    List<Animal> findByDate(LocalDate date);

    List<Animal> findByOrigin(String origin);

    List<Animal> findAnimalsInvolved(Long id);
    List<Product> findProductsFromAnimal(Long id);

}
