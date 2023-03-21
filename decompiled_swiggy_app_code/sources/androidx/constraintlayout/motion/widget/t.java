package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.c;
import i2.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ViewTransition */
public class t {

    /* renamed from: w  reason: collision with root package name */
    private static String f8642w = "ViewTransition";

    /* renamed from: a  reason: collision with root package name */
    private int f8643a;

    /* renamed from: b  reason: collision with root package name */
    private int f8644b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8645c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f8646d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f8647e;

    /* renamed from: f  reason: collision with root package name */
    g f8648f;

    /* renamed from: g  reason: collision with root package name */
    c.a f8649g;

    /* renamed from: h  reason: collision with root package name */
    private int f8650h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f8651i = -1;
    private int j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private int f8652l = 0;

    /* renamed from: m  reason: collision with root package name */
    private String f8653m = null;
    private int n = -1;

    /* renamed from: o  reason: collision with root package name */
    Context f8654o;

    /* renamed from: p  reason: collision with root package name */
    private int f8655p = -1;
    private int q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f8656r = -1;

    /* renamed from: s  reason: collision with root package name */
    private int f8657s = -1;
    private int t = -1;

    /* renamed from: u  reason: collision with root package name */
    private int f8658u = -1;
    private int v = -1;

    /* compiled from: ViewTransition */
    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2.c f8659a;

        a(t tVar, i2.c cVar) {
            this.f8659a = cVar;
        }

