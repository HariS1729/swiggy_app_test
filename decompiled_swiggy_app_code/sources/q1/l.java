package q1;

import android.text.StaticLayout;
import kotlin.jvm.internal.p;

/* compiled from: StaticLayoutFactory.kt */
final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f16329a = new l();

    private l() {
    }

    public final void a(StaticLayout.Builder builder, boolean z11) {
        p.j(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z11);
    }
}
