package androidx.compose.ui.window;

import bp0.k;
import i1.e0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt$SimpleStack$1$measure$3 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<e0> f7831a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$SimpleStack$1$measure$3(List<? extends e0> list) {
        super(1);
        this.f7831a = list;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        int l11 = k.l(this.f7831a);
        if (l11 >= 0) {
            int i11 = 0;
            while (true) {
                e0.a.n(aVar, this.f7831a.get(i11), 0, 0, 0.0f, 4, (Object) null);
                if (i11 != l11) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
