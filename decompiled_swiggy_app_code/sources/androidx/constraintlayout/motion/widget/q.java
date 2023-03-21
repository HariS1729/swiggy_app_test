package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.h;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene */
public class q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f8586a;

    /* renamed from: b  reason: collision with root package name */
    h f8587b = null;

    /* renamed from: c  reason: collision with root package name */
    b f8588c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8589d = false;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<b> f8590e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private b f8591f = null;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f8592g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public SparseArray<c> f8593h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, Integer> f8594i = new HashMap<>();
    private SparseIntArray j = new SparseIntArray();
    private boolean k = false;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f8595l = OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f8596m = 0;
    private MotionEvent n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8597o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8598p = false;
    private MotionLayout.g q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8599r;

    /* renamed from: s  reason: collision with root package name */
    final u f8600s;
    float t;

    /* renamed from: u  reason: collision with root package name */
    float f8601u;

    /* compiled from: MotionScene */
    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2.c f8602a;

        a(q qVar, i2.c cVar) {
            this.f8602a = cVar;
        }

        public float getInterpolation(float f11) {
            return (float) this.f8602a.a((double) f11);
        }
    }

    q(Context context, MotionLayout motionLayout, int i11) {
        this.f8586a = motionLayout;
        this.f8600s = new u(motionLayout);
        J(context, i11);
        SparseArray<c> sparseArray = this.f8593h;
        int i12 = R.id.motion_base;
        sparseArray.put(i12, new c());
        this.f8594i.put("motion_base", Integer.valueOf(i12));
    }

    private boolean H(int i11) {
        int i12 = this.j.get(i11);
        int size = this.j.size();
        while (i12 > 0) {
            if (i12 == i11) {
                return true;
            }
            int i13 = size - 1;
            if (size < 0) {
                return true;
            }
            i12 = this.j.get(i12);
            size = i13;
        }
        return false;
    }

    private boolean I() {
        return this.q != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void J(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0174
            if (r2 == 0) goto L_0x0162
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x0165
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            boolean r5 = r8.k     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r6 = "MotionScene"
            r7 = -1
            switch(r5) {
                case -1349929691: goto L_0x009a;
                case -1239391468: goto L_0x008f;
                case -687739768: goto L_0x0085;
                case 61998586: goto L_0x007a;
                case 269306229: goto L_0x0071;
                case 312750793: goto L_0x0067;
                case 327855227: goto L_0x005d;
                case 793277014: goto L_0x0055;
                case 1382829617: goto L_0x004b;
                case 1942574248: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x00a4
        L_0x0041:
            java.lang.String r3 = "include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 6
            goto L_0x00a5
        L_0x004b:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 4
            goto L_0x00a5
        L_0x0055:
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 0
            goto L_0x00a5
        L_0x005d:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 2
            goto L_0x00a5
        L_0x0067:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 3
            goto L_0x00a5
        L_0x0071:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x007a:
            java.lang.String r3 = "ViewTransition"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 9
            goto L_0x00a5
        L_0x0085:
            java.lang.String r3 = "Include"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 7
            goto L_0x00a5
        L_0x008f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 8
            goto L_0x00a5
        L_0x009a:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r2 == 0) goto L_0x00a4
            r3 = 5
            goto L_0x00a5
        L_0x00a4:
            r3 = -1
        L_0x00a5:
            switch(r3) {
                case 0: goto L_0x015e;
                case 1: goto L_0x011c;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x00a8:
            goto L_0x0165
        L_0x00aa:
            androidx.constraintlayout.motion.widget.t r2 = new androidx.constraintlayout.motion.widget.t     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.u r3 = r8.f8600s     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r3.a(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00b6:
            androidx.constraintlayout.motion.widget.g r2 = new androidx.constraintlayout.motion.widget.g     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x0165
            java.util.ArrayList r3 = r1.k     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00c6:
            r8.M(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00cb:
            r8.K(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00d0:
            androidx.constraintlayout.widget.h r2 = new androidx.constraintlayout.widget.h     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r8.f8587b = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00d9:
            if (r1 == 0) goto L_0x0165
            r1.u(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x00e0:
            if (r1 != 0) goto L_0x010f
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            android.util.Log.v(r6, r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x010f:
            if (r1 == 0) goto L_0x0165
            androidx.constraintlayout.motion.widget.r r2 = new androidx.constraintlayout.motion.widget.r     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f8586a     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.r unused = r1.f8612l = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x011c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f8590e     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.q$b r1 = r8.f8588c     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != 0) goto L_0x0143
            boolean r1 = r2.f8604b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != 0) goto L_0x0143
            r8.f8588c = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.r r1 = r2.f8612l     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x0143
            androidx.constraintlayout.motion.widget.q$b r1 = r8.f8588c     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            androidx.constraintlayout.motion.widget.r r1 = r1.f8612l     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            boolean r3 = r8.f8599r     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.x(r3)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0143:
            boolean r1 = r2.f8604b     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 == 0) goto L_0x015c
            int r1 = r2.f8605c     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            if (r1 != r7) goto L_0x0152
            r8.f8591f = r2     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0157
        L_0x0152:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f8592g     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0157:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f8590e     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x015c:
            r1 = r2
            goto L_0x0165
        L_0x015e:
            r8.N(r9, r0)     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x0165
        L_0x0162:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
        L_0x0165:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x0170, IOException -> 0x016b }
            goto L_0x000d
        L_0x016b:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x0174
        L_0x0170:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.J(android.content.Context, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int K(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1 = 0
            r0.U(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x00e9
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.k
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            r8.hashCode()
            int r10 = r8.hashCode()
            r11 = 2
            switch(r10) {
                case -1496482599: goto L_0x0059;
                case -1153153640: goto L_0x004e;
                case 3355: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r8 = -1
            goto L_0x0063
        L_0x0043:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r8 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r8 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0062
            goto L_0x0041
        L_0x0062:
            r8 = 0
        L_0x0063:
            switch(r8) {
                case 0: goto L_0x00e1;
                case 1: goto L_0x0081;
                case 2: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00e5
        L_0x0068:
            int r5 = r13.q(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f8594i
            java.lang.String r8 = Z(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.a.c(r14, r5)
            r0.f8795b = r7
            goto L_0x00e5
        L_0x0081:
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0089 }
            r0.f8797d = r8     // Catch:{ NumberFormatException -> 0x0089 }
            goto L_0x00e5
        L_0x0089:
            r9.hashCode()
            int r8 = r9.hashCode()
            r10 = 4
            r12 = 3
            switch(r8) {
                case -768416914: goto L_0x00c4;
                case 3317767: goto L_0x00b9;
                case 3387192: goto L_0x00ae;
                case 108511772: goto L_0x00a3;
                case 1954540437: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            r8 = -1
            goto L_0x00ce
        L_0x0098:
            java.lang.String r8 = "x_right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00a1
            goto L_0x0096
        L_0x00a1:
            r8 = 4
            goto L_0x00ce
        L_0x00a3:
            java.lang.String r8 = "right"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00ac
            goto L_0x0096
        L_0x00ac:
            r8 = 3
            goto L_0x00ce
        L_0x00ae:
            java.lang.String r8 = "none"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00b7
            goto L_0x0096
        L_0x00b7:
            r8 = 2
            goto L_0x00ce
        L_0x00b9:
            java.lang.String r8 = "left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00c2
            goto L_0x0096
        L_0x00c2:
            r8 = 1
            goto L_0x00ce
        L_0x00c4:
            java.lang.String r8 = "x_left"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00cd
            goto L_0x0096
        L_0x00cd:
            r8 = 0
        L_0x00ce:
            switch(r8) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00db;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00d2;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x00e5
        L_0x00d2:
            r0.f8797d = r12
            goto L_0x00e5
        L_0x00d5:
            r0.f8797d = r7
            goto L_0x00e5
        L_0x00d8:
            r0.f8797d = r1
            goto L_0x00e5
        L_0x00db:
            r0.f8797d = r11
            goto L_0x00e5
        L_0x00de:
            r0.f8797d = r10
            goto L_0x00e5
        L_0x00e1:
            int r6 = r13.q(r14, r9)
        L_0x00e5:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00e9:
            if (r5 == r3) goto L_0x0103
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f8586a
            int r1 = r1.W
            if (r1 == 0) goto L_0x00f4
            r0.V(r7)
        L_0x00f4:
            r0.G(r14, r15)
            if (r6 == r3) goto L_0x00fe
            android.util.SparseIntArray r14 = r13.j
            r14.put(r5, r6)
        L_0x00fe:
            android.util.SparseArray<androidx.constraintlayout.widget.c> r14 = r13.f8593h
            r14.put(r5, r0)
        L_0x0103:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.K(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: private */
    public int L(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return K(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        } catch (IOException e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    private void M(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.include_constraintSet) {
                L(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i12 = obtainStyledAttributes.getInt(index, this.f8595l);
                this.f8595l = i12;
                if (i12 < 8) {
                    this.f8595l = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.f8596m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void R(int i11, MotionLayout motionLayout) {
        c cVar = this.f8593h.get(i11);
        cVar.f8796c = cVar.f8795b;
        int i12 = this.j.get(i11);
        if (i12 > 0) {
            R(i12, motionLayout);
            c cVar2 = this.f8593h.get(i12);
            if (cVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + a.c(this.f8586a.getContext(), i12));
                return;
            }
            cVar.f8796c += "/" + cVar2.f8796c;
            cVar.O(cVar2);
        } else {
            cVar.f8796c += "  layout";
            cVar.N(motionLayout);
        }
        cVar.h(cVar);
    }

    public static String Z(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    private int q(Context context, String str) {
        int i11;
        if (str.contains("/")) {
            i11 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), DistributedTracing.NR_ID_ATTRIBUTE, context.getPackageName());
            if (this.k) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i11);
            }
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            return i11;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c(r3, -1, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.h r0 = r2.f8587b
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.c(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.x(int):int");
    }

    /* access modifiers changed from: package-private */
    public float A() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.m();
    }

    /* access modifiers changed from: package-private */
    public float B() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.n();
    }

    /* access modifiers changed from: package-private */
    public float C() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.o();
    }

    public float D() {
        b bVar = this.f8588c;
        if (bVar != null) {
            return bVar.f8611i;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int E() {
        b bVar = this.f8588c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f8606d;
    }

    public b F(int i11) {
        Iterator<b> it2 = this.f8590e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f8603a == i11) {
                return next;
            }
        }
        return null;
    }

    public List<b> G(int i11) {
        int x11 = x(i11);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it2 = this.f8590e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f8606d == x11 || next.f8605c == x11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void O(float f11, float f12) {
        b bVar = this.f8588c;
        if (bVar != null && bVar.f8612l != null) {
            this.f8588c.f8612l.u(f11, f12);
        }
    }

    /* access modifiers changed from: package-private */
    public void P(float f11, float f12) {
        b bVar = this.f8588c;
        if (bVar != null && bVar.f8612l != null) {
            this.f8588c.f8612l.v(f11, f12);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(MotionEvent motionEvent, int i11, MotionLayout motionLayout) {
        MotionLayout.g gVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.q == null) {
            this.q = this.f8586a.x0();
        }
        this.q.a(motionEvent);
        if (i11 != -1) {
            int action = motionEvent.getAction();
            boolean z11 = false;
            if (action == 0) {
                this.t = motionEvent.getRawX();
                this.f8601u = motionEvent.getRawY();
                this.n = motionEvent;
                this.f8597o = false;
                if (this.f8588c.f8612l != null) {
                    RectF f11 = this.f8588c.f8612l.f(this.f8586a, rectF);
                    if (f11 == null || f11.contains(this.n.getX(), this.n.getY())) {
                        RectF p11 = this.f8588c.f8612l.p(this.f8586a, rectF);
                        if (p11 == null || p11.contains(this.n.getX(), this.n.getY())) {
                            this.f8598p = false;
                        } else {
                            this.f8598p = true;
                        }
                        this.f8588c.f8612l.w(this.t, this.f8601u);
                        return;
                    }
                    this.n = null;
                    this.f8597o = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f8597o) {
                float rawY = motionEvent.getRawY() - this.f8601u;
                float rawX = motionEvent.getRawX() - this.t;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.n) != null) {
                    b h11 = h(i11, rawX, rawY, motionEvent2);
                    if (h11 != null) {
                        motionLayout.setTransition(h11);
                        RectF p12 = this.f8588c.f8612l.p(this.f8586a, rectF);
                        if (p12 != null && !p12.contains(this.n.getX(), this.n.getY())) {
                            z11 = true;
                        }
                        this.f8598p = z11;
                        this.f8588c.f8612l.y(this.t, this.f8601u);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f8597o) {
            b bVar = this.f8588c;
            if (!(bVar == null || bVar.f8612l == null || this.f8598p)) {
                this.f8588c.f8612l.s(motionEvent, this.q, i11, this);
            }
            this.t = motionEvent.getRawX();
            this.f8601u = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (gVar = this.q) != null) {
                gVar.recycle();
                this.q = null;
                int i12 = motionLayout.D;
                if (i12 != -1) {
                    g(motionLayout, i12);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S(MotionLayout motionLayout) {
        int i11 = 0;
        while (i11 < this.f8593h.size()) {
            int keyAt = this.f8593h.keyAt(i11);
            if (H(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                R(keyAt, motionLayout);
                i11++;
            }
        }
    }

    public void T(int i11, c cVar) {
        this.f8593h.put(i11, cVar);
    }

    public void U(int i11) {
        b bVar = this.f8588c;
        if (bVar != null) {
            bVar.E(i11);
        } else {
            this.f8595l = i11;
        }
    }

    public void V(boolean z11) {
        this.f8599r = z11;
        b bVar = this.f8588c;
        if (bVar != null && bVar.f8612l != null) {
            this.f8588c.f8612l.x(this.f8599r);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.h r0 = r6.f8587b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.h r2 = r6.f8587b
            int r2 = r2.c(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.q$b r3 = r6.f8588c
            if (r3 == 0) goto L_0x002b
            int r3 = r3.f8605c
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.q$b r3 = r6.f8588c
            int r3 = r3.f8606d
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f8590e
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.q.b) r4
            int r5 = r4.f8605c
            if (r5 != r2) goto L_0x0049
            int r5 = r4.f8606d
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.f8605c
            if (r5 != r8) goto L_0x0031
            int r5 = r4.f8606d
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.f8588c = r4
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.r r7 = r4.f8612l
            if (r7 == 0) goto L_0x006a
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f8588c
            androidx.constraintlayout.motion.widget.r r7 = r7.f8612l
            boolean r8 = r6.f8599r
            r7.x(r8)
        L_0x006a:
            return
        L_0x006b:
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f8591f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f8592g
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.q.b) r4
            int r5 = r4.f8605c
            if (r5 != r8) goto L_0x0073
            r7 = r4
            goto L_0x0073
        L_0x0087:
            androidx.constraintlayout.motion.widget.q$b r8 = new androidx.constraintlayout.motion.widget.q$b
            r8.<init>(r6, r7)
            int unused = r8.f8606d = r0
            int unused = r8.f8605c = r2
            if (r0 == r1) goto L_0x0099
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r6.f8590e
            r7.add(r8)
        L_0x0099:
            r6.f8588c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.q.W(int, int):void");
    }

    public void X(b bVar) {
        this.f8588c = bVar;
        if (bVar != null && bVar.f8612l != null) {
            this.f8588c.f8612l.x(this.f8599r);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        b bVar = this.f8588c;
        if (bVar != null && bVar.f8612l != null) {
            this.f8588c.f8612l.z();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a0() {
        Iterator<b> it2 = this.f8590e.iterator();
        while (it2.hasNext()) {
            if (it2.next().f8612l != null) {
                return true;
            }
        }
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return false;
        }
        return true;
    }

    public void b0(int i11, View... viewArr) {
        this.f8600s.h(i11, viewArr);
    }

    public void f(MotionLayout motionLayout, int i11) {
        Iterator<b> it2 = this.f8590e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f8613m.size() > 0) {
                Iterator it3 = next.f8613m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it4 = this.f8592g.iterator();
        while (it4.hasNext()) {
            b next2 = it4.next();
            if (next2.f8613m.size() > 0) {
                Iterator it5 = next2.f8613m.iterator();
                while (it5.hasNext()) {
                    ((b.a) it5.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it6 = this.f8590e.iterator();
        while (it6.hasNext()) {
            b next3 = it6.next();
            if (next3.f8613m.size() > 0) {
                Iterator it7 = next3.f8613m.iterator();
                while (it7.hasNext()) {
                    ((b.a) it7.next()).a(motionLayout, i11, next3);
                }
            }
        }
        Iterator<b> it8 = this.f8592g.iterator();
        while (it8.hasNext()) {
            b next4 = it8.next();
            if (next4.f8613m.size() > 0) {
                Iterator it9 = next4.f8613m.iterator();
                while (it9.hasNext()) {
                    ((b.a) it9.next()).a(motionLayout, i11, next4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g(MotionLayout motionLayout, int i11) {
        b bVar;
        if (I() || this.f8589d) {
            return false;
        }
        Iterator<b> it2 = this.f8590e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.n != 0 && ((bVar = this.f8588c) != next || !bVar.D(2))) {
                if (i11 == next.f8606d && (next.n == 4 || next.n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.H0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.l0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.y0();
                    }
                    return true;
                } else if (i11 == next.f8605c && (next.n == 3 || next.n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.J0();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.l0(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.y0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i11, float f11, float f12, MotionEvent motionEvent) {
        RectF f13;
        int i12 = i11;
        float f14 = f11;
        float f15 = f12;
        if (i12 == -1) {
            return this.f8588c;
        }
        List<b> G = G(i11);
        float f16 = 0.0f;
        b bVar = null;
        RectF rectF = new RectF();
        for (b next : G) {
            if (!next.f8614o && next.f8612l != null) {
                next.f8612l.x(this.f8599r);
                RectF p11 = next.f8612l.p(this.f8586a, rectF);
                if ((p11 == null || motionEvent == null || p11.contains(motionEvent.getX(), motionEvent.getY())) && ((f13 = next.f8612l.f(this.f8586a, rectF)) == null || motionEvent == null || f13.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a11 = next.f8612l.a(f14, f15);
                    if (next.f8612l.f8629l && motionEvent != null) {
                        float x11 = motionEvent.getX() - next.f8612l.f8628i;
                        float y11 = motionEvent.getY() - next.f8612l.j;
                        a11 = ((float) (Math.atan2((double) (f15 + y11), (double) (f14 + x11)) - Math.atan2((double) x11, (double) y11))) * 10.0f;
                    }
                    float f17 = a11 * (next.f8605c == i12 ? -1.0f : 1.1f);
                    if (f17 > f16) {
                        bVar = next;
                        f16 = f17;
                    }
                }
            }
        }
        return bVar;
    }

    public int i() {
        b bVar = this.f8588c;
        if (bVar != null) {
            return bVar.f8615p;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0;
        }
        return this.f8588c.f8612l.d();
    }

    /* access modifiers changed from: package-private */
    public c k(int i11) {
        return l(i11, -1, -1);
    }

    /* access modifiers changed from: package-private */
    public c l(int i11, int i12, int i13) {
        int c11;
        if (this.k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i11);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f8593h.size());
        }
        h hVar = this.f8587b;
        if (!(hVar == null || (c11 = hVar.c(i11, i12, i13)) == -1)) {
            i11 = c11;
        }
        if (this.f8593h.get(i11) != null) {
            return this.f8593h.get(i11);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + a.c(this.f8586a.getContext(), i11) + " In MotionScene");
        SparseArray<c> sparseArray = this.f8593h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] m() {
        int size = this.f8593h.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f8593h.keyAt(i11);
        }
        return iArr;
    }

    public ArrayList<b> n() {
        return this.f8590e;
    }

    public int o() {
        b bVar = this.f8588c;
        if (bVar != null) {
            return bVar.f8610h;
        }
        return this.f8595l;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        b bVar = this.f8588c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f8605c;
    }

    public Interpolator r() {
        int g11 = this.f8588c.f8607e;
        if (g11 == -2) {
            return AnimationUtils.loadInterpolator(this.f8586a.getContext(), this.f8588c.f8609g);
        }
        if (g11 == -1) {
            return new a(this, i2.c.c(this.f8588c.f8608f));
        }
        if (g11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g11 == 1) {
            return new AccelerateInterpolator();
        }
        if (g11 == 2) {
            return new DecelerateInterpolator();
        }
        if (g11 == 4) {
            return new BounceInterpolator();
        }
        if (g11 == 5) {
            return new OvershootInterpolator();
        }
        if (g11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void s(m mVar) {
        b bVar = this.f8588c;
        if (bVar == null) {
            b bVar2 = this.f8591f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.k.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(mVar);
                }
                return;
            }
            return;
        }
        Iterator it3 = bVar.k.iterator();
        while (it3.hasNext()) {
            ((g) it3.next()).b(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public float t() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.g();
    }

    /* access modifiers changed from: package-private */
    public float u() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.h();
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return false;
        }
        return this.f8588c.f8612l.i();
    }

    /* access modifiers changed from: package-private */
    public float w(float f11, float f12) {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.j(f11, f12);
    }

    /* access modifiers changed from: package-private */
    public int y() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0;
        }
        return this.f8588c.f8612l.k();
    }

    /* access modifiers changed from: package-private */
    public float z() {
        b bVar = this.f8588c;
        if (bVar == null || bVar.f8612l == null) {
            return 0.0f;
        }
        return this.f8588c.f8612l.l();
    }

    /* compiled from: MotionScene */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f8603a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f8604b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f8605c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f8606d = -1;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f8607e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f8608f = null;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f8609g = -1;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f8610h = OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public float f8611i = 0.0f;
        /* access modifiers changed from: private */
        public final q j;
        /* access modifiers changed from: private */
        public ArrayList<g> k = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public r f8612l = null;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<a> f8613m = new ArrayList<>();
        /* access modifiers changed from: private */
        public int n = 0;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f8614o = false;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f8615p = -1;
        private int q = 0;

        /* renamed from: r  reason: collision with root package name */
        private int f8616r = 0;

        /* compiled from: MotionScene */
        public static class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            private final b f8617a;

            /* renamed from: b  reason: collision with root package name */
            int f8618b = -1;

            /* renamed from: c  reason: collision with root package name */
            int f8619c = 17;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f8617a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i11 = 0; i11 < indexCount; i11++) {
                    int index = obtainStyledAttributes.getIndex(i11);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f8618b = obtainStyledAttributes.getResourceId(index, this.f8618b);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.f8619c = obtainStyledAttributes.getInt(index, this.f8619c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i11, b bVar) {
                int i12 = this.f8618b;
                View view = motionLayout;
                if (i12 != -1) {
                    view = motionLayout.findViewById(i12);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f8618b);
                    return;
                }
                int c11 = bVar.f8606d;
                int a11 = bVar.f8605c;
                if (c11 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i13 = this.f8619c;
                boolean z11 = false;
                boolean z12 = ((i13 & 1) != 0 && i11 == c11) | ((i13 & 1) != 0 && i11 == c11) | ((i13 & 256) != 0 && i11 == c11) | ((i13 & 16) != 0 && i11 == a11);
                if ((i13 & 4096) != 0 && i11 == a11) {
                    z11 = true;
                }
                if (z12 || z11) {
                    view.setOnClickListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f8617a;
                if (bVar2 == bVar) {
                    return true;
                }
                int a11 = bVar2.f8605c;
                int c11 = this.f8617a.f8606d;
                if (c11 != -1) {
                    int i11 = motionLayout.D;
                    if (i11 == c11 || i11 == a11) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.D != a11) {
                    return true;
                } else {
                    return false;
                }
            }

            public void c(MotionLayout motionLayout) {
                int i11 = this.f8618b;
                if (i11 != -1) {
                    View findViewById = motionLayout.findViewById(i11);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.f8618b);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public void onClick(View view) {
                MotionLayout d11 = this.f8617a.j.f8586a;
                if (d11.w0()) {
                    if (this.f8617a.f8606d == -1) {
                        int currentState = d11.getCurrentState();
                        if (currentState == -1) {
                            d11.K0(this.f8617a.f8605c);
                            return;
                        }
                        b bVar = new b(this.f8617a.j, this.f8617a);
                        int unused = bVar.f8606d = currentState;
                        int unused2 = bVar.f8605c = this.f8617a.f8605c;
                        d11.setTransition(bVar);
                        d11.H0();
                        return;
                    }
                    b bVar2 = this.f8617a.j.f8588c;
                    int i11 = this.f8619c;
                    boolean z11 = false;
                    boolean z12 = ((i11 & 1) == 0 && (i11 & 256) == 0) ? false : true;
                    boolean z13 = ((i11 & 16) == 0 && (i11 & 4096) == 0) ? false : true;
                    if (z12 && z13) {
                        b bVar3 = this.f8617a.j.f8588c;
                        b bVar4 = this.f8617a;
                        if (bVar3 != bVar4) {
                            d11.setTransition(bVar4);
                        }
                        if (d11.getCurrentState() != d11.getEndState() && d11.getProgress() <= 0.5f) {
                            z11 = z12;
                            z13 = false;
                        }
                    } else {
                        z11 = z12;
                    }
                    if (!b(bVar2, d11)) {
                        return;
                    }
                    if (z11 && (this.f8619c & 1) != 0) {
                        d11.setTransition(this.f8617a);
                        d11.H0();
                    } else if (z13 && (this.f8619c & 16) != 0) {
                        d11.setTransition(this.f8617a);
                        d11.J0();
                    } else if (z11 && (this.f8619c & 256) != 0) {
                        d11.setTransition(this.f8617a);
                        d11.setProgress(1.0f);
                    } else if (z13 && (this.f8619c & 4096) != 0) {
                        d11.setTransition(this.f8617a);
                        d11.setProgress(0.0f);
                    }
                }
            }
        }

        b(q qVar, b bVar) {
            this.j = qVar;
            this.f8610h = qVar.f8595l;
            if (bVar != null) {
                this.f8615p = bVar.f8615p;
                this.f8607e = bVar.f8607e;
                this.f8608f = bVar.f8608f;
                this.f8609g = bVar.f8609g;
                this.f8610h = bVar.f8610h;
                this.k = bVar.k;
                this.f8611i = bVar.f8611i;
                this.q = bVar.q;
            }
        }

        private void v(q qVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.f8605c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8605c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        cVar.F(context, this.f8605c);
                        qVar.f8593h.append(this.f8605c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f8605c = qVar.L(context, this.f8605c);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.f8606d = typedArray.getResourceId(index, this.f8606d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f8606d);
                    if ("layout".equals(resourceTypeName2)) {
                        c cVar2 = new c();
                        cVar2.F(context, this.f8606d);
                        qVar.f8593h.append(this.f8606d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f8606d = qVar.L(context, this.f8606d);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f8609g = resourceId;
                        if (resourceId != -1) {
                            this.f8607e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        this.f8608f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f8609g = typedArray.getResourceId(index, -1);
                                this.f8607e = -2;
                            } else {
                                this.f8607e = -1;
                            }
                        }
                    } else {
                        this.f8607e = typedArray.getInteger(index, this.f8607e);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i13 = typedArray.getInt(index, this.f8610h);
                    this.f8610h = i13;
                    if (i13 < 8) {
                        this.f8610h = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.f8611i = typedArray.getFloat(index, this.f8611i);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.n = typedArray.getInteger(index, this.n);
                } else if (index == R.styleable.Transition_android_id) {
                    this.f8603a = typedArray.getResourceId(index, this.f8603a);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.f8614o = typedArray.getBoolean(index, this.f8614o);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.f8615p = typedArray.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.q = typedArray.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.f8616r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f8606d == -1) {
                this.f8604b = true;
            }
        }

        private void w(q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            v(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f8606d;
        }

        public r B() {
            return this.f8612l;
        }

        public boolean C() {
            return !this.f8614o;
        }

        public boolean D(int i11) {
            return (i11 & this.f8616r) != 0;
        }

        public void E(int i11) {
            this.f8610h = Math.max(i11, 8);
        }

        public void F(int i11, String str, int i12) {
            this.f8607e = i11;
            this.f8608f = str;
            this.f8609g = i12;
        }

        public void G(int i11) {
            this.f8615p = i11;
        }

        public void t(g gVar) {
            this.k.add(gVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.f8613m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.n;
        }

        public int y() {
            return this.f8605c;
        }

        public int z() {
            return this.q;
        }

        public b(int i11, q qVar, int i12, int i13) {
            this.f8603a = i11;
            this.j = qVar;
            this.f8606d = i12;
            this.f8605c = i13;
            this.f8610h = qVar.f8595l;
            this.q = qVar.f8596m;
        }

        b(q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f8610h = qVar.f8595l;
            this.q = qVar.f8596m;
            this.j = qVar;
            w(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
