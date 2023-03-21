package b0;

import a0.s;
import androidx.compose.ui.text.input.TextFieldValue;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.a0;
import v1.a;
import v1.d;
import v1.y;

/* compiled from: TextPreparedSelection.kt */
public final class l extends a<l> {

    /* renamed from: i  reason: collision with root package name */
    private final TextFieldValue f12563i;
    private final s j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(TextFieldValue textFieldValue, v1.s sVar, s sVar2, n nVar) {
        super(textFieldValue.e(), textFieldValue.g(), sVar2 != null ? sVar2.i() : null, sVar, nVar, (i) null);
        p.j(textFieldValue, "currentValue");
        p.j(sVar, "offsetMapping");
        p.j(nVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        this.f12563i = textFieldValue;
        this.j = sVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int c0(a0.s r6, int r7) {
        /*
            r5 = this;
            i1.m r0 = r6.c()
            if (r0 == 0) goto L_0x0015
            i1.m r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
            r4 = 2
            t0.h r2 = i1.l.a(r1, r0, r3, r4, r2)
        L_0x0013:
            if (r2 != 0) goto L_0x001b
        L_0x0015:
            t0.h$a r0 = t0.h.f16667e
            t0.h r2 = r0.a()
        L_0x001b:
            v1.s r0 = r5.p()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.f12563i
            long r3 = r1.g()
            int r1 = p1.a0.i(r3)
            int r0 = r0.b(r1)
            p1.y r1 = r6.i()
            t0.h r0 = r1.d(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = t0.l.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            v1.s r7 = r5.p()
            p1.y r6 = r6.i()
            long r0 = t0.g.a(r1, r0)
            int r6 = r6.w(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l.c0(a0.s, int):int");
    }

    public final List<d> a0(lp0.l<? super l, ? extends d> lVar) {
        p.j(lVar, "or");
        if (a0.h(w())) {
            d dVar = (d) lVar.invoke(this);
            if (dVar != null) {
                return j.d(dVar);
            }
            return null;
        }
        return k.m(new a("", 0), new y(a0.l(w()), a0.l(w())));
    }

    public final TextFieldValue b0() {
        return TextFieldValue.d(this.f12563i, e(), w(), (a0) null, 4, (Object) null);
    }

    public final l d0() {
        s sVar;
        if ((y().length() > 0) && (sVar = this.j) != null) {
            V(c0(sVar, 1));
        }
        return this;
    }

    public final l e0() {
        s sVar;
        if ((y().length() > 0) && (sVar = this.j) != null) {
            V(c0(sVar, -1));
        }
        return this;
    }
}
