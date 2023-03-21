package androidx.compose.foundation.layout;

import android.view.View;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: WindowInsets.android.kt */
final class WindowInsetsHolder$Companion$current$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WindowInsetsHolder f3878a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f3879b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WindowInsetsHolder f3880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3881b;

        public a(WindowInsetsHolder windowInsetsHolder, View view) {
            this.f3880a = windowInsetsHolder;
            this.f3881b = view;
        }

        public void dispose() {
            this.f3880a.b(this.f3881b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInsetsHolder$Companion$current$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.f3878a = windowInsetsHolder;
        this.f3879b = view;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f3878a.f(this.f3879b);
        return new a(this.f3878a, this.f3879b);
    }
}