        public float getInterpolation(float f11) {
            return (float) this.f8659a.a((double) f11);
        }
    }

    /* compiled from: ViewTransition */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f8660a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8661b;

        /* renamed from: c  reason: collision with root package name */
        long f8662c;

        /* renamed from: d  reason: collision with root package name */
        m f8663d;

        /* renamed from: e  reason: collision with root package name */
        int f8664e;

        /* renamed from: f  reason: collision with root package name */
        int f8665f;

        /* renamed from: g  reason: collision with root package name */
        d f8666g = new d();

        /* renamed from: h  reason: collision with root package name */
        u f8667h;

        /* renamed from: i  reason: collision with root package name */
        Interpolator f8668i;
        boolean j = false;
        float k;

        /* renamed from: l  reason: collision with root package name */
        float f8669l;

        /* renamed from: m  reason: collision with root package name */
        long f8670m;
        Rect n = new Rect();

        /* renamed from: o  reason: collision with root package name */
        boolean f8671o = false;

        b(u uVar, m mVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            this.f8667h = uVar;
            this.f8663d = mVar;
            this.f8664e = i11;
            this.f8665f = i12;
            long nanoTime = System.nanoTime();
            this.f8662c = nanoTime;
            this.f8670m = nanoTime;
            this.f8667h.b(this);
            this.f8668i = interpolator;
            this.f8660a = i14;
            this.f8661b = i15;
            if (i13 == 3) {
                this.f8671o = true;
            }
            this.f8669l = i11 == 0 ? Float.MAX_VALUE : 1.0f / ((float) i11);
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            long nanoTime = System.nanoTime();
            this.f8670m = nanoTime;
            float f11 = this.k + (((float) (((double) (nanoTime - this.f8670m)) * 1.0E-6d)) * this.f8669l);
            this.k = f11;
            if (f11 >= 1.0f) {
                this.k = 1.0f;
            }
            Interpolator interpolator = this.f8668i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            m mVar = this.f8663d;
            boolean u11 = mVar.u(mVar.f8549b, interpolation, nanoTime, this.f8666g);
            if (this.k >= 1.0f) {
                if (this.f8660a != -1) {
                    this.f8663d.s().setTag(this.f8660a, Long.valueOf(System.nanoTime()));
                }
                if (this.f8661b != -1) {
                    this.f8663d.s().setTag(this.f8661b, (Object) null);
                }
                if (!this.f8671o) {
                    this.f8667h.f(this);
                }
            }
            if (this.k < 1.0f || u11) {
                this.f8667h.d();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            long nanoTime = System.nanoTime();
            this.f8670m = nanoTime;
            float f11 = this.k - (((float) (((double) (nanoTime - this.f8670m)) * 1.0E-6d)) * this.f8669l);
            this.k = f11;
            if (f11 < 0.0f) {
                this.k = 0.0f;
            }
            Interpolator interpolator = this.f8668i;
            float interpolation = interpolator == null ? this.k : interpolator.getInterpolation(this.k);
            m mVar = this.f8663d;
            boolean u11 = mVar.u(mVar.f8549b, interpolation, nanoTime, this.f8666g);
            if (this.k <= 0.0f) {
                if (this.f8660a != -1) {
                    this.f8663d.s().setTag(this.f8660a, Long.valueOf(System.nanoTime()));
                }
                if (this.f8661b != -1) {
                    this.f8663d.s().setTag(this.f8661b, (Object) null);
                }
                this.f8667h.f(this);
            }
            if (this.k > 0.0f || u11) {
                this.f8667h.d();
            }
        }

        public void d(int i11, float f11, float f12) {
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f8663d.s().getHitRect(this.n);
                    if (!this.n.contains((int) f11, (int) f12) && !this.j) {
                        e(true);
                    }
                }
            } else if (!this.j) {
                e(true);
            }
        }

        /* access modifiers changed from: package-private */
        public void e(boolean z11) {
            int i11;
            this.j = z11;
            if (z11 && (i11 = this.f8665f) != -1) {
                this.f8669l = i11 == 0 ? Float.MAX_VALUE : 1.0f / ((float) i11);
            }
            this.f8667h.d();
            this.f8670m = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    t(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f8644b = r0
            r1 = 0
            r9.f8645c = r1
            r9.f8646d = r1
            r9.f8650h = r0
            r9.f8651i = r0
            r9.f8652l = r1
            r2 = 0
            r9.f8653m = r2
            r9.n = r0
            r9.f8655p = r0
            r9.q = r0
            r9.f8656r = r0
            r9.f8657s = r0
            r9.t = r0
            r9.f8658u = r0
            r9.v = r0
            r9.f8654o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x002a:
            r3 = 1
            if (r2 == r3) goto L_0x00eb
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x0037
            goto L_0x00dc
        L_0x0037:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r2 == 0) goto L_0x00dc
            return
        L_0x0042:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0075;
                case -1239391468: goto L_0x006b;
                case 61998586: goto L_0x0063;
                case 366511058: goto L_0x0059;
                case 1791837707: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x004e:
            goto L_0x007f
        L_0x004f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 3
            goto L_0x0080
        L_0x0059:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 4
            goto L_0x0080
        L_0x0063:
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 0
            goto L_0x0080
        L_0x006b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 1
            goto L_0x0080
        L_0x0075:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x007f
            r4 = 2
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            if (r4 == 0) goto L_0x00d9
            if (r4 == r3) goto L_0x00d1
            if (r4 == r6) goto L_0x00ca
            if (r4 == r5) goto L_0x00c2
            if (r4 == r8) goto L_0x00c2
            java.lang.String r3 = f8642w     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r5 = androidx.constraintlayout.motion.widget.a.a()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r5 = " unknown tag "
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            android.util.Log.e(r3, r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r2 = f8642w     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r4 = ".xml:"
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            int r4 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            android.util.Log.e(r2, r3)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00c2:
            androidx.constraintlayout.widget.c$a r2 = r9.f8649g     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f8807g     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            androidx.constraintlayout.widget.ConstraintAttribute.i(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00ca:
            androidx.constraintlayout.widget.c$a r2 = androidx.constraintlayout.widget.c.m(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r9.f8649g = r2     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00d1:
            androidx.constraintlayout.motion.widget.g r2 = new androidx.constraintlayout.motion.widget.g     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            r9.f8648f = r2     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x00dc
        L_0x00d9:
            r9.l(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
        L_0x00dc:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e2 }
            goto L_0x002a
        L_0x00e2:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00eb
        L_0x00e7:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(View[] viewArr) {
        if (this.f8655p != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f8655p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.q != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.q, (Object) null);
            }
        }
    }

    private void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.ViewTransition_android_id) {
                this.f8643a = obtainStyledAttributes.getResourceId(index, this.f8643a);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.f8375p1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.f8644b = obtainStyledAttributes.getInt(index, this.f8644b);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.f8645c = obtainStyledAttributes.getBoolean(index, this.f8645c);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.f8646d = obtainStyledAttributes.getInt(index, this.f8646d);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.f8650h = obtainStyledAttributes.getInt(index, this.f8650h);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.f8651i = obtainStyledAttributes.getInt(index, this.f8651i);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.f8647e = obtainStyledAttributes.getInt(index, this.f8647e);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i12 = obtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f8652l = -2;
                    }
                } else if (i12 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8653m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f8652l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f8652l = -2;
                    }
                } else {
                    this.f8652l = obtainStyledAttributes.getInteger(index, this.f8652l);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.f8655p = obtainStyledAttributes.getResourceId(index, this.f8655p);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.f8656r = obtainStyledAttributes.getResourceId(index, this.f8656r);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.f8657s = obtainStyledAttributes.getResourceId(index, this.f8657s);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.f8658u = obtainStyledAttributes.getResourceId(index, this.f8658u);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void n(q.b bVar, View view) {
        int i11 = this.f8650h;
        if (i11 != -1) {
            bVar.E(i11);
        }
        bVar.G(this.f8646d);
        bVar.F(this.f8652l, this.f8653m, this.n);
        int id2 = view.getId();
        g gVar = this.f8648f;
        if (gVar != null) {
            ArrayList<d> d11 = gVar.d(-1);
            g gVar2 = new g();
            Iterator<d> it2 = d11.iterator();
            while (it2.hasNext()) {
                gVar2.c(it2.next().clone().h(id2));
            }
            bVar.t(gVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(u uVar, MotionLayout motionLayout, View view) {
        m mVar = new m(view);
        mVar.y(view);
        this.f8648f.a(mVar);
        mVar.F(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f8650h, System.nanoTime());
        u uVar2 = uVar;
        m mVar2 = mVar;
        new b(uVar2, mVar2, this.f8650h, this.f8651i, this.f8644b, f(motionLayout.getContext()), this.f8655p, this.q);
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar, MotionLayout motionLayout, int i11, c cVar, View... viewArr) {
        if (!this.f8645c) {
            int i12 = this.f8647e;
            if (i12 == 2) {
                b(uVar, motionLayout, viewArr[0]);
                return;
            }
            if (i12 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i13 : constraintSetIds) {
                    if (i13 != i11) {
                        c r02 = motionLayout.r0(i13);
                        for (View id2 : viewArr) {
                            c.a y11 = r02.y(id2.getId());
                            c.a aVar = this.f8649g;
                            if (aVar != null) {
                                aVar.d(y11);
                                y11.f8807g.putAll(this.f8649g.f8807g);
                            }
                        }
                    }
                }
            }
            c cVar2 = new c();
            cVar2.q(cVar);
            for (View id3 : viewArr) {
                c.a y12 = cVar2.y(id3.getId());
                c.a aVar2 = this.f8649g;
                if (aVar2 != null) {
                    aVar2.d(y12);
                    y12.f8807g.putAll(this.f8649g.f8807g);
                }
            }
            motionLayout.O0(i11, cVar2);
            int i14 = R.id.view_transition;
            motionLayout.O0(i14, cVar);
            motionLayout.C0(i14, -1, -1);
            q.b bVar = new q.b(-1, motionLayout.f8403y, i14, i11);
            for (View n11 : viewArr) {
                n(bVar, n11);
            }
            motionLayout.setTransition(bVar);
            motionLayout.I0(new s(this, viewArr));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d(View view) {
        int i11 = this.f8656r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f8657s;
        boolean z12 = i12 == -1 || view.getTag(i12) == null;
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f8643a;
    }

    /* access modifiers changed from: package-private */
    public Interpolator f(Context context) {
        int i11 = this.f8652l;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, this.n);
        }
        if (i11 == -1) {
            return new a(this, i2.c.c(this.f8653m));
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.t;
    }

    public int h() {
        return this.f8658u;
    }

    public int i() {
        return this.f8644b;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f8717c0) != null && str.matches(this.k)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m(int i11) {
        int i12 = this.f8644b;
        return i12 == 1 ? i11 == 0 : i12 == 2 ? i11 == 1 : i12 == 3 && i11 == 0;
    }

    public String toString() {
        return "ViewTransition(" + a.c(this.f8654o, this.f8643a) + ")";
    }
}
