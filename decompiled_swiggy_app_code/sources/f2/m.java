package f2;

import androidx.constraintlayout.compose.LayoutInfoFlags;
import e0.h0;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintLayout.kt */
public abstract class m implements s {

    /* renamed from: a  reason: collision with root package name */
    private int f14584a;

    /* renamed from: b  reason: collision with root package name */
    private int f14585b;

    /* renamed from: c  reason: collision with root package name */
    private h0<Long> f14586c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInfoFlags f14587d;

    /* renamed from: e  reason: collision with root package name */
    private String f14588e;

    /* renamed from: f  reason: collision with root package name */
    private long f14589f;

    /* renamed from: g  reason: collision with root package name */
    private String f14590g;

    public void b(String str) {
        p.j(str, "information");
        this.f14589f = System.nanoTime();
        this.f14588e = str;
    }

    public int f() {
        return this.f14585b;
    }

    public LayoutInfoFlags g() {
        return this.f14587d;
    }

    public int h() {
        return this.f14584a;
    }

    public final String i() {
        return this.f14590g;
    }

    public final void j(h0<Long> h0Var) {
        p.j(h0Var, "needsUpdate");
        this.f14586c = h0Var;
    }
}
