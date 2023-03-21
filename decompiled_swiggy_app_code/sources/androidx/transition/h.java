package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.k;
import androidx.core.view.a0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ChangeTransform */
public class h extends b0 {
    private static final String[] O = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<e, float[]> P = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> Q = new b(PointF.class, "translations");
    private static final boolean R = true;
    boolean L = true;
    private boolean M = true;
    private Matrix N = new Matrix();

    /* compiled from: ChangeTransform */
    static class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* compiled from: ChangeTransform */
    static class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* compiled from: ChangeTransform */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11912a;

        /* renamed from: b  reason: collision with root package name */
        private Matrix f11913b = new Matrix();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f11914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f11915d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f11916e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f11917f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f11918g;

        c(boolean z11, Matrix matrix, View view, f fVar, e eVar) {
            this.f11914c = z11;
            this.f11915d = matrix;
            this.f11916e = view;
            this.f11917f = fVar;
            this.f11918g = eVar;
        }

        private void a(Matrix matrix) {
            this.f11913b.set(matrix);
            this.f11916e.setTag(R.id.transition_transform, this.f11913b);
            this.f11917f.a(this.f11916e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f11912a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11912a) {
                if (!this.f11914c || !h.this.L) {
                    this.f11916e.setTag(R.id.transition_transform, (Object) null);
                    this.f11916e.setTag(R.id.parent_matrix, (Object) null);
                } else {
                    a(this.f11915d);
                }
            }
            p0.f(this.f11916e, (Matrix) null);
            this.f11917f.a(this.f11916e);
        }

        public void onAnimationPause(Animator animator) {
            a(this.f11918g.a());
        }

