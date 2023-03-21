package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import bp0.k;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.newrelic.agent.android.agentdata.HexAttribute;
import i7.c;
import i7.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import q7.b;
import q7.e;
import q7.f;

/* compiled from: MaterialDialog.kt */
public final class MaterialDialog extends Dialog {
    private static i7.a t = c.f15131a;

    /* renamed from: u  reason: collision with root package name */
    public static final a f13707u = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f13708a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13709b;

    /* renamed from: c  reason: collision with root package name */
    private Typeface f13710c;

    /* renamed from: d  reason: collision with root package name */
    private Typeface f13711d;

    /* renamed from: e  reason: collision with root package name */
    private Typeface f13712e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13713f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13714g;

    /* renamed from: h  reason: collision with root package name */
    private Float f13715h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f13716i;
    private final DialogLayout j;
    private final List<l<MaterialDialog, k>> k;

    /* renamed from: l  reason: collision with root package name */
    private final List<l<MaterialDialog, k>> f13717l;

    /* renamed from: m  reason: collision with root package name */
    private final List<l<MaterialDialog, k>> f13718m;
    private final List<l<MaterialDialog, k>> n;

    /* renamed from: o  reason: collision with root package name */
    private final List<l<MaterialDialog, k>> f13719o;

    /* renamed from: p  reason: collision with root package name */
    private final List<l<MaterialDialog, k>> f13720p;
    private final List<l<MaterialDialog, k>> q;

    /* renamed from: r  reason: collision with root package name */
    private final Context f13721r;

    /* renamed from: s  reason: collision with root package name */
    private final i7.a f13722s;

    /* compiled from: MaterialDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaterialDialog(Context context, i7.a aVar, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? t : aVar);
    }

    private final void f() {
        int c11 = q7.a.c(this, (Integer) null, Integer.valueOf(R.attr.md_background_color), new MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1(this), 1, (Object) null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        i7.a aVar = this.f13722s;
        DialogLayout dialogLayout = this.j;
        Float f11 = this.f13715h;
        aVar.f(dialogLayout, c11, f11 != null ? f11.floatValue() : e.f16390a.k(this.f13721r, R.attr.md_corner_radius, new MaterialDialog$invalidateBackgroundColorAndRadius$1(this)));
    }

    public static /* synthetic */ MaterialDialog h(MaterialDialog materialDialog, Integer num, CharSequence charSequence, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            charSequence = null;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return materialDialog.g(num, charSequence, lVar);
    }

    public static /* synthetic */ MaterialDialog j(MaterialDialog materialDialog, Integer num, CharSequence charSequence, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            charSequence = null;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return materialDialog.i(num, charSequence, lVar);
    }

    public static /* synthetic */ MaterialDialog m(MaterialDialog materialDialog, Integer num, CharSequence charSequence, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            charSequence = null;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return materialDialog.l(num, charSequence, lVar);
    }

    private final void n() {
        i7.a aVar = this.f13722s;
        Context context = this.f13721r;
        Integer num = this.f13716i;
        Window window = getWindow();
        if (window == null) {
            p.v();
        }
        p.f(window, "window!!");
        aVar.g(context, window, this.j, num);
    }

    public static /* synthetic */ MaterialDialog p(MaterialDialog materialDialog, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return materialDialog.o(num, str);
    }

    public final MaterialDialog a(boolean z11) {
        setCancelable(z11);
        return this;
    }

    public final Map<String, Object> b() {
        return this.f13708a;
    }

    public final List<l<MaterialDialog, k>> c() {
        return this.k;
    }

    public final DialogLayout d() {
        return this.j;
    }

    public void dismiss() {
        if (!this.f13722s.onDismiss()) {
            b.a(this);
            super.dismiss();
        }
    }

    public final Context e() {
        return this.f13721r;
    }

    public final MaterialDialog g(Integer num, CharSequence charSequence, l<? super p7.a, k> lVar) {
        e eVar = e.f16390a;
        eVar.b(HexAttribute.HEX_ATTR_MESSAGE, charSequence, num);
        this.j.getContentLayout().g(this, num, charSequence, this.f13711d, Float.valueOf(eVar.s(this.f13721r, R.attr.md_text_size_body, new MaterialDialog$message$1$1(this))), lVar);
        return this;
    }

