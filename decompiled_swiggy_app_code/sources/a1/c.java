package a1;

import a1.b;
import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: PlatformHapticFeedback.android.kt */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f880a;

    public c(View view) {
        p.j(view, "view");
        this.f880a = view;
    }

    public void a(int i11) {
        b.a aVar = b.f879a;
        if (b.b(i11, aVar.a())) {
            this.f880a.performHapticFeedback(0);
        } else if (b.b(i11, aVar.b())) {
            this.f880a.performHapticFeedback(9);
        }
    }
}
