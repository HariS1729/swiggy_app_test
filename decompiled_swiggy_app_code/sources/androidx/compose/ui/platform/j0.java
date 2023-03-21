package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import in.juspay.hyper.constants.LogCategory;
import java.util.Objects;
import kotlin.jvm.internal.p;
import u0.c;
import u0.x;

/* compiled from: ViewLayerContainer.android.kt */
public class j0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7313a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(x xVar, View view, long j) {
        p.j(xVar, "canvas");
        p.j(view, "view");
        super.drawChild(c.c(xVar), view, j);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z11;
        p.j(canvas, "canvas");
        int childCount = super.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = getChildAt(i11);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).s()) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11) {
            this.f7313a = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f7313a = false;
            }
        }
    }

    public int getChildCount() {
        if (this.f7313a) {
            return super.getChildCount();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }
}
