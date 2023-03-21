package q1;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.jvm.internal.p;

/* compiled from: StaticLayoutFactory.kt */
final class j implements n {
    public StaticLayout a(p pVar) {
        p.j(pVar, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(pVar.p(), pVar.o(), pVar.e(), pVar.m(), pVar.s());
        obtain.setTextDirection(pVar.q());
        obtain.setAlignment(pVar.a());
        obtain.setMaxLines(pVar.l());
        obtain.setEllipsize(pVar.c());
        obtain.setEllipsizedWidth(pVar.d());
        obtain.setLineSpacing(pVar.j(), pVar.k());
        obtain.setIncludePad(pVar.g());
        obtain.setBreakStrategy(pVar.b());
        obtain.setHyphenationFrequency(pVar.f());
        obtain.setIndents(pVar.i(), pVar.n());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            k kVar = k.f16328a;
            p.i(obtain, "this");
            kVar.a(obtain, pVar.h());
        }
        if (i11 >= 28) {
            l lVar = l.f16329a;
            p.i(obtain, "this");
            lVar.a(obtain, pVar.r());
        }
        StaticLayout build = obtain.build();
        p.i(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
