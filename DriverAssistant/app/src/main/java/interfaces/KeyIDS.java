package interfaces;

public interface KeyIDS {
    String TAG = "Advisor.Healthcare";
    String DEBUG = "doctordebug";
    String ID = "id";
    String PLAN_ID = "plan_id";
    String TIMING = "timing";
    //table related key
    String FOOD_TABLE = "food_table";
    String FOOD_ID = "food_id";
    String FOOD_NAME = "food_name";

    //log table constants
    String LOG_TABLE = "logs";
    String TIME_TABLE_PLAN_ID = "plan_id";
    String MEAL_ID = "meal_id";
    String DETAILS = "details";
    String RESPONSE = "response";
    String SYNCHRONIZED = "synchronized";


    String TIME_TABLE = "time_table";
    String TIME_TABLE_DAY = "day";
    String TIME_TABLE_TYPE = "type";
    String TIME_TABLE_TIME = "time";
    String TIME_TABLE_MEAL_ID = "meal_id";
    String TIME_TABLE_MEAL_NAME = "meal_name";

    String NOTIFICATION_ACTION = "notification_action";
    String APPOINTMENT_APPROVED="appointment_approved";
    String APPOINTMENT_BOOKED="appointment_booked";

    String MARK_COMPLETE_REMINDER_FOUTYFIVE_AFTER_KEY ="appointment_mark_complete_forty_five_minute_after";



    String CONSULTATION_FEE_AND_TIMING = "Consultation Fee and Timing";
    String HEALTH_PACKAGES = "Health Packages";
    String PRACTICE_MANAGEMENT = "Practice Management";
    String ACCOUNT_AND_BILLING = "Account and Billing Details";
    String HEALTH_TIPS = "Health Tips";
    String SHARE_APP = "Share App";
    String RATE_APP = "Rate App";
    String CONTACT_US = "Contact Us";
    String LOGOUT = "Logout";

    //COLORS
    String APP_GREEN = "#19BC9C";
    String WHITE = "#FFFFFF";
    String BLACK = "#000000";

    String STATUS = "status";
    String DATA = "data";
    String ERROR = "Error Occured...";
    String FAILED_TO_LOAD = "Failed to Load";
    String GET = "get";
    String POST = "post";


    //QuickBlox credentials

    public final String QB_APP_ID = "26046";
    public final String QB_AUTH_KEY = "dgYxStEYMMu46C4";
    public final String QB_AUTH_SECRET = "wGWDmYPknTBttt6";


    String WATER_GRAPH_DATA_WEEK = "/v1/log/graph/water?timeline=week&patient_id=";
    String WATER_GRAPH_DATA_MONTH = "/v1/log/graph/water?timeline=month&patient_id=";
    String WATER_GRAPH_DATA_YEAR = "/v1/log/graph/water?timeline=year&patient_id=";

    String WEIGHT_GRAPH_DATA_WEEK = "/v1/log/graph/weight?timeline=week&patient_id=";
    String WEIGHT_GRAPH_DATA_MONTH = "/v1/log/graph/weight?timeline=month&patient_id=";
    String WEIGHT_GRAPH_DATA_YEAR = "/v1/log/graph/weight?timeline=year&patient_id=";

    String VERIFY_OTP_ACTIONID = "/v1/account/otp/verify";
    String VERIFY_EMAIL_ACTIONID = "/v1/account/email/send";
    String VERIFY_MOBILE_ACTIONID = "/v1/account/otp/resend";


    public static final String ENROLL_PATIENT_PREFERENCES_URL = "/v1/user/preference?patient_id=";
    public static final String ENROLL_PATIENT_MEDICAL_URL = "/v1/user/medical-profile?patient_id=";

    public static final String COLLECTIVE_CHAT_NOTIFICATION = "collective_chat_notification";


    //Mix panelroperties
    public final String MP_MIX_PANEL_KEY = "4e8315dadbcb5e2edc1ddad74a065e15";
    //// TODO: 12-10-2015 SenderId
    public final String MP_ANDROID_PUSH_SENDER_ID = "706506588897";

    public final String MIXPANEL_DISTINCT_ID_NAME = "mp_distinctid";

    public final String MP_HEALTH_TIPS = "Health Tips";
    //  public final String MP_LEFT_NAVIGATION = "LEFT NAVIGATION";

