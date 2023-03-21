package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import k1.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$2$6 extends Lambda implements p<LayoutNode, LayoutDirection, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7747a;

    /* compiled from: AndroidView.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7748a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f7748a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$2$6(t<ViewFactoryHolder<T>> tVar) {
        super(2);
        this.f7747a = tVar;
    }

    public final void a(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$set");
        kotlin.jvm.internal.p.j(layoutDirection, "it");
        ViewFactoryHolder<T> a11 = this.f7747a.a();
        kotlin.jvm.internal.p.g(a11);
        ViewFactoryHolder viewFactoryHolder = a11;
        int i11 = a.f7748a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        viewFactoryHolder.setLayoutDirection(i12);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (LayoutDirection) obj2);
        return k.f22762a;
    }
}
