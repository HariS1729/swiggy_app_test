package gl0;

import android.os.Looper;
import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import dl0.e;
import in.swiggy.android.track.R;
import kotlin.jvm.internal.p;
import vs.a;
import vs.b;

/* compiled from: TrackOrderNonContactOverLayViewModel.kt */
public final class k extends a {
    private final y<Integer> n = new y<>(8);

    /* renamed from: o  reason: collision with root package name */
    private final y<String> f20161o = new y<>();

    /* renamed from: p  reason: collision with root package name */
    private final y<String> f20162p = new y<>();
    private final y<String> q = new y<>();

    /* renamed from: r  reason: collision with root package name */
    private final int f20163r = l().n(R.dimen.dimen_60dp);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(b bVar) {
        super(bVar);
        p.j(bVar, "sharedState");
    }

    public final y<String> R1() {
        return this.q;
    }

    public final y<String> S1() {
        return this.f20161o;
    }

    public final y<String> T1() {
        return this.f20162p;
    }

    public final y<Integer> U1() {
        return this.n;
    }

    public final void V1(TrackOrderV3 trackOrderV3) {
        if (trackOrderV3 != null) {
            y<String> S1 = S1();
            Messages O = e.O(trackOrderV3);
            String str = null;
            String title = O == null ? null : O.getTitle();
            if (title == null) {
                title = l().getString(R.string.track_order_non_contact_overlay_text);
            }
            if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
                if (S1 != null) {
                    S1.q(title);
                }
            } else if (S1 != null) {
                S1.n(title);
            }
            y<String> T1 = T1();
            Messages O2 = e.O(trackOrderV3);
            String description = O2 == null ? null : O2.getDescription();
            if (description == null) {
                description = l().getString(R.string.track_order_overlay_delivered_time);
            }
            if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
                if (T1 != null) {
                    T1.q(description);
                }
            } else if (T1 != null) {
                T1.n(description);
            }
            Messages O3 = e.O(trackOrderV3);
            String icon = O3 == null ? null : O3.getIcon();
            if (!(icon == null || o.A(icon))) {
                y<String> R1 = R1();
                ps.b g11 = g();
                int i11 = this.f20163r;
                Messages O4 = e.O(trackOrderV3);
                if (O4 != null) {
                    str = O4.getIcon();
                }
                String u11 = g11.u(i11, i11, str);
                if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
                    if (R1 != null) {
                        R1.q(u11);
                    }
                } else if (R1 != null) {
                    R1.n(u11);
                }
            }
        }
    }
}
