package l2;

import androidx.constraintlayout.core.state.State;
import m2.b;

/* compiled from: BarrierReference */
public class c extends androidx.constraintlayout.core.state.c {

    /* renamed from: n0  reason: collision with root package name */
    private State.Direction f15444n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f15445o0;

    /* renamed from: p0  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f15446p0;

    /* compiled from: BarrierReference */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15447a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Direction[] r0 = androidx.constraintlayout.core.state.State.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15447a = r0
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15447a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15447a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15447a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15447a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15447a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.c.a.<clinit>():void");
        }
    }

    public c(State state) {
        super(state, State.Helper.BARRIER);
    }

    public androidx.constraintlayout.core.state.a I(int i11) {
        this.f15445o0 = i11;
        return this;
    }

    public androidx.constraintlayout.core.state.a J(Object obj) {
        I(this.f8154j0.d(obj));
        return this;
    }

    public void b() {
        s0();
        int i11 = a.f15447a[this.f15444n0.ordinal()];
        int i12 = 3;
        if (i11 == 3 || i11 == 4) {
            i12 = 1;
        } else if (i11 == 5) {
            i12 = 2;
        } else if (i11 != 6) {
            i12 = 0;
        }
        this.f15446p0.G1(i12);
        this.f15446p0.H1(this.f15445o0);
    }

    public b s0() {
        if (this.f15446p0 == null) {
            this.f15446p0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f15446p0;
    }

    public void t0(State.Direction direction) {
        this.f15444n0 = direction;
    }
}
