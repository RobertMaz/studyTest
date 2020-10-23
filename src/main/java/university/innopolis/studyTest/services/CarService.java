package university.innopolis.studyTest.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import university.innopolis.studyTest.entities.Car;
import university.innopolis.studyTest.repositories.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
