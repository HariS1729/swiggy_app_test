package w5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.e;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@Instrumented
/* compiled from: SPHelper */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17597a = "co.hyperverge.hypersnapsdk.c.n";

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f17598b;

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences.Editor f17599c;

    /* compiled from: SPHelper */
    class a extends TypeToken<HashMap<String, Boolean>> {
        a() {
        }
    }

    /* compiled from: SPHelper */
    class b extends TypeToken<HashMap<String, Integer>> {
        b() {
        }
    }

    public static int a(String str, String str2) {
        try {
            String i11 = i(str, str2);
            HashMap<String, Integer> o11 = o();
            if (o11 == null || !o11.containsKey(i11)) {
                return 0;
            }
            return o11.get(i11).intValue();
        } catch (Exception e11) {
            Log.e(f17597a, e11.getMessage());
            return 0;
        }
    }

    public static HashMap<String, Integer> b(HashMap<String, Integer> hashMap, String str) {
        if (hashMap.containsKey(str)) {
            hashMap.put(str, Integer.valueOf(hashMap.get(str).intValue() + 1));
        } else {
            hashMap.put(str, 1);
        }
        if (hashMap.containsKey("totalAttempts")) {
            hashMap.put("totalAttempts", Integer.valueOf(hashMap.get("totalAttempts").intValue() + 1));
        } else {
            hashMap.put("totalAttempts", 1);
        }
        return hashMap;
    }

    public static void c(int i11) {
        if (f17598b != null) {
            j().putInt("feature-config-expiry", i11);
            j().commit();
        }
    }

    public static void d(long j) {
        if (f17598b != null) {
            j().putLong("feature-config-last-modified", j);
            j().commit();
        }
    }

    public static void e(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("HyperSnapSP", 0);
            f17598b = sharedPreferences;
            f17599c = sharedPreferences.edit();
        }
    }

    public static void f(e eVar) {
        f17598b.edit().putString("ipAddressData", GsonInstrumentation.toJson(new Gson(), (Object) eVar).toString()).apply();
    }

    public static void g(Map<String, Boolean> map) {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) map);
        if (f17598b != null) {
            j().putString("feature-config", json);
            d(System.currentTimeMillis());
            j().commit();
        }
    }

    public static String h(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    public static String i(String str, String str2) {
        String h11 = h(str);
        if (str2 == null || str2.trim().isEmpty()) {
            return h11;
        }
        return h11 + "_" + str2;
    }

    private static SharedPreferences.Editor j() {
        if (f17599c == null) {
            f17599c = q().edit();
        }
        return f17599c;
    }

    public static JSONObject k(String str, String str2) {
        HashMap<String, Integer> o11 = o();
        JSONObject jSONObject = new JSONObject();
        String i11 = i(str, str2);
        int i12 = 1;
        int intValue = o11.containsKey("totalAttempts") ? o11.get("totalAttempts").intValue() + 1 : 1;
        if (o11.containsKey(i11)) {
            i12 = 1 + o11.get(i11).intValue();
        }
        try {
            jSONObject.put("attempts", i12);
            jSONObject.put("totalAttempts", intValue);
        } catch (Exception e11) {
            Log.e(f17597a, e11.getMessage());
        }
        return jSONObject;
    }

    public static long l() {
        SharedPreferences sharedPreferences = f17598b;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("feature-config-last-modified", 0);
        }
        return 0;
    }

    public static String m(String str, String str2) {
        if (r().trim().isEmpty()) {
            return null;
        }
        HashMap<String, Integer> o11 = o();
        b(o11, i(str, str2));
        String json = GsonInstrumentation.toJson(new Gson(), (Object) o11);
        if (f17598b != null) {
            j().putString(r(), json);
            j().commit();
        }
        return json;
    }

    public static Map<String, Boolean> n() {
        try {
            SharedPreferences sharedPreferences = f17598b;
            if (sharedPreferences != null) {
                return (Map) GsonInstrumentation.fromJson(new Gson(), sharedPreferences.getString("feature-config", ""), new a().getType());
            }
        } catch (Exception e11) {
            Log.e(f17597a, e11.getMessage());
        }
        return h.a();
    }

    public static HashMap<String, Integer> o() {
        Gson gson = new Gson();
        SharedPreferences sharedPreferences = f17598b;
        String str = "";
        if (sharedPreferences != null) {
            str = sharedPreferences.getString(r(), str);
        }
        HashMap<String, Integer> hashMap = (HashMap) GsonInstrumentation.fromJson(gson, str, new b().getType());
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    public static e p() {
        return (e) GsonInstrumentation.fromJson(new Gson(), f17598b.getString("ipAddressData", JSONObjectInstrumentation.toString(new JSONObject())), e.class);
    }

    private static SharedPreferences q() {
        return f17598b;
    }

    public static String r() {
        if (q() != null) {
            return q().getString("transactionId", "");
        }
        return "";
    }

    public static boolean s() {
        SharedPreferences sharedPreferences = f17598b;
        if (sharedPreferences == null) {
            return true;
        }
        if (((int) ((System.currentTimeMillis() - l()) / 1000)) > sharedPreferences.getInt("feature-config-expiry", 3600)) {
            return true;
        }
        return false;
    }
}
