package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: ScrollEventAdapter */
final class e extends RecyclerView.t {

    /* renamed from: a  reason: collision with root package name */
    private ViewPager2.i f12255a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f12256b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f12257c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f12258d;

    /* renamed from: e  reason: collision with root package name */
    private int f12259e;

    /* renamed from: f  reason: collision with root package name */
    private int f12260f;

    /* renamed from: g  reason: collision with root package name */
    private a f12261g = new a();

    /* renamed from: h  reason: collision with root package name */
    private int f12262h;

    /* renamed from: i  reason: collision with root package name */
    private int f12263i;
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12264l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12265m;

    /* compiled from: ScrollEventAdapter */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f12266a;

        /* renamed from: b  reason: collision with root package name */
        float f12267b;

        /* renamed from: c  reason: collision with root package name */
        int f12268c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f12266a = -1;
            this.f12267b = 0.0f;
            this.f12268c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f12256b = viewPager2;
        RecyclerView recyclerView = viewPager2.j;
        this.f12257c = recyclerView;
        this.f12258d = (LinearLayoutManager) recyclerView.getLayoutManager();
        l();
    }

    private void a(int i11, float f11, int i12) {
        ViewPager2.i iVar = this.f12255a;
        if (iVar != null) {
            iVar.b(i11, f11, i12);
        }
    }

    private void b(int i11) {
        ViewPager2.i iVar = this.f12255a;
        if (iVar != null) {
            iVar.c(i11);
        }
    }

    private void c(int i11) {
        if ((this.f12259e != 3 || this.f12260f != 0) && this.f12260f != i11) {
            this.f12260f = i11;
            ViewPager2.i iVar = this.f12255a;
            if (iVar != null) {
                iVar.a(i11);
            }
        }
    }

    private int d() {
        return this.f12258d.i2();
    }

    private boolean i() {
        int i11 = this.f12259e;
        return i11 == 1 || i11 == 4;
    }

    private void l() {
        this.f12259e = 0;
        this.f12260f = 0;
        this.f12261g.a();
        this.f12262h = -1;
        this.f12263i = -1;
        this.j = false;
        this.k = false;
        this.f12265m = false;
        this.f12264l = false;
    }

    private void n(boolean z11) {
        this.f12265m = z11;
        this.f12259e = z11 ? 4 : 1;
        int i11 = this.f12263i;
        if (i11 != -1) {
            this.f12262h = i11;
            this.f12263i = -1;
        } else if (this.f12262h == -1) {
            this.f12262h = d();
        }
        c(1);
    }

    private void o() {
        int i11;
        a aVar = this.f12261g;
        int i22 = this.f12258d.i2();
        aVar.f12266a = i22;
        if (i22 == -1) {
            aVar.a();
            return;
        }
        View N = this.f12258d.N(i22);
        if (N == null) {
            aVar.a();
            return;
        }
        int l02 = this.f12258d.l0(N);
        int q02 = this.f12258d.q0(N);
        int t02 = this.f12258d.t0(N);
        int S = this.f12258d.S(N);
        ViewGroup.LayoutParams layoutParams = N.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l02 += marginLayoutParams.leftMargin;
            q02 += marginLayoutParams.rightMargin;
            t02 += marginLayoutParams.topMargin;
            S += marginLayoutParams.bottomMargin;
        }
        int height = N.getHeight() + t02 + S;
        int width = N.getWidth() + l02 + q02;
        if (this.f12258d.w2() == 0) {
            i11 = (N.getLeft() - l02) - this.f12257c.getPaddingLeft();
            if (this.f12256b.d()) {
                i11 = -i11;
            }
            height = width;
        } else {
            i11 = (N.getTop() - t02) - this.f12257c.getPaddingTop();
        }
        int i12 = -i11;
        aVar.f12268c = i12;
        if (i12 >= 0) {
            aVar.f12267b = height == 0 ? 0.0f : ((float) i12) / ((float) height);
        } else if (new a(this.f12258d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f12268c)}));
        }
    }

    /* access modifiers changed from: package-private */
    public double e() {
        o();
        a aVar = this.f12261g;
        return ((double) aVar.f12266a) + ((double) aVar.f12267b);
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f12260f;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f12265m;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f12260f == 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f12264l = true;
    }

    /* access modifiers changed from: package-private */
    public void k(int i11, boolean z11) {
        this.f12259e = z11 ? 2 : 3;
        boolean z12 = false;
        this.f12265m = false;
        if (this.f12263i != i11) {
            z12 = true;
        }
        this.f12263i = i11;
        c(2);
        if (z12) {
            b(i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(ViewPager2.i iVar) {
        this.f12255a = iVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        boolean z11 = true;
        if (!(this.f12259e == 1 && this.f12260f == 1) && i11 == 1) {
            n(false);
        } else if (!i() || i11 != 2) {
            if (i() && i11 == 0) {
                o();
                if (!this.k) {
                    int i12 = this.f12261g.f12266a;
                    if (i12 != -1) {
                        a(i12, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f12261g;
                    if (aVar.f12268c == 0) {
                        int i13 = this.f12262h;
                        int i14 = aVar.f12266a;
                        if (i13 != i14) {
                            b(i14);
                        }
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    c(0);
                    l();
                }
            }
            if (this.f12259e == 2 && i11 == 0 && this.f12264l) {
                o();
                a aVar2 = this.f12261g;
                if (aVar2.f12268c == 0) {
                    int i15 = this.f12263i;
                    int i16 = aVar2.f12266a;
                    if (i15 != i16) {
                        if (i16 == -1) {
                            i16 = 0;
                        }
                        b(i16);
                    }
                    c(0);
                    l();
                }
            }
        } else if (this.k) {
            c(2);
            this.j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f12256b.d()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.k = r4
            r3.o()
            boolean r0 = r3.j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f12256b
            boolean r6 = r6.d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f12261g
            int r6 = r5.f12268c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f12266a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f12261g
            int r5 = r5.f12266a
        L_0x0033:
            r3.f12263i = r5
            int r6 = r3.f12262h
            if (r6 == r5) goto L_0x004b
            r3.b(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f12259e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.e$a r5 = r3.f12261g
            int r5 = r5.f12266a
            if (r5 != r1) goto L_0x0048
            r5 = 0
        L_0x0048:
            r3.b(r5)
        L_0x004b:
            androidx.viewpager2.widget.e$a r5 = r3.f12261g
            int r6 = r5.f12266a
            if (r6 != r1) goto L_0x0052
            r6 = 0
        L_0x0052:
            float r0 = r5.f12267b
            int r5 = r5.f12268c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f12261g
            int r6 = r5.f12266a
            int r0 = r3.f12263i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f12268c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f12260f
            if (r5 == r4) goto L_0x0071
            r3.c(r2)
            r3.l()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
