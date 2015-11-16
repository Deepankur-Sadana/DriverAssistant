
package consumer.entities.MedicalProfile;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String conditions;
    private String deficiencies;
    private String other_condition;
    private String other_deficiency;
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
     *     The conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * @return
     *     The deficiencies
     */
    public String getDeficiencies() {
        return deficiencies;
    }

    /**
     * 
     * @param deficiencies
     *     The deficiencies
     */
    public void setDeficiencies(String deficiencies) {
        this.deficiencies = deficiencies;
    }

    /**
     * 
     * @return
     *     The other_condition
     */
    public String getOther_condition() {
        return other_condition;
    }

    /**
     * 
     * @param other_condition
     *     The other_condition
     */
    public void setOther_condition(String other_condition) {
        this.other_condition = other_condition;
    }

    /**
     * 
     * @return
     *     The other_deficiency
     */
    public String getOther_deficiency() {
        return other_deficiency;
    }

    /**
     * 
     * @param other_deficiency
     *     The other_deficiency
     */
    public void setOther_deficiency(String other_deficiency) {
        this.other_deficiency = other_deficiency;
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
