package androidx.lifecycle;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import bp0.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import sp0.c;

/* compiled from: ViewModelLazy.kt */
public final class ViewModelLazy<VM extends j0> implements f<VM> {

    /* renamed from: a  reason: collision with root package name */
    private final c<VM> f10699a;

    /* renamed from: b  reason: collision with root package name */
    private final a<o0> f10700b;

    /* renamed from: c  reason: collision with root package name */
    private final a<l0.b> f10701c;

    /* renamed from: d  reason: collision with root package name */
    private final a<g3.a> f10702d;

    /* renamed from: e  reason: collision with root package name */
    private VM f10703e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(c<VM> cVar, a<? extends o0> aVar, a<? extends l0.b> aVar2) {
        this(cVar, aVar, aVar2, (a) null, 8, (i) null);
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        p.j(aVar2, "factoryProducer");
    }

    public ViewModelLazy(c<VM> cVar, a<? extends o0> aVar, a<? extends l0.b> aVar2, a<? extends g3.a> aVar3) {
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        p.j(aVar2, "factoryProducer");
        p.j(aVar3, "extrasProducer");
        this.f10699a = cVar;
        this.f10700b = aVar;
        this.f10701c = aVar2;
        this.f10702d = aVar3;
    }

    /* renamed from: a */
    public VM getValue() {
        VM vm2 = this.f10703e;
        if (vm2 != null) {
            return vm2;
        }
        VM a11 = new l0(this.f10700b.invoke(), this.f10701c.invoke(), this.f10702d.invoke()).a(kp0.a.a(this.f10699a));
        this.f10703e = a11;
        return a11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelLazy(c cVar, a aVar, a aVar2, a aVar3, int i11, i iVar) {
        this(cVar, aVar, aVar2, (i11 & 8) != 0 ? AnonymousClass1.f10704a : aVar3);
    }
}
