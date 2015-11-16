package models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Neelanjana on 8/2/15
 */
public class MetaDataModel {
    private JSONArray states;
    private HashMap<String, String> countryCodes;
    private HashMap<String, String> genders;
    private HashMap<String, String> bloodgroups;
    private HashMap<String, String> salutations;
    private HashMap<String, String> userSpecialities;
    private HashMap<String, String> foodTypes;
    private HashMap<String, String> dietPlanPurposes;
    private HashMap<String, String> lifestyles;
    private HashMap<String, String> foodWeaknesses;
    private HashMap<String, String> foodAllergies;
    private HashMap<String, String> conditions;
    private HashMap<String, String> deficiencies;
    private HashMap<String, String> dietPlanTypes;
    private HashMap<String, String> dietPlanStatuses;
    private HashMap<String, String> dietPlanVisibilities;
    private HashMap<String, String> dietLogResponses;
    private JSONArray languages;
    private JSONArray specialities;
    private JSONArray moods;

    public MetaDataModel(JSONObject object){
        JSONObject dataObject= object.optJSONObject("data");
        if(dataObject==null){
            return;
        }
        try {
            setStates(dataObject.optJSONArray("geographicals"));
            HashMap<String, String> countrycodes = new Gson().fromJson(dataObject.optJSONObject("country_codes").toString(), new TypeToken<HashMap<String, String>>() {
            }.getType());
            setCountryCodes(countrycodes);
        }catch(Exception e){
            e.printStackTrace();
        }
        JSONObject userObject= dataObject.optJSONObject("user");
        try{

        HashMap<String, String> genders = new Gson().fromJson(userObject.optJSONObject("genders").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setGenders(genders);
        HashMap<String, String> bloodgroups = new Gson().fromJson(userObject.optJSONObject("blood_groups").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setBloodgroups(bloodgroups);
        HashMap<String, String> salutations = new Gson().fromJson(userObject.optJSONObject("salutations").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setSalutations(salutations);
        HashMap<String, String> userSpecialities = new Gson().fromJson(userObject.optJSONObject("specialities").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setUserSpecialities(userSpecialities);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
        JSONObject preferenceObject= userObject.optJSONObject("preferences");
        HashMap<String, String> foodtypes = new Gson().fromJson(preferenceObject.optJSONObject("food_type").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setFoodTypes(foodtypes);
        HashMap<String, String> dietPlanPurposes = new Gson().fromJson(preferenceObject.optJSONObject("diet_plan_purposes").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setDietPlanPurposes(dietPlanPurposes);
        HashMap<String, String> lifestyles = new Gson().fromJson(preferenceObject.optJSONObject("lifestyles").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setLifestyles(lifestyles);
        HashMap<String, String> food_weaknesses = new Gson().fromJson(preferenceObject.optJSONObject("food_weaknesses").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setFoodWeaknesses(food_weaknesses);
        HashMap<String, String> food_allergies = new Gson().fromJson(preferenceObject.optJSONObject("food_allergies").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setFoodAllergies(food_allergies);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
        JSONObject medicalProfileObject= userObject.optJSONObject("medical_profile");
        HashMap<String, String> conditions = new Gson().fromJson(medicalProfileObject.optJSONObject("conditions").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setConditions(conditions);
        HashMap<String, String> deficiencies = new Gson().fromJson(medicalProfileObject.optJSONObject("deficiencies").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setDeficiencies(deficiencies);
        }catch(Exception e){
            e.printStackTrace();
        }

        JSONObject dietObject= dataObject.optJSONObject("diet");
        JSONObject dietPlanObject= dietObject.optJSONObject("plan");
            try{
        HashMap<String, String> dietPlanTypes = new Gson().fromJson(dietPlanObject.optJSONObject("types").toString(), new TypeToken<HashMap<String, String>>() {
        }.getType());
        setDietPlanTypes(dietPlanTypes);
        HashMap<String, String> dietPlanStatuses = new Gson().fromJson(dietPlanObject.optJSONObject("statuses").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setDietPlanStatuses(dietPlanStatuses);
        HashMap<String, String> dietPlanVisibilities = new Gson().fromJson(dietPlanObject.optJSONObject("visibilities").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setDietPlanVisibilities(dietPlanVisibilities);
            }catch(Exception e){
                e.printStackTrace();
            }
        try{
        JSONObject dietLogObject= dietObject.optJSONObject("log");
        HashMap<String, String> dietLogResponses = new Gson().fromJson(dietLogObject.optJSONObject("responses").toString(), new TypeToken<HashMap<String, String>>() {}.getType());
        setDietLogResponses(dietLogResponses);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
        setLanguages(dataObject.optJSONArray("languages"));
        setSpecialities(dataObject.optJSONArray("specialities"));
        setMoods(dataObject.optJSONArray("moods"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public HashMap<String, String> getMapForJson(JSONObject jsonObject){
        HashMap<String, String> map = new HashMap<String, String>();
        JSONObject jObject = jsonObject;
        try {
            Iterator<?> keys = jObject.keys();
            while( keys.hasNext() ){
                String key = (String)keys.next();
                String value = jObject.getString(key);
                map.put(key, value);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if(map.size()>0) {
            return map;
        }
        return null;
    }

    public JSONArray getStates() {
        return states;
    }

    public void setStates(JSONArray states) {
        this.states = states;
    }

    public HashMap<String, String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(HashMap<String, String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public HashMap<String, String> getGenders() {
        return genders;
    }

    public void setGenders(HashMap<String, String> genders) {
        this.genders = genders;
    }

    public HashMap<String, String> getBloodgroups() {
        return bloodgroups;
    }

    public void setBloodgroups(HashMap<String, String> bloodgroups) {
        this.bloodgroups = bloodgroups;
    }

    public HashMap<String, String> getSalutations() {
        return salutations;
    }

    public void setSalutations(HashMap<String, String> salutations) {
        this.salutations = salutations;
    }

    public HashMap<String, String> getUserSpecialities() {
        return userSpecialities;
    }

    public void setUserSpecialities(HashMap<String, String> userSpecialities) {
        this.userSpecialities = userSpecialities;
    }

    public HashMap<String, String> getFoodTypes() {
        return foodTypes;
    }

    public void setFoodTypes(HashMap<String, String> foodTypes) {
        this.foodTypes = foodTypes;
    }

    public HashMap<String, String> getDietPlanPurposes() {
        return dietPlanPurposes;
    }

    public void setDietPlanPurposes(HashMap<String, String> dietPlanPurposes) {
        this.dietPlanPurposes = dietPlanPurposes;
    }

    public HashMap<String, String> getLifestyles() {
        return lifestyles;
    }

    public void setLifestyles(HashMap<String, String> lifestyles) {
        this.lifestyles = lifestyles;
    }

    public HashMap<String, String> getFoodWeaknesses() {
        return foodWeaknesses;
    }

    public void setFoodWeaknesses(HashMap<String, String> foodWeaknesses) {
        this.foodWeaknesses = foodWeaknesses;
    }

    public HashMap<String, String> getFoodAllergies() {
        return foodAllergies;
    }

    public void setFoodAllergies(HashMap<String, String> foodAllergies) {
        this.foodAllergies = foodAllergies;
    }

    public HashMap<String, String> getConditions() {
        return conditions;
    }

    public void setConditions(HashMap<String, String> conditions) {
        this.conditions = conditions;
    }

    public HashMap<String, String> getDeficiencies() {
        return deficiencies;
    }

    public void setDeficiencies(HashMap<String, String> deficiencies) {
        this.deficiencies = deficiencies;
    }

    public HashMap<String, String> getDietPlanTypes() {
        return dietPlanTypes;
    }

    public void setDietPlanTypes(HashMap<String, String> dietPlanTypes) {
        this.dietPlanTypes = dietPlanTypes;
    }

    public HashMap<String, String> getDietPlanStatuses() {
        return dietPlanStatuses;
    }

    public void setDietPlanStatuses(HashMap<String, String> dietPlanStatuses) {
        this.dietPlanStatuses = dietPlanStatuses;
    }

    public HashMap<String, String> getDietPlanVisibilities() {
        return dietPlanVisibilities;
    }

    public void setDietPlanVisibilities(HashMap<String, String> dietPlanVisibilities) {
        this.dietPlanVisibilities = dietPlanVisibilities;
    }

    public HashMap<String, String> getDietLogResponses() {
        return dietLogResponses;
    }

    public void setDietLogResponses(HashMap<String, String> dietLogResponses) {
        this.dietLogResponses = dietLogResponses;
    }

    public JSONArray getLanguages() {
        return languages;
    }

    public void setLanguages(JSONArray languages) {
        this.languages = languages;
    }

    public JSONArray getSpecialities() {
        return specialities;
    }

    public void setSpecialities(JSONArray specialities) {
        this.specialities = specialities;
    }

    public JSONArray getMoods() {
        return moods;
    }

    public void setMoods(JSONArray moods) {
        this.moods = moods;
    }
}
