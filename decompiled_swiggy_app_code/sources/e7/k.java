package e7;

import com.adobe.xmp.XMPException;
import d7.b;
import d7.c;
import g7.e;

public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private m f14429a;

    /* renamed from: b  reason: collision with root package name */
    private String f14430b;

    static {
        Class<k> cls = k.class;
    }

    public k() {
        this.f14430b = null;
        this.f14429a = new m((String) null, (String) null, (e) null);
    }

    public k(m mVar) {
        this.f14430b = null;
        this.f14429a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r2 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r8.o() <= 1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r8.K(r2);
        r8.a(1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r10 = e7.n.b(r8, r10, r11);
        r0 = ((java.lang.Integer) r10[0]).intValue();
        r10 = (e7.m) r10[1];
        r3 = "x-default".equals(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r0 == 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r0 == 1) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r0 == 2) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r0 == 3) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r0 == 4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        if (r0 != 5) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        e7.n.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (r3 == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        throw new com.adobe.xmp.XMPException("Unexpected result from ChooseLocalizedText", 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        if (r2 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e2, code lost:
        if (r8.o() != 1) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e4, code lost:
        r2.Y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        e7.n.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        e7.n.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        if (r3 == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r9 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r2 == r10) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        if (r2 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        if (r2.y().equals(r10.y()) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        r2.Y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        r10.Y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        if (r3 != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r9 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r2 == r10) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        if (r2 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        if (r2.y().equals(r10.y()) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        r10 = r8.G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r10.hasNext() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        r11 = (e7.m) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (r11 == r2) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        r0 = r11.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        if (r2 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        r3 = r2.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        if (r0.equals(r3) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014a, code lost:
        r11.Y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014e, code lost:
        if (r2 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0150, code lost:
        r2.Y(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0154, code lost:
        e7.n.a(r8, "x-default", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0157, code lost:
        if (r3 != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0159, code lost:
        e7.n.a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r9 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0163, code lost:
        if (r8.o() != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0165, code lost:
        e7.n.a(r8, "x-default", r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O0(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, g7.e r13) throws com.adobe.xmp.XMPException {
        /*
            r7 = this;
            e7.e.e(r8)
            e7.e.a(r9)
            e7.e.f(r11)
            r13 = 0
            if (r10 == 0) goto L_0x0011
            java.lang.String r10 = e7.h.h(r10)
            goto L_0x0012
        L_0x0011:
            r10 = r13
        L_0x0012:
            java.lang.String r11 = e7.h.h(r11)
            f7.b r8 = f7.c.a(r8, r9)
            e7.m r9 = r7.f14429a
            g7.e r0 = new g7.e
            r1 = 7680(0x1e00, float:1.0762E-41)
            r0.<init>(r1)
            r1 = 1
            e7.m r8 = e7.n.g(r9, r8, r1, r0)
            r9 = 102(0x66, float:1.43E-43)
            if (r8 == 0) goto L_0x0169
            g7.e r0 = r8.s()
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r8.z()
            if (r0 != 0) goto L_0x004e
            g7.e r0 = r8.s()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x004e
            g7.e r0 = r8.s()
            r0.t(r1)
            goto L_0x0056
        L_0x004e:
            com.adobe.xmp.XMPException r8 = new com.adobe.xmp.XMPException
            java.lang.String r10 = "Specified property is no alt-text array"
            r8.<init>(r10, r9)
            throw r8
        L_0x0056:
            java.util.Iterator r0 = r8.G()
        L_0x005a:
            boolean r2 = r0.hasNext()
            r3 = 0
            java.lang.String r4 = "x-default"
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            e7.m r2 = (e7.m) r2
            boolean r5 = r2.A()
            if (r5 == 0) goto L_0x008f
            e7.m r5 = r2.u(r1)
            java.lang.String r5 = r5.r()
            java.lang.String r6 = "xml:lang"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x008f
            e7.m r5 = r2.u(r1)
            java.lang.String r5 = r5.y()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005a
            r9 = 1
            goto L_0x0099
        L_0x008f:
            com.adobe.xmp.XMPException r8 = new com.adobe.xmp.XMPException
            java.lang.String r10 = "Language qualifier must be first"
            r8.<init>(r10, r9)
            throw r8
        L_0x0097:
            r2 = r13
            r9 = 0
        L_0x0099:
            if (r2 == 0) goto L_0x00a7
            int r0 = r8.o()
            if (r0 <= r1) goto L_0x00a7
            r8.K(r2)
            r8.a(r1, r2)
        L_0x00a7:
            java.lang.Object[] r10 = e7.n.b(r8, r10, r11)
            r0 = r10[r3]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10 = r10[r1]
            e7.m r10 = (e7.m) r10
            boolean r3 = r4.equals(r11)
            if (r0 == 0) goto L_0x0154
            if (r0 == r1) goto L_0x010e
            r13 = 2
            if (r0 == r13) goto L_0x00f3
            r10 = 3
            if (r0 == r10) goto L_0x00ec
            r10 = 4
            if (r0 == r10) goto L_0x00dc
            r10 = 5
            if (r0 != r10) goto L_0x00d2
            e7.n.a(r8, r11, r12)
            if (r3 == 0) goto L_0x015d
            goto L_0x015c
        L_0x00d2:
            com.adobe.xmp.XMPException r8 = new com.adobe.xmp.XMPException
            r9 = 9
            java.lang.String r10 = "Unexpected result from ChooseLocalizedText"
            r8.<init>(r10, r9)
            throw r8
        L_0x00dc:
            if (r2 == 0) goto L_0x00e7
            int r10 = r8.o()
            if (r10 != r1) goto L_0x00e7
            r2.Y(r12)
        L_0x00e7:
            e7.n.a(r8, r11, r12)
            goto L_0x015d
        L_0x00ec:
            e7.n.a(r8, r11, r12)
            if (r3 == 0) goto L_0x015d
            goto L_0x015c
        L_0x00f3:
            if (r9 == 0) goto L_0x010a
            if (r2 == r10) goto L_0x010a
            if (r2 == 0) goto L_0x010a
            java.lang.String r11 = r2.y()
            java.lang.String r13 = r10.y()
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x010a
        L_0x0107:
            r2.Y(r12)
        L_0x010a:
            r10.Y(r12)
            goto L_0x015d
        L_0x010e:
            if (r3 != 0) goto L_0x0125
            if (r9 == 0) goto L_0x010a
            if (r2 == r10) goto L_0x010a
            if (r2 == 0) goto L_0x010a
            java.lang.String r11 = r2.y()
            java.lang.String r13 = r10.y()
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x010a
            goto L_0x0107
        L_0x0125:
            java.util.Iterator r10 = r8.G()
        L_0x0129:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014e
            java.lang.Object r11 = r10.next()
            e7.m r11 = (e7.m) r11
            if (r11 == r2) goto L_0x0129
            java.lang.String r0 = r11.y()
            if (r2 == 0) goto L_0x0142
            java.lang.String r3 = r2.y()
            goto L_0x0143
        L_0x0142:
            r3 = r13
        L_0x0143:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x014a
            goto L_0x0129
        L_0x014a:
            r11.Y(r12)
            goto L_0x0129
        L_0x014e:
            if (r2 == 0) goto L_0x015d
            r2.Y(r12)
            goto L_0x015d
        L_0x0154:
            e7.n.a(r8, r4, r12)
            if (r3 != 0) goto L_0x015c
            e7.n.a(r8, r11, r12)
        L_0x015c:
            r9 = 1
        L_0x015d:
            if (r9 != 0) goto L_0x0168
            int r9 = r8.o()
            if (r9 != r1) goto L_0x0168
            e7.n.a(r8, r4, r12)
        L_0x0168:
            return
        L_0x0169:
            com.adobe.xmp.XMPException r8 = new com.adobe.xmp.XMPException
            java.lang.String r10 = "Failed to find or create array node"
            r8.<init>(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.k.O0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, g7.e):void");
    }

    public m b() {
        return this.f14429a;
    }

    public void c(String str) {
        this.f14430b = str;
    }

    public Object clone() {
        return new k((m) this.f14429a.clone());
    }

    public b iterator() throws XMPException {
        return t((String) null, (String) null, (g7.b) null);
    }

    public b t(String str, String str2, g7.b bVar) throws XMPException {
        return new j(this, str, str2, bVar);
    }
}
