package university.innopolis.studyTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.innopolis.studyTest.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
