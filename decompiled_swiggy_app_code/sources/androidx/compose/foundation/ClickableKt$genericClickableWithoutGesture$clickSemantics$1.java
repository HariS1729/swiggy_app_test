package androidx.compose.foundation;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.g;
import n1.o;
import n1.q;

/* compiled from: Clickable.kt */
final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f2931a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f2932b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a<k> f2933c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f2934d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f2935e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a<k> f2936f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$genericClickableWithoutGesture$clickSemantics$1(g gVar, String str, a<k> aVar, String str2, boolean z11, a<k> aVar2) {
        super(1);
        this.f2931a = gVar;
        this.f2932b = str;
        this.f2933c = aVar;
        this.f2934d = str2;
        this.f2935e = z11;
        this.f2936f = aVar2;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        g gVar = this.f2931a;
        if (gVar != null) {
            o.K(qVar, gVar.m());
        }
        String str = this.f2932b;
        final a<k> aVar = this.f2936f;
        o.n(qVar, str, new a<Boolean>() {
            /* renamed from: a */
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
        final a<k> aVar2 = this.f2933c;
        if (aVar2 != null) {
            o.p(qVar, this.f2934d, new a<Boolean>() {
                /* renamed from: a */
                public final Boolean invoke() {
                    aVar2.invoke();
                    return Boolean.TRUE;
                }
            });
        }
        if (!this.f2935e) {
            o.f(qVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
