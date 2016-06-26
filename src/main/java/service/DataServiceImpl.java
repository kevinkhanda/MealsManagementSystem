package service;

import entity.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.DataRepository;
import repository.DataRepositoryImpl;

import java.util.Set;
import java.util.UUID;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class that implements DataService that separate business logic of application with DBMS logic.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {

    private static final Logger log = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    @Qualifier("dataRepository")
    private DataRepositoryImpl dataRepository;

    @Override
    public boolean persist(String problem) {
        try {
            dataRepository.persist(new Data(UUID.randomUUID(), problem));
            return true;
        } catch (Exception e) {
            log.error("ERROR SAVING DATA: " + e.getMessage(), e);
            return false;
        }
    }

    @Override
    public Set<String> getRandomData() {
        return dataRepository.getRandomData();
    }
}
