package repository.quota;

import config.JpaConfig;
import entity.Quota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.Types;

/**
 * Created by Kevin Khanda on 27.08.2016.
 * Class that implements method of interface QuotaRepository.
 * There are several meal types in database.
 * 1 - breakfast, 2 - lunch, 3 - dinner
 * 4- coffee-break 1, 5 - coffee-break 2
 */
public class QuotaRepositoryImpl implements QuotaRepository<Quota> {

    @Autowired
    protected JpaConfig jpaConfig = new JpaConfig();

    @Autowired
    protected JdbcTemplate jdbcTemplate = new JdbcTemplate(jpaConfig.configureDataSource());

    @Override
    public void quotaForNextMonth(String login, int mealTypeId, int quantity,
                                  boolean isWorkday, boolean isWeekend) {
        // Not cardId because there will be a collision in pom.xml file
        int card_id = -1;
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT card.id FROM card, users " +
                "WHERE users.login = ? AND card.id = users.id;", login);
        while (rowSet.next()) {
            card_id = Integer.parseInt(rowSet.getString("id"));
        }

        if (card_id != -1) {
            Object[] params = new Object[]{quantity, isWorkday, isWeekend,
                    card_id, mealTypeId};
            int[] types = new int[]{Types.INTEGER, Types.BOOLEAN, Types.BOOLEAN,
                    Types.INTEGER, Types.INTEGER};

            jdbcTemplate.update("UPDATE quota SET (quantity, is_workday, " +
                    "is_weekend, next_month) = (?, ?, ?, true)\n" +
                    "WHERE card_id = ? AND meal_type_id = ?;", params, types);
        } else {
            System.out.println("Enter valid login!");
        }
    }
}
