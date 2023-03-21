package l2;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* compiled from: VerticalChainReference */
public class h extends d {

    /* compiled from: VerticalChainReference */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15458a = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15458a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.h.a.<clinit>():void");
        }
    }

    public h(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    public void b() {
        Iterator<Object> it2 = this.f8156l0.iterator();
        while (it2.hasNext()) {
            this.f8154j0.c(it2.next()).t();
        }
        Iterator<Object> it3 = this.f8156l0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it3.hasNext()) {
            androidx.constraintlayout.core.state.a c11 = this.f8154j0.c(it3.next());
            if (aVar2 == null) {
                Object obj = this.S;
                if (obj != null) {
                    c11.k0(obj).I(this.f8133o).K(this.f8137u);
                } else {
                    Object obj2 = this.T;
                    if (obj2 != null) {
                        c11.j0(obj2).I(this.f8133o).K(this.f8137u);
                    } else {
                        c11.k0(State.f8106f);
                    }
                }
                aVar2 = c11;
            }
            if (aVar != null) {
                aVar.p(c11.getKey());
                c11.j0(aVar.getKey());
            }
            aVar = c11;
        }
        if (aVar != null) {
            Object obj3 = this.U;
            if (obj3 != null) {
                aVar.p(obj3).I(this.f8134p).K(this.v);
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    aVar.o(obj4).I(this.f8134p).K(this.v);
                } else {
                    aVar.o(State.f8106f);
                }
            }
        }
        if (aVar2 != null) {
            float f11 = this.f15448n0;
            if (f11 != 0.5f) {
                aVar2.o0(f11);
            }
            int i11 = a.f15458a[this.f15449o0.ordinal()];
            if (i11 == 1) {
                aVar2.b0(0);
            } else if (i11 == 2) {
                aVar2.b0(1);
            } else if (i11 == 3) {
                aVar2.b0(2);
            }
        }
    }
}
