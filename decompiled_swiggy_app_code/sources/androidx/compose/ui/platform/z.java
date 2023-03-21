package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import in.juspay.hyper.constants.LogCategory;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.p;

/* compiled from: AndroidViewsHandler.android.kt */
public final class z extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<AndroidViewHolder, LayoutNode> f7398a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<LayoutNode, AndroidViewHolder> f7399b = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        setClipChildren(false);
    }

    public final void a(AndroidViewHolder androidViewHolder, Canvas canvas) {
        p.j(androidViewHolder, "view");
        p.j(canvas, "canvas");
        androidViewHolder.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.f7398a;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f7399b;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        p.j(view, "child");
        p.j(view2, "target");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Set<AndroidViewHolder> keySet = this.f7398a.keySet();
        p.i(keySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : keySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            if (View.MeasureSpec.getMode(i12) != 1073741824) {
                z11 = false;
            }
            if (z11) {
                setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
                Set<AndroidViewHolder> keySet = this.f7398a.keySet();
                p.i(keySet, "holderToLayoutNode.keys");
                for (AndroidViewHolder k : keySet) {
                    k.k();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutNode layoutNode = this.f7398a.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.k1(layoutNode, false, 1, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
