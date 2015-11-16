package models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Neelanjana on 7/7/15.
 */
public class DoctorInformationModel implements Serializable {

	private int id;
	private String hcid;
	private String fb_id;
	private String qb_id;
	private String qb_username;
	private String salutation;
	private String name;
	private String email;
	private String country_code;
	private String medical_registration_number;
	private long mobile;
	private String gender;
	private String picture;
	private String birthday;
	private String headline;
	private String linkedin_link;
	private String facebook_link;
	private String twitter_link;
	private String blog_link;
	private int practising_since;
	private int experience;
	private String about_me;
	private int consultation_fee;
	private String gcm_id;
	private String type;
	private float height;
	private float weight;
	private String blood_group;
	private float bmi;
	private String last_login_time;
	private boolean is_otp_verified;
	private boolean is_email_verified;
	private String created_at;
	private String updated_at;




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getHcid() {
		return hcid;
	}

	public void setHcid(String hcid) {
		this.hcid = hcid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public float getBmi() {
		return bmi;
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}

	public String getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}

	public boolean is_otp_verified() {
		return is_otp_verified;
	}

	public void setIs_otp_verified(boolean is_otp_verified) {
		this.is_otp_verified = is_otp_verified;
	}

	public boolean is_email_verified() {
		return is_email_verified;
	}

	public void setIs_email_verified(boolean is_email_verified) {
		this.is_email_verified = is_email_verified;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

    public String getFb_id() {
        return fb_id;
    }

    public void setFb_id(String fb_id) {
        this.fb_id = fb_id;
    }

    public String getQb_id() {
        return qb_id;
    }

    public void setQb_id(String qb_id) {
        this.qb_id = qb_id;
    }

    public String getQb_username() {
        return qb_username;
    }

    public void setQb_username(String qb_username) {
        this.qb_username = qb_username;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getMedical_registration_number() {
        return medical_registration_number;
    }

    public void setMedical_registration_number(String medical_registration_number) {
        this.medical_registration_number = medical_registration_number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getLinkedin_link() {
        return linkedin_link;
    }

    public void setLinkedin_link(String linkedin_link) {
        this.linkedin_link = linkedin_link;
    }

    public String getFacebook_link() {
        return facebook_link;
    }

    public void setFacebook_link(String facebook_link) {
        this.facebook_link = facebook_link;
    }

    public String getTwitter_link() {
        return twitter_link;
    }

    public void setTwitter_link(String twitter_link) {
        this.twitter_link = twitter_link;
    }

    public String getBlog_link() {
        return blog_link;
    }

    public void setBlog_link(String blog_link) {
        this.blog_link = blog_link;
    }

    public int getPractising_since() {
        return practising_since;
    }

    public void setPractising_since(int practising_since) {
        this.practising_since = practising_since;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public int getConsultation_fee() {
        return consultation_fee;
    }

    public void setConsultation_fee(int consultation_fee) {
        this.consultation_fee = consultation_fee;
    }

    public String getGcm_id() {
        return gcm_id;
    }

    public void setGcm_id(String gcm_id) {
        this.gcm_id = gcm_id;
    }



}

