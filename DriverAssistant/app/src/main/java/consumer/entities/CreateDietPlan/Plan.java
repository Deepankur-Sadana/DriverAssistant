
package consumer.entities.CreateDietPlan;

import java.util.HashMap;
import java.util.Map;

public class Plan {

    private Integer id;
    private String name;
    private String type;
    private String status;
    private String visibility;
    private Object is_active;
    private String started_at;
    private String ended_at;
    private String created_at;
    private String updated_at;
    private Creator creator;
    private Meals meals;
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
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The is_active
     */
    public Object getIs_active() {
        return is_active;
    }

    /**
     * 
     * @param is_active
     *     The is_active
     */
    public void setIs_active(Object is_active) {
        this.is_active = is_active;
    }

    /**
     * 
     * @return
     *     The started_at
     */
    public String getStarted_at() {
        return started_at;
    }

    /**
     * 
     * @param started_at
     *     The started_at
     */
    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    /**
     * 
     * @return
     *     The ended_at
     */
    public String getEnded_at() {
        return ended_at;
    }

    /**
     * 
     * @param ended_at
     *     The ended_at
     */
    public void setEnded_at(String ended_at) {
        this.ended_at = ended_at;
    }

    /**
     * 
     * @return
     *     The created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     * @param created_at
     *     The created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * 
     * @return
     *     The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     * @param updated_at
     *     The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * 
     * @return
     *     The creator
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * 
     * @param creator
     *     The creator
     */
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    /**
     * 
     * @return
     *     The meals
     */
    public Meals getMeals() {
        return meals;
    }

    /**
     * 
     * @param meals
     *     The meals
     */
    public void setMeals(Meals meals) {
        this.meals = meals;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
