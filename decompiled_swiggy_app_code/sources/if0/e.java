package if0;

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
public abstract class e implements ef0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18361c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final transient Context f18362a;

    /* renamed from: b  reason: collision with root package name */
    private transient SharedPreferences f18363b;

    /* compiled from: PersistableContext.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public e(Context context) {
        p.j(context, "application");
        this.f18362a = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        p.i(defaultSharedPreferences, "getDefaultSharedPreferences(application)");
        this.f18363b = defaultSharedPreferences;
    }

    /* access modifiers changed from: private */
    public static final k C(e eVar) {
        p.j(eVar, "this$0");
        eVar.F();
        return k.f22762a;
    }

    private final void F() {
        SharedPreferences.Editor edit = this.f18363b.edit();
        p.i(edit, "editor");
        edit.remove(q());
        edit.apply();
    }

    private final <T> T t(Class<T> cls, String str) {
        T v = v(cls);
        b();
        js.a.b(this.f18363b, str, Boolean.TRUE);
        return v;
    }

    private final <T> T v(Class<T> cls) {
        File file = new File(this.f18362a.getFilesDir(), q());
        if (!file.exists()) {
            return null;
        }
        try {
            u.b(k(), p.s("Loading from file:", file));
            m mVar = new m(file);
            Gson gson = GsonUtil.getGson();
            return !(gson instanceof Gson) ? gson.fromJson((Reader) mVar, cls) : GsonInstrumentation.fromJson(gson, (Reader) mVar, cls);
        } catch (Throwable th2) {
            u.h(k(), th2);
            return null;
        }
    }

    private final <T> T w(Class<T> cls) {
        String str = "";
        try {
            String string = this.f18363b.getString(q(), str);
            if (string != null) {
                str = string;
            }
            Gson gson = GsonUtil.getGson();
            return !(gson instanceof Gson) ? gson.fromJson(str, cls) : GsonInstrumentation.fromJson(gson, str, cls);
        } catch (Exception unused) {
            if (p.e("release", "release")) {
                return null;
            }
            throw new JsonSyntaxException("json parsing exception while reading from shared pref");
        }
    }

    /* access modifiers changed from: private */
    public static final k y(e eVar) {
        p.j(eVar, "this$0");
        eVar.z();
        return k.f22762a;
    }

    private final void z() {
        SharedPreferences sharedPreferences = this.f18363b;
        String q = q();
        Gson gson = GsonUtil.getGson();
        Object l11 = l();
        js.a.b(sharedPreferences, q, !(gson instanceof Gson) ? gson.toJson(l11) : GsonInstrumentation.toJson(gson, l11));
    }

    public synchronized void a() {
        h.c(new d(this), wo0.a.c());
    }

    public synchronized void b() {
        h.c(new c(this), wo0.a.c());
    }

    /* access modifiers changed from: protected */
    public abstract String k();

    /* access modifiers changed from: protected */
    public abstract Object l();

    /* access modifiers changed from: protected */
    public abstract String p();

    /* access modifiers changed from: protected */
    public final String q() {
        return p.s(p(), ".PRODUCTION");
    }

    public <T> T u(Class<T> cls) {
        Boolean bool;
        p.j(cls, "clazz");
        String s11 = p.s(q(), ".old_deleted");
        SharedPreferences sharedPreferences = this.f18363b;
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
            return t(cls, s11);
        }
        return w(cls);
    }
}
