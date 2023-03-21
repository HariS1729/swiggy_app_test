package in.swiggy.android.reactnative.dinersone;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.n0;
import bp0.k;
import in.swiggy.android.reactnative.dinersone.DinersOneUtils;
import kotlin.jvm.internal.Lambda;
import lp0.q;

/* compiled from: DinersOneUtils.kt */
final class DinersOneUtils$applySystemWindows$1 extends Lambda implements q<View, n0, DinersOneUtils.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f18493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f18494b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f18495c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f18496d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f18497e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DinersOneUtils$applySystemWindows$1(ViewGroup viewGroup, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(3);
        this.f18493a = viewGroup;
        this.f18494b = z11;
        this.f18495c = z12;
        this.f18496d = z13;
        this.f18497e = z14;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d3, code lost:
        if (r3 != (r7 == null ? 0 : r7.rightMargin)) goto L_0x00d5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6, androidx.core.view.n0 r7, in.swiggy.android.reactnative.dinersone.DinersOneUtils.a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "$noName_0"
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.String r6 = "insets"
            kotlin.jvm.internal.p.j(r7, r6)
            java.lang.String r6 = "padding"
            kotlin.jvm.internal.p.j(r8, r6)
            android.view.ViewGroup r6 = r5.f18493a
            androidx.core.view.n0 r6 = androidx.core.view.a0.M(r6)
            boolean r8 = r5.f18494b
            r0 = 30
            r1 = 0
            if (r8 == 0) goto L_0x002d
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 >= r0) goto L_0x0028
            if (r6 != 0) goto L_0x0023
            goto L_0x002d
        L_0x0023:
            int r8 = r6.j()
            goto L_0x002e
        L_0x0028:
            int r8 = r7.p()
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            boolean r2 = r5.f18495c
            if (r2 == 0) goto L_0x0049
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 >= r0) goto L_0x003e
            if (r6 != 0) goto L_0x0039
            goto L_0x0049
        L_0x0039:
            int r2 = r6.l()
            goto L_0x004a
        L_0x003e:
            int r2 = androidx.core.view.n0.m.h()
            androidx.core.graphics.b r2 = r7.f(r2)
            int r2 = r2.f9236b
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            boolean r3 = r5.f18496d
            if (r3 == 0) goto L_0x005f
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r0) goto L_0x005a
            if (r6 != 0) goto L_0x0055
            goto L_0x005f
        L_0x0055:
            int r3 = r6.k()
            goto L_0x0060
        L_0x005a:
            int r3 = r7.q()
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            boolean r4 = r5.f18497e
            if (r4 == 0) goto L_0x007b
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r0) goto L_0x0070
            if (r6 != 0) goto L_0x006b
            goto L_0x007b
        L_0x006b:
            int r6 = r6.i()
            goto L_0x007c
        L_0x0070:
            int r6 = androidx.core.view.n0.m.h()
            androidx.core.graphics.b r6 = r7.f(r6)
            int r6 = r6.f9238d
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            android.view.ViewGroup r7 = r5.f18493a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            r4 = 0
            if (r0 == 0) goto L_0x008a
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x008b
        L_0x008a:
            r7 = r4
        L_0x008b:
            if (r7 != 0) goto L_0x008f
            r7 = 0
            goto L_0x0091
        L_0x008f:
            int r7 = r7.bottomMargin
        L_0x0091:
            if (r6 != r7) goto L_0x00d5
            android.view.ViewGroup r7 = r5.f18493a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00a0
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x00a1
        L_0x00a0:
            r7 = r4
        L_0x00a1:
            if (r7 != 0) goto L_0x00a5
            r7 = 0
            goto L_0x00a7
        L_0x00a5:
            int r7 = r7.topMargin
        L_0x00a7:
            if (r2 != r7) goto L_0x00d5
            android.view.ViewGroup r7 = r5.f18493a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00b6
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x00b7
        L_0x00b6:
            r7 = r4
        L_0x00b7:
            if (r7 != 0) goto L_0x00bb
            r7 = 0
            goto L_0x00bd
        L_0x00bb:
            int r7 = r7.leftMargin
        L_0x00bd:
            if (r8 != r7) goto L_0x00d5
            android.view.ViewGroup r7 = r5.f18493a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x00cd
        L_0x00cc:
            r7 = r4
        L_0x00cd:
            if (r7 != 0) goto L_0x00d1
            r7 = 0
            goto L_0x00d3
        L_0x00d1:
            int r7 = r7.rightMargin
        L_0x00d3:
            if (r3 == r7) goto L_0x00d6
        L_0x00d5:
            r1 = 1
        L_0x00d6:
            if (r1 == 0) goto L_0x00f0
            android.view.ViewGroup r7 = r5.f18493a
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00e5
            r4 = r7
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x00e5:
            if (r4 != 0) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            android.view.ViewGroup r7 = r5.f18493a
            r4.setMargins(r8, r2, r3, r6)
            r7.setLayoutParams(r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.reactnative.dinersone.DinersOneUtils$applySystemWindows$1.a(android.view.View, androidx.core.view.n0, in.swiggy.android.reactnative.dinersone.DinersOneUtils$a):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((View) obj, (n0) obj2, (DinersOneUtils.a) obj3);
        return k.f22762a;
    }
}