    public final String MP_HEALTH_TRACKER = "Health Tracker";
    public final String MP_MY_DIET_PLAN = "My Diet Plan";
    public final String MP_TODAY_DIET_PLAN = "Todays Diet Plan";
    public final String MP_CREATE_DIET_PLAN = "Create Diet Plan";
    public final String MP_SOCIAL_DIET_PLAN = "Social Diet Plan";
    public final String MP_ACTIVE_DIET_PLAN = "Active Diet Plan";
    public final String MP_DIET_PREF = "Diet Preference";
    public final String MP_VERIFY_EMAIL = "Verify Email";
    public final String MP_VERIFY_MOBILE = "Verify Mobile";
    public final String MP_DIET_CONSULTATION = "Diet Consultation";
    public final String MP_ADD_NEW_MEAL = "Add New MeaL";
    public final String MP_CREATE_DIET_PLAN_2 = "Create Diet Plan 2";
    public final String CREATE_DIET_PLAN_3 = "Create Diet Plan 3";
    public final String MP_SOCIAL_SHARE_DIET_PLAN = "Social Share Diet plan";
    public final String MP_SCHEDULE_DIET_PLAN = "Schedule Diet Plan";
    public final String MP_SAVE_DIET_PLAN = "Save Diet Plan";
    public final String MP_LOGIN = "Login";
    public final String MP_HOME = "Home";
    public final String MP_DIET_DIARY = "Diet Diary";
    public final String MP_MY_CONSULTATIONS = "My Consultations";
    public final String MP_HEALTH_ADVISORS = "Health Advisors";
    public final String MP_DOCTOR_AND_ADVISORS = "Doctors and Advisors";
    public final String MP_TODAY = "Today";
    public final String MP_PROFILE = "Profile";
    public final String MP_SHARE_OUR_APP = "Share our app";
    public final String MP_CONTACT_US = "Contact Us";
    public final String MP_RATE_OUT_APP = "Rate our app";
    public final String MP_LOGOUT = "Logout";
    public final String MP_MY_DOCTORS = "My Doctors";
    public final String MP_ALL_DOCTORS = "All Doctors";
    public final String MP__PACKAGES = "Packages";
    public final String MP_DOCTOR_PROFILE = "Doctor Profile";
    public final String MP_EDIT_PROFILE = "Edit Profile";
    public final String MP_UPDATE_PERSONAL_PROFILE = "Update Personal Profile";
    public final String MP_UPDATE_PROFFESIONAL_PROFILE = "Update Professional Profile";
    public final String MP_VIEW_PROFFESIONAL_PROFILE = "View Professional Profile";
    public final String MP_UPDATE_PERSONAL_PROFILE_BUTTON = "Update Personal Profile Clicked";
    public final String MP_UPDATE_PROFFESIONAL_PROFILE_BUTTON = "Update Professional Profile Clicked";
    public final String MP_VIEW_PERSONAL_PROFILE = "View Personal Profile";
    public final String MP_CHECKOUT = "Checkout";
    public final String MP_HEALTH_ISSUE = "Health Issue";
    public final String MP_HEALTH_RECORD = "Health Record";
    public final String MP_WRITE_PRESCRIPTION = "Write Prescription";
    public final String MP_PRESCRIPTION = "Prescription List";
    public final String MP_PATIENT_REGISTRATION = "Register Patient";
    public final String MP_SHARE_HEALTH_TIPS = "Share Health Tips";
    public final String MP_HEALTH_TIP_TEXT = "Health Tips Text";
    public final String MP_MY_CHATS = "My Chats";
    public final String MP_FOLLOWUP_BUTTON = "Follow Up Clicked";


    public final String MP_CONSULTATION_FEE = "Virtual Clinic";
    public final String MP_UPDATE_VIRTUAL = "Update Virtual Clinic Setting";
    public final String MP_HEALTH_PACKAGES = "Health Packages";
    public final String MP_CONFIGURE_PACKAGE = "View Health Package";
    public final String MP_PRACTICE_MANAGMENT = "Practice management";
    public final String MP_ACCOUNT_BILLING = "Account Billing";
    public final String MP_MONITOR = "Monitor";

    public final String MP_PATIENT_INFO = "Patient Info";
    public final String MP_DIET_PREFERENCE = "Diet Preference";
    public final String MP_MEDICAL_PROFILE = "Medical Profile";

    public final String MP_ENROLL_DIET_PREFERENCE = "Enroll Patient Diet Preference ";
    public final String MP_ENROLL_MEDICAL_PROFILE = "Enroll Patient Medical Profile ";
    public final String MP_MESSAGE= "Message Clicked";
    public final String MP_COMPLETE= "Complete Clicked";
    public final String MP_CALL = "Call Clicked ";
    public final String MP_FOLLOWUP = "FollowUp Clicked ";



    public final String MP_DOCTOR_PACKAGE_LIST = "Doctor Package List";
    public final String MP_DOCTOR_REVIEW = "Doctor Review";
    public final String MP_DIET_PLAN_SUCCESSFULL = "Save Diet Plan Successfull";
    //mp data by sandeep
    public final String MP_ORDER_DETAILS = "Order Details";
    public final String MP_MORE = "More";
    public final String MP_PATIENT_PROFILE = "Patient Profile";
    public final String MP_MAINACTIVITY = "Main Activity";

    //Number constants
    public final int CALL_NOTIFICATION_ID =7071;

    public final String ACTION = "action";
    public final String NOTIFICATION_ID="notification_id";
    public final String RECEIVE_CALL="receive_call";
    public final String REJECT_CALL="reject_call";
    public final String MAKE_CALL="make_call";
    public final String VIDEO_CALL="video_call";
    public final String AUDIO_CALL="audio_call";
    public final String CALL_TYPE="call_type";
}

