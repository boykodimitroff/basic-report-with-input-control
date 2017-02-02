package eu.dreamix.dao;

import eu.dreamix.dto.InputControlDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO class which retrieves data populated in the input controls of the report
 * Created by bdimitrov on 1/22/17.
 */
@Repository
public class InputControlDAO {

    private static final String TEXT_COLUMN_NAME = "TEXT";
    private static final String VALUE_COLUMN_NAME = "VALUE";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<InputControlDTO> getData() {
        return jdbcTemplate.query(getQuery(), new ResultSetExtractor<List<InputControlDTO>>() {
            @Override
            public List<InputControlDTO> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<InputControlDTO> inputControlDTOs = new ArrayList<InputControlDTO>();

                while(resultSet.next()) {
                    inputControlDTOs.add(new InputControlDTO(resultSet.getString(TEXT_COLUMN_NAME), resultSet.getInt(VALUE_COLUMN_NAME)));
                }
                return inputControlDTOs;
            }
        });
    }

    private String getQuery() {
        return "SELECT ID AS VALUE, NAME AS TEXT FROM CAR_MANUFACTURER ORDER BY ID";
    }
}
