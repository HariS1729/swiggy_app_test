package y1;

import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import p1.e0;
import p1.f0;

/* compiled from: TtsAnnotationExtensions.android.kt */
public final class e {
    public static final TtsSpan a(e0 e0Var) {
        p.j(e0Var, "<this>");
        if (e0Var instanceof f0) {
            return b((f0) e0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(f0 f0Var) {
        p.j(f0Var, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(f0Var.a()).build();
        p.i(build, "builder.build()");
        return build;
    }
}
