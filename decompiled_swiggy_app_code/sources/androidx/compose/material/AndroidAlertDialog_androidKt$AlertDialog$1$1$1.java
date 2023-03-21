package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$1$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4851a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4852b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4853c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$1$1$1(p<? super g, ? super Integer, k> pVar, int i11, p<? super g, ? super Integer, k> pVar2) {
        super(2);
        this.f4851a = pVar;
        this.f4852b = i11;
        this.f4853c = pVar2;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            p<g, Integer, k> pVar = this.f4851a;
            gVar.E(-1046483318);
            if (pVar != null) {
                pVar.invoke(gVar, Integer.valueOf((this.f4852b >> 9) & 14));
            }
            gVar.P();
            this.f4853c.invoke(gVar, Integer.valueOf((this.f4852b >> 3) & 14));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
