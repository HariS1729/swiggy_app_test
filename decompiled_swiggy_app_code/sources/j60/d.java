package j60;

import android.os.Bundle;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.GridLayoutManager;
import bp0.k;
import in.swiggy.android.mvvm.viewmodels.SwiggyBaseViewModel;
import in.swiggy.android.mvvm.viewmodels.h0;
import in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData;
import lp0.a;

/* compiled from: StaffTemperatureBottomSheetViewModel.kt */
public final class d extends h0 {

    /* renamed from: q0  reason: collision with root package name */
    private final int f15309q0;

    /* renamed from: r0  reason: collision with root package name */
    private StaffTemperatureData f15310r0;

    /* renamed from: s0  reason: collision with root package name */
    private ObservableField<String> f15311s0;

    /* renamed from: t0  reason: collision with root package name */
    private ObservableField<String> f15312t0;

    /* renamed from: u0  reason: collision with root package name */
    private ObservableArrayList<SwiggyBaseViewModel> f15313u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f15314v0;

    /* renamed from: w0  reason: collision with root package name */
    private GridLayoutManager.c f15315w0;

    /* renamed from: x0  reason: collision with root package name */
    private final a<k> f15316x0;

    public void E1() {
    }

    public final a<k> J2() {
        return this.f15316x0;
    }

    public final int K2() {
        return this.f15309q0;
    }

    public final int L2() {
        return this.f15314v0;
    }

    public final ObservableArrayList<SwiggyBaseViewModel> M2() {
        return this.f15313u0;
    }

    public final GridLayoutManager.c N2() {
        return this.f15315w0;
    }

    public final ObservableField<String> O2() {
        return this.f15312t0;
    }

    public final ObservableField<String> P2() {
        return this.f15311s0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r0 = (r0 = r0.getRecordings()).getSequence();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init() {
        /*
            r12 = this;
            in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData r0 = r12.f15310r0
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = 0
            goto L_0x0019
        L_0x0007:
            in.swiggy.android.tejas.oldapi.models.restaurant.TemperatureRecording r0 = r0.getRecordings()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            java.util.ArrayList r0 = r0.getSequence()
            if (r0 != 0) goto L_0x0015
            goto L_0x0005
        L_0x0015:
            int r0 = r0.size()
        L_0x0019:
            r12.f15314v0 = r0
            androidx.databinding.ObservableField<java.lang.String> r0 = r12.f15311s0
            in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData r2 = r12.f15310r0
            r3 = 0
            if (r2 != 0) goto L_0x0024
            r2 = r3
            goto L_0x0028
        L_0x0024:
            java.lang.String r2 = r2.getTitle()
        L_0x0028:
            r0.j(r2)
            androidx.databinding.ObservableField<java.lang.String> r0 = r12.f15312t0
            in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData r2 = r12.f15310r0
            if (r2 != 0) goto L_0x0033
            r2 = r3
            goto L_0x0037
        L_0x0033:
            java.lang.String r2 = r2.getSubTitle()
        L_0x0037:
            r0.j(r2)
            in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData r0 = r12.f15310r0
            if (r0 != 0) goto L_0x003f
            goto L_0x004a
        L_0x003f:
            in.swiggy.android.tejas.oldapi.models.restaurant.TemperatureRecording r0 = r0.getRecordings()
            if (r0 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.util.ArrayList r3 = r0.getSequence()
        L_0x004a:
            r0 = 1
            if (r3 != 0) goto L_0x004e
            goto L_0x0086
        L_0x004e:
            java.util.Iterator r2 = r3.iterator()
            r4 = 0
        L_0x0053:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0086
            java.lang.Object r5 = r2.next()
            int r6 = r4 + 1
            if (r4 >= 0) goto L_0x0064
            kotlin.collections.k.t()
        L_0x0064:
            in.swiggy.android.tejas.oldapi.models.restaurant.RecordDataSequence r5 = (in.swiggy.android.tejas.oldapi.models.restaurant.RecordDataSequence) r5
            androidx.databinding.ObservableArrayList r7 = r12.M2()
            j60.c r8 = new j60.c
            java.lang.String r9 = r5.getName()
            int r10 = r12.L2()
            int r10 = r10 - r0
            if (r10 != r4) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            float r5 = r5.getRatio()
            r8.<init>(r9, r4, r5)
            r7.add(r8)
            r4 = r6
            goto L_0x0053
        L_0x0086:
            androidx.databinding.ObservableArrayList<in.swiggy.android.mvvm.viewmodels.SwiggyBaseViewModel> r2 = r12.f15313u0
            j60.a r4 = new j60.a
            r4.<init>(r1)
            r2.add(r4)
            in.swiggy.android.tejas.oldapi.models.restaurant.StaffTemperatureData r2 = r12.f15310r0
            if (r2 != 0) goto L_0x0096
            goto L_0x0114
        L_0x0096:
            in.swiggy.android.tejas.oldapi.models.restaurant.TemperatureRecording r2 = r2.getRecordings()
            if (r2 != 0) goto L_0x009e
            goto L_0x0114
        L_0x009e:
            java.util.ArrayList r2 = r2.getRecords()
            if (r2 != 0) goto L_0x00a6
            goto L_0x0114
        L_0x00a6:
            java.util.Iterator r2 = r2.iterator()
        L_0x00aa:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0114
            java.lang.Object r4 = r2.next()
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r3 != 0) goto L_0x00b9
            goto L_0x0107
        L_0x00b9:
            java.util.Iterator r5 = r3.iterator()
            r6 = 0
        L_0x00be:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0107
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 >= 0) goto L_0x00cf
            kotlin.collections.k.t()
        L_0x00cf:
            in.swiggy.android.tejas.oldapi.models.restaurant.RecordDataSequence r7 = (in.swiggy.android.tejas.oldapi.models.restaurant.RecordDataSequence) r7
            j60.b r9 = new j60.b
            java.lang.String r10 = r7.getName()
            java.lang.String r10 = r10.toLowerCase()
            java.lang.String r11 = "this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.p.i(r10, r11)
            java.lang.Object r10 = r4.get(r10)
            in.swiggy.android.tejas.oldapi.models.restaurant.RecordData r10 = (in.swiggy.android.tejas.oldapi.models.restaurant.RecordData) r10
            int r11 = r12.L2()
            int r11 = r11 - r0
            if (r11 != r6) goto L_0x00ef
            r6 = 1
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            float r7 = r7.getRatio()
            r9.<init>(r10, r6, r7)
            fb0.f r6 = r12.U1()
            r6.x0(r9)
            androidx.databinding.ObservableArrayList r6 = r12.M2()
            r6.add(r9)
            r6 = r8
            goto L_0x00be
        L_0x0107:
            androidx.databinding.ObservableArrayList r4 = r12.M2()
            j60.a r5 = new j60.a
            r5.<init>(r0)
            r4.add(r5)
            goto L_0x00aa
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j60.d.init():void");
    }

    public void w2(Bundle bundle) {
        this.f15310r0 = bundle == null ? null : (StaffTemperatureData) bundle.getParcelable("staff_recording");
    }
}
