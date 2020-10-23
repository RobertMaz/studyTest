package university.innopolis.studyTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UniversalService {

    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UniversalService(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List getAll(String tableName) {
        String SQLQuery = "SELECT * FROM " + tableName;
        return jdbcTemplate.queryForList(SQLQuery);
    }

    public List getOne(String tableName, Integer rowId) {
        String SQLQuery = "SELECT * FROM " + tableName + " WHERE ID = " + rowId;
        return jdbcTemplate.queryForList(SQLQuery);
    }
}