    public final MaterialDialog i(Integer num, CharSequence charSequence, l<? super MaterialDialog, k> lVar) {
        if (lVar != null) {
            this.f13720p.add(lVar);
        }
        DialogActionButton a11 = j7.a.a(this, WhichButton.NEGATIVE);
        if (!(num == null && charSequence == null && f.e(a11))) {
            b.c(this, a11, num, charSequence, 17039360, this.f13712e, (Integer) null, Float.valueOf(e.f16390a.s(this.f13721r, R.attr.md_text_size_button, new MaterialDialog$negativeButton$1$1(this))), 32, (Object) null);
        }
        return this;
    }

    public final void k(WhichButton whichButton) {
        p.k(whichButton, "which");
        int i11 = i7.b.f15130a[whichButton.ordinal()];
        if (i11 == 1) {
            k7.a.a(this.f13719o, this);
            RecyclerView.Adapter<?> a11 = o7.a.a(this);
            if (!(a11 instanceof n7.a)) {
                a11 = null;
            }
            n7.a aVar = (n7.a) a11;
            if (aVar != null) {
                aVar.a();
            }
        } else if (i11 == 2) {
            k7.a.a(this.f13720p, this);
        } else if (i11 == 3) {
            k7.a.a(this.q, this);
        }
        if (this.f13709b) {
            dismiss();
        }
    }

    public final MaterialDialog l(Integer num, CharSequence charSequence, l<? super MaterialDialog, k> lVar) {
        if (lVar != null) {
            this.f13719o.add(lVar);
        }
        DialogActionButton a11 = j7.a.a(this, WhichButton.POSITIVE);
        if (num == null && charSequence == null && f.e(a11)) {
            return this;
        }
        b.c(this, a11, num, charSequence, 17039370, this.f13712e, (Integer) null, Float.valueOf(e.f16390a.s(this.f13721r, R.attr.md_text_size_button, new MaterialDialog$positiveButton$1$1(this))), 32, (Object) null);
        return this;
    }

    public final MaterialDialog o(Integer num, String str) {
        e eVar = e.f16390a;
        eVar.b("title", str, num);
        b.c(this, this.j.getTitleLayout().getTitleView$core(), num, str, 0, this.f13710c, Integer.valueOf(R.attr.md_color_title), Float.valueOf(eVar.s(this.f13721r, R.attr.md_text_size_title, new MaterialDialog$title$1$1(this))), 8, (Object) null);
        return this;
    }

    public void setCancelable(boolean z11) {
        this.f13714g = z11;
        super.setCancelable(z11);
    }

    public void setCanceledOnTouchOutside(boolean z11) {
        this.f13713f = z11;
        super.setCanceledOnTouchOutside(z11);
    }

    public void show() {
        n();
        b.d(this);
        this.f13722s.d(this);
        super.show();
        this.f13722s.c(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialDialog(Context context, i7.a aVar) {
        super(context, d.a(context, aVar));
        p.k(context, "windowContext");
        p.k(aVar, "dialogBehavior");
        this.f13721r = context;
        this.f13722s = aVar;
        this.f13708a = new LinkedHashMap();
        this.f13709b = true;
        this.f13713f = true;
        this.f13714g = true;
        this.k = new ArrayList();
        this.f13717l = new ArrayList();
        this.f13718m = new ArrayList();
        this.n = new ArrayList();
        this.f13719o = new ArrayList();
        this.f13720p = new ArrayList();
        this.q = new ArrayList();
        LayoutInflater from = LayoutInflater.from(context);
        Window window = getWindow();
        if (window == null) {
            p.v();
        }
        p.f(window, "window!!");
        p.f(from, "layoutInflater");
        ViewGroup e11 = aVar.e(context, window, from, this);
        setContentView(e11);
        DialogLayout b11 = aVar.b(e11);
        b11.a(this);
        this.j = b11;
        this.f13710c = q7.d.b(this, (Integer) null, Integer.valueOf(R.attr.md_font_title), 1, (Object) null);
        this.f13711d = q7.d.b(this, (Integer) null, Integer.valueOf(R.attr.md_font_body), 1, (Object) null);
        this.f13712e = q7.d.b(this, (Integer) null, Integer.valueOf(R.attr.md_font_button), 1, (Object) null);
        f();
    }
}
