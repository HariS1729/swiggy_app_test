package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavAction */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f10876a;

    /* renamed from: b  reason: collision with root package name */
    private t f10877b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f10878c;

    public c(int i11) {
        this(i11, (t) null);
    }

    public Bundle a() {
        return this.f10878c;
    }

    public int b() {
        return this.f10876a;
    }

    public t c() {
        return this.f10877b;
    }

    public void d(Bundle bundle) {
        this.f10878c = bundle;
    }

    public void e(t tVar) {
        this.f10877b = tVar;
    }

    public c(int i11, t tVar) {
        this(i11, tVar, (Bundle) null);
    }

    public c(int i11, t tVar, Bundle bundle) {
        this.f10876a = i11;
        this.f10877b = tVar;
        this.f10878c = bundle;
    }
}
