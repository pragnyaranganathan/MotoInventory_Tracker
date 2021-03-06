package com.epochconsulting.motoinventory.vehicletracker.util;

/**
 * Created by pragnya on 9/6/17.
 */

public class Constants {
    Constants(){

    }
    public static final String LOGIN_RESPONSE = "Logged In";
    public static final String  KEY_NAME = "usr";
    public static final String KEY_PASSWORD = "pwd";
    public static final String LOGIN_SUCCESS = "Login Success: ";
    public static final String PASSWORD_RESEND_MSG = "Password reset instructions have been sent to your email";
    public static final String KEY_EMAILID = "user";
    public static final String LOGOUT_RESPONSE =  "Logged out Successfully";
    /** The default socket timeout in milliseconds */
    public static final int DEFAULT_TIMEOUT_MS = 2500;

    /** The default number of retries */
    public static final int DEFAULT_MAX_RETRIES = 0;

    /** The default backoff multiplier */
    public static final float DEFAULT_BACKOFF_MULT = 1f;
    public static final String USER_ID="USER_ID" ;
    public static final String SESSION_ID ="SESSION_ID";
    public static final String PREFS_NAME = "PREF_NAME";
    public static final String SINGLE_SPACE = "%20";
    public static final long DISCONNECT_TIMEOUT = 120*60*1000L; //min*60secs*1000msecs
    public static final long TEST_USER_ACTIVITY = 5000L;//5 Seconds
    public static final long NUMBER_OF_DAYS_TO_TRANSFER_VEHICLE = 1;
    public static final long DUMMY_NUMBER_OF_DAYS_DIFF = -1;
}
