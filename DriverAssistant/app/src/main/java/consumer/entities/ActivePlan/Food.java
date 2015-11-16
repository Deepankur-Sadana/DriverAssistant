
package consumer.entities.ActivePlan;

import java.util.HashMap;
import java.util.Map;

public class Food {

    private long id;
    private String name;
    private long food_id;
    private String unit;
    private long servings;
    private String recipe;

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

    public Food withId(long id) {
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

    public Food withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The food_id
     */
    public long getFood_id() {
        return food_id;
    }

    /**
     * 
     * @param food_id
     *     The food_id
     */
    public void setFood_id(long food_id) {
        this.food_id = food_id;
    }

    public Food withFood_id(long food_id) {
        this.food_id = food_id;
        return this;
    }

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Food withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 
     * @return
     *     The servings
     */
    public long getServings() {
        return servings;
    }

    /**
     * 
     * @param servings
     *     The servings
     */
    public void setServings(long servings) {
        this.servings = servings;
    }

    public Food withServings(long servings) {
        this.servings = servings;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Food withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }


}
