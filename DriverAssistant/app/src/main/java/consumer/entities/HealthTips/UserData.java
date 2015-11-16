
package consumer.entities.HealthTips;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    private Integer id;
    private String name;
    private String gender;
    private String picture;
    private String age;
    private String height;
    private String weight;
    private String bmi;
    private String salutation;
    private String speciality;
    private String status;
    private String status_refined;
    private String doctor_errors;
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
     *     The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     *     The age
     */
    public String getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The bmi
     */
    public String getBmi() {
        return bmi;
    }

    /**
     * 
     * @param bmi
     *     The bmi
     */
    public void setBmi(String bmi) {
        this.bmi = bmi;
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
     *     The status_refined
     */
    public String getStatus_refined() {
        return status_refined;
    }

    /**
     * 
     * @param status_refined
     *     The status_refined
     */
    public void setStatus_refined(String status_refined) {
        this.status_refined = status_refined;
    }

    /**
     * 
     * @return
     *     The doctor_errors
     */
    public String getDoctor_errors() {
        return doctor_errors;
    }

    /**
     * 
     * @param doctor_errors
     *     The doctor_errors
     */
    public void setDoctor_errors(String doctor_errors) {
        this.doctor_errors = doctor_errors;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
