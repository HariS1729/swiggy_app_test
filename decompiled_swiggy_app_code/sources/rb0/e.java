package rb0;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.h;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import rb0.c;

@Instrumented
/* compiled from: CustomBottomSheetDialogFragment */
public abstract class e extends h implements TraceFieldInterface {

    /* renamed from: h  reason: collision with root package name */
    private static final String f16521h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f16522i;
    public static final String j;
    public static final String k;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f16523a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f16524b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f16525c;

    /* renamed from: d  reason: collision with root package name */
    private c f16526d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public fb0.e f16527e;

    /* renamed from: f  reason: collision with root package name */
    private c.d f16528f;

    /* renamed from: g  reason: collision with root package name */
    public Trace f16529g;

    /* compiled from: CustomBottomSheetDialogFragment */
    class a extends c {
        a(Context context, int i11, boolean z11, boolean z12, boolean z13) {
            super(context, i11, z11, z12, z13);
        }

        public void onBackPressed() {
            if (e.this.f16525c) {
                super.onBackPressed();
                if (j() != null) {
                    try {
                        j().a();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            if (e.this.f16527e != null) {
                e.this.f16527e.a();
            }
        }
    }

    static {
        String simpleName = e.class.getSimpleName();
        f16521h = simpleName;
        f16522i = simpleName + ".swipeable";
        j = simpleName + ".darkBg";
        k = simpleName + ".cancellable";
    }

    protected static Bundle d0(boolean z11, boolean z12, boolean z13) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f16522i, z11);
        bundle.putBoolean(j, z12);
        bundle.putBoolean(k, z13);
        return bundle;
    }

    public void _nr_setTrace(Trace trace) {
        try {
            this.f16529g = trace;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void f0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f16523a = arguments.getBoolean(f16522i);
            this.f16524b = arguments.getBoolean(j);
            this.f16525c = arguments.getBoolean(k);
        }
    }

    public void g0(boolean z11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.l(z11);
        }
    }

    public void h0(int i11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.m(i11);
        }
    }

    public void i0(int i11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.n(i11);
        }
    }

    public void j0(c.d dVar) {
        this.f16528f = dVar;
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.o(dVar);
        }
    }

    public void m0(boolean z11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.p(z11);
        }
    }

    public void n0(c.e eVar) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.q(eVar);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        f0();
        a aVar = new a(super.getContext(), getTheme(), this.f16523a, this.f16524b, this.f16525c);
        this.f16526d = aVar;
        c.d dVar = this.f16528f;
        if (dVar != null) {
            aVar.o(dVar);
        }
        if (this.f16526d.getWindow() != null) {
            this.f16526d.getWindow().addFlags(67108864);
        }
        return this.f16526d;
    }

    public void p0(boolean z11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.r(z11);
        }
    }

    public void u0(boolean z11) {
        c cVar = this.f16526d;
        if (cVar != null) {
            cVar.s(z11);
        }
    }
}
