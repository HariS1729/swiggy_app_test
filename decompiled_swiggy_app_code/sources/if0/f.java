package if0;

import android.content.Context;
import fg0.d;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PersistanceContextService.kt */
public final class f extends d implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18364f = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private String f18365d;

    /* renamed from: e  reason: collision with root package name */
    private Object f18366e;

    /* compiled from: PersistanceContextService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
    }

    /* access modifiers changed from: protected */
    public String N2() {
        return "PersistanceContextService";
    }

    /* access modifiers changed from: protected */
    public Object O2() {
        return this.f18366e;
    }

    /* access modifiers changed from: protected */
    public String P2() {
        String str = this.f18365d;
        return str == null ? "" : str;
    }

    public void S1(String str, Object obj) {
        this.f18365d = str;
        this.f18366e = obj;
        a();
    }

    public void U(String str) {
        this.f18365d = str;
        b();
    }

    public <T> T r2(String str, Class<T> cls) {
        p.j(cls, "classType");
        this.f18365d = str;
        return T2(cls);
    }
}
