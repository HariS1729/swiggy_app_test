package fl0;

import android.os.Looper;
import androidx.lifecycle.y;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.track.cards.carddata.TrackHelpCenterCardData;
import in.swiggy.android.track.R;
import kotlin.jvm.internal.p;
import vs.a;

/* compiled from: TrackHelpCenterEntryCardViewModel.kt */
public final class b extends a {
    private final TrackHelpCenterCardData n;

    /* renamed from: o  reason: collision with root package name */
    private final lp0.a<k> f20127o;

    /* renamed from: p  reason: collision with root package name */
    private final y<String> f20128p = new y<>("");
    private final y<String> q = new y<>("");

    /* renamed from: r  reason: collision with root package name */
    private final y<String> f20129r = new y<>("");

    /* renamed from: s  reason: collision with root package name */
    private final int f20130s = l().n(R.dimen.dimen_32dp);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(vs.b bVar, TrackHelpCenterCardData trackHelpCenterCardData, lp0.a<k> aVar) {
        super(bVar);
        p.j(bVar, "sharedState");
        p.j(trackHelpCenterCardData, "trackHelpCenterCardData");
        p.j(aVar, "openHelpCenter");
        this.n = trackHelpCenterCardData;
        this.f20127o = aVar;
    }

    private final void V1() {
        y<String> yVar = this.f20128p;
        String title = this.n.getTitle();
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar != null) {
                yVar.q(title);
            }
        } else if (yVar != null) {
            yVar.n(title);
        }
        y<String> yVar2 = this.q;
        String subtitle = this.n.getSubtitle();
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar2 != null) {
                yVar2.q(subtitle);
            }
        } else if (yVar2 != null) {
            yVar2.n(subtitle);
        }
        y<String> yVar3 = this.f20129r;
        ps.b g11 = g();
        int i11 = this.f20130s;
        String u11 = g11.u(i11, i11, this.n.getIcon());
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            if (yVar3 != null) {
                yVar3.q(u11);
            }
        } else if (yVar3 != null) {
            yVar3.n(u11);
        }
    }

    public final void R1() {
        this.f20127o.invoke();
    }

    public final y<String> S1() {
        return this.f20129r;
    }

    public final y<String> T1() {
        return this.q;
    }

    public final y<String> U1() {
        return this.f20128p;
    }

    public void init() {
        V1();
    }
}
