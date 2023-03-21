package ph0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import in.swiggy.android.swiggylynx.R;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import rb0.e;

/* compiled from: CustomIntentBottomSheetFragment.kt */
public final class c extends e {
    public static final a Companion = new a((i) null);

    /* renamed from: l  reason: collision with root package name */
    private f f19818l;

    /* compiled from: CustomIntentBottomSheetFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a() {
            Bundle z02 = e.d0(true, false, true);
            p.i(z02, "getBaseBundle(true, false, true)");
            c cVar = new c();
            cVar.setArguments(z02);
            return cVar;
        }
    }

    public final void A0(f fVar) {
        p.j(fVar, "viewModel");
        if (this.f19818l == null) {
            this.f19818l = fVar;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.j(layoutInflater, "inflater");
        mg0.a aVar = (mg0.a) g.i(layoutInflater, R.layout.custom_intent_bottomsheet, viewGroup, false);
        f fVar = this.f19818l;
        if (fVar == null) {
            p.B("bottomSheetViewModel");
            fVar = null;
        }
        aVar.x0(fVar);
        return aVar.G();
    }

    public void onViewCreated(View view, Bundle bundle) {
        p.j(view, "view");
        super.onViewCreated(view, bundle);
        f fVar = this.f19818l;
        if (fVar == null) {
            p.B("bottomSheetViewModel");
            fVar = null;
        }
        fVar.init();
    }
}
