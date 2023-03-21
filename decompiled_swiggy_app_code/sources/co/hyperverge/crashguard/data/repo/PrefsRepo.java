package co.hyperverge.crashguard.data.repo;

import android.content.Context;
import android.util.Log;
import b3.a;
import bp0.f;
import c5.b;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import sp0.j;
import y2.c;

/* compiled from: PrefsRepo.kt */
public final class PrefsRepo {
    public static final a Companion = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ j<Object>[] f13120e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static PrefsRepo f13121f;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c<b3.a> f13122a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f13123b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13124c;

    /* renamed from: d  reason: collision with root package name */
    private final b f13125d;

    /* compiled from: PrefsRepo.kt */
    public static final class Keys {

        /* renamed from: a  reason: collision with root package name */
        public static final Keys f13126a = new Keys();

        /* renamed from: b  reason: collision with root package name */
        private static final f f13127b = b.b(PrefsRepo$Keys$SENTRY_ENDPOINT_URL$2.f13129a);

        /* renamed from: c  reason: collision with root package name */
        private static final f f13128c = b.b(PrefsRepo$Keys$SENTRY_KEY$2.f13130a);

        private Keys() {
        }

        public final a.C0100a<String> a() {
            return (a.C0100a) f13127b.getValue();
        }

        public final a.C0100a<String> b() {
            return (a.C0100a) f13128c.getValue();
        }
    }

    /* compiled from: PrefsRepo.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final PrefsRepo a() {
            return PrefsRepo.f13121f;
        }

        public final PrefsRepo b(Context context) {
            p.j(context, LogCategory.CONTEXT);
            PrefsRepo a11 = a();
            if (a11 != null) {
                return a11;
            }
            PrefsRepo prefsRepo = new PrefsRepo(c5.c.b(context), (i) null);
            PrefsRepo.Companion.c(prefsRepo);
            return prefsRepo;
        }

        public final void c(PrefsRepo prefsRepo) {
            PrefsRepo.f13121f = prefsRepo;
        }
    }

    static {
        Class<PrefsRepo> cls = PrefsRepo.class;
        f13120e = new j[]{s.f(new MutablePropertyReference1Impl(cls, "sentryEndpointUrl", "getSentryEndpointUrl()Ljava/lang/String;", 0)), s.f(new MutablePropertyReference1Impl(cls, "sentryKey", "getSentryKey()Ljava/lang/String;", 0))};
    }

    private PrefsRepo(c<b3.a> cVar) {
        this.f13122a = cVar;
        this.f13123b = s.b(PrefsRepo.class).b();
        Keys keys = Keys.f13126a;
        this.f13124c = new b(keys.a(), "");
        this.f13125d = new b(keys.b(), "");
    }

    public /* synthetic */ PrefsRepo(c cVar, i iVar) {
        this(cVar);
    }

    public final <T> T e(a.C0100a<T> aVar, T t) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        T f11 = i.b((CoroutineContext) null, new PrefsRepo$get$1(this, aVar, (fp0.c<? super PrefsRepo$get$1>) null), 1, (Object) null);
        if (f11 != null) {
            t = f11;
        }
        String str = this.f13123b;
        Log.i(str, "get: key: " + aVar.a() + ", value: " + t);
        return t;
    }

    public final String f() {
        return (String) this.f13124c.a(this, f13120e[0]);
    }

    public final String g() {
        return (String) this.f13125d.a(this, f13120e[1]);
    }

    public final <T> b3.a h(a.C0100a<T> aVar, T t) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        return (b3.a) i.b((CoroutineContext) null, new PrefsRepo$set$1(this, aVar, t, (fp0.c<? super PrefsRepo$set$1>) null), 1, (Object) null);
    }

    public final void i(String str) {
        p.j(str, "<set-?>");
        this.f13124c.c(this, f13120e[0], str);
    }

    public final void j(String str) {
        p.j(str, "<set-?>");
        this.f13125d.c(this, f13120e[1], str);
    }
}
