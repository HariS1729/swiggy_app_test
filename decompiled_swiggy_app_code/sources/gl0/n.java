package gl0;

import android.animation.Animator;
import androidx.databinding.ObservableInt;
import androidx.databinding.k;
import androidx.lifecycle.y;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.MessagesMetaDataType;
import in.swiggy.android.tejas.oldapi.models.intdef.TrackOrderState;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import sp0.j;

/* compiled from: TrackRainAnimViewModel.kt */
public final class n extends vs.a {
    public static final a C = new a((i) null);
    static final /* synthetic */ j<Object>[] D;
    public static final int E = 8;
    private gu.d A;
    private final b B;
    private final ObservableInt n;

    /* renamed from: o  reason: collision with root package name */
    private String f20170o = "https://res.cloudinary.com/swiggy/raw/upload/v1630054046/lottie/rain.json";

    /* renamed from: p  reason: collision with root package name */
    private final String f20171p = "TrackRainAnimViewModel";
    private final y<Integer> q = new y<>(8);

    /* renamed from: r  reason: collision with root package name */
    private final y<Boolean> f20172r;

    /* renamed from: s  reason: collision with root package name */
    private final y<Boolean> f20173s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private final y<Integer> f20174u;
    private int v;

    /* renamed from: w  reason: collision with root package name */
    private ObservableInt f20175w;

    /* renamed from: x  reason: collision with root package name */
    public TrackOrderV3 f20176x;

    /* renamed from: y  reason: collision with root package name */
    private final op0.e f20177y;

    /* renamed from: z  reason: collision with root package name */
    private final op0.e f20178z;

    /* compiled from: TrackRainAnimViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: TrackRainAnimViewModel.kt */
    public static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f20179a;

        b(n nVar) {
            this.f20179a = nVar;
        }

