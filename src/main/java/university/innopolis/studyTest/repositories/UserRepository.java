package university.innopolis.studyTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import university.innopolis.studyTest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
