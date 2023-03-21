package gl0;

import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.Messages;
import in.swiggy.android.track.R;
import in.swiggy.android.trackkit.constants.TrackGeekStatCapabilityEnum;
import kotlin.jvm.internal.p;
import vs.a;

/* compiled from: TrackOrderAnomalyViewModel.kt */
public final class b extends a {
    private final Messages n;

    /* renamed from: o  reason: collision with root package name */
    private final y<Integer> f20142o = new y<>(8);

    /* renamed from: p  reason: collision with root package name */
    private final y<String> f20143p = new y<>();
    private final y<String> q = new y<>();

    /* renamed from: r  reason: collision with root package name */
    private final int f20144r = l().n(R.dimen.dimen_36dp);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(vs.b bVar, Messages messages) {
        super(bVar);
        p.j(bVar, "sharedState");
        this.n = messages;
    }

    public final y<String> R1() {
        return this.f20143p;
    }

    public final y<Integer> S1() {
        return this.f20142o;
    }

    public final y<String> T1() {
        return this.q;
    }

    public void init() {
        super.init();
        Messages messages = this.n;
        boolean z11 = false;
        if (messages != null) {
            String icon = messages.getIcon();
            if (!(icon == null || icon.length() == 0)) {
                y<String> R1 = R1();
                ps.b g11 = g();
                int i11 = this.f20144r;
                R1.q(g11.u(i11, i11, messages.getIcon()));
                S1().q(0);
            }
            String description = messages.getDescription();
            if (description == null || description.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                T1().q(messages.getDescription());
            }
        }
        if (ml0.a.e(getSharedPreferences(), TrackGeekStatCapabilityEnum.EXAMPLE_HUD_MESSAGE)) {
            this.q.q(ml0.a.b(getSharedPreferences()));
            y<String> yVar = this.f20143p;
            ps.b g12 = g();
            int i12 = this.f20144r;
            yVar.q(g12.u(i12, i12, ml0.a.a(getSharedPreferences())));
            this.f20142o.q(0);
        }
    }
}
