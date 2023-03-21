package fg0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import bp0.k;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.utils.GsonUtil;
import io.sentry.instrumentation.file.m;
import java.io.File;
import java.io.Reader;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import ms.h;
import os.u;

@Instrumented
/* compiled from: PersistableContext.kt */
public abstract class d implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18321c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final transient Context f18322a;

    /* renamed from: b  reason: collision with root package name */
    private transient SharedPreferences f18323b;

    /* compiled from: PersistableContext.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(Context context) {
        p.j(context, "application");
        this.f18322a = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        p.i(defaultSharedPreferences, "getDefaultSharedPreferences(application)");
        this.f18323b = defaultSharedPreferences;
    }

    private final <T> T S2(Class<T> cls, String str) {
        T U2 = U2(cls);
        b();
        js.a.b(this.f18323b, str, Boolean.TRUE);
        return U2;
    }

    private final <T> T U2(Class<T> cls) {
        File file = new File(this.f18322a.getFilesDir(), Q2());
        if (!file.exists()) {
            return null;
        }
        try {
            u.b(N2(), p.s("Loading from file:", file));
            m mVar = new m(file);
            Gson gson = GsonUtil.getGson();
            return !(gson instanceof Gson) ? gson.fromJson((Reader) mVar, cls) : GsonInstrumentation.fromJson(gson, (Reader) mVar, cls);
        } catch (Throwable th2) {
            u.h(N2(), th2);
            return null;
        }
    }

    private final <T> T V2(Class<T> cls) {
        String str = "";
        try {
            String string = this.f18323b.getString(Q2(), str);
            if (string != null) {
                str = string;
            }
            Gson gson = GsonUtil.getGson();
            return !(gson instanceof Gson) ? gson.fromJson(str, cls) : GsonInstrumentation.fromJson(gson, str, cls);
        } catch (IncompatibleClassChangeError unused) {
            if (p.e("release", "release")) {
                return null;
            }
            throw new JsonSyntaxException("json parsing exception while reading from shared pref");
        } catch (Exception unused2) {
            if (p.e("release", "release")) {
                return null;
            }
            throw new JsonSyntaxException("json parsing exception while reading from shared pref");
        }
    }

    /* access modifiers changed from: private */
    public static final k W2(d dVar) {
        p.j(dVar, "this$0");
        dVar.X2();
        return k.f22762a;
    }

    private final void X2() {
        SharedPreferences sharedPreferences = this.f18323b;
        String Q2 = Q2();
        Gson gson = GsonUtil.getGson();
        Object O2 = O2();
        js.a.b(sharedPreferences, Q2, !(gson instanceof Gson) ? gson.toJson(O2) : GsonInstrumentation.toJson(gson, O2));
    }

    /* access modifiers changed from: private */
    public static final k Y2(d dVar) {
        p.j(dVar, "this$0");
        dVar.Z2();
        return k.f22762a;
    }

    private final void Z2() {
        SharedPreferences.Editor edit = this.f18323b.edit();
        p.i(edit, "editor");
        edit.remove(Q2());
        edit.apply();
    }

    public final Context M2() {
        return this.f18322a;
    }

    /* access modifiers changed from: protected */
    public abstract String N2();

    /* access modifiers changed from: protected */
    public abstract Object O2();

    /* access modifiers changed from: protected */
    public abstract String P2();

    /* access modifiers changed from: protected */
    public final String Q2() {
        return p.s(P2(), ".PRODUCTION");
    }

    public final SharedPreferences R2() {
        return this.f18323b;
    }

    public <T> T T2(Class<T> cls) {
        Boolean bool;
        p.j(cls, "clazz");
        String s11 = p.s(Q2(), ".old_deleted");
        SharedPreferences sharedPreferences = this.f18323b;
        Boolean bool2 = Boolean.FALSE;
        if (bool2 instanceof String) {
            String string = sharedPreferences.getString(s11, (String) bool2);
            if (string == null) {
                string = "";
            }
            bool = (Boolean) string;
        } else if (bool2 instanceof Integer) {
            bool = (Boolean) Integer.valueOf(sharedPreferences.getInt(s11, ((Integer) bool2).intValue()));
        } else {
            bool = Boolean.valueOf(sharedPreferences.getBoolean(s11, false));
        }
        if (c.e(bool)) {
            return S2(cls, s11);
        }
        return V2(cls);
    }

    public synchronized void a() {
        h.c(new b(this), wo0.a.c());
    }

    public synchronized void b() {
        h.c(new c(this), wo0.a.c());
    }
}
