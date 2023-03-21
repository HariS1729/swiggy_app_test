package androidx.constraintlayout.compose;

import bp0.k;
import f2.v;
import i1.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ConstraintLayout.kt */
final class ConstraintSetForInlineDsl$applyTo$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<r> f7965a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f7966b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f7967c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintSetForInlineDsl$applyTo$1(List<? extends r> list, v vVar, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.f7965a = list;
        this.f7966b = vVar;
        this.f7967c = constraintSetForInlineDsl;
    }

    public final void invoke() {
        List<r> list = this.f7965a;
        v vVar = this.f7966b;
        ConstraintSetForInlineDsl constraintSetForInlineDsl = this.f7967c;
        int size = list.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object p11 = list.get(i11).p();
                c cVar = p11 instanceof c ? (c) p11 : null;
                if (cVar != null) {
                    ConstrainScope constrainScope = new ConstrainScope(cVar.c().c());
                    cVar.b().invoke(constrainScope);
                    constrainScope.a(vVar);
                }
                constraintSetForInlineDsl.f7964f.add(cVar);
                if (i12 <= size) {
                    i11 = i12;
                } else {
                    return;
                }
            }
        }
    }
}
