package in.swiggy.android.swiggylynx.ui.fragment.utils;

import bp0.k;
import in.swiggy.android.swiggylynx.ui.fragment.LynxFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LynxFragmentPluginHelper.kt */
/* synthetic */ class LynxFragmentPluginHelperKt$initCorePlugin$1 extends FunctionReferenceImpl implements l<String, k> {
    LynxFragmentPluginHelperKt$initCorePlugin$1(Object obj) {
        super(1, obj, LynxFragment.class, "onSubmitFeedback", "onSubmitFeedback(Ljava/lang/String;)V", 0);
    }

    public final void h(String str) {
        p.j(str, "p0");
        ((LynxFragment) this.receiver).F1(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((String) obj);
        return k.f22762a;
    }
}
