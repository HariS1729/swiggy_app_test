package d0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.ui.R;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: RippleContainer.android.kt */
public final class d extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final int f13804a = 5;

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f13805b;

    /* renamed from: c  reason: collision with root package name */
    private final List<g> f13806c;

    /* renamed from: d  reason: collision with root package name */
    private final e f13807d;

    /* renamed from: e  reason: collision with root package name */
    private int f13808e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        ArrayList arrayList = new ArrayList();
        this.f13805b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13806c = arrayList2;
        this.f13807d = new e();
        setClipChildren(false);
        g gVar = new g(context);
        addView(gVar);
        arrayList.add(gVar);
        arrayList2.add(gVar);
        this.f13808e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        p.j(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.n();
        g b11 = this.f13807d.b(androidRippleIndicationInstance);
        if (b11 != null) {
            b11.d();
            this.f13807d.c(androidRippleIndicationInstance);
            this.f13806c.add(b11);
        }
    }

    public final g b(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        p.j(androidRippleIndicationInstance, "<this>");
        g b11 = this.f13807d.b(androidRippleIndicationInstance);
        if (b11 != null) {
            return b11;
        }
        g gVar = (g) p.G(this.f13806c);
        if (gVar == null) {
            if (this.f13808e > k.l(this.f13805b)) {
                Context context = getContext();
                p.i(context, LogCategory.CONTEXT);
                gVar = new g(context);
                addView(gVar);
                this.f13805b.add(gVar);
            } else {
                gVar = this.f13805b.get(this.f13808e);
                AndroidRippleIndicationInstance a11 = this.f13807d.a(gVar);
                if (a11 != null) {
                    a11.n();
                    this.f13807d.c(a11);
                    gVar.d();
                }
            }
            int i11 = this.f13808e;
            if (i11 < this.f13804a - 1) {
                this.f13808e = i11 + 1;
            } else {
                this.f13808e = 0;
            }
        }
        this.f13807d.d(androidRippleIndicationInstance, gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }
}
