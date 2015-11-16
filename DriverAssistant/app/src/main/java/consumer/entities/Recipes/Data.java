
package consumer.entities.Recipes;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String name;
    private String alt_names;
    private String standard_amount;
    private String standard_unit;
    private String source_name;
    private String source_pid;
    private String source_gid;
    private String recipe;
    private String recipe_link;
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
     *     The alt_names
     */
    public String getAlt_names() {
        return alt_names;
    }

    /**
     *
     * @param alt_names
     *     The alt_names
     */
    public void setAlt_names(String alt_names) {
        this.alt_names = alt_names;
    }

    /**
     *
     * @return
     *     The standard_amount
     */
    public String getStandard_amount() {
        return standard_amount;
    }

    /**
     *
     * @param standard_amount
     *     The standard_amount
     */
    public void setStandard_amount(String standard_amount) {
        this.standard_amount = standard_amount;
    }

    /**
     *
     * @return
     *     The standard_unit
     */
    public String getStandard_unit() {
        return standard_unit;
    }

    /**
     *
     * @param standard_unit
     *     The standard_unit
     */
    public void setStandard_unit(String standard_unit) {
        this.standard_unit = standard_unit;
    }

    /**
     *
     * @return
     *     The source_name
     */
    public String getSource_name() {
        return source_name;
    }

    /**
     *
     * @param source_name
     *     The source_name
     */
    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    /**
     *
     * @return
     *     The source_pid
     */
    public String getSource_pid() {
        return source_pid;
    }

    /**
     *
     * @param source_pid
     *     The source_pid
     */
    public void setSource_pid(String source_pid) {
        this.source_pid = source_pid;
    }

    /**
     *
     * @return
     *     The source_gid
     */
    public String getSource_gid() {
        return source_gid;
    }

    /**
     *
     * @param source_gid
     *     The source_gid
     */
    public void setSource_gid(String source_gid) {
        this.source_gid = source_gid;
    }

    /**
     *
     * @return
     *     The recipe
     */
    public String getRecipe() {
        return recipe;
    }

    /**
     *
     * @param recipe
     *     The recipe
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     *
     * @return
     *     The recipe_link
     */
    public String getRecipe_link() {
        return recipe_link;
    }

    /**
     *
     * @param recipe_link
     *     The recipe_link
     */
    public void setRecipe_link(String recipe_link) {
        this.recipe_link = recipe_link;
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
