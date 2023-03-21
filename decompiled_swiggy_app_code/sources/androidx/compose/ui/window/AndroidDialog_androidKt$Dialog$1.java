package androidx.compose.ui.window;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$Dialog$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f7765a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7766a;

        public a(c cVar) {
            this.f7766a = cVar;
        }

        public void dispose() {
            this.f7766a.dismiss();
            this.f7766a.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$1(c cVar) {
        super(1);
        this.f7765a = cVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f7765a.show();
        return new a(this.f7765a);
    }
}
