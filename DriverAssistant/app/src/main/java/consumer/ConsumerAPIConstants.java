package consumer;


public class ConsumerAPIConstants {

    public static final String HCARE_TYPE_HEADER_KEY="X-HCARE-TYPE";

    public static final String HCARE_TYPE="doctor";

    public static final String AUTHORIZATION_HEADER_KEY="Authorization";

    public static final String BEARER_PREFIX="Bearer ";

    public static String TOKEN_URL_PARAM="?token=";


    public static String BASE_API_SERVER="http://staging.api.advisor.healthcare";

    public static String API_VERSION="v1";

    public static String GET_TEMPLATE_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/desktop/plan?is_template=1";

    public static String GET_ASSIGNED_PLAN_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/desktop/plan?is_assigned=1";

    public static String GET_SOCIAL_PLANS_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/desktop/plan?visibility=public";

    public static String GET_RECIPES_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/food/desktop/food";

    public static String CREATE_RECIPES_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/food";
    public static String CONFIGURE_PACKAGE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/package";
    public static String ADD_VARIANT=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/package/variant";
    public static String GET_MY_PACKAGES=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/package";
    public static String GET_SINGLE_PACKAGE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/package";
    public static String ADD_ACCOUNT_BILLING_INFO=BASE_API_SERVER+"/api/"+API_VERSION+"/user/account";
    public static String ADD_VIRTUAL_CLINIC_SETTINGS=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/schedule";
    public static String GET_PATIENT_PROFILE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient-detail?patient_id=";
    public static String GET_MY_SCHEDULE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/schedule/0";
    public static String GET_RECIPE=BASE_API_SERVER+"/api/"+API_VERSION+"/food/all?format=json";
    public static String GET_PRESCRIPTION=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/prescription?patient_id=";
    public static String GET_ALL_DIET_TEMPLATES =BASE_API_SERVER+"/api/"+API_VERSION+"/diet/desktop/plan?is_template=1&records=100";

    public static String GET_ACTIVE_DIET_PLAN =BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient/plans?patient_id=";

    public static String HEALTH_ISSUES=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient/detail/";
    public static String DOCTOR_PATIENTS_URL =BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patients";
    public static String MEDICAL_PROFILE_URL =BASE_API_SERVER+"/api/"+API_VERSION+"/user/medical-profile?patient_id=";
    public static String PREFFERENCE=BASE_API_SERVER+"/api/"+API_VERSION+"/user/preference?patient_id=";
    public static final String PATIENT_INFO = BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient/profile?patient_id=";
    public static String CREATE_SCHEDULE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/schedule/";
    public static String DIET_PLAN_CREATE=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/bulk";

    public static final String CREATE_DIET_PLAN_ACTIONID = BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/bulk";

    public static final String ACTIVATE_DIET_PLAN_ACTIONID = BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/active";

    public static final String DIET_PLAN_SHARE_ACTIONID = BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/";

    public static final String HEALTH_TIP_SHARE_URL = BASE_API_SERVER+"/api/"+API_VERSION+"/healthtip";

    public static final String MY_FEEDS_URL = BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/feed?appointment_status=requested";

    public static final String MY_APPOINTMENTS_URL = BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/appointments?appointment_status=scheduled";

    public static final String APPOINTMENT_ACTION_URL = BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient/appointment/status";

    public static final String FOLLOW_UP_ACTION_URL = BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/patient/follow-up?patient_id=";
    public static String GET_QB_CREDS_URL =BASE_API_SERVER+"/api/"+API_VERSION+"/chat/credentials";
    public static final String UPLOAD_PACKAGE_IMAGE=BASE_API_SERVER+"/api/"+API_VERSION+"/doctor/package/upload/";
    public static int MULTIPART_TIMEOUT=36000;
    public static int MAX_RETRIES=3;
    public static int REQUEST_TIMEOUT=6000;

    public static String GET_DIET_PLAN=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/";
    public static String GET_SINGLR_DIET_PLAN=BASE_API_SERVER+"/api/"+API_VERSION+"/diet/plan/";

    public static String REGISTER_DEVICE_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/device/register";

    public static String LOGOUT_USER_URL=BASE_API_SERVER+"/api/"+API_VERSION+"/account/logout";



}
