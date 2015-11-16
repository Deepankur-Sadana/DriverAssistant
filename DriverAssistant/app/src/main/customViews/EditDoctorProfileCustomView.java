package customViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import adapters.DoctorProfileRowAdapter;
import advisor.healthcare.hcaredoctorapp.R;
import advisor.healthcare.hcaredoctorapp.activities.MainActivity;
import constants.hCareAPIConstants;
import dialogs.GenericListDialog;
import dialogs.MessageBoxDialog;
import models.CityStateModel;
import models.DoctorAwardModel;
import models.DoctorEducationModel;
import models.DoctorExperienceModel;
import models.DoctorInformationModel;
import models.DoctorLanguageModel;
import models.DoctorMembershipModel;
import models.DoctorRegistrationsModel;
import models.DoctorServiceModel;
import robotoViews.RobotoLightTextView;
import utils.Constants;
import utils.Utils;
import utils.hCareAPIUtils;

/**
 * Created by Neelanjana on 29/07/15.
 */
public class EditDoctorProfileCustomView extends LinearLayout implements
        MessageBoxDialog.OnMessageBoxDoneButtonListener,
        GenericListDialog.GenericListDialogListener {

    private DoctorProfileRowAdapter adapter;

    public enum DoctorEditProfileViewType {
        EXPERIENCES,
        SERVICES,
        LANGUAGES,
        AWARDS,
        EDUCATION,
        MEMBERSHIP,
        REGISTRATIONS
    }
    private Context context;
    private DoctorEditProfileViewType viewType;
    private RobotoLightTextView heading;
    private RobotoLightTextView addNew;
    private LinearLayout contentView;
    private CustomExpandedListView listView;
    private ArrayList<String> dataList = new ArrayList<>();
    private DoctorInformationModel model;
    private String url = "";
    private HashMap<String,String> params = new HashMap<String,String>();

    public EditDoctorProfileCustomView(Context context) {
        super(context);
        init(context);
    }

    public EditDoctorProfileCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public EditDoctorProfileCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(final Context context){
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.layout_edit_profile_custom_view, this, true);
        heading = (RobotoLightTextView) findViewById(R.id.txt_heading);
        addNew = (RobotoLightTextView) findViewById(R.id.txt_add_new);
        contentView = (LinearLayout) findViewById(R.id.layout_content_view);

        listView = new CustomExpandedListView(context);
        listView.setLongClickable(true);
      //  listView.setDivider(null);
        listView.setExpanded(true);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                GenericListDialog dialog = new GenericListDialog(context,
                        Constants.getGenericDialogList(), position, viewType, EditDoctorProfileCustomView.this);
                dialog.show();
                return true;
            }
        });

    }

    public void setViewType(DoctorEditProfileViewType type, DoctorInformationModel model){
        this.viewType = type;
        this.model = model;
        showViewByType();

        addNew.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                MessageBoxDialog dialog = new MessageBoxDialog(context, viewType,
                        EditDoctorProfileCustomView.this, null, false, -1);
                dialog.show();
            }
        });
    }

    private void showViewByType(){

        switch (viewType){

            case AWARDS: setUpAwardsView(); url = hCareAPIConstants.UPDATE_DOCTOR_AWARD;  break;
            case EXPERIENCES : setUpExperienceView(); url = hCareAPIConstants.UPDATE_DOCTOR_EXP; break;
            case SERVICES : setUpServicesView(); url = hCareAPIConstants.UPDATE_DOCTOR_SERVICES; break;
            case LANGUAGES : setUpLanguagesiew(); url = hCareAPIConstants.UPDATE_DOCTOR_LANGUAGE; break;
            case EDUCATION : setUpEducationView(); url = hCareAPIConstants.UPDATE_DOCTOR_EDUCATION; break;
            case MEMBERSHIP : setUpMembershipView(); url = hCareAPIConstants.UPDATE_DOCTOR_MEMBERSHIP; break;
            case REGISTRATIONS : setUpRegistrationsView(); url = hCareAPIConstants.UPDATE_DOCTOR_REGISTRATION; break;

        }
    }

    private void setUpExperienceView(){
        this.heading.setText("Experience");
        adapter = new DoctorProfileRowAdapter(context,model.getExperienceModel(), DoctorEditProfileViewType.EXPERIENCES);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);
    }

    private void setUpAwardsView(){
        this.heading.setText("Awards & Recognitions");
        adapter = new DoctorProfileRowAdapter(context,model.getAwardModel(), DoctorEditProfileViewType.AWARDS);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }

    private void setUpServicesView(){
        this.heading.setText("Services");

        adapter = new DoctorProfileRowAdapter(context,model.getServiceModel(), DoctorEditProfileViewType.SERVICES);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }

    private void setUpMembershipView(){
        this.heading.setText("Membership");

        adapter = new DoctorProfileRowAdapter(context,model.getMembershipModel(), DoctorEditProfileViewType.MEMBERSHIP);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }

    private void setUpLanguagesiew(){
        this.heading.setText("Languages");

        adapter = new DoctorProfileRowAdapter(context,model.getLanguageModel(), DoctorEditProfileViewType.LANGUAGES);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }

    private void setUpEducationView(){
        this.heading.setText("Education");

        adapter = new DoctorProfileRowAdapter(context,model.getEducationModel(), DoctorEditProfileViewType.EDUCATION);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }

    private void setUpRegistrationsView(){
        this.heading.setText("Registrations");

        adapter = new DoctorProfileRowAdapter(context,model.getRegistrationsModel(), DoctorEditProfileViewType.REGISTRATIONS);
        listView.setAdapter(adapter);
        this.contentView.addView(listView);

    }


    @Override
    public void onDoneButtonPressed(DoctorEditProfileViewType messageBoxType, String message,
                                    String location,String college,String year,String endYear,int isPresent,int state,int city,
                                    boolean isEdit,int position) {
        switch (messageBoxType){

            case AWARDS:
                params.clear();
                params.put("name", message);
                params.put("year", year);

                if(isEdit){
                    editFromDoctorProfile(""+model.getAwardModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }

                break;
            case EXPERIENCES :
                params.clear();
                params.put("designation", message);
                params.put("organisation", location);
                params.put("start", year);
                params.put("is_present", String.valueOf(isPresent));
                if(isPresent==0){
                    params.put("end", endYear);
                }
                params.put("state_id", String.valueOf(state));
                params.put("city_id", String.valueOf(city));

                if(isEdit){
                    editFromDoctorProfile(""+model.getExperienceModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }
                break;
            case SERVICES :
                params.clear();
                params.put("name", message);
                if(isEdit){
                    editFromDoctorProfile(""+model.getServiceModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }
                break;
            case LANGUAGES :
                params.clear();
                params.put("language_id", String.valueOf(state));
                if(isEdit){
                    editFromDoctorProfile(""+model.getLanguageModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }
                break;
            case EDUCATION :
                params.clear();
                params.put("degree", message);
                params.put("specialisation",location);
                params.put("college", college);
                params.put("year", year);

                if(isEdit){
                    editFromDoctorProfile(""+model.getEducationModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }

                break;

            case MEMBERSHIP :
                params.clear();
                params.put("name", message);
                if(isEdit){
                    editFromDoctorProfile(""+model.getMembershipModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }
                break;
            case REGISTRATIONS :
                params.clear();

                params.put("number", location);
                params.put("name", message);
                if(isEdit){
                    editFromDoctorProfile(""+model.getRegistrationsModel().get(position).getId(),position);
                }else{
                    updateProfile();
                }
                break;

        }

    }


    private void updateProfile(){
        final Response.Listener<JSONObject> responseListener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                if (Utils.checkStatus(response)) {
                    String message = response.optString("message");
                    if(message!=null && message.length()>0){
                        showToastMessage(message);
                        updateDoctorModel(response.optJSONObject("data"),-1);
                    }
                } else {
                    showToastMessage(Utils.getErrorMessage(context, response));
                }
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            //    hideSpinner();

                showToastMessage(getResources().getString(R.string.api_failure_message));
            }
        };

        hCareAPIUtils.updateDoctorProfile(url, model.getId() + "", params, responseListener, errorListener);
    }

    private void showToastMessage(String message){
        Toast.makeText(MainActivity.getInstance(), message, Toast.LENGTH_LONG).show();
    }

    private void updateDoctorModel(JSONObject data,int position){
        Gson gson = new Gson();
        switch (viewType){

            case AWARDS:
                DoctorAwardModel awardsObj  = gson.fromJson(data.toString(), DoctorAwardModel.class);
                if(position != -1){
                    model.getAwardModel().set(position,awardsObj);
                }else{
                    model.getAwardModel().add(awardsObj);
                }

                adapter.notifyDataSetChanged();

                break;
            case EXPERIENCES :
                DoctorExperienceModel expObj  = gson.fromJson(data.toString(), DoctorExperienceModel.class);
                CityStateModel city = gson.fromJson(data.optJSONObject("city").optJSONObject("data").toString(),CityStateModel.class);
                expObj.setCityModel(city);
                CityStateModel state = gson.fromJson(data.optJSONObject("state").optJSONObject("data").toString(),CityStateModel.class);
                expObj.setStateModel(state);

                if(position != -1){
                    model.getExperienceModel().set(position,expObj);
                }else{
                    model.getExperienceModel().add(expObj);
                }

                adapter.notifyDataSetChanged();

                break;
            case SERVICES :
                DoctorServiceModel serviceObj  = gson.fromJson(data.toString(), DoctorServiceModel.class);
                if(position != -1){
                    model.getServiceModel().set(position, serviceObj);
                }else{
                    model.getServiceModel().add(serviceObj);
                }

                adapter.notifyDataSetChanged();
                break;
            case LANGUAGES :
                DoctorLanguageModel langObj  = gson.fromJson(data.toString(), DoctorLanguageModel.class);
                if(position != -1){
                    model.getLanguageModel().set(position,langObj);
                }else{
                    model.getLanguageModel().add(langObj);
                }

                adapter.notifyDataSetChanged();
                break;
            case EDUCATION :
                DoctorEducationModel eduObj  = gson.fromJson(data.toString(), DoctorEducationModel.class);
                if(position != -1){
                    model.getEducationModel().set(position,eduObj);
                }else{
                    model.getEducationModel().add(eduObj);
                }

                adapter.notifyDataSetChanged();

                break;
            case MEMBERSHIP :
                DoctorMembershipModel memObj  = gson.fromJson(data.toString(), DoctorMembershipModel.class);
                if(position != -1){
                    model.getMembershipModel().set(position,memObj);
                }else{
                    model.getMembershipModel().add(memObj);
                }

                adapter.notifyDataSetChanged();

                break;
            case REGISTRATIONS :
                DoctorRegistrationsModel regObj  = gson.fromJson(data.toString(), DoctorRegistrationsModel.class);
                if(position != -1){
                    model.getRegistrationsModel().set(position,regObj);
                }else{
                    model.getRegistrationsModel().add(regObj);
                }

                adapter.notifyDataSetChanged();
                break;

        }
    }

    private void deleteFromDoctorProfile(String url,String id){
        HashMap<String,String> params = new HashMap<>();
        //add id somewhere

        Response.Listener<JSONObject> responseListener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                if (Utils.checkStatus(response)) {
                    String message = response.optString("message");
                    if(message!=null && message.length()>0){
                        showToastMessage(message);

                    }
                } else {
                    showToastMessage(Utils.getErrorMessage(context, response));
                }
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                showToastMessage(getResources().getString(R.string.api_failure_message));
            }
        };

        hCareAPIUtils.deleteDoctorProfile(url + "/" + id, params, responseListener, errorListener);
    }

    private void editFromDoctorProfile(String id, final int position){

        Response.Listener<JSONObject> responseListener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                if (Utils.checkStatus(response)) {
                    String message = response.optString("message");
                    if(message!=null && message.length()>0){
                        showToastMessage(message);
                        updateDoctorModel(response.optJSONObject("data"),position);
                    }
                } else {
                    showToastMessage(Utils.getErrorMessage(context, response));
                }
            }
        };
        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                showToastMessage(getResources().getString(R.string.api_failure_message));
            }
        };

        hCareAPIUtils.editDoctorProfile(url + "/" + id, params, responseListener, errorListener);

    }

    @Override
    public void genericListDialogClicked(int id,int position) {
        if(position == 0){
            performEdit(id);
        }else if(position == 1){
            performDelete(id);
        }
    }

    private void performEdit(int position){

        switch (viewType){

            case AWARDS:
                MessageBoxDialog awardsDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.AWARDS,this,model.getAwardModel().get(position),true,position);
                awardsDialog.show();

                break;
            case EXPERIENCES :
                MessageBoxDialog expDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.EXPERIENCES,this,model.getExperienceModel().get(position),true,position);
                expDialog.show();
                break;
            case SERVICES:
                MessageBoxDialog serviceDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.SERVICES,this,model.getServiceModel().get(position),true,position);
                serviceDialog.show();
                break;
            case LANGUAGES :
                MessageBoxDialog lanDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.LANGUAGES,this,model.getLanguageModel().get(position),true,position);
                lanDialog.show();
                break;
            case EDUCATION :
                MessageBoxDialog eduDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.EDUCATION,this,model.getEducationModel().get(position),true,position);
                eduDialog.show();
                break;
            case MEMBERSHIP :
                MessageBoxDialog memDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.MEMBERSHIP,this,model.getMembershipModel().get(position),true,position);
                memDialog.show();
                break;
            case REGISTRATIONS :
                MessageBoxDialog regDialog = new MessageBoxDialog
                        (context, DoctorEditProfileViewType.REGISTRATIONS,this,model.getRegistrationsModel().get(position),true,position);
                regDialog.show();
                break;

        }


    }

    private void performDelete(int position){

        String url;
        String id;
        switch (viewType){

            case AWARDS:
                url = hCareAPIConstants.UPDATE_DOCTOR_AWARD;
                id = ""+model.getAwardModel().get(position).getId();
                model.getAwardModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url, id);
                break;
            case EXPERIENCES :
                url = hCareAPIConstants.UPDATE_DOCTOR_EXP;
                id =  ""+model.getExperienceModel().get(position).getId();
                model.getExperienceModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
            case SERVICES :
                url = hCareAPIConstants.UPDATE_DOCTOR_SERVICES;
                id = model.getServiceModel().get(position).getId();
                model.getServiceModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
            case LANGUAGES :
                url = hCareAPIConstants.UPDATE_DOCTOR_LANGUAGE;
                id = model.getLanguageModel().get(position).getId();
                model.getLanguageModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
            case EDUCATION :
                url = hCareAPIConstants.UPDATE_DOCTOR_EDUCATION;
                id = ""+model.getEducationModel().get(position).getId();
                model.getEducationModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
            case MEMBERSHIP :
                url = hCareAPIConstants.UPDATE_DOCTOR_MEMBERSHIP;
                id = ""+model.getMembershipModel().get(position).getId();
                model.getMembershipModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
            case REGISTRATIONS :
                url = hCareAPIConstants.UPDATE_DOCTOR_REGISTRATION;
                id = ""+model.getRegistrationsModel().get(position).getId();
                model.getRegistrationsModel().remove(position);
                adapter.notifyDataSetChanged();
                deleteFromDoctorProfile(url,id);
                break;
        }
    }
}
