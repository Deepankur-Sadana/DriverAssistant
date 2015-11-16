
package consumer.entities.FetchPackages;

import java.util.HashMap;
import java.util.Map;

public class Datum {

    private Integer id;
    private String name;
    private String slug;
    private String features;
    private String image;
    private String persona;
    private String age_group;
    private String description;
    private String addons;
    private String tags;
    private String status;
    private Integer minimum_offer_price;
    private Integer speciality_id;
    private Integer is_default;
    private String category;
    private String speciality;
    private String sub_speciality;
    private String created_at;
    private String updated_at;
    private Doctor doctor;
    private Variants variants;
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
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The persona
     */
    public String getPersona() {
        return persona;
    }

    /**
     * 
     * @param persona
     *     The persona
     */
    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * 
     * @return
     *     The age_group
     */
    public String getAge_group() {
        return age_group;
    }

    /**
     * 
     * @param age_group
     *     The age_group
     */
    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The addons
     */
    public String getAddons() {
        return addons;
    }

    /**
     * 
     * @param addons
     *     The addons
     */
    public void setAddons(String addons) {
        this.addons = addons;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
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
     *     The minimum_offer_price
     */
    public Integer getMinimum_offer_price() {
        return minimum_offer_price;
    }

    /**
     * 
     * @param minimum_offer_price
     *     The minimum_offer_price
     */
    public void setMinimum_offer_price(Integer minimum_offer_price) {
        this.minimum_offer_price = minimum_offer_price;
    }

    /**
     * 
     * @return
     *     The speciality_id
     */
    public Integer getSpeciality_id() {
        return speciality_id;
    }

    /**
     * 
     * @param speciality_id
     *     The speciality_id
     */
    public void setSpeciality_id(Integer speciality_id) {
        this.speciality_id = speciality_id;
    }

    /**
     * 
     * @return
     *     The is_default
     */
    public Integer getIs_default() {
        return is_default;
    }

    /**
     * 
     * @param is_default
     *     The is_default
     */
    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * 
     * @param speciality
     *     The speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * 
     * @return
     *     The sub_speciality
     */
    public String getSub_speciality() {
        return sub_speciality;
    }

    /**
     * 
     * @param sub_speciality
     *     The sub_speciality
     */
    public void setSub_speciality(String sub_speciality) {
        this.sub_speciality = sub_speciality;
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
     *     The doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * 
     * @param doctor
     *     The doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * 
     * @return
     *     The variants
     */
    public Variants getVariants() {
        return variants;
    }

    /**
     * 
     * @param variants
     *     The variants
     */
    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
