
package consumer.entities.PatientInfo;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String hcid;
    private String fb_id;
    private String name;
    private String email;
    private String status;
    private Integer qb_id;
    private String qb_username;
    private Long mobile;
    private String gender;
    private Integer age;
    private String picture;
    private String birthday;
    private String height;
    private Integer weight;
    private Integer initial_weight;
    private Object goal_weight;
    private String blood_group;
    private Double bmi;
    private Integer waist;
    private Boolean is_otp_verified;
    private Boolean is_email_verified;
    private Integer city_id;
    private Integer state_id;
    private String gcm_id;
    private String last_login_time;
    private String created_at;
    private String updated_at;
    private String patient_since;
    private City city;
    private State state;
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
     *     The hcid
     */
    public String getHcid() {
        return hcid;
    }

    /**
     * 
     * @param hcid
     *     The hcid
     */
    public void setHcid(String hcid) {
        this.hcid = hcid;
    }

    /**
     * 
     * @return
     *     The fb_id
     */
    public String getFb_id() {
        return fb_id;
    }

    /**
     * 
     * @param fb_id
     *     The fb_id
     */
    public void setFb_id(String fb_id) {
        this.fb_id = fb_id;
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
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
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
     *     The qb_id
     */
    public Integer getQb_id() {
        return qb_id;
    }

    /**
     * 
     * @param qb_id
     *     The qb_id
     */
    public void setQb_id(Integer qb_id) {
        this.qb_id = qb_id;
    }

    /**
     * 
     * @return
     *     The qb_username
     */
    public String getQb_username() {
        return qb_username;
    }

    /**
     * 
     * @param qb_username
     *     The qb_username
     */
    public void setQb_username(String qb_username) {
        this.qb_username = qb_username;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
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
     *     The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(Integer age) {
        this.age = age;
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
     *     The birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The initial_weight
     */
    public Integer getInitial_weight() {
        return initial_weight;
    }

    /**
     * 
     * @param initial_weight
     *     The initial_weight
     */
    public void setInitial_weight(Integer initial_weight) {
        this.initial_weight = initial_weight;
    }

    /**
     * 
     * @return
     *     The goal_weight
     */
    public Object getGoal_weight() {
        return goal_weight;
    }

    /**
     * 
     * @param goal_weight
     *     The goal_weight
     */
    public void setGoal_weight(Object goal_weight) {
        this.goal_weight = goal_weight;
    }

    /**
     * 
     * @return
     *     The blood_group
     */
    public String getBlood_group() {
        return blood_group;
    }

    /**
     * 
     * @param blood_group
     *     The blood_group
     */
    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    /**
     * 
     * @return
     *     The bmi
     */
    public Double getBmi() {
        return bmi;
    }

    /**
     * 
     * @param bmi
     *     The bmi
     */
    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    /**
     * 
     * @return
     *     The waist
     */
    public Integer getWaist() {
        return waist;
    }

    /**
     * 
     * @param waist
     *     The waist
     */
    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    /**
     * 
     * @return
     *     The is_otp_verified
     */
    public Boolean getIs_otp_verified() {
        return is_otp_verified;
    }

    /**
     * 
     * @param is_otp_verified
     *     The is_otp_verified
     */
    public void setIs_otp_verified(Boolean is_otp_verified) {
        this.is_otp_verified = is_otp_verified;
    }

    /**
     * 
     * @return
     *     The is_email_verified
     */
    public Boolean getIs_email_verified() {
        return is_email_verified;
    }

    /**
     * 
     * @param is_email_verified
     *     The is_email_verified
     */
    public void setIs_email_verified(Boolean is_email_verified) {
        this.is_email_verified = is_email_verified;
    }

    /**
     * 
     * @return
     *     The city_id
     */
    public Integer getCity_id() {
        return city_id;
    }

    /**
     * 
     * @param city_id
     *     The city_id
     */
    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    /**
     * 
     * @return
     *     The state_id
     */
    public Integer getState_id() {
        return state_id;
    }

    /**
     * 
     * @param state_id
     *     The state_id
     */
    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    /**
     * 
     * @return
     *     The gcm_id
     */
    public String getGcm_id() {
        return gcm_id;
    }

    /**
     * 
     * @param gcm_id
     *     The gcm_id
     */
    public void setGcm_id(String gcm_id) {
        this.gcm_id = gcm_id;
    }

    /**
     * 
     * @return
     *     The last_login_time
     */
    public String getLast_login_time() {
        return last_login_time;
    }

    /**
     * 
     * @param last_login_time
     *     The last_login_time
     */
    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
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
     *     The patient_since
     */
    public String getPatient_since() {
        return patient_since;
    }

    /**
     * 
     * @param patient_since
     *     The patient_since
     */
    public void setPatient_since(String patient_since) {
        this.patient_since = patient_since;
    }

    /**
     * 
     * @return
     *     The city
     */
    public City getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    public State getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(State state) {
        this.state = state;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
