package l2;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* compiled from: HorizontalChainReference */
public class g extends d {

    /* compiled from: HorizontalChainReference */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15457a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15457a = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15457a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15457a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.g.a.<clinit>():void");
        }
    }

    public g(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    public void b() {
        Iterator<Object> it2 = this.f8156l0.iterator();
        while (it2.hasNext()) {
            this.f8154j0.c(it2.next()).s();
        }
        Iterator<Object> it3 = this.f8156l0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it3.hasNext()) {
            androidx.constraintlayout.core.state.a c11 = this.f8154j0.c(it3.next());
            if (aVar2 == null) {
                Object obj = this.O;
                if (obj != null) {
                    c11.h0(obj).I(this.f8132m).K(this.f8136s);
                } else {
                    Object obj2 = this.P;
                    if (obj2 != null) {
                        c11.g0(obj2).I(this.f8132m).K(this.f8136s);
                    } else {
                        Object obj3 = this.K;
                        if (obj3 != null) {
                            c11.h0(obj3).I(this.k).K(this.q);
                        } else {
                            Object obj4 = this.L;
                            if (obj4 != null) {
                                c11.g0(obj4).I(this.k).K(this.q);
                            } else {
                                c11.h0(State.f8106f);
                            }
                        }
                    }
                }
                aVar2 = c11;
            }
            if (aVar != null) {
                aVar.y(c11.getKey());
                c11.g0(aVar.getKey());
            }
            aVar = c11;
        }
        if (aVar != null) {
            Object obj5 = this.Q;
            if (obj5 != null) {
                aVar.y(obj5).I(this.n).K(this.t);
            } else {
                Object obj6 = this.R;
                if (obj6 != null) {
                    aVar.x(obj6).I(this.n).K(this.t);
                } else {
                    Object obj7 = this.M;
                    if (obj7 != null) {
                        aVar.y(obj7).I(this.f8131l).K(this.f8135r);
                    } else {
                        Object obj8 = this.N;
                        if (obj8 != null) {
                            aVar.x(obj8).I(this.f8131l).K(this.f8135r);
                        } else {
                            aVar.x(State.f8106f);
                        }
                    }
                }
            }
        }
        if (aVar2 != null) {
            float f11 = this.f15448n0;
            if (f11 != 0.5f) {
                aVar2.E(f11);
            }
            int i11 = a.f15457a[this.f15449o0.ordinal()];
            if (i11 == 1) {
                aVar2.Y(0);
            } else if (i11 == 2) {
                aVar2.Y(1);
            } else if (i11 == 3) {
                aVar2.Y(2);
            }
        }
    }
}
