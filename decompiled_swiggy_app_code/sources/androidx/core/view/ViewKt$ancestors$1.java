package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: View.kt */
/* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements l<ViewParent, ViewParent> {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewKt$ancestors$1 f9423a = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    /* renamed from: h */
    public final ViewParent invoke(ViewParent viewParent) {
        p.j(viewParent, "p0");
        return viewParent.getParent();
    }
}
