package fl0;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.DeliveryInstructions;
import in.swiggy.android.mvvm.aarch.CoreViewModel;
import in.swiggy.android.trackkit.models.TrackFTUEToolTipData;
import in.swiggy.android.trackkit.models.TrackOrderStatusPnData;
import ir.b;
import kotlin.jvm.internal.p;
import r7.d;

/* compiled from: TrackOrderActivityViewModel.kt */
public final class c extends CoreViewModel {

    /* renamed from: h  reason: collision with root package name */
    private final b f20131h;

    /* renamed from: i  reason: collision with root package name */
    private final y<Boolean> f20132i = new y<>();
    private final y<Boolean> j = new y<>();
    private final y<String> k = new y<>();

    /* renamed from: l  reason: collision with root package name */
    private final y<Boolean> f20133l = new y<>();

    /* renamed from: m  reason: collision with root package name */
    private final y<Boolean> f20134m = new y<>();
    private final y<Boolean> n = new y<>();

    /* renamed from: o  reason: collision with root package name */
    private final y<gu.b> f20135o = new y<>();

    /* renamed from: p  reason: collision with root package name */
    private final y<d> f20136p = new y<>();
    private final y<TrackFTUEToolTipData> q = new y<>(null);

    /* renamed from: r  reason: collision with root package name */
    private final y<DeliveryInstructions> f20137r = new y<>();

    /* renamed from: s  reason: collision with root package name */
    private final y<Boolean> f20138s = new y<>();

    public c(b bVar) {
        p.j(bVar, "swiggyEventHandler");
        this.f20131h = bVar;
    }

    public void A1() {
        this.f20138s.q(Boolean.FALSE);
    }

    public void D1() {
        this.f20138s.q(Boolean.TRUE);
    }

    public final y<Boolean> J1() {
        return this.f20134m;
    }

    public final y<Boolean> K1() {
        return this.n;
    }

    public final TrackFTUEToolTipData L1() {
        TrackFTUEToolTipData trackFTUEToolTipData;
        y<TrackFTUEToolTipData> yVar = this.q;
        if (yVar == null) {
            trackFTUEToolTipData = null;
        } else {
            trackFTUEToolTipData = yVar.f();
        }
        return trackFTUEToolTipData;
    }

    public final y<Boolean> M1() {
        return this.f20133l;
    }

    public final y<Boolean> N1() {
        return this.f20132i;
    }

    public final y<DeliveryInstructions> O1() {
        return this.f20137r;
    }

    public final LiveData<d> P1() {
        return this.f20136p;
    }

    public final y<String> Q1() {
        return this.k;
    }

    public final y<gu.b> R1() {
        return this.f20135o;
    }

    public final y<Boolean> S1() {
        return this.j;
    }

    public final LiveData<Boolean> T1() {
        return this.f20138s;
    }

    public final void U1(boolean z11, String str, String str2) {
        if (z11) {
            b bVar = this.f20131h;
            bVar.j(bVar.k("track_v3", "click-notification", str == null ? "-" : str, 9999, str2 == null ? "-" : str2));
        }
    }

    public final void V1(String str, TrackOrderStatusPnData trackOrderStatusPnData) {
        String str2;
        if (trackOrderStatusPnData != null && trackOrderStatusPnData.b()) {
            b bVar = this.f20131h;
            String str3 = str == null ? "-" : str;
            String a11 = trackOrderStatusPnData.a();
            if (a11 == null) {
                str2 = "-";
            } else {
                str2 = a11;
            }
            bVar.j(bVar.k("track_v3", "click-order-status-pn", str3, 9999, str2));
        }
    }

    public final void W1(TrackFTUEToolTipData trackFTUEToolTipData) {
        y<TrackFTUEToolTipData> yVar = this.q;
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar != null) {
                yVar.q(trackFTUEToolTipData);
            }
        } else if (yVar != null) {
            yVar.n(trackFTUEToolTipData);
        }
    }

    public final void X1(d dVar) {
        p.j(dVar, "lottieComposition");
        y<d> yVar = this.f20136p;
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar != null) {
                yVar.q(dVar);
            }
        } else if (yVar != null) {
            yVar.n(dVar);
        }
    }
}
