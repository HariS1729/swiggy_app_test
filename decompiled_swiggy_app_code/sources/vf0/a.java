package vf0;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import os.u;
import vf0.c;

/* compiled from: AssetPreCacheJob.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0247a f19935b = new C0247a((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19936c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f19937a;

    /* renamed from: vf0.a$a  reason: collision with other inner class name */
    /* compiled from: AssetPreCacheJob.kt */
    public static final class C0247a {
        private C0247a() {
        }

        public /* synthetic */ C0247a(i iVar) {
            this();
        }

        private final boolean a(JSONObject jSONObject) {
            String string;
            String string2 = jSONObject.getString(DistributedTracing.NR_ID_ATTRIBUTE);
            if (string2 != null && (string = jSONObject.getString("type")) != null && !o.A(string2) && !o.A(string)) {
                return true;
            }
            return false;
        }

        private final List<b> c(String str) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                p.i(jSONObject, "item");
                if (!c.e(Boolean.valueOf(a(jSONObject)))) {
                    String string = jSONObject.getString(DistributedTracing.NR_ID_ATTRIBUTE);
                    String string2 = jSONObject.getString("type");
                    if (string2 != null) {
                        int hashCode = string2.hashCode();
                        if (hashCode != -2013070401) {
                            if (hashCode != -1956270131) {
                                if (hashCode == -512468560 && string2.equals("EndCardImage")) {
                                    p.i(string, DistributedTracing.NR_ID_ATTRIBUTE);
                                    arrayList.add(new b(new c.b(string), 0, 2, (i) null));
                                }
                            } else if (string2.equals("CloudinaryImage")) {
                                p.i(string, DistributedTracing.NR_ID_ATTRIBUTE);
                                arrayList.add(new b(new c.a(string), 0, 2, (i) null));
                            }
                        } else if (string2.equals("Lottie")) {
                            p.i(string, DistributedTracing.NR_ID_ATTRIBUTE);
                            arrayList.add(new b(new c.C0248c(string), 0, 2, (i) null));
                        }
                    }
                }
                i11 = i12;
            }
            return arrayList;
        }

        public final a b(String str) {
            p.j(str, "json");
            try {
                return new a(c(str));
            } catch (JSONException e11) {
                u.h("AssetPreCacheWorker", e11);
                return null;
            }
        }
    }

    public a(List<b> list) {
        p.j(list, "requests");
        this.f19937a = list;
    }

    public final List<b> a() {
        return this.f19937a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p.e(this.f19937a, ((a) obj).f19937a);
    }

    public int hashCode() {
        return this.f19937a.hashCode();
    }

    public String toString() {
        return "AssetPreCacheJob(requests=" + this.f19937a + ')';
    }
}