        public void onAnimationResume(Animator animator) {
            h.x0(this.f11916e);
        }
    }

    /* compiled from: ChangeTransform */
    private static class d extends d0 {

        /* renamed from: a  reason: collision with root package name */
        private View f11920a;

        /* renamed from: b  reason: collision with root package name */
        private m f11921b;

        d(View view, m mVar) {
            this.f11920a = view;
            this.f11921b = mVar;
        }

        public void a(b0 b0Var) {
            this.f11921b.setVisibility(0);
        }

        public void c(b0 b0Var) {
            this.f11921b.setVisibility(4);
        }

        public void d(b0 b0Var) {
            b0Var.d0(this);
            q.b(this.f11920a);
            this.f11920a.setTag(R.id.transition_transform, (Object) null);
            this.f11920a.setTag(R.id.parent_matrix, (Object) null);
        }
    }

    /* compiled from: ChangeTransform */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Matrix f11922a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        private final View f11923b;

        /* renamed from: c  reason: collision with root package name */
        private final float[] f11924c;

        /* renamed from: d  reason: collision with root package name */
        private float f11925d;

        /* renamed from: e  reason: collision with root package name */
        private float f11926e;

        e(View view, float[] fArr) {
            this.f11923b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f11924c = fArr2;
            this.f11925d = fArr2[2];
            this.f11926e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f11924c;
            fArr[2] = this.f11925d;
            fArr[5] = this.f11926e;
            this.f11922a.setValues(fArr);
            p0.f(this.f11923b, this.f11922a);
        }

        /* access modifiers changed from: package-private */
        public Matrix a() {
            return this.f11922a;
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f11925d = pointF.x;
            this.f11926e = pointF.y;
            b();
        }

        /* access modifiers changed from: package-private */
        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f11924c, 0, fArr.length);
            b();
        }
    }

    /* compiled from: ChangeTransform */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        final float f11927a;

        /* renamed from: b  reason: collision with root package name */
        final float f11928b;

        /* renamed from: c  reason: collision with root package name */
        final float f11929c;

        /* renamed from: d  reason: collision with root package name */
        final float f11930d;

        /* renamed from: e  reason: collision with root package name */
        final float f11931e;

        /* renamed from: f  reason: collision with root package name */
        final float f11932f;

        /* renamed from: g  reason: collision with root package name */
        final float f11933g;

        /* renamed from: h  reason: collision with root package name */
        final float f11934h;

        f(View view) {
            this.f11927a = view.getTranslationX();
            this.f11928b = view.getTranslationY();
            this.f11929c = a0.R(view);
            this.f11930d = view.getScaleX();
            this.f11931e = view.getScaleY();
            this.f11932f = view.getRotationX();
            this.f11933g = view.getRotationY();
            this.f11934h = view.getRotation();
        }

        public void a(View view) {
            h.z0(view, this.f11927a, this.f11928b, this.f11929c, this.f11930d, this.f11931e, this.f11932f, this.f11933g, this.f11934h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.f11927a == this.f11927a && fVar.f11928b == this.f11928b && fVar.f11929c == this.f11929c && fVar.f11930d == this.f11930d && fVar.f11931e == this.f11931e && fVar.f11932f == this.f11932f && fVar.f11933g == this.f11933g && fVar.f11934h == this.f11934h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float f11 = this.f11927a;
            int i11 = 0;
            int floatToIntBits = (f11 != 0.0f ? Float.floatToIntBits(f11) : 0) * 31;
            float f12 = this.f11928b;
            int floatToIntBits2 = (floatToIntBits + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f11929c;
            int floatToIntBits3 = (floatToIntBits2 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f11930d;
            int floatToIntBits4 = (floatToIntBits3 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f11931e;
            int floatToIntBits5 = (floatToIntBits4 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f11932f;
            int floatToIntBits6 = (floatToIntBits5 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f11933g;
            int floatToIntBits7 = (floatToIntBits6 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0)) * 31;
            float f18 = this.f11934h;
            if (f18 != 0.0f) {
                i11 = Float.floatToIntBits(f18);
            }
            return floatToIntBits7 + i11;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11823g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.L = k.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.M = k.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    private void t0(h0 h0Var) {
        View view = h0Var.f11936b;
        if (view.getVisibility() != 8) {
            h0Var.f11935a.put("android:changeTransform:parent", view.getParent());
            h0Var.f11935a.put("android:changeTransform:transforms", new f(view));
            Matrix matrix = view.getMatrix();
            h0Var.f11935a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.M) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                p0.j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                h0Var.f11935a.put("android:changeTransform:parentMatrix", matrix2);
                h0Var.f11935a.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
                h0Var.f11935a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
            }
        }
    }

    private void u0(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        View view = h0Var2.f11936b;
        Matrix matrix = new Matrix((Matrix) h0Var2.f11935a.get("android:changeTransform:parentMatrix"));
        p0.k(viewGroup, matrix);
        m a11 = q.a(view, viewGroup, matrix);
        if (a11 != null) {
            a11.a((ViewGroup) h0Var.f11935a.get("android:changeTransform:parent"), h0Var.f11936b);
            b0 b0Var = this;
            while (true) {
                b0 b0Var2 = b0Var.f11846r;
                if (b0Var2 == null) {
                    break;
                }
                b0Var = b0Var2;
            }
            b0Var.b(new d(view, a11));
            if (R) {
                View view2 = h0Var.f11936b;
                if (view2 != h0Var2.f11936b) {
                    p0.h(view2, 0.0f);
                }
                p0.h(view, 1.0f);
            }
        }
    }

    private ObjectAnimator v0(h0 h0Var, h0 h0Var2, boolean z11) {
        Matrix matrix = (Matrix) h0Var.f11935a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) h0Var2.f11935a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = t.f12004a;
        }
        if (matrix2 == null) {
            matrix2 = t.f12004a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = h0Var2.f11936b;
        x0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(P, new k(new float[9]), new float[][]{fArr, fArr2}), w.a(Q, H().a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        c cVar = new c(z11, matrix3, view, (f) h0Var2.f11935a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f11936b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean w0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.T(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.T(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.h0 r4 = r3.F(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f11936b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.h.w0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void x0(View view) {
        z0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void y0(h0 h0Var, h0 h0Var2) {
        Matrix matrix = (Matrix) h0Var2.f11935a.get("android:changeTransform:parentMatrix");
        h0Var2.f11936b.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.N;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) h0Var.f11935a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            h0Var.f11935a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) h0Var.f11935a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void z0(View view, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        a0.S0(view, f13);
        view.setScaleX(f14);
        view.setScaleY(f15);
        view.setRotationX(f16);
        view.setRotationY(f17);
        view.setRotation(f18);
    }

    public String[] P() {
        return O;
    }

    public void k(h0 h0Var) {
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        t0(h0Var);
        if (!R) {
            ((ViewGroup) h0Var.f11936b.getParent()).startViewTransition(h0Var.f11936b);
        }
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        if (h0Var == null || h0Var2 == null || !h0Var.f11935a.containsKey("android:changeTransform:parent") || !h0Var2.f11935a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) h0Var.f11935a.get("android:changeTransform:parent");
        boolean z11 = this.M && !w0(viewGroup2, (ViewGroup) h0Var2.f11935a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) h0Var.f11935a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            h0Var.f11935a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) h0Var.f11935a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            h0Var.f11935a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z11) {
            y0(h0Var, h0Var2);
        }
        ObjectAnimator v02 = v0(h0Var, h0Var2, z11);
        if (z11 && v02 != null && this.L) {
            u0(viewGroup, h0Var, h0Var2);
        } else if (!R) {
            viewGroup2.endViewTransition(h0Var.f11936b);
        }
        return v02;
    }
}
