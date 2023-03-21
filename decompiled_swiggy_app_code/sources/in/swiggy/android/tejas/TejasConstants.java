package in.swiggy.android.tejas;

/* compiled from: TejasConstants.kt */
public final class TejasConstants {
    public static final String APPEND_FLOW_ID_FORMATTER = "@@flow_id=%s";
    public static final String DIRECTIONS_PARAMS = "?origin=%s&destination=%s&waypoints=via:%s&alternatives=true&region=in&avoid=tolls|highways|ferries";
    public static final String DIRECTIONS_PATH = "/maps/api/directions/json";
    public static final String DIRECTIONS_USER_AGENT = "Swiggy-Android";
    public static final String EDM_FEATURE_NAME = "EDM";
    public static final String FOOD_MAX_TTL_IN_SEC = "food_max_ttl_in_sec";
    public static final String FOOD_MAX_TTL_IN_SEC_DEFAULT = "300";
    public static final String FOOD_MIN_TTL_IN_SEC = "food_min_ttl_in_sec";
    public static final String FOOD_MIN_TTL_IN_SEC_DEFAULT = "60";
    public static final String GIFTING_FLOW_ID = "gifting";
    public static final String HOME_MAX_TTL_IN_MILLIS = "home_max_ttl_in_millis";
    public static final String HOME_MAX_TTL_IN_MILLIS_DEFAULT = "300000";
    public static final String HOME_MIN_TTL_IN_MILLIS = "home_min_ttl_in_millis";
    public static final String HOME_MIN_TTL_IN_MILLIS_DEFAULT = "60000";
    public static final String HOME_PAGE = "HOME_PAGE";
    public static final String HOME_PAGE_FEATURE_NUDGE = "HOME_PAGE_NUDGE";
    public static final String HOME_V2_MAX_TTL_IN_SEC = "home_v2_max_ttl_in_sec";
    public static final String HOME_V2_MAX_TTL_IN_SEC_DEFAULT = "300";
    public static final String HOME_V2_MIN_TTL_IN_SEC = "home_v2_min_ttl_in_sec";
    public static final String HOME_V2_MIN_TTL_IN_SEC_DEFAULT = "60";
    public static final TejasConstants INSTANCE = new TejasConstants();
    public static final String OFO_FLOW_ID = "ofo";
    public static final String POP_FEATURE_NAME = "SWIGGY_POP";
    public static final String SHARED_PREF_DIRECTIONS = "_directions";
    public static final String SHARED_PREF_DISCOVERY_STORE = "_discovery_store";
    public static final String SHARED_PREF_FOOD_DISCOVERY_STORE = "_food_discovery_store";
    public static final String SHARED_PREF_HOME_STORE = "_home_store";
    public static final String SWIGGY_DASH = "SWIGGY_DASH";

    private TejasConstants() {
    }
}
