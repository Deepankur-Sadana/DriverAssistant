
package consumer.entities.CreateDietPlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wed {

    private Integer id;
    private String name;
    private String timing;
    private List<Object> foods = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * 
     * @return
     *     The foods
     */
    public List<Object> getFoods() {
        return foods;
    }

    /**
     * 
     * @param foods
     *     The foods
     */
    public void setFoods(List<Object> foods) {
        this.foods = foods;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
