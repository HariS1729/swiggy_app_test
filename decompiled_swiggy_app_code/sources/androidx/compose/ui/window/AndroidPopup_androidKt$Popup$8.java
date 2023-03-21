package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import i1.j;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$8 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7813a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f7814b;

    AndroidPopup_androidKt$Popup$8(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.f7813a = popupLayout;
        this.f7814b = layoutDirection;
    }

    public /* synthetic */ int a(j jVar, List list, int i11) {
        return s.a(this, jVar, list, i11);
    }

    public /* synthetic */ int b(j jVar, List list, int i11) {
        return s.c(this, jVar, list, i11);
    }

    public /* synthetic */ int c(j jVar, List list, int i11) {
        return s.d(this, jVar, list, i11);
    }

    public final u d(w wVar, List<? extends r> list, long j) {
        p.j(wVar, "$this$Layout");
        p.j(list, "<anonymous parameter 0>");
        this.f7813a.setParentLayoutDirection(this.f7814b);
        return v.b(wVar, 0, 0, (Map) null, AndroidPopup_androidKt$Popup$8$measure$1.f7815a, 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
