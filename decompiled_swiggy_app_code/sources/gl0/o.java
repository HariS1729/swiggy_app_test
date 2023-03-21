package gl0;

import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import dl0.e;
import in.swiggy.android.track.R;
import kotlin.jvm.internal.p;
import vs.a;
import vs.b;

/* compiled from: TrackThirdPartyDeliveryViewModel.kt */
public final class o extends a {
    private y<Float> n = new y<>(Float.valueOf(0.6433f));

    /* renamed from: o  reason: collision with root package name */
    private y<Integer> f20183o = new y<>(Integer.valueOf(R.drawable.third_party_delivery_background));

    /* renamed from: p  reason: collision with root package name */
    private y<Integer> f20184p = new y<>(Integer.valueOf(R.drawable.third_party_delivery_guy));
    private y<String> q = new y<>();

    /* renamed from: r  reason: collision with root package name */
    private y<String> f20185r = new y<>();

    /* renamed from: s  reason: collision with root package name */
    private y<String> f20186s = new y<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(b bVar) {
        super(bVar);
        p.j(bVar, "sharedState");
    }

    private final void X1(Messages messages) {
        if (messages != null) {
            y<String> S1 = S1();
            String description = messages.getDescription();
            p.i(description, "it.description");
            S1.q(o.A(description) ^ true ? messages.getDescription() : "");
        }
    }

    private final void Y1(Messages messages) {
        if (messages != null) {
            y<String> V1 = V1();
            String description = messages.getDescription();
            p.i(description, "it.description");
            V1.q(o.A(description) ^ true ? messages.getDescription() : "");
        }
    }

    private final void Z1(Messages messages) {
        if (messages != null) {
            y<String> W1 = W1();
            String description = messages.getDescription();
            p.i(description, "it.description");
            W1.q(o.A(description) ^ true ? messages.getDescription() : "");
        }
    }

    public final y<Integer> R1() {
        return this.f20183o;
    }

    public final y<String> S1() {
        return this.f20186s;
    }

    public final y<Float> T1() {
        return this.n;
    }

    public final y<Integer> U1() {
        return this.f20184p;
    }

    public final y<String> V1() {
        return this.f20185r;
    }

    public final y<String> W1() {
        return this.q;
    }

    public final void a2(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "trackOrderResponse");
        if (e.A(trackOrderV3)) {
            this.n.q(Float.valueOf(l().f(R.dimen.aspect_ratio_1_55, false)));
            this.f20184p.q(Integer.valueOf(R.drawable.third_party_delivery_guy));
            this.f20183o.q(Integer.valueOf(R.drawable.third_party_delivery_background));
            Messages c02 = e.c0(trackOrderV3);
            Messages b02 = e.b0(trackOrderV3);
            Messages X = e.X(trackOrderV3);
            Z1(c02);
            Y1(b02);
            X1(X);
        }
    }
}
