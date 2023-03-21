package androidx.compose.ui.platform;

import android.content.res.Configuration;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements l<Configuration, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeView$configurationChangeObserver$1 f6989a = new AndroidComposeView$configurationChangeObserver$1();

    AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public final void a(Configuration configuration) {
        p.j(configuration, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Configuration) obj);
        return k.f22762a;
    }
}
