
package consumer.entities.ActivePlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thu  implements DayData {

    private long id;
    private String name;
    private String timing;
    private List<Food> foods = new ArrayList<Food>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(long id) {
        this.id = id;
    }

    public Thu withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Thu withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The timing
     */
    public String getTiming() {
        return timing;
    }

    /**
     * 
     * @param timing
     *     The timing
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }

    public Thu withTiming(String timing) {
        this.timing = timing;
        return this;
    }

    /**
     *
     * @return
     *     The foods
     */
    public List<Food> getFoods() {
        return foods;
    }

    /**
     *
     * @param foods
     *     The foods
     */
    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Thu withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
