package gl0;

import android.animation.Animator;
import android.os.Looper;
import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.OrderDetails;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import dl0.e;
import gu.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: TrackOrderSpeedyAnimationViewModel.kt */
public final class l extends vs.a {
    public static final a t = new a((i) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f20164u = 8;
    private final y<Integer> n = new y<>(8);

    /* renamed from: o  reason: collision with root package name */
    private final y<Boolean> f20165o = new y<>(Boolean.FALSE);

    /* renamed from: p  reason: collision with root package name */
    private final y<String> f20166p = new y<>();
    private final y<String> q = new y<>();

    /* renamed from: r  reason: collision with root package name */
    private final y<String> f20167r = new y<>();

    /* renamed from: s  reason: collision with root package name */
    private final d f20168s = new b(this);

    /* compiled from: TrackOrderSpeedyAnimationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: TrackOrderSpeedyAnimationViewModel.kt */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f20169a;

        b(l lVar) {
            this.f20169a = lVar;
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "animation");
            super.onAnimationEnd(animator);
            this.f20169a.W1().q(Boolean.TRUE);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(vs.b bVar) {
        super(bVar);
        p.j(bVar, "sharedState");
    }

    private final void Y1(TrackOrderV3 trackOrderV3) {
        OrderDetails L;
        String orderId;
        ir.b k02 = k0();
        String str = "-";
        if (!(trackOrderV3 == null || (L = e.L(trackOrderV3)) == null || (orderId = L.getOrderId()) == null)) {
            str = orderId;
        }
        k02.i(k02.c("track_v3", "impression-view-full-screen-speedy-lottie", str, 9999));
    }

    public final y<Integer> R1() {
        return this.n;
    }

    public final y<String> S1() {
        return this.f20166p;
    }

    public final d T1() {
        return this.f20168s;
    }

    public final y<String> U1() {
        return this.f20167r;
    }

    public final y<String> V1() {
        return this.q;
    }

    public final y<Boolean> W1() {
        return this.f20165o;
    }

    public final void X1(TrackOrderV3 trackOrderV3) {
        Messages s11;
        y<String> yVar = this.q;
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar != null) {
                yVar.q("speed_delivery_lottie");
            }
        } else if (yVar != null) {
            yVar.n("speed_delivery_lottie");
        }
        y<String> yVar2 = this.f20167r;
        String s12 = p.s(this.q.f(), "/speedy_delivery.json");
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar2 != null) {
                yVar2.q(s12);
            }
        } else if (yVar2 != null) {
            yVar2.n(s12);
        }
        y<String> yVar3 = this.f20166p;
        String str = null;
        if (!(trackOrderV3 == null || (s11 = e.s(trackOrderV3)) == null)) {
            str = s11.getDescription();
        }
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar3 != null) {
                yVar3.q(str);
            }
        } else if (yVar3 != null) {
            yVar3.n(str);
        }
        Y1(trackOrderV3);
    }
}
