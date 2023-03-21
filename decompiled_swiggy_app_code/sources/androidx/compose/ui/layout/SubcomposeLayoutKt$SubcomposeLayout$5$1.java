package androidx.compose.ui.layout;

import e0.d1;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutKt$SubcomposeLayout$5$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<SubcomposeLayoutState> f6780a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d1 f6781a;

        public a(d1 d1Var) {
            this.f6781a = d1Var;
        }

        public void dispose() {
            ((SubcomposeLayoutState) this.f6781a.getValue()).d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$5$1(d1<SubcomposeLayoutState> d1Var) {
        super(1);
        this.f6780a = d1Var;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f6780a);
    }
}
