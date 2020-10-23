package university.innopolis.studyTest.controllers.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import university.innopolis.studyTest.services.CarService;
import university.innopolis.studyTest.services.UniversalService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/testService")
@Log4j2
public class MainController {

    private final CarService carService;
    private final UniversalService universalService;


    @GetMapping("/{table}")
    public ResponseEntity<?> getAll(@PathVariable("table") String tableName) {
        log.info("IN getAll cars");
        return new ResponseEntity<>(universalService.getAll(tableName), HttpStatus.OK);
    }

    @GetMapping("/{table}/{row_id}")
    public ResponseEntity<?> getOne(@PathVariable("row_id") Integer rowId,
                                    @PathVariable("table") String tableName) {
        if (rowId == null) {
            throw new NullPointerException("Not shown row id");
        }
        log.info("IN getOne cars by row id : " + rowId);
        return new ResponseEntity<>(universalService.getOne(tableName, rowId), HttpStatus.OK);
    }


}
