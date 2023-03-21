package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat */
public class e {

    /* compiled from: FontResourcesParserCompat */
    static class a {
        static int a(TypedArray typedArray, int i11) {
            return typedArray.getType(i11);
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f9196a;

        public c(d[] dVarArr) {
            this.f9196a = dVarArr;
        }

        public d[] a() {
            return this.f9196a;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f9197a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9198b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f9199c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9200d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9201e;

        /* renamed from: f  reason: collision with root package name */
        private final int f9202f;

        public d(String str, int i11, boolean z11, String str2, int i12, int i13) {
            this.f9197a = str;
            this.f9198b = i11;
            this.f9199c = z11;
            this.f9200d = str2;
            this.f9201e = i12;
            this.f9202f = i13;
        }

        public String a() {
            return this.f9197a;
        }

        public int b() {
            return this.f9202f;
        }

        public int c() {
            return this.f9201e;
        }

        public String d() {
            return this.f9200d;
        }

        public int e() {
            return this.f9198b;
        }

        public boolean f() {
            return this.f9199c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0038e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f9203a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9204b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9205c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9206d;

        public C0038e(androidx.core.provider.e eVar, int i11, int i12, String str) {
            this.f9203a = eVar;
            this.f9205c = i11;
            this.f9204b = i12;
            this.f9206d = str;
        }

        public int a() {
            return this.f9205c;
        }

        public androidx.core.provider.e b() {
            return this.f9203a;
        }

        public String c() {
            return this.f9206d;
        }

        public int d() {
            return this.f9204b;
        }
    }

    private static int a(TypedArray typedArray, int i11) {
        return a.a(typedArray, i11);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.res.e.b b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.e.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    public static List<List<byte[]>> c(Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < obtainTypedArray.length(); i12++) {
                    int resourceId = obtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i11)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        String string4 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0038e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        int i11 = R.styleable.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i11)) {
            i11 = R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i12 = obtainAttributes.getInt(i11, OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL);
        int i13 = R.styleable.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z11 = 1 == obtainAttributes.getInt(i13, 0);
        int i14 = R.styleable.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = R.styleable.FontFamilyFont_android_ttcIndex;
        }
        int i15 = R.styleable.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i15)) {
            i15 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i15);
        int i16 = obtainAttributes.getInt(i14, 0);
        int i17 = R.styleable.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i17)) {
            i17 = R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i17, 0);
        String string2 = obtainAttributes.getString(i17);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i12, z11, string, i16, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
