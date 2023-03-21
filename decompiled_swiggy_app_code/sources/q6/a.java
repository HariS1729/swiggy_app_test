package q6;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.b;
import coil.size.Scale;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import o6.d;

/* compiled from: CrossfadeDrawable.kt */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: m  reason: collision with root package name */
    public static final C0173a f16379m = new C0173a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Scale f16380a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16381b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16382c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16383d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f16384e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final int f16385f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16386g;

    /* renamed from: h  reason: collision with root package name */
    private long f16387h;

    /* renamed from: i  reason: collision with root package name */
    private int f16388i;
    private int j;
    private Drawable k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f16389l;

    /* renamed from: q6.a$a  reason: collision with other inner class name */
    /* compiled from: CrossfadeDrawable.kt */
    public static final class C0173a {
        private C0173a() {
        }

        public /* synthetic */ C0173a(i iVar) {
            this();
        }
    }

    public a(Drawable drawable, Drawable drawable2, Scale scale, int i11, boolean z11, boolean z12) {
        Integer num;
        Integer num2;
        Drawable drawable3;
        this.f16380a = scale;
        this.f16381b = i11;
        this.f16382c = z11;
        this.f16383d = z12;
        Drawable drawable4 = null;
        if (drawable == null) {
            num = null;
        } else {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        }
        this.f16385f = a(num, drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicWidth()));
        if (drawable == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        }
        this.f16386g = a(num2, drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.f16388i = 255;
        if (drawable == null) {
            drawable3 = null;
        } else {
            drawable3 = drawable.mutate();
        }
        this.k = drawable3;
        drawable4 = drawable2 != null ? drawable2.mutate() : drawable4;
        this.f16389l = drawable4;
        if (i11 > 0) {
            Drawable drawable5 = this.k;
            if (drawable5 != null) {
                drawable5.setCallback(this);
            }
            if (drawable4 != null) {
                drawable4.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    private final int a(Integer num, Integer num2) {
        int i11;
        int i12 = -1;
        if (!this.f16383d && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num == null) {
            i11 = -1;
        } else {
            i11 = num.intValue();
        }
        if (num2 != null) {
            i12 = num2.intValue();
        }
        return Math.max(i11, i12);
    }

    private final void b() {
        this.j = 2;
        this.k = null;
        List<b> list = this.f16384e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c11 = d.c(intrinsicWidth, intrinsicHeight, width, height, this.f16380a);
        double d11 = (double) 2;
        int b11 = c.b((((double) width) - (((double) intrinsicWidth) * c11)) / d11);
        int b12 = c.b((((double) height) - (c11 * ((double) intrinsicHeight))) / d11);
        drawable.setBounds(rect.left + b11, rect.top + b12, rect.right - b11, rect.bottom - b12);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i11 = this.j;
        if (i11 == 0) {
            Drawable drawable2 = this.k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f16388i);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i11 == 2) {
            Drawable drawable3 = this.f16389l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f16388i);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.f16387h)) / ((double) this.f16381b);
            double k11 = l.k(uptimeMillis, 0.0d, 1.0d);
            int i12 = this.f16388i;
            int i13 = (int) (k11 * ((double) i12));
            if (this.f16382c) {
                i12 -= i13;
            }
            boolean z11 = uptimeMillis >= 1.0d;
            if (!z11 && (drawable = this.k) != null) {
                drawable.setAlpha(i12);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.f16389l;
            if (drawable4 != null) {
                drawable4.setAlpha(i13);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z11) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.f16388i;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable;
        int i11 = this.j;
        if (i11 == 0) {
            Drawable drawable2 = this.k;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        } else if (i11 == 1) {
            Drawable drawable3 = this.f16389l;
            ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
            if (colorFilter != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.k;
            if (drawable4 == null) {
                return null;
            }
            return drawable4.getColorFilter();
        } else if (i11 == 2 && (drawable = this.f16389l) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.f16386g;
    }

    public int getIntrinsicWidth() {
        return this.f16385f;
    }

    public int getOpacity() {
        Drawable drawable = this.k;
        Drawable drawable2 = this.f16389l;
        int i11 = this.j;
        if (i11 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        } else if (i11 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.j == 1;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.k;
        boolean level = drawable == null ? false : drawable.setLevel(i11);
        Drawable drawable2 = this.f16389l;
        boolean level2 = drawable2 == null ? false : drawable2.setLevel(i11);
        if (level || level2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.k;
        boolean state = drawable == null ? false : drawable.setState(iArr);
        Drawable drawable2 = this.f16389l;
        boolean state2 = drawable2 == null ? false : drawable2.setState(iArr);
        if (state || state2) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    public void setAlpha(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < 256) {
            z11 = true;
        }
        if (z11) {
            this.f16388i = i11;
            return;
        }
        throw new IllegalArgumentException(p.s("Invalid alpha: ", Integer.valueOf(i11)).toString());
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i11) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setTint(i11);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            drawable2.setTint(i11);
        }
    }

    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f16389l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0.start()
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r4.f16389l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x001a
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x001a:
            if (r2 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r2.start()
        L_0x0020:
            int r0 = r4.j
            if (r0 == 0) goto L_0x0025
            return
        L_0x0025:
            r0 = 1
            r4.j = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.f16387h = r0
            java.util.List<androidx.vectordrawable.graphics.drawable.b> r0 = r4.f16384e
            r1 = 0
            int r2 = r0.size()
        L_0x0035:
            if (r1 >= r2) goto L_0x0044
            int r3 = r1 + 1
            java.lang.Object r1 = r0.get(r1)
            androidx.vectordrawable.graphics.drawable.b r1 = (androidx.vectordrawable.graphics.drawable.b) r1
            r1.b(r4)
            r1 = r3
            goto L_0x0035
        L_0x0044:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0.stop()
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r3.f16389l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x001a
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x001a:
            if (r2 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r2.stop()
        L_0x0020:
            int r0 = r3.j
            r1 = 2
            if (r0 == r1) goto L_0x0028
            r3.b()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.stop():void");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
