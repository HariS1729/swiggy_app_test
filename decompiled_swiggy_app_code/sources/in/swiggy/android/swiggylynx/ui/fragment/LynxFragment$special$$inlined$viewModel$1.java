package in.swiggy.android.swiggylynx.ui.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import qb0.j;
import sp0.c;

/* compiled from: ViewModelUtils.kt */
public final class LynxFragment$special$$inlined$viewModel$1 extends Lambda implements a<LynxFragmentViewModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f19577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f19578b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LynxFragment f19579c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxFragment$special$$inlined$viewModel$1(Fragment fragment, c cVar, LynxFragment lynxFragment) {
        super(0);
        this.f19577a = fragment;
        this.f19578b = cVar;
        this.f19579c = lynxFragment;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.lifecycle.j0, in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel] */
    /* renamed from: a */
    public final LynxFragmentViewModel invoke() {
        return new l0((p0) this.f19577a, j.c(this.f19579c.j1())).a(kp0.a.a(this.f19578b));
    }
}
