package e6;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.n;

/* compiled from: HVSignatureService */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14389a = "co.hyperverge.hypersnapsdk.service.HVSignatureService";

    public static TreeMap<String, Object> a(JSONObject jSONObject) {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = null;
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e11) {
                Log.e(f14389a, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
            treeMap.put(next, obj);
        }
        return treeMap;
    }

    public static String b(TreeMap<String, Object> treeMap) {
        JSONObject jSONObject;
        String str = "" + "{";
        try {
            for (String next : treeMap.keySet()) {
                if (!str.equals("{")) {
                    str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
                Object obj = treeMap.get(next);
                if (obj instanceof JSONObject) {
                    obj = b(a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    try {
                        jSONObject = ((JSONArray) obj).getJSONObject(0);
                    } catch (JSONException e11) {
                        Log.e(f14389a, e11.getMessage());
                        if (n.w().s() != null) {
                            n.w().s().a(e11);
                        }
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        TreeMap<String, Object> a11 = a(jSONObject);
                        obj = "[" + b(a11) + "]";
                    }
                } else if (obj instanceof String) {
                    obj = "\"" + obj.toString() + "\"";
                }
                str = str + "\"" + next + "\":" + obj;
            }
            return str + "}";
        } catch (Exception e12) {
            Log.e(f14389a, e12.getMessage());
            return null;
        }
    }
}
