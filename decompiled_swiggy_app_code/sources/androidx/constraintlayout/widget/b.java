package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintLayoutStates */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f8776a;

    /* renamed from: b  reason: collision with root package name */
    c f8777b;

    /* renamed from: c  reason: collision with root package name */
    int f8778c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f8779d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f8780e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<c> f8781f = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f8782a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<C0028b> f8783b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f8784c = -1;

        /* renamed from: d  reason: collision with root package name */
        c f8785d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.State_android_id) {
                    this.f8782a = obtainStyledAttributes.getResourceId(index, this.f8782a);
                } else if (index == R.styleable.State_constraints) {
                    this.f8784c = obtainStyledAttributes.getResourceId(index, this.f8784c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8784c);
                    context.getResources().getResourceName(this.f8784c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f8785d = cVar;
                        cVar.o(context, this.f8784c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(C0028b bVar) {
            this.f8783b.add(bVar);
        }

        public int b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f8783b.size(); i11++) {
                if (this.f8783b.get(i11).a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ConstraintLayoutStates */
    static class C0028b {

        /* renamed from: a  reason: collision with root package name */
        float f8786a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f8787b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f8788c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f8789d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f8790e = -1;

        /* renamed from: f  reason: collision with root package name */
        c f8791f;

        public C0028b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.Variant_constraints) {
                    this.f8790e = obtainStyledAttributes.getResourceId(index, this.f8790e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8790e);
                    context.getResources().getResourceName(this.f8790e);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f8791f = cVar;
                        cVar.o(context, this.f8790e);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f8789d = obtainStyledAttributes.getDimension(index, this.f8789d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f8787b = obtainStyledAttributes.getDimension(index, this.f8787b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f8788c = obtainStyledAttributes.getDimension(index, this.f8788c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f8786a = obtainStyledAttributes.getDimension(index, this.f8786a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f11, float f12) {
            if (!Float.isNaN(this.f8786a) && f11 < this.f8786a) {
                return false;
            }
            if (!Float.isNaN(this.f8787b) && f12 < this.f8787b) {
                return false;
            }
            if (!Float.isNaN(this.f8788c) && f11 > this.f8788c) {
                return false;
            }
            if (Float.isNaN(this.f8789d) || f12 <= this.f8789d) {
                return true;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i11) {
        this.f8776a = constraintLayout;
        a(context, i11);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 3
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 4
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.b$b r1 = new androidx.constraintlayout.widget.b$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r1 = r8.f8780e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f8782a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i11;
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i12 = 0;
        while (i12 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i12);
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            if (attributeName == null || attributeValue == null || !DistributedTracing.NR_ID_ATTRIBUTE.equals(attributeName)) {
                i12++;
            } else {
                if (attributeValue.contains("/")) {
                    i11 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), DistributedTracing.NR_ID_ATTRIBUTE, context.getPackageName());
                } else {
                    i11 = -1;
                }
                if (i11 == -1) {
                    if (attributeValue.length() > 1) {
                        i11 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.G(context, xmlPullParser);
                this.f8781f.put(i11, cVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }

    public void d(int i11, float f11, float f12) {
        c cVar;
        a aVar;
        int b11;
        c cVar2;
        int i12 = this.f8778c;
        if (i12 == i11) {
            if (i11 == -1) {
                aVar = this.f8780e.valueAt(0);
            } else {
                aVar = this.f8780e.get(i12);
            }
            int i13 = this.f8779d;
            if ((i13 == -1 || !aVar.f8783b.get(i13).a(f11, f12)) && this.f8779d != (b11 = aVar.b(f11, f12))) {
                if (b11 == -1) {
                    cVar2 = this.f8777b;
                } else {
                    cVar2 = aVar.f8783b.get(b11).f8791f;
                }
                if (b11 != -1) {
                    int i14 = aVar.f8783b.get(b11).f8790e;
                }
                if (cVar2 != null) {
                    this.f8779d = b11;
                    cVar2.i(this.f8776a);
                    return;
                }
                return;
            }
            return;
        }
        this.f8778c = i11;
        a aVar2 = this.f8780e.get(i11);
        int b12 = aVar2.b(f11, f12);
        if (b12 == -1) {
            cVar = aVar2.f8785d;
        } else {
            cVar = aVar2.f8783b.get(b12).f8791f;
        }
        if (b12 != -1) {
            int i15 = aVar2.f8783b.get(b12).f8790e;
        }
        if (cVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i11 + ", dim =" + f11 + ", " + f12);
            return;
        }
        this.f8779d = b12;
        cVar.i(this.f8776a);
    }
}
