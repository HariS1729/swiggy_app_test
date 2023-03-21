package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import k1.t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$3$valueProvider$1 extends Lambda implements a<SparseArray<Parcelable>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7753a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$3$valueProvider$1(t<ViewFactoryHolder<T>> tVar) {
        super(0);
        this.f7753a = tVar;
    }

    /* renamed from: a */
    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ViewFactoryHolder<T> a11 = this.f7753a.a();
        p.g(a11);
        View typedView$ui_release = a11.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
