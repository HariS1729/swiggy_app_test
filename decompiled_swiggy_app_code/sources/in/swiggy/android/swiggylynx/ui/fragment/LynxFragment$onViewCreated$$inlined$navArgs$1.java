package in.swiggy.android.swiggylynx.ui.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FragmentNavArgsLazy.kt */
public final class LynxFragment$onViewCreated$$inlined$navArgs$1 extends Lambda implements a<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f19576a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxFragment$onViewCreated$$inlined$navArgs$1(Fragment fragment) {
        super(0);
        this.f19576a = fragment;
    }

    /* renamed from: a */
    public final Bundle invoke() {
        Bundle arguments = this.f19576a.getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this.f19576a + " has null arguments");
    }
}
