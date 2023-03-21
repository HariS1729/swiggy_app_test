package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: StateSet */
public class h {

    /* renamed from: a  reason: collision with root package name */
    int f8895a = -1;

    /* renamed from: b  reason: collision with root package name */
    int f8896b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f8897c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<a> f8898d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<c> f8899e = new SparseArray<>();

    /* compiled from: StateSet */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f8900a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f8901b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f8902c = -1;

        /* renamed from: d  reason: collision with root package name */
        boolean f8903d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f8903d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.State_android_id) {
                    this.f8900a = obtainStyledAttributes.getResourceId(index, this.f8900a);
                } else if (index == R.styleable.State_constraints) {
                    this.f8902c = obtainStyledAttributes.getResourceId(index, this.f8902c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8902c);
                    context.getResources().getResourceName(this.f8902c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8903d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f8901b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f8901b.size(); i11++) {
                if (this.f8901b.get(i11).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* compiled from: StateSet */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f8904a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f8905b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f8906c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f8907d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f8908e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f8909f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f8909f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.Variant_constraints) {
                    this.f8908e = obtainStyledAttributes.getResourceId(index, this.f8908e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8908e);
                    context.getResources().getResourceName(this.f8908e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8909f = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f8907d = obtainStyledAttributes.getDimension(index, this.f8907d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f8905b = obtainStyledAttributes.getDimension(index, this.f8905b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f8906c = obtainStyledAttributes.getDimension(index, this.f8906c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f8904a = obtainStyledAttributes.getDimension(index, this.f8904a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f11, float f12) {
            if (!Float.isNaN(this.f8904a) && f11 < this.f8904a) {
                return false;
            }
            if (!Float.isNaN(this.f8905b) && f12 < this.f8905b) {
                return false;
            }
            if (!Float.isNaN(this.f8906c) && f11 > this.f8906c) {
                return false;
            }
            if (Float.isNaN(this.f8907d) || f12 <= this.f8907d) {
                return true;
            }
            return false;
        }
    }

    public h(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = 0
        L_0x0010:
            if (r3 >= r1) goto L_0x0025
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r4 != r5) goto L_0x0022
            int r5 = r9.f8895a
            int r4 = r0.getResourceId(r4, r5)
            r9.f8895a = r4
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x002d:
            r3 = 1
            if (r1 == r3) goto L_0x00a7
            if (r1 == 0) goto L_0x0096
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L_0x0046
            if (r1 == r5) goto L_0x003b
            goto L_0x0099
        L_0x003b:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            boolean r1 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0099
            return
        L_0x0046:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7 = -1
            int r8 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            switch(r8) {
                case 80204913: goto L_0x006e;
                case 1301459538: goto L_0x0064;
                case 1382829617: goto L_0x005d;
                case 1901439077: goto L_0x0053;
                default: goto L_0x0052;
            }     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0052:
            goto L_0x0078
        L_0x0053:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 3
            goto L_0x0079
        L_0x005d:
            boolean r1 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0064:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 0
            goto L_0x0079
        L_0x006e:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 2
            goto L_0x0079
        L_0x0078:
            r3 = -1
        L_0x0079:
            if (r3 == r6) goto L_0x0089
            if (r3 == r5) goto L_0x007e
            goto L_0x0099
        L_0x007e:
            androidx.constraintlayout.widget.h$b r1 = new androidx.constraintlayout.widget.h$b     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r0 == 0) goto L_0x0099
            r0.a(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0089:
            androidx.constraintlayout.widget.h$a r0 = new androidx.constraintlayout.widget.h$a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r0.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            android.util.SparseArray<androidx.constraintlayout.widget.h$a> r1 = r9.f8898d     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            int r3 = r0.f8900a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.put(r3, r0)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0096:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0099:
            int r1 = r11.next()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x002d
        L_0x009e:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00a7
        L_0x00a3:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.h.b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int a(int i11, int i12, float f11, float f12) {
        a aVar = this.f8898d.get(i12);
        if (aVar == null) {
            return i12;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            b bVar = null;
            Iterator<b> it2 = aVar.f8901b.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next.a(f11, f12)) {
                    if (i11 == next.f8908e) {
                        return i11;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f8908e;
            }
            return aVar.f8902c;
        } else if (aVar.f8902c == i11) {
            return i11;
        } else {
            Iterator<b> it3 = aVar.f8901b.iterator();
            while (it3.hasNext()) {
                if (i11 == it3.next().f8908e) {
                    return i11;
                }
            }
            return aVar.f8902c;
        }
    }

    public int c(int i11, int i12, int i13) {
        return d(-1, i11, (float) i12, (float) i13);
    }

    public int d(int i11, int i12, float f11, float f12) {
        a aVar;
        int b11;
        if (i11 == i12) {
            if (i12 == -1) {
                aVar = this.f8898d.valueAt(0);
            } else {
                aVar = this.f8898d.get(this.f8896b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f8897c == -1 || !aVar.f8901b.get(i11).a(f11, f12)) && i11 != (b11 = aVar.b(f11, f12))) {
                return b11 == -1 ? aVar.f8902c : aVar.f8901b.get(b11).f8908e;
            }
            return i11;
        }
        a aVar2 = this.f8898d.get(i12);
        if (aVar2 == null) {
            return -1;
        }
        int b12 = aVar2.b(f11, f12);
        return b12 == -1 ? aVar2.f8902c : aVar2.f8901b.get(b12).f8908e;
    }
}
