package qf0;

import in.swiggy.android.services.network.NetworkPreHeatWorker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONException;
import os.u;

/* compiled from: NetworkPreHeatJob.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0240a f19851b = new C0240a((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19852c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f19853a;

    /* renamed from: qf0.a$a  reason: collision with other inner class name */
    /* compiled from: NetworkPreHeatJob.kt */
    public static final class C0240a {
        private C0240a() {
        }

        public /* synthetic */ C0240a(i iVar) {
            this();
        }

        public final a a(String str) {
            p.j(str, "json");
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(str);
                int i11 = 0;
                int length = jSONArray.length();
                while (i11 < length) {
                    int i12 = i11 + 1;
                    String string = jSONArray.getString(i11);
                    if (string != null) {
                        arrayList.add(string);
                    }
                    i11 = i12;
                }
                return new a(arrayList);
            } catch (JSONException e11) {
                u.h(NetworkPreHeatWorker.k.a(), e11);
                return null;
            }
        }
    }

    public a(List<String> list) {
        p.j(list, "urls");
        this.f19853a = list;
    }

    public final List<String> a() {
        return this.f19853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p.e(this.f19853a, ((a) obj).f19853a);
    }

    public int hashCode() {
        return this.f19853a.hashCode();
    }

    public String toString() {
        return "NetworkPreHeatJob(urls=" + this.f19853a + ')';
    }
}
