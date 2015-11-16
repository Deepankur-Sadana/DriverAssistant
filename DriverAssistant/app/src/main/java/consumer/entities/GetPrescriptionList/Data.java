
package consumer.entities.GetPrescriptionList;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String name;
    private String picture;
    private Object gender;
    private Object age;
    private Object height;
    private Object weight;
    private Object bmi;
    private Object status;
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
     *     The gender
     */
    public Object getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(Object gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The age
     */
    public Object getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(Object age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Object getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Object height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Object getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The bmi
     */
    public Object getBmi() {
        return bmi;
    }

    /**
     * 
     * @param bmi
     *     The bmi
     */
    public void setBmi(Object bmi) {
        this.bmi = bmi;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Object getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Object status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
