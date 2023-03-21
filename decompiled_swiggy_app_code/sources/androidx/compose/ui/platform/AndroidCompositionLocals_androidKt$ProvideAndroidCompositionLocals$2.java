package androidx.compose.ui.platform;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i0 f7055a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i0 f7056a;

        public a(i0 i0Var) {
            this.f7056a = i0Var;
        }

        public void dispose() {
            this.f7056a.e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(i0 i0Var) {
        super(1);
        this.f7055a = i0Var;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f7055a);
    }
}
