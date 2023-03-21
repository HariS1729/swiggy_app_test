package androidx.compose.material;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import u.f;
import u.g;
import u.h;
import u.i;
import u.m;
import u.n;
import u.o;
import wp0.j0;

@d(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1", f = "FloatingActionButton.kt", l = {338}, m = "invokeSuspend")
/* compiled from: FloatingActionButton.kt */
final class DefaultFloatingActionButtonElevation$elevation$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4963a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f4964b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<h> f4965c;

    /* compiled from: Collect.kt */
    public static final class a implements e<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SnapshotStateList f4966a;

        public a(SnapshotStateList snapshotStateList) {
            this.f4966a = snapshotStateList;
        }

        public Object emit(h hVar, c<? super k> cVar) {
            h hVar2 = hVar;
            if (hVar2 instanceof f) {
                this.f4966a.add(hVar2);
            } else if (hVar2 instanceof g) {
                this.f4966a.remove((Object) ((g) hVar2).a());
            } else if (hVar2 instanceof u.d) {
                this.f4966a.add(hVar2);
            } else if (hVar2 instanceof u.e) {
                this.f4966a.remove((Object) ((u.e) hVar2).a());
            } else if (hVar2 instanceof n) {
                this.f4966a.add(hVar2);
            } else if (hVar2 instanceof o) {
                this.f4966a.remove((Object) ((o) hVar2).a());
            } else if (hVar2 instanceof m) {
                this.f4966a.remove((Object) ((m) hVar2).a());
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$1(i iVar, SnapshotStateList<h> snapshotStateList, c<? super DefaultFloatingActionButtonElevation$elevation$1> cVar) {
        super(2, cVar);
        this.f4964b = iVar;
        this.f4965c = snapshotStateList;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$1(this.f4964b, this.f4965c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4963a;
        if (i11 == 0) {
            bp0.g.b(obj);
            kotlinx.coroutines.flow.d<h> b11 = this.f4964b.b();
            a aVar = new a(this.f4965c);
            this.f4963a = 1;
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
