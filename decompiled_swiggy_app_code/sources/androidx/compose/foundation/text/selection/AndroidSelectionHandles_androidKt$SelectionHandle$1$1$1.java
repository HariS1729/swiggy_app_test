package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import b0.h;
import b0.i;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.q;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4682a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f4683b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z11, long j) {
        super(1);
        this.f4682a = z11;
        this.f4683b = j;
    }

    public final void a(q qVar) {
        Handle handle;
        p.j(qVar, "$this$semantics");
        SemanticsPropertyKey<h> d11 = i.d();
        if (this.f4682a) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        qVar.a(d11, new h(handle, this.f4683b, (kotlin.jvm.internal.i) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
