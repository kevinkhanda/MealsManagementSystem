package repository.quota;

import entity.DomainObject;

/**
 * Created by Kevin Khanda on 27.08.2016.
 * Inteface that provides methods for future implementation.
 */

public interface QuotaRepository<V extends DomainObject> {
    // Implementation of this method will add a quota for a user.
    void quotaForNextMonth(String login, int mealTypeID,
                           boolean isWorkday, boolean isWeekend);
}
