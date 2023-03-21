package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat */
public class c extends g implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private b f12046b;

    /* renamed from: c  reason: collision with root package name */
    private Context f12047c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f12048d;

    /* renamed from: e  reason: collision with root package name */
    private Animator.AnimatorListener f12049e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<b> f12050f;

    /* renamed from: g  reason: collision with root package name */
    final Drawable.Callback f12051g;

    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f12053a;

        /* renamed from: b  reason: collision with root package name */
        h f12054b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f12055c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f12056d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f12057e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f12053a = bVar.f12053a;
                h hVar = bVar.f12054b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f12054b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f12054b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f12054b.mutate();
                    this.f12054b = hVar2;
                    hVar2.setCallback(callback);
                    this.f12054b.setBounds(bVar.f12054b.getBounds());
                    this.f12054b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f12056d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f12056d = new ArrayList<>(size);
                    this.f12057e = new androidx.collection.a<>(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        Animator animator = bVar.f12056d.get(i11);
                        Animator clone = animator.clone();
                        String str = bVar.f12057e.get(animator);
                        clone.setTarget(this.f12054b.d(str));
                        this.f12056d.add(clone);
                        this.f12057e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f12055c == null) {
                this.f12055c = new AnimatorSet();
            }
            this.f12055c.playTogether(this.f12056d);
        }

        public int getChangingConfigurations() {
            return this.f12053a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this((Context) null, (b) null, (Resources) null);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f12046b.f12054b.d(str));
        b bVar = this.f12046b;
        if (bVar.f12056d == null) {
            bVar.f12056d = new ArrayList<>();
            this.f12046b.f12057e = new androidx.collection.a<>();
        }
        this.f12046b.f12056d.add(animator);
        this.f12046b.f12057e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f12046b.f12054b.draw(canvas);
        if (this.f12046b.f12055c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f12046b.f12054b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12046b.f12053a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f12046b.f12054b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f12061a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0089c(this.f12061a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f12046b.f12054b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f12046b.f12054b.getIntrinsicWidth();
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
        return this.f12046b.f12054b.getOpacity();
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

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s11 = k.s(resources, theme, attributeSet, a.f12040e);
                    int resourceId = s11.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b11 = h.b(resources, resourceId, theme);
                        b11.h(false);
                        b11.setCallback(this.f12051g);
                        h hVar = this.f12046b.f12054b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f12046b.f12054b = b11;
                    }
                    s11.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f12041f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f12047c;
                        if (context != null) {
                            b(string, e.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f12046b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f12046b.f12054b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f12046b.f12055c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f12046b.f12054b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f12046b.f12054b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        return this.f12046b.f12054b.setLevel(i11);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f12046b.f12054b.setState(iArr);
    }

    public void setAlpha(int i11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f12046b.f12054b.setAlpha(i11);
        }
    }

    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z11);
        } else {
            this.f12046b.f12054b.setAutoMirrored(z11);
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
            this.f12046b.f12054b.setTint(i11);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f12046b.f12054b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f12046b.f12054b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f12046b.f12054b.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    public void start() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f12046b.f12055c.isStarted()) {
            this.f12046b.f12055c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f12046b.f12055c.end();
        }
    }

    private c(Context context) {
        this(context, (b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f12061a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f12046b.f12054b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0089c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f12058a;

        public C0089c(Drawable.ConstantState constantState) {
            this.f12058a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f12058a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f12058a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f12058a.newDrawable();
            cVar.f12061a = newDrawable;
            newDrawable.setCallback(cVar.f12051g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f12058a.newDrawable(resources);
            cVar.f12061a = newDrawable;
            newDrawable.setCallback(cVar.f12051g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f12058a.newDrawable(resources, theme);
            cVar.f12061a = newDrawable;
            newDrawable.setCallback(cVar.f12051g);
            return cVar;
        }
    }

    private c(Context context, b bVar, Resources resources) {
        this.f12048d = null;
        this.f12049e = null;
        this.f12050f = null;
        a aVar = new a();
        this.f12051g = aVar;
        this.f12047c = context;
        if (bVar != null) {
            this.f12046b = bVar;
        } else {
            this.f12046b = new b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
