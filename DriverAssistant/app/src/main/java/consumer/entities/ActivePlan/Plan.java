
package consumer.entities.ActivePlan;

import java.util.HashMap;
import java.util.Map;

public class Plan {

    private long id;
    private String name;
    private String type;
    private String status;
    private String visibility;
    private long is_active;
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

    public Plan withId(long id) {
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

    public Plan withName(String name) {
        this.name = name;
        return this;
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

    public Plan withType(String type) {
        this.type = type;
        return this;
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

    public Plan withStatus(String status) {
        this.status = status;
        return this;
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

    public Plan withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 
     * @return
     *     The is_active
     */
    public long getIs_active() {
        return is_active;
    }

    /**
     * 
     * @param is_active
     *     The is_active
     */
    public void setIs_active(long is_active) {
        this.is_active = is_active;
    }

    public Plan withIs_active(long is_active) {
        this.is_active = is_active;
        return this;
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

    public Plan withStarted_at(String started_at) {
        this.started_at = started_at;
        return this;
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

    public Plan withEnded_at(String ended_at) {
        this.ended_at = ended_at;
        return this;
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

    public Plan withCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
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

    public Plan withUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
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

    public Plan withCreator(Creator creator) {
        this.creator = creator;
        return this;
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

    public Plan withMeals(Meals meals) {
        this.meals = meals;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Plan withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
