package in.swiggy.android.swiggylynx.ui.fragment.viewmodel;

import androidx.lifecycle.y;
import bp0.k;
import in.swiggy.android.swiggylynx.ui.LynxData;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import os.j;
import zh0.a;

/* compiled from: LynxFragmentViewModel.kt */
final class LynxFragmentViewModel$processIntent$1 extends Lambda implements l<Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxFragmentViewModel f19616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<String, String> f19617b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LynxData f19618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f19619d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f19620e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxFragmentViewModel$processIntent$1(LynxFragmentViewModel lynxFragmentViewModel, Map<String, String> map, LynxData lynxData, boolean z11, String str) {
        super(1);
        this.f19616a = lynxFragmentViewModel;
        this.f19617b = map;
        this.f19618c = lynxData;
        this.f19619d = z11;
        this.f19620e = str;
    }

    public final void a(int i11) {
        this.f19616a.x1().j(Integer.valueOf(i11 == 0 ? 8 : 0));
        this.f19616a.R1(this.f19617b);
        this.f19616a.D = this.f19618c.getPluginSet();
        if (this.f19617b.containsKey("x-web-checkout-flow")) {
            this.f19616a.E = String.valueOf(this.f19617b.get("x-web-checkout-flow"));
        }
        if (this.f19619d) {
            this.f19616a.f19598o.clear();
            y s12 = this.f19616a.f19597m;
            final LynxFragmentViewModel lynxFragmentViewModel = this.f19616a;
            final String str = this.f19620e;
            final Map<String, String> map = this.f19617b;
            s12.q(new j(new a.C0253a(new lp0.a<k>() {
                public final void invoke() {
                    lynxFragmentViewModel.g2(str, true, map, true, (String) null);
                    LynxFragmentViewModel lynxFragmentViewModel = lynxFragmentViewModel;
                    lynxFragmentViewModel.n2(lynxFragmentViewModel.d().getCustomerId());
                }
            })));
            return;
        }
        this.f19616a.g2(this.f19620e, true, this.f19617b, true, (String) null);
        LynxFragmentViewModel lynxFragmentViewModel2 = this.f19616a;
        lynxFragmentViewModel2.n2(lynxFragmentViewModel2.d().getCustomerId());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Number) obj).intValue());
        return k.f22762a;
    }
}
