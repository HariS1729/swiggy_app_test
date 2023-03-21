package androidx.compose.ui.viewinterop;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements l<AndroidViewHolder, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7722a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f7722a = androidViewHolder;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void b(AndroidViewHolder androidViewHolder) {
        p.j(androidViewHolder, "it");
        this.f7722a.getHandler().post(new a(this.f7722a.f7701m));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AndroidViewHolder) obj);
        return k.f22762a;
    }
}
