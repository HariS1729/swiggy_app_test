package in.swiggy.android.reactnative.dinersone;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import androidx.core.view.n0;
import bp0.k;
import cg0.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import kotlin.jvm.internal.p;
import lp0.q;
import ue0.j;

/* compiled from: DinersOneUtils.kt */
public final class DinersOneUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final DinersOneUtils f18488a = new DinersOneUtils();

    /* compiled from: DinersOneUtils.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f18489a;

        /* renamed from: b  reason: collision with root package name */
        private final int f18490b;

        /* renamed from: c  reason: collision with root package name */
        private final int f18491c;

        /* renamed from: d  reason: collision with root package name */
        private final int f18492d;

        public a(int i11, int i12, int i13, int i14) {
            this.f18489a = i11;
            this.f18490b = i12;
            this.f18491c = i13;
            this.f18492d = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18489a == aVar.f18489a && this.f18490b == aVar.f18490b && this.f18491c == aVar.f18491c && this.f18492d == aVar.f18492d;
        }

        public int hashCode() {
            return (((((this.f18489a * 31) + this.f18490b) * 31) + this.f18491c) * 31) + this.f18492d;
        }

        public String toString() {
            return "InitialPadding(left=" + this.f18489a + ", top=" + this.f18490b + ", right=" + this.f18491c + ", bottom=" + this.f18492d + ')';
        }
    }

    /* compiled from: DinersOneUtils.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            p.j(view, "v");
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        public void onViewDetachedFromWindow(View view) {
            p.j(view, "v");
        }
    }

    private DinersOneUtils() {
    }

    /* access modifiers changed from: private */
    public static final n0 d(q qVar, a aVar, View view, n0 n0Var) {
        p.j(qVar, "$f");
        p.j(aVar, "$initialPadding");
        p.j(view, "v");
        p.j(n0Var, "insets");
        qVar.invoke(view, n0Var, aVar);
        return n0Var;
    }

    public static final WritableMap e(n nVar) {
        WritableMap createMap = Arguments.createMap();
        if (nVar != null) {
            createMap.putDouble("latitude", nVar.getLatitude());
            createMap.putDouble("longitude", nVar.getLongitude());
            Address p02 = nVar.p0();
            String str = null;
            if (!TextUtils.isEmpty(p02 == null ? null : p02.getAnnotationTagString())) {
                Address p03 = nVar.p0();
                if (p03 != null) {
                    str = p03.getAnnotationTagString();
                }
            } else if (!TextUtils.isEmpty(nVar.H())) {
                str = nVar.H();
            } else {
                GooglePlace S0 = nVar.S0();
                if (S0 == null || (str = S0.getFormattedAddress()) == null) {
                    str = "";
                }
            }
            createMap.putString("areaName", str);
            createMap.putString("city", nVar.getCity());
            createMap.putString("subLocalityName", nVar.u1());
        }
        p.i(createMap, "locationMap");
        return createMap;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final in.swiggy.android.reactnative.dinersone.DinersOneUtils.a f(android.view.ViewGroup r8) {
        /*
            r7 = this;
            in.swiggy.android.reactnative.dinersone.DinersOneUtils$a r0 = new in.swiggy.android.reactnative.dinersone.DinersOneUtils$a
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            r2 = 0
            if (r1 != 0) goto L_0x0014
            r1 = 0
            goto L_0x0016
        L_0x0014:
            int r1 = r1.leftMargin
        L_0x0016:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0021
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r4 != 0) goto L_0x0026
            r4 = 0
            goto L_0x0028
        L_0x0026:
            int r4 = r4.topMargin
        L_0x0028:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0033
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r5 != 0) goto L_0x0038
            r5 = 0
            goto L_0x003a
        L_0x0038:
            int r5 = r5.rightMargin
        L_0x003a:
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            boolean r6 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0045
            r3 = r8
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x0045:
            if (r3 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            int r2 = r3.bottomMargin
        L_0x004a:
            r0.<init>(r1, r4, r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.reactnative.dinersone.DinersOneUtils.f(android.view.ViewGroup):in.swiggy.android.reactnative.dinersone.DinersOneUtils$a");
    }

    public final void b(ViewGroup viewGroup, boolean z11, boolean z12, boolean z13, boolean z14) {
        p.j(viewGroup, "view");
        c(viewGroup, new DinersOneUtils$applySystemWindows$1(viewGroup, z11, z12, z13, z14));
    }

    public final void c(ViewGroup viewGroup, q<? super View, ? super n0, ? super a, k> qVar) {
        p.j(viewGroup, "<this>");
        p.j(qVar, "f");
        a0.K0(viewGroup, new j(qVar, f(viewGroup)));
        g(viewGroup);
    }

    public final void g(View view) {
        p.j(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
