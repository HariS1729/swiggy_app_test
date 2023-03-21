package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import d2.b;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: AndroidViewHolder.android.kt */
public final class AndroidViewHolder$layoutNode$1$5 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7714a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7715b;

    AndroidViewHolder$layoutNode$1$5(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.f7714a = androidViewHolder;
        this.f7715b = layoutNode;
    }

    private final int f(int i11) {
        AndroidViewHolder androidViewHolder = this.f7714a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        p.g(layoutParams);
        androidViewHolder.measure(androidViewHolder.g(0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f7714a.getMeasuredHeight();
    }

    private final int g(int i11) {
        AndroidViewHolder androidViewHolder = this.f7714a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder2 = this.f7714a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
        p.g(layoutParams);
        androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.g(0, i11, layoutParams.height));
        return this.f7714a.getMeasuredWidth();
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return f(i11);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return f(i11);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return g(i11);
    }

    public u d(w wVar, List<? extends r> list, long j) {
        p.j(wVar, "$this$measure");
        p.j(list, "measurables");
        if (b.p(j) != 0) {
            this.f7714a.getChildAt(0).setMinimumWidth(b.p(j));
        }
        if (b.o(j) != 0) {
            this.f7714a.getChildAt(0).setMinimumHeight(b.o(j));
        }
        AndroidViewHolder androidViewHolder = this.f7714a;
        int p11 = b.p(j);
        int n = b.n(j);
        ViewGroup.LayoutParams layoutParams = this.f7714a.getLayoutParams();
        p.g(layoutParams);
        int f11 = androidViewHolder.g(p11, n, layoutParams.width);
        AndroidViewHolder androidViewHolder2 = this.f7714a;
        int o11 = b.o(j);
        int m11 = b.m(j);
        ViewGroup.LayoutParams layoutParams2 = this.f7714a.getLayoutParams();
        p.g(layoutParams2);
        androidViewHolder.measure(f11, androidViewHolder2.g(o11, m11, layoutParams2.height));
        return v.b(wVar, this.f7714a.getMeasuredWidth(), this.f7714a.getMeasuredHeight(), (Map) null, new AndroidViewHolder$layoutNode$1$5$measure$1(this.f7714a, this.f7715b), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return g(i11);
    }
}
