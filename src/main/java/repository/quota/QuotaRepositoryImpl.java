package repository.quota;

import com.sun.corba.se.spi.ior.ObjectKey;
import config.JpaConfig;
import entity.Quota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Types;

/**
 * Created by Kevin Khanda on 27.08.2016.
 * Class that implements method of interface QuotaRepository.
 */
public class QuotaRepositoryImpl implements QuotaRepository<Quota> {

    @Autowired
    protected JpaConfig jpaConfig = new JpaConfig();

    @Autowired
    protected JdbcTemplate jdbcTemplate = new JdbcTemplate(jpaConfig.configureDataSource());

    @Override
    public void quotaForNextMonth(String login, int mealTypeID,
                                  boolean isWorkday, boolean isWeekend) {
        Object[] params = new Object[] {login, mealTypeID,
                isWorkday, isWeekend};
        Object[] types = new Object[] {Types.VARCHAR, Types.INTEGER,
                Types.BOOLEAN, Types.BOOLEAN};



        jdbcTemplate.update("INSERT INTO quota (card_id)");
    }
}
