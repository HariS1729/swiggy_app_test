package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import e0.d1;
import kotlin.jvm.internal.p;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final d1<Object> f7659a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7660b;

    public a(d1<? extends Object> d1Var) {
        p.j(d1Var, "resolveResult");
        this.f7659a = d1Var;
        this.f7660b = d1Var.getValue();
    }

    public final Typeface a() {
        return (Typeface) this.f7660b;
    }

    public final boolean b() {
        return this.f7659a.getValue() != this.f7660b;
    }
}
