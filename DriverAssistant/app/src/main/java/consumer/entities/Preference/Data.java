
package consumer.entities.Preference;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String food_preference;
    private String diet_plan_purposes;
    private String lifestyle;
    private String food_cuisine;
    private String food_weaknesses;
    private String food_dislikes;
    private String food_allergies;
    private String other_food_allergy;
    private String other_diet_purpose;
    private String created_at;
    private String updated_at;
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
     *     The food_preference
     */
    public String getFood_preference() {
        return food_preference;
    }

    /**
     * 
     * @param food_preference
     *     The food_preference
     */
    public void setFood_preference(String food_preference) {
        this.food_preference = food_preference;
    }

    /**
     * 
     * @return
     *     The diet_plan_purposes
     */
    public String getDiet_plan_purposes() {
        return diet_plan_purposes;
    }

    /**
     * 
     * @param diet_plan_purposes
     *     The diet_plan_purposes
     */
    public void setDiet_plan_purposes(String diet_plan_purposes) {
        this.diet_plan_purposes = diet_plan_purposes;
    }

    /**
     * 
     * @return
     *     The lifestyle
     */
    public String getLifestyle() {
        return lifestyle;
    }

    /**
     * 
     * @param lifestyle
     *     The lifestyle
     */
    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    /**
     * 
     * @return
     *     The food_cuisine
     */
    public String getFood_cuisine() {
        return food_cuisine;
    }

    /**
     * 
     * @param food_cuisine
     *     The food_cuisine
     */
    public void setFood_cuisine(String food_cuisine) {
        this.food_cuisine = food_cuisine;
    }

    /**
     * 
     * @return
     *     The food_weaknesses
     */
    public String getFood_weaknesses() {
        return food_weaknesses;
    }

    /**
     * 
     * @param food_weaknesses
     *     The food_weaknesses
     */
    public void setFood_weaknesses(String food_weaknesses) {
        this.food_weaknesses = food_weaknesses;
    }

    /**
     * 
     * @return
     *     The food_dislikes
     */
    public String getFood_dislikes() {
        return food_dislikes;
    }

    /**
     * 
     * @param food_dislikes
     *     The food_dislikes
     */
    public void setFood_dislikes(String food_dislikes) {
        this.food_dislikes = food_dislikes;
    }

    /**
     * 
     * @return
     *     The food_allergies
     */
    public String getFood_allergies() {
        return food_allergies;
    }

    /**
     * 
     * @param food_allergies
     *     The food_allergies
     */
    public void setFood_allergies(String food_allergies) {
        this.food_allergies = food_allergies;
    }

    /**
     * 
     * @return
     *     The other_food_allergy
     */
    public String getOther_food_allergy() {
        return other_food_allergy;
    }

    /**
     * 
     * @param other_food_allergy
     *     The other_food_allergy
     */
    public void setOther_food_allergy(String other_food_allergy) {
        this.other_food_allergy = other_food_allergy;
    }

    /**
     * 
     * @return
     *     The other_diet_purpose
     */
    public String getOther_diet_purpose() {
        return other_diet_purpose;
    }

    /**
     * 
     * @param other_diet_purpose
     *     The other_diet_purpose
     */
    public void setOther_diet_purpose(String other_diet_purpose) {
        this.other_diet_purpose = other_diet_purpose;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
