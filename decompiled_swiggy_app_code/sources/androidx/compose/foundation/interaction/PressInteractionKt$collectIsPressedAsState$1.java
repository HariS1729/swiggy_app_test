package androidx.compose.foundation.interaction;

import bp0.g;
import bp0.k;
import e0.h0;
import fp0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import u.h;
import u.i;
import u.m;
import u.n;
import u.o;
import wp0.j0;

@d(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
/* compiled from: PressInteraction.kt */
final class PressInteractionKt$collectIsPressedAsState$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3639a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3640b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f3641c;

    /* compiled from: PressInteraction.kt */
    static final class a implements e<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<n> f3642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0<Boolean> f3643b;

        a(List<n> list, h0<Boolean> h0Var) {
            this.f3642a = list;
            this.f3643b = h0Var;
        }

        /* renamed from: a */
        public final Object emit(h hVar, c<? super k> cVar) {
            if (hVar instanceof n) {
                this.f3642a.add(hVar);
            } else if (hVar instanceof o) {
                this.f3642a.remove(((o) hVar).a());
            } else if (hVar instanceof m) {
                this.f3642a.remove(((m) hVar).a());
            }
            this.f3643b.setValue(kotlin.coroutines.jvm.internal.a.a(!this.f3642a.isEmpty()));
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PressInteractionKt$collectIsPressedAsState$1(i iVar, h0<Boolean> h0Var, c<? super PressInteractionKt$collectIsPressedAsState$1> cVar) {
        super(2, cVar);
        this.f3640b = iVar;
        this.f3641c = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new PressInteractionKt$collectIsPressedAsState$1(this.f3640b, this.f3641c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((PressInteractionKt$collectIsPressedAsState$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3639a;
        if (i11 == 0) {
            g.b(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.d<h> b11 = this.f3640b.b();
            a aVar = new a(arrayList, this.f3641c);
            this.f3639a = 1;
            if (b11.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
