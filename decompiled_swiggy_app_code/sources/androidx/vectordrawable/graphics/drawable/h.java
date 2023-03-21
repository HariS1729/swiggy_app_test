package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import com.rudderstack.android.sdk.core.MessageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class h extends g {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private C0090h f12062b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f12063c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f12064d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12065e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12066f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable.ConstantState f12067g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f12068h;

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f12069i;
    private final Rect j;

    /* compiled from: VectorDrawableCompat */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12091b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f12090a = androidx.core.graphics.d.d(string2);
            }
            this.f12092c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.r(xmlPullParser, "pathData")) {
                TypedArray s11 = k.s(resources, theme, attributeSet, a.f12039d);
                f(s11, xmlPullParser);
                s11.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    private static class C0090h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f12107a;

        /* renamed from: b  reason: collision with root package name */
        g f12108b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f12109c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f12110d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12111e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f12112f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f12113g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f12114h;

        /* renamed from: i  reason: collision with root package name */
        int f12115i;
        boolean j;
        boolean k;

        /* renamed from: l  reason: collision with root package name */
        Paint f12116l;

        public C0090h(C0090h hVar) {
            this.f12109c = null;
            this.f12110d = h.k;
            if (hVar != null) {
                this.f12107a = hVar.f12107a;
                g gVar = new g(hVar.f12108b);
                this.f12108b = gVar;
                if (hVar.f12108b.f12098e != null) {
                    gVar.f12098e = new Paint(hVar.f12108b.f12098e);
                }
                if (hVar.f12108b.f12097d != null) {
                    this.f12108b.f12097d = new Paint(hVar.f12108b.f12097d);
                }
                this.f12109c = hVar.f12109c;
                this.f12110d = hVar.f12110d;
                this.f12111e = hVar.f12111e;
            }
        }

        public boolean a(int i11, int i12) {
            return i11 == this.f12112f.getWidth() && i12 == this.f12112f.getHeight();
        }

        public boolean b() {
            return !this.k && this.f12113g == this.f12109c && this.f12114h == this.f12110d && this.j == this.f12111e && this.f12115i == this.f12108b.getRootAlpha();
        }

        public void c(int i11, int i12) {
            if (this.f12112f == null || !a(i11, i12)) {
                this.f12112f = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f12112f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f12116l == null) {
                Paint paint = new Paint();
                this.f12116l = paint;
                paint.setFilterBitmap(true);
            }
            this.f12116l.setAlpha(this.f12108b.getRootAlpha());
            this.f12116l.setColorFilter(colorFilter);
            return this.f12116l;
        }

        public boolean f() {
            return this.f12108b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f12108b.f();
        }

        public int getChangingConfigurations() {
            return this.f12107a;
        }

        public boolean h(int[] iArr) {
            boolean g11 = this.f12108b.g(iArr);
            this.k |= g11;
            return g11;
        }

        public void i() {
            this.f12113g = this.f12109c;
            this.f12114h = this.f12110d;
            this.f12115i = this.f12108b.getRootAlpha();
            this.j = this.f12111e;
            this.k = false;
        }

        public void j(int i11, int i12) {
            this.f12112f.eraseColor(0);
            this.f12108b.b(new Canvas(this.f12112f), i11, i12, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0090h() {
            this.f12109c = null;
            this.f12110d = h.k;
            this.f12108b = new g();
        }
    }

    h() {
        this.f12066f = true;
        this.f12068h = new float[9];
        this.f12069i = new Matrix();
        this.j = new Rect();
        this.f12062b = new C0090h();
    }

    static int a(int i11, float f11) {
        return (i11 & 16777215) | (((int) (((float) Color.alpha(i11)) * f11)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.h.e(r6, r7, r8)
            r0.f12061a = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f12061a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f12067g = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0090h hVar = this.f12062b;
        g gVar = hVar.f12108b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f12101h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12080b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f12106p.put(cVar.getPathName(), cVar);
                    }
                    z11 = false;
                    hVar.f12107a = cVar.f12093d | hVar.f12107a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12080b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f12106p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f12107a = bVar.f12093d | hVar.f12107a;
                } else if (MessageType.GROUP.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f12080b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f12106p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f12107a = dVar2.k | hVar.f12107a;
                }
            } else if (eventType == 3 && MessageType.GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z11) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0090h hVar = this.f12062b;
        g gVar = hVar.f12108b;
        hVar.f12110d = g(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g11 = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g11 != null) {
            hVar.f12109c = g11;
        }
        hVar.f12111e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f12111e);
        gVar.k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float j11 = k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f12103l);
        gVar.f12103l = j11;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j11 > 0.0f) {
            gVar.f12102i = typedArray.getDimension(3, gVar.f12102i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.f12102i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.f12106p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f12061a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f12062b.f12108b.f12106p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f12064d;
            if (colorFilter == null) {
                colorFilter = this.f12063c;
            }
            canvas.getMatrix(this.f12069i);
            this.f12069i.getValues(this.f12068h);
            float abs = Math.abs(this.f12068h[0]);
            float abs2 = Math.abs(this.f12068h[4]);
            float abs3 = Math.abs(this.f12068h[1]);
            float abs4 = Math.abs(this.f12068h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.j.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.j.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.f12062b.c(min, min2);
                if (!this.f12066f) {
                    this.f12062b.j(min, min2);
                } else if (!this.f12062b.b()) {
                    this.f12062b.j(min, min2);
                    this.f12062b.i();
                }
                this.f12062b.d(canvas, colorFilter, this.j);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f12062b.f12108b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12062b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f12064d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f12061a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f12061a.getConstantState());
        }
        this.f12062b.f12107a = getChangingConfigurations();
        return this.f12062b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f12062b.f12108b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f12062b.f12108b.f12102i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z11) {
        this.f12066f = z11;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f12062b.f12111e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f12062b.f12109c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f12062b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f12061a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f12062b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f12062b
            android.content.res.ColorStateList r0 = r0.f12109c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f12065e && super.mutate() == this) {
            this.f12062b = new C0090h(this.f12062b);
            this.f12065e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z11 = false;
        C0090h hVar = this.f12062b;
        ColorStateList colorStateList = hVar.f12109c;
        if (!(colorStateList == null || (mode = hVar.f12110d) == null)) {
            this.f12063c = j(this.f12063c, colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z11;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    public void setAlpha(int i11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f12062b.f12108b.getRootAlpha() != i11) {
            this.f12062b.f12108b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z11);
        } else {
            this.f12062b.f12111e = z11;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i11) {
        super.setChangingConfigurations(i11);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i11, PorterDuff.Mode mode) {
        super.setColorFilter(i11, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z11) {
        super.setFilterBitmap(z11);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0090h hVar = this.f12062b;
        if (hVar.f12109c != colorStateList) {
            hVar.f12109c = colorStateList;
            this.f12063c = j(this.f12063c, colorStateList, hVar.f12110d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0090h hVar = this.f12062b;
        if (hVar.f12110d != mode) {
            hVar.f12110d = mode;
            this.f12063c = j(this.f12063c, hVar.f12109c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        return super.setVisible(z11, z12);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f12117a;

        public i(Drawable.ConstantState constantState) {
            this.f12117a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f12117a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f12117a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f12061a = (VectorDrawable) this.f12117a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f12061a = (VectorDrawable) this.f12117a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f12061a = (VectorDrawable) this.f12117a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f12064d = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f12090a = null;

        /* renamed from: b  reason: collision with root package name */
        String f12091b;

        /* renamed from: c  reason: collision with root package name */
        int f12092c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f12093d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f12090a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f12090a;
        }

        public String getPathName() {
            return this.f12091b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f12090a, bVarArr)) {
                this.f12090a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f12090a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f12091b = fVar.f12091b;
            this.f12093d = fVar.f12093d;
            this.f12090a = androidx.core.graphics.d.f(fVar.f12090a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0090h hVar = this.f12062b;
        hVar.f12108b = new g();
        TypedArray s11 = k.s(resources, theme, attributeSet, a.f12036a);
        i(s11, xmlPullParser, theme);
        s11.recycle();
        hVar.f12107a = getChangingConfigurations();
        hVar.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f12063c = j(this.f12063c, hVar.f12109c, hVar.f12110d);
    }

    h(C0090h hVar) {
        this.f12066f = true;
        this.f12068h = new float[9];
        this.f12069i = new Matrix();
        this.j = new Rect();
        this.f12062b = hVar;
        this.f12063c = j(this.f12063c, hVar.f12109c, hVar.f12110d);
    }

    /* compiled from: VectorDrawableCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f12070e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f12071f;

        /* renamed from: g  reason: collision with root package name */
        float f12072g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f12073h;

        /* renamed from: i  reason: collision with root package name */
        float f12074i = 1.0f;
        float j = 1.0f;
        float k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f12075l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f12076m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f12077o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f12078p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i11, Paint.Cap cap) {
            if (i11 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i11 != 1) {
                return i11 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i11, Paint.Join join) {
            if (i11 == 0) {
                return Paint.Join.MITER;
            }
            if (i11 != 1) {
                return i11 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f12070e = null;
            if (k.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f12091b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f12090a = androidx.core.graphics.d.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f12073h = k.i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.f12077o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f12077o);
                this.f12078p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f12078p);
                this.f12071f = k.i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f12074i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f12074i);
                this.f12072g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f12072g);
                this.f12075l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f12075l);
                this.f12076m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f12076m);
                this.k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f12092c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f12092c);
            }
        }

        public boolean a() {
            return this.f12073h.i() || this.f12071f.i();
        }

        public boolean b(int[] iArr) {
            return this.f12071f.j(iArr) | this.f12073h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s11 = k.s(resources, theme, attributeSet, a.f12038c);
            h(s11, xmlPullParser, theme);
            s11.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f12073h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f12074i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f12071f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f12072g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f12075l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f12076m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f11) {
            this.j = f11;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i11) {
            this.f12073h.k(i11);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f11) {
            this.f12074i = f11;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i11) {
            this.f12071f.k(i11);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f11) {
            this.f12072g = f11;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f11) {
            this.f12075l = f11;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f11) {
            this.f12076m = f11;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f11) {
            this.k = f11;
        }

        c(c cVar) {
            super(cVar);
            this.f12070e = cVar.f12070e;
            this.f12071f = cVar.f12071f;
            this.f12072g = cVar.f12072g;
            this.f12074i = cVar.f12074i;
            this.f12073h = cVar.f12073h;
            this.f12092c = cVar.f12092c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.f12075l = cVar.f12075l;
            this.f12076m = cVar.f12076m;
            this.n = cVar.n;
            this.f12077o = cVar.f12077o;
            this.f12078p = cVar.f12078p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f12094a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f12095b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f12096c;

        /* renamed from: d  reason: collision with root package name */
        Paint f12097d;

        /* renamed from: e  reason: collision with root package name */
        Paint f12098e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f12099f;

        /* renamed from: g  reason: collision with root package name */
        private int f12100g;

        /* renamed from: h  reason: collision with root package name */
        final d f12101h;

        /* renamed from: i  reason: collision with root package name */
        float f12102i;
        float j;
        float k;

        /* renamed from: l  reason: collision with root package name */
        float f12103l;

        /* renamed from: m  reason: collision with root package name */
        int f12104m;
        String n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f12105o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f12106p;

        public g() {
            this.f12096c = new Matrix();
            this.f12102i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.f12103l = 0.0f;
            this.f12104m = 255;
            this.n = null;
            this.f12105o = null;
            this.f12106p = new androidx.collection.a<>();
            this.f12101h = new d();
            this.f12094a = new Path();
            this.f12095b = new Path();
        }

        private static float a(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            dVar.f12079a.set(matrix);
            dVar.f12079a.preConcat(dVar.j);
            canvas.save();
            for (int i13 = 0; i13 < dVar.f12080b.size(); i13++) {
                e eVar = dVar.f12080b.get(i13);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f12079a, canvas, i11, i12, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i11, i12, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            float f11 = ((float) i11) / this.k;
            float f12 = ((float) i12) / this.f12103l;
            float min = Math.min(f11, f12);
            Matrix matrix = dVar.f12079a;
            this.f12096c.set(matrix);
            this.f12096c.postScale(f11, f12);
            float e11 = e(matrix);
            if (e11 != 0.0f) {
                fVar.d(this.f12094a);
                Path path = this.f12094a;
                this.f12095b.reset();
                if (fVar.c()) {
                    this.f12095b.setFillType(fVar.f12092c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f12095b.addPath(path, this.f12096c);
                    canvas.clipPath(this.f12095b);
                    return;
                }
                c cVar = (c) fVar;
                float f13 = cVar.k;
                if (!(f13 == 0.0f && cVar.f12075l == 1.0f)) {
                    float f14 = cVar.f12076m;
                    float f15 = (f13 + f14) % 1.0f;
                    float f16 = (cVar.f12075l + f14) % 1.0f;
                    if (this.f12099f == null) {
                        this.f12099f = new PathMeasure();
                    }
                    this.f12099f.setPath(this.f12094a, false);
                    float length = this.f12099f.getLength();
                    float f17 = f15 * length;
                    float f18 = f16 * length;
                    path.reset();
                    if (f17 > f18) {
                        this.f12099f.getSegment(f17, length, path, true);
                        this.f12099f.getSegment(0.0f, f18, path, true);
                    } else {
                        this.f12099f.getSegment(f17, f18, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f12095b.addPath(path, this.f12096c);
                if (cVar.f12073h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f12073h;
                    if (this.f12098e == null) {
                        Paint paint = new Paint(1);
                        this.f12098e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f12098e;
                    if (dVar2.h()) {
                        Shader f19 = dVar2.f();
                        f19.setLocalMatrix(this.f12096c);
                        paint2.setShader(f19);
                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(dVar2.e(), cVar.j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f12095b.setFillType(cVar.f12092c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f12095b, paint2);
                }
                if (cVar.f12071f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f12071f;
                    if (this.f12097d == null) {
                        Paint paint3 = new Paint(1);
                        this.f12097d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f12097d;
                    Paint.Join join = cVar.f12077o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f12078p);
                    if (dVar3.h()) {
                        Shader f21 = dVar3.f();
                        f21.setLocalMatrix(this.f12096c);
                        paint4.setShader(f21);
                        paint4.setAlpha(Math.round(cVar.f12074i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(dVar3.e(), cVar.f12074i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f12072g * min * e11);
                    canvas.drawPath(this.f12095b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a11 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a11) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            c(this.f12101h, q, canvas, i11, i12, colorFilter);
        }

        public boolean f() {
            if (this.f12105o == null) {
                this.f12105o = Boolean.valueOf(this.f12101h.a());
            }
            return this.f12105o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f12101h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f12104m;
        }

        public void setAlpha(float f11) {
            setRootAlpha((int) (f11 * 255.0f));
        }

        public void setRootAlpha(int i11) {
            this.f12104m = i11;
        }

        public g(g gVar) {
            this.f12096c = new Matrix();
            this.f12102i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.f12103l = 0.0f;
            this.f12104m = 255;
            this.n = null;
            this.f12105o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f12106p = aVar;
            this.f12101h = new d(gVar.f12101h, aVar);
            this.f12094a = new Path(gVar.f12094a);
            this.f12095b = new Path(gVar.f12095b);
            this.f12102i = gVar.f12102i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.f12103l = gVar.f12103l;
            this.f12100g = gVar.f12100g;
            this.f12104m = gVar.f12104m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f12105o = gVar.f12105o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f12079a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f12080b;

        /* renamed from: c  reason: collision with root package name */
        float f12081c;

        /* renamed from: d  reason: collision with root package name */
        private float f12082d;

        /* renamed from: e  reason: collision with root package name */
        private float f12083e;

        /* renamed from: f  reason: collision with root package name */
        private float f12084f;

        /* renamed from: g  reason: collision with root package name */
        private float f12085g;

        /* renamed from: h  reason: collision with root package name */
        private float f12086h;

        /* renamed from: i  reason: collision with root package name */
        private float f12087i;
        final Matrix j;
        int k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f12088l;

        /* renamed from: m  reason: collision with root package name */
        private String f12089m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f fVar;
            this.f12079a = new Matrix();
            this.f12080b = new ArrayList<>();
            this.f12081c = 0.0f;
            this.f12082d = 0.0f;
            this.f12083e = 0.0f;
            this.f12084f = 1.0f;
            this.f12085g = 1.0f;
            this.f12086h = 0.0f;
            this.f12087i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.f12089m = null;
            this.f12081c = dVar.f12081c;
            this.f12082d = dVar.f12082d;
            this.f12083e = dVar.f12083e;
            this.f12084f = dVar.f12084f;
            this.f12085g = dVar.f12085g;
            this.f12086h = dVar.f12086h;
            this.f12087i = dVar.f12087i;
            this.f12088l = dVar.f12088l;
            String str = dVar.f12089m;
            this.f12089m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.f12080b;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                e eVar = arrayList.get(i11);
                if (eVar instanceof d) {
                    this.f12080b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f12080b.add(fVar);
                    String str2 = fVar.f12091b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.f12082d, -this.f12083e);
            this.j.postScale(this.f12084f, this.f12085g);
            this.j.postRotate(this.f12081c, 0.0f, 0.0f);
            this.j.postTranslate(this.f12086h + this.f12082d, this.f12087i + this.f12083e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12088l = null;
            this.f12081c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f12081c);
            this.f12082d = typedArray.getFloat(1, this.f12082d);
            this.f12083e = typedArray.getFloat(2, this.f12083e);
            this.f12084f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f12084f);
            this.f12085g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f12085g);
            this.f12086h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f12086h);
            this.f12087i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f12087i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12089m = string;
            }
            d();
        }

        public boolean a() {
            for (int i11 = 0; i11 < this.f12080b.size(); i11++) {
                if (this.f12080b.get(i11).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z11 = false;
            for (int i11 = 0; i11 < this.f12080b.size(); i11++) {
                z11 |= this.f12080b.get(i11).b(iArr);
            }
            return z11;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s11 = k.s(resources, theme, attributeSet, a.f12037b);
            e(s11, xmlPullParser);
            s11.recycle();
        }

        public String getGroupName() {
            return this.f12089m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f12082d;
        }

        public float getPivotY() {
            return this.f12083e;
        }

        public float getRotation() {
            return this.f12081c;
        }

        public float getScaleX() {
            return this.f12084f;
        }

        public float getScaleY() {
            return this.f12085g;
        }

        public float getTranslateX() {
            return this.f12086h;
        }

        public float getTranslateY() {
            return this.f12087i;
        }

        public void setPivotX(float f11) {
            if (f11 != this.f12082d) {
                this.f12082d = f11;
                d();
            }
        }

        public void setPivotY(float f11) {
            if (f11 != this.f12083e) {
                this.f12083e = f11;
                d();
            }
        }

        public void setRotation(float f11) {
            if (f11 != this.f12081c) {
                this.f12081c = f11;
                d();
            }
        }

        public void setScaleX(float f11) {
            if (f11 != this.f12084f) {
                this.f12084f = f11;
                d();
            }
        }

        public void setScaleY(float f11) {
            if (f11 != this.f12085g) {
                this.f12085g = f11;
                d();
            }
        }

        public void setTranslateX(float f11) {
            if (f11 != this.f12086h) {
                this.f12086h = f11;
                d();
            }
        }

        public void setTranslateY(float f11) {
            if (f11 != this.f12087i) {
                this.f12087i = f11;
                d();
            }
        }

        public d() {
            super();
            this.f12079a = new Matrix();
            this.f12080b = new ArrayList<>();
            this.f12081c = 0.0f;
            this.f12082d = 0.0f;
            this.f12083e = 0.0f;
            this.f12084f = 1.0f;
            this.f12085g = 1.0f;
            this.f12086h = 0.0f;
            this.f12087i = 0.0f;
            this.j = new Matrix();
            this.f12089m = null;
        }
    }
}
