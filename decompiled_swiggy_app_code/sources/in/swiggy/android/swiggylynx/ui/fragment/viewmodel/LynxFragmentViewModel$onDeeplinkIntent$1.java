package in.swiggy.android.swiggylynx.ui.fragment.viewmodel;

import android.util.Log;
import androidx.lifecycle.y;
import bp0.k;
import in.swiggy.android.swiggylynx.ui.LynxData;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import os.j;
import zh0.a;

/* compiled from: LynxFragmentViewModel.kt */
final class LynxFragmentViewModel$onDeeplinkIntent$1 extends Lambda implements l<Boolean, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxFragmentViewModel f19610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LynxData f19611b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f19612c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f19613d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxFragmentViewModel$onDeeplinkIntent$1(LynxFragmentViewModel lynxFragmentViewModel, LynxData lynxData, String str, String str2) {
        super(1);
        this.f19610a = lynxFragmentViewModel;
        this.f19611b = lynxData;
        this.f19612c = str;
        this.f19613d = str2;
    }

    public final void a(boolean z11) {
        try {
            if (this.f19610a.o2(this.f19611b, z11, this.f19612c, this.f19613d)) {
                y s12 = this.f19610a.f19597m;
                final LynxFragmentViewModel lynxFragmentViewModel = this.f19610a;
                final LynxData lynxData = this.f19611b;
                s12.q(new j(new a.e(false, new lp0.a<k>() {
                    public final void invoke() {
                        lynxFragmentViewModel.h2(lynxData, true);
                        lynxFragmentViewModel.i2(false);
                        lynxFragmentViewModel.j2(false);
                    }
                })));
            }
        } catch (NullPointerException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            Log.e("NullPointerException", message);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return k.f22762a;
    }
}
