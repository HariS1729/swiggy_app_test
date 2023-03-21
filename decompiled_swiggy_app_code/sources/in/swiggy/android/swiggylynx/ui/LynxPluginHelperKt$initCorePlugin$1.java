package in.swiggy.android.swiggylynx.ui;

import bp0.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LynxPluginHelper.kt */
/* synthetic */ class LynxPluginHelperKt$initCorePlugin$1 extends FunctionReferenceImpl implements l<String, k> {
    LynxPluginHelperKt$initCorePlugin$1(Object obj) {
        super(1, obj, LynxActivity.class, "onSubmitFeedback", "onSubmitFeedback(Ljava/lang/String;)V", 0);
    }

    public final void h(String str) {
        p.j(str, "p0");
        ((LynxActivity) this.receiver).z2(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((String) obj);
        return k.f22762a;
    }
}
