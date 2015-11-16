package constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by letsgomolabs on 6/24/15.
 */
public class hCareAPIConstants {
	public static final String META_DATA = "v1/meta";
	public static final String LOGIN_API = "v1/account/login";
	public static final String CREATE_NEW_PACKAGE = "v1/account/login";
	public static final String FACEBOOK_LOGIN_API = "v1/account/facebook-login";
	public static final String SIGNUP_API = "v1/account/register";
	public static final String FORGOT_PASSWORD_API = "v1/account/password/reset";
	public static final String OTP_VERIFICATION_API = "v1/account/otp/verify";
	public static final String RESEND_OTP_API = "v1/account/otp/resend";
	public static final String GET_DOCTOR = "v1/account/detail";
	public static final String REGISTER_PATIENT = "v1/doctor/patient/find-and-create";
	public static final String UPDATE_PATIENT = "v1/doctor/patient/update";
	public static final String FIND_PATIENT = "v1/doctor/patient/find";
	public static final String VERIFY_PATIENT_OTP = "v1/doctor/patient/verify-otp";
	public static final String RESEND_PATIENT_OTP = "v1/doctor/patient/resend-otp";
	public static final String CHANGE_PASSWORD = "v1/account/password/change";
	public static final String UPDATE_PERSONAL_INFO = "v1/account/update";
	public static final String UPDATE_DOCTOR_AWARD = "v1/doctor/award";
    public static final String UPDATE_DOCTOR_EDUCATION = "v1/doctor/education";
    public static final String UPDATE_DOCTOR_SERVICES = "v1/doctor/service";
    public static final String UPDATE_DOCTOR_EXP = "v1/doctor/experience";
    public static final String UPDATE_DOCTOR_LANGUAGE = "v1/doctor/language";
    public static final String UPDATE_DOCTOR_MEMBERSHIP = "v1/doctor/membership";
    public static final String UPDATE_DOCTOR_REGISTRATION = "v1/doctor/registration";
	public static final String UPLOAD_PROFILE_PICTURE = "v1/account/picture";
	public static final String MEDICAL_PROFILE = "v1/user/medical-profile";
	public static final String DIET_PREFERENCE = "v1/user/preference";

	public static final int CONNECTION_TIMEOUT_MS = 50000;

	private static final Map<String, SERVER_ADDRESS> serverMap =
			new HashMap<String, SERVER_ADDRESS>();

	public static final SERVER_ADDRESS DEFAULT_SERVER_LABEL = SERVER_ADDRESS.STAGING;

	public enum SERVER_ADDRESS {
		STAGING("http", "staging.api.advisor.healthcare/api"),
		PRODUCTION("http", "api.advisor.healthcare/api");

		public final String scheme;
		public final String authority;


		SERVER_ADDRESS(String scheme, String authority) {
			this.authority = authority;
			this.scheme = scheme;
			serverMap.put(authority, this);
		}

		public static SERVER_ADDRESS getServer(String label) {
			SERVER_ADDRESS server = serverMap.get(label);
			if (server != null) {
				return server;
			} else {
				// server not found
				return serverMap.get(DEFAULT_SERVER_LABEL);
			}
		}
	}
}
