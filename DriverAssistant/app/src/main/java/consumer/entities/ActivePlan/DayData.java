package consumer.entities.ActivePlan;

import java.util.List;
import java.util.Map;

/**
 * Created by swarajpal on 02-08-2015.
 */
public interface DayData {

    public long getId();
    public void setId(long id);
    public String getName();
    public String getTiming();
    public void setTiming(String timing);
    public List<Food> getFoods();
    public void setFoods(List<Food> foods);
    public Map<String, Object> getAdditionalProperties();

    public void setAdditionalProperty(String name, Object value) ;

}
