package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: ViewLayerContainer.android.kt */
public final class o1 extends j0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o1(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        p.j(canvas, "canvas");
    }

    /* access modifiers changed from: protected */
    public final void dispatchGetDisplayList() {
    }
}
