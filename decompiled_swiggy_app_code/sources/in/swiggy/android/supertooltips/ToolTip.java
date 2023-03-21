package in.swiggy.android.supertooltips;

import android.graphics.Typeface;
import android.view.View;

public class ToolTip {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f18744a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f18745b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f18746c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f18747d;

    /* renamed from: e  reason: collision with root package name */
    private View f18748e = null;

    /* renamed from: f  reason: collision with root package name */
    private AnimationType f18749f = AnimationType.FROM_MASTER_VIEW;

    /* renamed from: g  reason: collision with root package name */
    private Typeface f18750g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18751h = false;

    /* renamed from: i  reason: collision with root package name */
    private Integer f18752i = -1;
    private Integer j = -1;

    public enum AnimationType {
        FROM_MASTER_VIEW,
        FROM_TOP,
        NONE
    }

    public AnimationType a() {
        return this.f18749f;
    }

    public Integer b() {
        return this.f18752i;
    }

    public int c() {
        return this.f18746c;
    }

    public View d() {
        return this.f18748e;
    }

    public boolean e() {
        return this.f18751h;
    }

    public CharSequence f() {
        return this.f18744a;
    }

    public int g() {
        return this.f18747d;
    }

    public int h() {
        return this.f18745b;
    }

    public Typeface i() {
        return this.f18750g;
    }

    public ToolTip j(AnimationType animationType) {
        this.f18749f = animationType;
        return this;
    }

    public ToolTip k(Integer num) {
        this.f18752i = num;
        return this;
    }

    public ToolTip l(int i11) {
        this.f18746c = i11;
        return this;
    }

    public ToolTip m(View view) {
        this.f18748e = view;
        return this;
    }

    public ToolTip n(Integer num) {
        this.j = num;
        return this;
    }

    public ToolTip o(boolean z11) {
        this.f18751h = z11;
        return this;
    }
}
