package androidx.compose.ui.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.s1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import bp0.k;
import d2.e;
import d2.h;
import e0.g;
import in.juspay.hyper.constants.LogCategory;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: AndroidDialog.android.kt */
final class c extends Dialog implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private lp0.a<k> f7864a;

    /* renamed from: b  reason: collision with root package name */
    private b f7865b;

    /* renamed from: c  reason: collision with root package name */
    private final View f7866c;

    /* renamed from: d  reason: collision with root package name */
    private final DialogLayout f7867d;

    /* renamed from: e  reason: collision with root package name */
    private final float f7868e;

    /* compiled from: AndroidDialog.android.kt */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            p.j(view, "view");
            p.j(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7869a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f7869a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(lp0.a<k> aVar, b bVar, View view, LayoutDirection layoutDirection, e eVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme));
        p.j(aVar, "onDismissRequest");
        p.j(bVar, "properties");
        p.j(view, "composeView");
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        p.j(uuid, "dialogId");
        this.f7864a = aVar;
        this.f7865b = bVar;
        this.f7866c = view;
        float n = h.n((float) 30);
        this.f7868e = n;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            Context context = getContext();
            p.i(context, LogCategory.CONTEXT);
            DialogLayout dialogLayout = new DialogLayout(context, window);
            int i11 = R.id.compose_view_saveable_id_tag;
            dialogLayout.setTag(i11, "Dialog:" + uuid);
            dialogLayout.setClipChildren(false);
            dialogLayout.setElevation(eVar.v0(n));
            dialogLayout.setOutlineProvider(new a());
            this.f7867d = dialogLayout;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                a(viewGroup);
            }
            setContentView(dialogLayout);
            q0.b(dialogLayout, q0.a(view));
            r0.b(dialogLayout, r0.a(view));
            ViewTreeSavedStateRegistryOwner.b(dialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
            f(this.f7864a, this.f7865b, layoutDirection);
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    private static final void a(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    a(viewGroup2);
                }
            }
        }
    }

    private final void d(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.f7867d;
        int i11 = b.f7869a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i12);
    }

    private final void e(SecureFlagPolicy secureFlagPolicy) {
        boolean a11 = i.a(secureFlagPolicy, AndroidPopup_androidKt.f(this.f7866c));
        Window window = getWindow();
        p.g(window);
        window.setFlags(a11 ? 8192 : -8193, 8192);
    }

    public final void b() {
        this.f7867d.e();
    }

    public final void c(androidx.compose.runtime.a aVar, lp0.p<? super g, ? super Integer, k> pVar) {
        p.j(aVar, "parentComposition");
        p.j(pVar, "children");
        this.f7867d.l(aVar, pVar);
    }

    public void cancel() {
    }

    public final void f(lp0.a<k> aVar, b bVar, LayoutDirection layoutDirection) {
        p.j(aVar, "onDismissRequest");
        p.j(bVar, "properties");
        p.j(layoutDirection, "layoutDirection");
        this.f7864a = aVar;
        this.f7865b = bVar;
        e(bVar.c());
        d(layoutDirection);
        this.f7867d.m(bVar.d());
    }

    public void onBackPressed() {
        if (this.f7865b.a()) {
            this.f7864a.invoke();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        p.j(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f7865b.b()) {
            this.f7864a.invoke();
        }
        return onTouchEvent;
    }
}
