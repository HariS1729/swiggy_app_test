package in.swiggy.android.swiggylynx.ui.fragment.eventhandler;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import zh0.a;

/* compiled from: LynxFragmentEventHandler.kt */
final class LynxFragmentEventHandler$listenToEvents$1 extends Lambda implements l<a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxFragmentEventHandler f19588a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxFragmentEventHandler$listenToEvents$1(LynxFragmentEventHandler lynxFragmentEventHandler) {
        super(1);
        this.f19588a = lynxFragmentEventHandler;
    }

    public final void a(a aVar) {
        p.j(aVar, "it");
        if (aVar instanceof a.b) {
            ((a.b) aVar).a().invoke(Integer.valueOf(this.f19588a.f19586a.e()));
        } else if (aVar instanceof a.c) {
            ((a.c) aVar).a().invoke(Boolean.valueOf(this.f19588a.f19586a.b()));
        } else if (aVar instanceof a.e) {
            a.e eVar = (a.e) aVar;
            this.f19588a.f19586a.d(eVar.b());
            eVar.a().invoke();
        } else if (aVar instanceof a.C0253a) {
            this.f19588a.f19586a.c();
            ((a.C0253a) aVar).a().invoke();
        } else if (aVar instanceof a.d) {
            this.f19588a.f19586a.a(((a.d) aVar).a());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((a) obj);
        return k.f22762a;
    }
}
