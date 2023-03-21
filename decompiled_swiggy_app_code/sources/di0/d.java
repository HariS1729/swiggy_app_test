package di0;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.xiaomi.mipush.sdk.Constants;
import in.swiggy.android.commons.extension.StringExtensionsKt;
import java.util.List;
import java.util.Objects;
import js.c;
import kotlin.jvm.internal.p;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: KeyboardStateHandler.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f18260a;

    /* renamed from: b  reason: collision with root package name */
    private View f18261b;

    /* renamed from: c  reason: collision with root package name */
    private int f18262c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout.LayoutParams f18263d;

    /* renamed from: e  reason: collision with root package name */
    private int f18264e = OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f18265f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18266g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f18267h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f18268i;
    private a j;

    /* compiled from: KeyboardStateHandler.kt */
    public interface a {

        /* renamed from: di0.d$a$a  reason: collision with other inner class name */
        /* compiled from: KeyboardStateHandler.kt */
        public static final class C0219a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0219a f18269a = new C0219a();

            private C0219a() {
            }
        }

        /* compiled from: KeyboardStateHandler.kt */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f18270a = new b();

            private b() {
            }
        }
    }

    public d(SharedPreferences sharedPreferences) {
        p.j(sharedPreferences, "sharedPreferences");
        this.f18260a = sharedPreferences;
    }

    private final int b() {
        Rect rect = new Rect();
        View view = this.f18261b;
        if (view == null) {
            p.B("mChildOfContent");
            view = null;
        }
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    /* access modifiers changed from: private */
    public static final void d(d dVar) {
        p.j(dVar, "this$0");
        dVar.f();
    }

    private final void f() {
        int b11 = b();
        if (b11 != this.f18262c) {
            View view = this.f18261b;
            View view2 = null;
            if (view == null) {
                p.B("mChildOfContent");
                view = null;
            }
            int height = view.getRootView().getHeight();
            int i11 = height - b11;
            if (i11 > height / 4) {
                a aVar = this.j;
                if (aVar == null) {
                    p.B("source");
                    aVar = null;
                }
                if (aVar instanceof a.b) {
                    height += this.f18264e;
                }
                FrameLayout.LayoutParams layoutParams = this.f18263d;
                if (layoutParams != null) {
                    layoutParams.height = height - i11;
                }
            } else {
                a aVar2 = this.j;
                if (aVar2 == null) {
                    p.B("source");
                    aVar2 = null;
                }
                if (aVar2 instanceof a.C0219a) {
                    height -= this.f18264e;
                }
                FrameLayout.LayoutParams layoutParams2 = this.f18263d;
                if (layoutParams2 != null) {
                    layoutParams2.height = height;
                }
            }
            View view3 = this.f18261b;
            if (view3 == null) {
                p.B("mChildOfContent");
            } else {
                view2 = view3;
            }
            view2.requestLayout();
            this.f18262c = b11;
        }
    }

    public final void c() {
        this.f18265f = new c(this);
        View view = this.f18261b;
        View view2 = null;
        if (view == null) {
            p.B("mChildOfContent");
            view = null;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f18265f);
        View view3 = this.f18261b;
        if (view3 == null) {
            p.B("mChildOfContent");
        } else {
            view2 = view3;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this.f18263d = (FrameLayout.LayoutParams) layoutParams;
        this.f18266g = true;
    }

    public final void e(Activity activity, a aVar) {
        View view;
        p.j(aVar, "source");
        this.f18268i = activity;
        this.j = aVar;
        List<String> list = null;
        if (activity == null) {
            view = null;
        } else {
            view = activity.findViewById(16908290);
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        View childAt = ((FrameLayout) view).getChildAt(0);
        p.i(childAt, "content.getChildAt(0)");
        this.f18261b = childAt;
        String string = this.f18260a.getString("android_handle_keyboard_state_for_urls", "");
        if (string != null) {
            list = StringsKt__StringsKt.I0(string, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, (Object) null);
        }
        this.f18267h = list;
    }

    public final void g() {
        if (this.f18266g && this.f18265f != null) {
            View view = this.f18261b;
            if (view == null) {
                p.B("mChildOfContent");
                view = null;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f18265f);
            this.f18266g = false;
        }
    }

    public final boolean h(String str) {
        List<String> list = this.f18267h;
        if (list != null) {
            for (String str2 : list) {
                if (StringExtensionsKt.d(str2)) {
                    Boolean bool = null;
                    if (str != null) {
                        bool = Boolean.valueOf(StringsKt__StringsKt.S(str, str2, false, 2, (Object) null));
                    }
                    if (c.h(bool)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
