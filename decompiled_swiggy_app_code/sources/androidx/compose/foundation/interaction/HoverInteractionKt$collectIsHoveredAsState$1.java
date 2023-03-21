package androidx.compose.foundation.interaction;

import bp0.k;
import e0.h0;
import fp0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import u.f;
import u.g;
import u.h;
import u.i;
import wp0.j0;

@d(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* compiled from: HoverInteraction.kt */
final class HoverInteractionKt$collectIsHoveredAsState$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3635b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f3636c;

    /* compiled from: HoverInteraction.kt */
    static final class a implements e<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<f> f3637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0<Boolean> f3638b;

        a(List<f> list, h0<Boolean> h0Var) {
            this.f3637a = list;
            this.f3638b = h0Var;
        }

        /* renamed from: a */
        public final Object emit(h hVar, c<? super k> cVar) {
            if (hVar instanceof f) {
                this.f3637a.add(hVar);
            } else if (hVar instanceof g) {
                this.f3637a.remove(((g) hVar).a());
            }
            this.f3638b.setValue(kotlin.coroutines.jvm.internal.a.a(!this.f3637a.isEmpty()));
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HoverInteractionKt$collectIsHoveredAsState$1(i iVar, h0<Boolean> h0Var, c<? super HoverInteractionKt$collectIsHoveredAsState$1> cVar) {
        super(2, cVar);
        this.f3635b = iVar;
        this.f3636c = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new HoverInteractionKt$collectIsHoveredAsState$1(this.f3635b, this.f3636c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((HoverInteractionKt$collectIsHoveredAsState$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3634a;
        if (i11 == 0) {
            bp0.g.b(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.d<h> b11 = this.f3635b.b();
            a aVar = new a(arrayList, this.f3636c);
            this.f3634a = 1;
            if (b11.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            bp0.g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
