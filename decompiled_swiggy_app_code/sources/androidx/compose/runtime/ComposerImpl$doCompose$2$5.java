package androidx.compose.runtime;

import bp0.k;
import e0.b;
import e0.g;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.x;
import lp0.a;
import lp0.p;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: Composer.kt */
final class ComposerImpl$doCompose$2$5 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5925a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5926b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f5927c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$doCompose$2$5(p<? super g, ? super Integer, k> pVar, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.f5925a = pVar;
        this.f5926b = composerImpl;
        this.f5927c = obj;
    }

    public final void invoke() {
        Object obj;
        if (this.f5925a != null) {
            this.f5926b.B1(OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT, ComposerKt.G());
            b.b(this.f5926b, this.f5925a);
            this.f5926b.u0();
        } else if (!this.f5926b.f5894r || (obj = this.f5927c) == null || kotlin.jvm.internal.p.e(obj, g.f14172a.a())) {
            this.f5926b.w1();
        } else {
            this.f5926b.B1(OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT, ComposerKt.G());
            ComposerImpl composerImpl = this.f5926b;
            Object obj2 = this.f5927c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            b.b(composerImpl, (p) x.e(obj2, 2));
            this.f5926b.u0();
        }
    }
}
