package androidx.compose.ui.viewinterop;

import e0.r;
import e0.s;
import k1.t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.b;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$3 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f7749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f7750b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7751c;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f7752a;

        public a(b.a aVar) {
            this.f7752a = aVar;
        }

        public void dispose() {
            this.f7752a.unregister();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$3(b bVar, String str, t<ViewFactoryHolder<T>> tVar) {
        super(1);
        this.f7749a = bVar;
        this.f7750b = str;
        this.f7751c = tVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f7749a.d(this.f7750b, new AndroidView_androidKt$AndroidView$3$valueProvider$1(this.f7751c)));
    }
}
