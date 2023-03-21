package in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer;

/* compiled from: GooglePlaceTransformer.kt */
public abstract class GooglePlaceTransformer {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017a, code lost:
        if (os.d0.g(r9) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018f, code lost:
        if (os.d0.g(r9) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019c, code lost:
        if (os.d0.g(r9) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019e, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015e, code lost:
        if (os.d0.g(r9) != false) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void process(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace r19) {
        /*
            r18 = this;
            java.lang.String r0 = "googlePlace"
            r1 = r19
            kotlin.jvm.internal.p.j(r1, r0)
            java.lang.String r0 = r19.getFormattedAddress()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = ""
        L_0x000f:
            java.util.List r1 = r19.getAddressComponents()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0021
            r5 = r0
            r0 = r4
            r6 = r0
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            goto L_0x0105
        L_0x0021:
            java.util.Iterator r1 = r1.iterator()
            r5 = r0
            r0 = r4
            r6 = r0
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x002c:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0105
            java.lang.Object r11 = r1.next()
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceAddress r11 = (in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceAddress) r11
            java.util.List r12 = r11.getTypes()
            if (r12 != 0) goto L_0x003f
            goto L_0x002c
        L_0x003f:
            java.lang.String r13 = "locality"
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x004a
            r11.getShortName()
        L_0x004a:
            java.lang.String r13 = "sublocality_level_1"
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x005a
            java.lang.String r10 = r11.getShortName()
            java.lang.String r8 = r11.getShortName()
        L_0x005a:
            r13 = r8
            java.lang.String r8 = "sublocality_level_2"
            boolean r8 = r12.contains(r8)
            if (r8 == 0) goto L_0x0071
            boolean r7 = os.d0.e(r10)
            if (r7 == 0) goto L_0x006d
            java.lang.String r10 = r11.getShortName()
        L_0x006d:
            java.lang.String r7 = r11.getShortName()
        L_0x0071:
            java.lang.String r8 = "sublocality_level_3"
            boolean r8 = r12.contains(r8)
            if (r8 == 0) goto L_0x008d
            boolean r8 = os.d0.e(r7)
            if (r8 == 0) goto L_0x008d
            boolean r7 = os.d0.e(r10)
            if (r7 == 0) goto L_0x0089
            java.lang.String r10 = r11.getShortName()
        L_0x0089:
            java.lang.String r7 = r11.getShortName()
        L_0x008d:
            r14 = r7
            java.lang.String r7 = "neighborhood"
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x009e
            java.lang.String r7 = r11.getShortName()
            r16 = r7
            r15 = r9
            goto L_0x00af
        L_0x009e:
            java.lang.String r7 = "route"
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x00ac
            java.lang.String r7 = r11.getShortName()
            r15 = r7
            goto L_0x00ad
        L_0x00ac:
            r15 = r9
        L_0x00ad:
            r16 = r10
        L_0x00af:
            java.lang.String r7 = "establishment"
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = r11.getShortName()
        L_0x00bb:
            java.lang.String r7 = "premise"
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x00c7
            java.lang.String r6 = r11.getLongName()
        L_0x00c7:
            r17 = r6
            java.lang.String r6 = "street_number"
            boolean r6 = r12.contains(r6)
            if (r6 == 0) goto L_0x00fc
            java.lang.String r6 = r11.getShortName()
            if (r6 == 0) goto L_0x00fc
            if (r5 == 0) goto L_0x00e2
            int r6 = r5.length()
            if (r6 != 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r6 = 0
            goto L_0x00e3
        L_0x00e2:
            r6 = 1
        L_0x00e3:
            if (r6 != 0) goto L_0x00fc
            if (r5 != 0) goto L_0x00e9
            r5 = r4
            goto L_0x00fc
        L_0x00e9:
            java.lang.String r6 = r11.getShortName()
            java.lang.String r7 = ", "
            java.lang.String r6 = kotlin.jvm.internal.p.s(r6, r7)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r7 = ""
            java.lang.String r5 = kotlin.text.o.H(r5, r6, r7, r8, r9, r10)
        L_0x00fc:
            r8 = r13
            r7 = r14
            r9 = r15
            r10 = r16
            r6 = r17
            goto L_0x002c
        L_0x0105:
            boolean r1 = os.d0.g(r0)
            if (r1 == 0) goto L_0x010d
            r1 = r0
            goto L_0x012e
        L_0x010d:
            boolean r1 = os.d0.g(r6)
            if (r1 == 0) goto L_0x0115
            r1 = r6
            goto L_0x012e
        L_0x0115:
            boolean r1 = os.d0.g(r7)
            if (r1 == 0) goto L_0x011d
            r1 = r7
            goto L_0x012e
        L_0x011d:
            boolean r1 = os.d0.g(r8)
            if (r1 == 0) goto L_0x0125
            r1 = r8
            goto L_0x012e
        L_0x0125:
            boolean r1 = os.d0.g(r9)
            if (r1 == 0) goto L_0x012d
            r1 = r9
            goto L_0x012e
        L_0x012d:
            r1 = r4
        L_0x012e:
            if (r1 == 0) goto L_0x013f
            int r11 = r1.length()
            if (r11 <= 0) goto L_0x0138
            r11 = 1
            goto L_0x0139
        L_0x0138:
            r11 = 0
        L_0x0139:
            if (r11 == 0) goto L_0x013f
            r11 = 2
            boolean unused = kotlin.text.StringsKt__StringsKt.S(r5, r1, r3, r11, r4)
        L_0x013f:
            boolean r0 = os.d0.g(r0)
            if (r0 == 0) goto L_0x0161
            boolean r0 = os.d0.g(r6)
            if (r0 == 0) goto L_0x014c
            goto L_0x01a1
        L_0x014c:
            boolean r0 = os.d0.g(r7)
            if (r0 == 0) goto L_0x0153
            goto L_0x016d
        L_0x0153:
            boolean r0 = os.d0.g(r8)
            if (r0 == 0) goto L_0x015a
            goto L_0x0189
        L_0x015a:
            boolean r0 = os.d0.g(r9)
            if (r0 == 0) goto L_0x01a0
            goto L_0x019e
        L_0x0161:
            boolean r0 = os.d0.g(r6)
            if (r0 == 0) goto L_0x017d
            boolean r0 = os.d0.g(r7)
            if (r0 == 0) goto L_0x016f
        L_0x016d:
            r6 = r7
            goto L_0x01a1
        L_0x016f:
            boolean r0 = os.d0.g(r8)
            if (r0 == 0) goto L_0x0176
            goto L_0x0189
        L_0x0176:
            boolean r0 = os.d0.g(r9)
            if (r0 == 0) goto L_0x01a0
            goto L_0x019e
        L_0x017d:
            boolean r0 = os.d0.g(r7)
            if (r0 == 0) goto L_0x0192
            boolean r0 = os.d0.g(r8)
            if (r0 == 0) goto L_0x018b
        L_0x0189:
            r6 = r8
            goto L_0x01a1
        L_0x018b:
            boolean r0 = os.d0.g(r9)
            if (r0 == 0) goto L_0x01a0
            goto L_0x019e
        L_0x0192:
            boolean r0 = os.d0.g(r8)
            if (r0 == 0) goto L_0x01a0
            boolean r0 = os.d0.g(r9)
            if (r0 == 0) goto L_0x01a0
        L_0x019e:
            r6 = r9
            goto L_0x01a1
        L_0x01a0:
            r6 = r10
        L_0x01a1:
            if (r6 == 0) goto L_0x01c3
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.i1(r6)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01b2
            goto L_0x01b3
        L_0x01b2:
            r2 = 0
        L_0x01b3:
            if (r2 == 0) goto L_0x01c3
            java.lang.String r0 = r6.toLowerCase()
            java.lang.String r1 = "this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.p.i(r0, r1)
            java.lang.String r1 = "na"
            kotlin.jvm.internal.p.e(r1, r0)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer.GooglePlaceTransformer.process(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace):void");
    }
}
