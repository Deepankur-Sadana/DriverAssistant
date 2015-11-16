
package consumer.entities.FetchSinglePackage;

import java.util.HashMap;
import java.util.Map;

public class Data_ {

    private Integer id;
    private String salutation;
    private String name;
    private String picture;
    private Integer experience;
    private String about_me;
    private String educations;
    private String specialities;
    private String experiences;
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
     *     The salutation
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * 
     * @param salutation
     *     The salutation
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
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
     *     The picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 
     * @param picture
     *     The picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 
     * @return
     *     The experience
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * 
     * @param experience
     *     The experience
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * 
     * @return
     *     The about_me
     */
    public String getAbout_me() {
        return about_me;
    }

    /**
     * 
     * @param about_me
     *     The about_me
     */
    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    /**
     * 
     * @return
     *     The educations
     */
    public String getEducations() {
        return educations;
    }

    /**
     * 
     * @param educations
     *     The educations
     */
    public void setEducations(String educations) {
        this.educations = educations;
    }

    /**
     * 
     * @return
     *     The specialities
     */
    public String getSpecialities() {
        return specialities;
    }

    /**
     * 
     * @param specialities
     *     The specialities
     */
    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    /**
     * 
     * @return
     *     The experiences
     */
    public String getExperiences() {
        return experiences;
    }

    /**
     * 
     * @param experiences
     *     The experiences
     */
    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
