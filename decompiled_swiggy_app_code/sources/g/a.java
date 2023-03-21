package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.e0;
import androidx.collection.h;
import androidx.core.content.res.k;
import g.b;
import g.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AnimatedStateListDrawableCompat */
public class a extends d implements androidx.core.graphics.drawable.f {
    private static final String t = a.class.getSimpleName();

    /* renamed from: o  reason: collision with root package name */
    private c f14660o;

    /* renamed from: p  reason: collision with root package name */
    private g f14661p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private int f14662r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14663s;

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f14664a;

        b(Animatable animatable) {
            super();
            this.f14664a = animatable;
        }

        public void c() {
            this.f14664a.start();
        }

        public void d() {
            this.f14664a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    static class c extends d.a {
        androidx.collection.e<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.e<>();
            this.L = new h<>();
        }

        private static long D(int i11, int i12) {
            return ((long) i12) | (((long) i11) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i11) {
            int z11 = super.z(iArr, drawable);
            this.L.n(z11, Integer.valueOf(i11));
            return z11;
        }

        /* access modifiers changed from: package-private */
        public int C(int i11, int i12, Drawable drawable, boolean z11) {
            int a11 = super.a(drawable);
            long D = D(i11, i12);
            long j = z11 ? 8589934592L : 0;
            long j11 = (long) a11;
            this.K.b(D, Long.valueOf(j11 | j));
            if (z11) {
                this.K.b(D(i12, i11), Long.valueOf(4294967296L | j11 | j));
            }
            return a11;
        }

        /* access modifiers changed from: package-private */
        public int E(int i11) {
            if (i11 < 0) {
                return 0;
            }
            return this.L.j(i11, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i11, int i12) {
            return (int) this.K.j(D(i11, i12), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i11, int i12) {
            return (this.K.j(D(i11, i12), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i11, int i12) {
            return (this.K.j(D(i11, i12), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f14665a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f14665a = cVar;
        }

        public void c() {
            this.f14665a.start();
        }

        public void d() {
            this.f14665a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f14666a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14667b;

        e(AnimationDrawable animationDrawable, boolean z11, boolean z12) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i11 = z11 ? numberOfFrames - 1 : 0;
            int i12 = z11 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z11);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i11, i12});
            h.b.a(ofInt, true);
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f14667b = z12;
            this.f14666a = ofInt;
        }

        public boolean a() {
            return this.f14667b;
        }

        public void b() {
            this.f14666a.reverse();
        }

        public void c() {
            this.f14666a.start();
        }

        public void d() {
            this.f14666a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f14668a;

        /* renamed from: b  reason: collision with root package name */
        private int f14669b;

        /* renamed from: c  reason: collision with root package name */
        private int f14670c;

        f(AnimationDrawable animationDrawable, boolean z11) {
            b(animationDrawable, z11);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f14670c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f14669b = numberOfFrames;
            int[] iArr = this.f14668a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f14668a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f14668a;
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfFrames; i12++) {
                int duration = animationDrawable.getDuration(z11 ? (numberOfFrames - i12) - 1 : i12);
                iArr2[i12] = duration;
                i11 += duration;
            }
            this.f14670c = i11;
            return i11;
        }

        public float getInterpolation(float f11) {
            int i11 = (int) ((f11 * ((float) this.f14670c)) + 0.5f);
            int i12 = this.f14669b;
            int[] iArr = this.f14668a;
            int i13 = 0;
            while (i13 < i12 && i11 >= iArr[i13]) {
                i11 -= iArr[i13];
                i13++;
            }
            return (((float) i13) / ((float) i12)) + (i13 < i12 ? ((float) i11) / ((float) this.f14670c) : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s11 = k.s(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableItem);
        int resourceId = s11.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = s11.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? e0.h().j(context, resourceId2) : null;
        s11.recycle();
        int[] k = k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j = androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = h.c.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (j != null) {
            return this.f14660o.B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s11 = k.s(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = s11.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = s11.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = s11.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? e0.h().j(context, resourceId3) : null;
        boolean z11 = s11.getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        s11.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = androidx.vectordrawable.graphics.drawable.c.a(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                j = h.c.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f14660o.C(resourceId, resourceId2, j, z11);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i11) {
        int i12;
        int G;
        g gVar;
        g gVar2 = this.f14661p;
        if (gVar2 == null) {
            i12 = c();
        } else if (i11 == this.q) {
            return true;
        } else {
            if (i11 != this.f14662r || !gVar2.a()) {
                i12 = this.q;
                gVar2.d();
            } else {
                gVar2.b();
                this.q = this.f14662r;
                this.f14662r = i11;
                return true;
            }
        }
        this.f14661p = null;
        this.f14662r = -1;
        this.q = -1;
        c cVar = this.f14660o;
        int E = cVar.E(i12);
        int E2 = cVar.E(i11);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f14661p = gVar;
        this.f14662r = i12;
        this.q = i11;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f14660o;
        cVar.f14686d |= h.c.b(typedArray);
        cVar.x(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f14691i));
        cVar.t(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f14692l));
        cVar.u(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f14700x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f14660o = (c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f14661p;
        if (gVar != null) {
            gVar.d();
            this.f14661p = null;
            g(this.q);
            this.q = -1;
            this.f14662r = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.f14660o, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f14663s && super.mutate() == this) {
            this.f14660o.r();
            this.f14663s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s11 = k.s(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(s11.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(s11);
        i(resources);
        s11.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i11) {
        return super.onLayoutDirectionChanged(i11);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f14660o.F(iArr);
        boolean z11 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z11 | current.setState(iArr) : z11;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i11) {
        super.setAlpha(i11);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z11) {
        super.setAutoMirrored(z11);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z11) {
        super.setDither(z11);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        g gVar = this.f14661p;
        if (gVar != null && (visible || z12)) {
            if (z11) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    a(c cVar, Resources resources) {
        super((d.a) null);
        this.q = -1;
        this.f14662r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
