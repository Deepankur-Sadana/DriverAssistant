
package consumer.entities.DietPlanList;


public class Datum {

    private Integer id;
    private String name;
    private String type;
    private String status;
    private String visibility;
    private Boolean is_active;
    private Boolean is_assigned;
    private Boolean is_followed;
    private Boolean is_schedule;
    private String started_at;
    private String ended_at;
    private String created_at;
    private String updated_at;
    private Creator creator;
    private User user;

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
    public Boolean getIs_active() {
        return is_active;
    }

    /**
     * 
     * @param is_active
     *     The is_active
     */
    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    /**
     * 
     * @return
     *     The is_assigned
     */
    public Boolean getIs_assigned() {
        return is_assigned;
    }

    /**
     * 
     * @param is_assigned
     *     The is_assigned
     */
    public void setIs_assigned(Boolean is_assigned) {
        this.is_assigned = is_assigned;
    }

    /**
     * 
     * @return
     *     The is_followed
     */
    public Boolean getIs_followed() {
        return is_followed;
    }

    /**
     * 
     * @param is_followed
     *     The is_followed
     */
    public void setIs_followed(Boolean is_followed) {
        this.is_followed = is_followed;
    }

    /**
     * 
     * @return
     *     The is_schedule
     */
    public Boolean getIs_schedule() {
        return is_schedule;
    }

    /**
     * 
     * @param is_schedule
     *     The is_schedule
     */
    public void setIs_schedule(Boolean is_schedule) {
        this.is_schedule = is_schedule;
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
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

}
