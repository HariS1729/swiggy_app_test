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
import wp0.j0;

@d(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
/* compiled from: FocusInteraction.kt */
final class FocusInteractionKt$collectIsFocusedAsState$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3629a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3630b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f3631c;

    /* compiled from: FocusInteraction.kt */
    static final class a implements e<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<u.d> f3632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0<Boolean> f3633b;

        a(List<u.d> list, h0<Boolean> h0Var) {
            this.f3632a = list;
            this.f3633b = h0Var;
        }

        /* renamed from: a */
        public final Object emit(h hVar, c<? super k> cVar) {
            if (hVar instanceof u.d) {
                this.f3632a.add(hVar);
            } else if (hVar instanceof u.e) {
                this.f3632a.remove(((u.e) hVar).a());
            }
            this.f3633b.setValue(kotlin.coroutines.jvm.internal.a.a(!this.f3632a.isEmpty()));
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusInteractionKt$collectIsFocusedAsState$1(i iVar, h0<Boolean> h0Var, c<? super FocusInteractionKt$collectIsFocusedAsState$1> cVar) {
        super(2, cVar);
        this.f3630b = iVar;
        this.f3631c = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FocusInteractionKt$collectIsFocusedAsState$1(this.f3630b, this.f3631c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3629a;
        if (i11 == 0) {
            g.b(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.d<h> b11 = this.f3630b.b();
            a aVar = new a(arrayList, this.f3631c);
            this.f3629a = 1;
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