        public void a(k kVar, int i11) {
            p.j(kVar, "sender");
            n nVar = this.f20179a;
            ObservableInt observableInt = kVar instanceof ObservableInt ? (ObservableInt) kVar : null;
            nVar.i2(observableInt == null ? 0 : observableInt.g());
        }
    }

    /* compiled from: TrackRainAnimViewModel.kt */
    public static final class c extends gu.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f20180a;

        c(n nVar) {
            this.f20180a = nVar;
        }

        public void onAnimationRepeat(Animator animator) {
            p.j(animator, "animation");
            super.onAnimationRepeat(animator);
            Integer f11 = this.f20180a.T1().f();
            if (f11 != null) {
                n nVar = this.f20180a;
                nVar.T1().q(Integer.valueOf(f11.intValue() + 1));
                Integer f12 = nVar.T1().f();
                int U1 = nVar.U1();
                if (f12 != null && f12.intValue() == U1) {
                    nVar.d2().q(8);
                    nVar.S1().q(Boolean.TRUE);
                    nVar.V1().q(Boolean.FALSE);
                }
            }
        }
    }

    /* compiled from: Delegates.kt */
    public static final class d extends op0.c<String> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f20181b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Object obj, n nVar) {
            super(obj);
            this.f20181b = nVar;
        }

        /* access modifiers changed from: protected */
        public void b(j<?> jVar, String str, String str2) {
            p.j(jVar, "property");
            if (!p.e(str, str2)) {
                this.f20181b.f2();
            }
        }
    }

    /* compiled from: Delegates.kt */
    public static final class e extends op0.c<Integer> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f20182b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Object obj, n nVar) {
            super(obj);
            this.f20182b = nVar;
        }

        /* access modifiers changed from: protected */
        public void b(j<?> jVar, Integer num, Integer num2) {
            p.j(jVar, "property");
            int intValue = num2.intValue();
            if (num.intValue() != intValue) {
                this.f20182b.W1().j(intValue);
            }
        }
    }

    static {
        Class<n> cls = n.class;
        D = new j[]{s.f(new MutablePropertyReference1Impl(cls, "rainLottieAnim", "getRainLottieAnim()Ljava/lang/String;", 0)), s.f(new MutablePropertyReference1Impl(cls, "setRainAnimBottomPadding", "getSetRainAnimBottomPadding()I", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(vs.b bVar, ObservableInt observableInt) {
        super(bVar);
        p.j(bVar, "sharedState");
        p.j(observableInt, "bottomSheetHeight");
        this.n = observableInt;
        Boolean bool = Boolean.FALSE;
        this.f20172r = new y<>(bool);
        this.f20173s = new y<>(bool);
        this.t = true;
        this.f20174u = new y<>(0);
        String string = getSharedPreferences().getString("track_rain_lottie_anim_repeat_count", TrackOrderState.ORDER_CANCELLED);
        this.v = js.c.u(string == null ? "" : string, 5);
        this.f20175w = new ObservableInt(observableInt);
        op0.a aVar = op0.a.f27371a;
        this.f20177y = new d("", this);
        this.f20178z = new e(-1, this);
        this.A = new c(this);
        this.B = new b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = r0.getOrderId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f2() {
        /*
            r7 = this;
            ir.b r6 = r7.k0()
            com.swiggy.pos.service.grpc.v1.TrackOrderV3 r0 = r7.a2()
            com.swiggy.pos.service.grpc.v1.OrderDetails r0 = r0.getOrderDetails()
            java.lang.String r1 = "-"
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            r3 = r1
            goto L_0x001a
        L_0x0012:
            java.lang.String r0 = r0.getOrderId()
            if (r0 != 0) goto L_0x0019
            goto L_0x0010
        L_0x0019:
            r3 = r0
        L_0x001a:
            r4 = 9999(0x270f, float:1.4012E-41)
            com.swiggy.pos.service.grpc.v1.TrackOrderV3 r0 = r7.a2()
            com.swiggy.pos.service.grpc.v1.OrderDetails r0 = r0.getOrderDetails()
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r5 = r1
            goto L_0x0030
        L_0x0028:
            java.lang.String r0 = r0.getOrderId()
            if (r0 != 0) goto L_0x002f
            goto L_0x0026
        L_0x002f:
            r5 = r0
        L_0x0030:
            java.lang.String r1 = "track_v3"
            java.lang.String r2 = "rain-animation"
            r0 = r6
            gr.f r0 = r0.k(r1, r2, r3, r4, r5)
            r6.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl0.n.f2():void");
    }

    public final y<Boolean> S1() {
        return this.f20172r;
    }

    public final y<Integer> T1() {
        return this.f20174u;
    }

    public final int U1() {
        return this.v;
    }

    public final y<Boolean> V1() {
        return this.f20173s;
    }

    public final ObservableInt W1() {
        return this.f20175w;
    }

    public final gu.d X1() {
        return this.A;
    }

    public final String Y1() {
        return this.f20170o;
    }

    public final String Z1() {
        return this.f20171p;
    }

    public final TrackOrderV3 a2() {
        TrackOrderV3 trackOrderV3 = this.f20176x;
        if (trackOrderV3 != null) {
            return trackOrderV3;
        }
        p.B("trackOrderResponse");
        return null;
    }

    public final void c2() {
        this.n.h(this.B);
    }

    public final y<Integer> d2() {
        return this.q;
    }

    public final void e2(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "trackOrderResponse");
        boolean z11 = false;
        if (this.t) {
            Messages w11 = dl0.e.w(trackOrderV3);
            if (w11 != null) {
                d2().q(0);
                V1().q(Boolean.TRUE);
                h2(false);
                j2(trackOrderV3);
                g2(String.valueOf(w11.getMetaMap().get(MessagesMetaDataType.RAIN_ANIMATION_ENABLE)));
                return;
            }
            return;
        }
        if (dl0.e.w(trackOrderV3) != null) {
            z11 = true;
        }
        if (!z11) {
            this.q.q(8);
            this.f20172r.q(Boolean.TRUE);
            this.f20173s.q(Boolean.FALSE);
            this.t = true;
        }
    }

    public final void g2(String str) {
        p.j(str, "<set-?>");
        this.f20177y.c(this, D[0], str);
    }

    public final void h2(boolean z11) {
        this.t = z11;
    }

    public final void i2(int i11) {
        this.f20178z.c(this, D[1], Integer.valueOf(i11));
    }

    public final void j2(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<set-?>");
        this.f20176x = trackOrderV3;
    }

    public void w1() {
        super.w1();
        this.n.j0(this.B);
    }
}
