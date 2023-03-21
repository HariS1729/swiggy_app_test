package e7;

import com.adobe.xmp.XMPException;
import d7.a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class c {
    public static a a(String str) throws XMPException {
        return b(str, new i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0222 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d7.a b(java.lang.String r12, d7.a r13) throws com.adobe.xmp.XMPException {
        /*
            if (r12 == 0) goto L_0x022b
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0009
            return r13
        L_0x0009:
            e7.g r0 = new e7.g
            r0.<init>(r12)
            r12 = 0
            char r1 = r0.b(r12)
            r2 = 45
            if (r1 != r2) goto L_0x001a
            r0.f()
        L_0x001a:
            r1 = 9999(0x270f, float:1.4012E-41)
            java.lang.String r3 = "Invalid year in date string"
            int r1 = r0.c(r3, r1)
            boolean r3 = r0.d()
            r4 = 5
            if (r3 == 0) goto L_0x0038
            char r3 = r0.a()
            if (r3 != r2) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after year"
            r12.<init>(r13, r4)
            throw r12
        L_0x0038:
            char r3 = r0.b(r12)
            if (r3 != r2) goto L_0x003f
            int r1 = -r1
        L_0x003f:
            r13.X0(r1)
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x0049
            return r13
        L_0x0049:
            r0.f()
            r1 = 12
            java.lang.String r3 = "Invalid month in date string"
            int r1 = r0.c(r3, r1)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0069
            char r3 = r0.a()
            if (r3 != r2) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after month"
            r12.<init>(r13, r4)
            throw r12
        L_0x0069:
            r13.N0(r1)
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x0073
            return r13
        L_0x0073:
            r0.f()
            r1 = 31
            java.lang.String r3 = "Invalid day in date string"
            int r1 = r0.c(r3, r1)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0095
            char r3 = r0.a()
            r5 = 84
            if (r3 != r5) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after day"
            r12.<init>(r13, r4)
            throw r12
        L_0x0095:
            r13.P(r1)
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x009f
            return r13
        L_0x009f:
            r0.f()
            java.lang.String r1 = "Invalid hour in date string"
            r3 = 23
            int r1 = r0.c(r1, r3)
            r13.S0(r1)
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x00b4
            return r13
        L_0x00b4:
            char r1 = r0.a()
            r5 = 59
            r6 = 58
            r7 = 43
            r8 = 90
            if (r1 != r6) goto L_0x00f5
            r0.f()
            java.lang.String r1 = "Invalid minute in date string"
            int r1 = r0.c(r1, r5)
            boolean r9 = r0.d()
            if (r9 == 0) goto L_0x00f2
            char r9 = r0.a()
            if (r9 == r6) goto L_0x00f2
            char r9 = r0.a()
            if (r9 == r8) goto L_0x00f2
            char r9 = r0.a()
            if (r9 == r7) goto L_0x00f2
            char r9 = r0.a()
            if (r9 != r2) goto L_0x00ea
            goto L_0x00f2
        L_0x00ea:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after minute"
            r12.<init>(r13, r4)
            throw r12
        L_0x00f2:
            r13.U0(r1)
        L_0x00f5:
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x00fc
            return r13
        L_0x00fc:
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x018d
            char r1 = r0.a()
            if (r1 != r6) goto L_0x018d
            r0.f()
            java.lang.String r1 = "Invalid whole seconds in date string"
            int r1 = r0.c(r1, r5)
            boolean r9 = r0.d()
            r10 = 46
            if (r9 == 0) goto L_0x013a
            char r9 = r0.a()
            if (r9 == r10) goto L_0x013a
            char r9 = r0.a()
            if (r9 == r8) goto L_0x013a
            char r9 = r0.a()
            if (r9 == r7) goto L_0x013a
            char r9 = r0.a()
            if (r9 != r2) goto L_0x0132
            goto L_0x013a
        L_0x0132:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after whole seconds"
            r12.<init>(r13, r4)
            throw r12
        L_0x013a:
            r13.h1(r1)
            char r1 = r0.a()
            if (r1 != r10) goto L_0x01a8
            r0.f()
            int r1 = r0.e()
            r9 = 999999999(0x3b9ac9ff, float:0.004723787)
            java.lang.String r10 = "Invalid fractional seconds in date string"
            int r9 = r0.c(r10, r9)
            boolean r10 = r0.d()
            if (r10 == 0) goto L_0x0174
            char r10 = r0.a()
            if (r10 == r8) goto L_0x0174
            char r10 = r0.a()
            if (r10 == r7) goto L_0x0174
            char r10 = r0.a()
            if (r10 != r2) goto L_0x016c
            goto L_0x0174
        L_0x016c:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after fractional second"
            r12.<init>(r13, r4)
            throw r12
        L_0x0174:
            int r10 = r0.e()
            int r10 = r10 - r1
        L_0x0179:
            r1 = 9
            if (r10 <= r1) goto L_0x0182
            int r9 = r9 / 10
            int r10 = r10 + -1
            goto L_0x0179
        L_0x0182:
            if (r10 >= r1) goto L_0x0189
            int r9 = r9 * 10
            int r10 = r10 + 1
            goto L_0x0182
        L_0x0189:
            r13.x0(r9)
            goto L_0x01a8
        L_0x018d:
            char r1 = r0.a()
            if (r1 == r8) goto L_0x01a8
            char r1 = r0.a()
            if (r1 == r7) goto L_0x01a8
            char r1 = r0.a()
            if (r1 != r2) goto L_0x01a0
            goto L_0x01a8
        L_0x01a0:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after time"
            r12.<init>(r13, r4)
            throw r12
        L_0x01a8:
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x01af
            return r13
        L_0x01af:
            char r1 = r0.a()
            if (r1 != r8) goto L_0x01b9
            r0.f()
            goto L_0x0205
        L_0x01b9:
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x0205
            char r1 = r0.a()
            if (r1 != r7) goto L_0x01c7
            r1 = 1
            goto L_0x01ce
        L_0x01c7:
            char r1 = r0.a()
            if (r1 != r2) goto L_0x01fd
            r1 = -1
        L_0x01ce:
            r0.f()
            java.lang.String r2 = "Invalid time zone hour in date string"
            int r2 = r0.c(r2, r3)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x01f9
            char r12 = r0.a()
            if (r12 != r6) goto L_0x01f1
            r0.f()
            java.lang.String r12 = "Invalid time zone minute in date string"
            int r12 = r0.c(r12, r5)
            r11 = r1
            r1 = r12
            r12 = r2
            r2 = r11
            goto L_0x0207
        L_0x01f1:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, after time zone hour"
            r12.<init>(r13, r4)
            throw r12
        L_0x01f9:
            r12 = r2
            r2 = r1
            r1 = 0
            goto L_0x0207
        L_0x01fd:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Time zone must begin with 'Z', '+', or '-'"
            r12.<init>(r13, r4)
            throw r12
        L_0x0205:
            r1 = 0
            r2 = 0
        L_0x0207:
            int r12 = r12 * 3600
            int r12 = r12 * 1000
            int r1 = r1 * 60
            int r1 = r1 * 1000
            int r12 = r12 + r1
            int r12 = r12 * r2
            java.util.SimpleTimeZone r1 = new java.util.SimpleTimeZone
            java.lang.String r2 = ""
            r1.<init>(r12, r2)
            r13.e1(r1)
            boolean r12 = r0.d()
            if (r12 != 0) goto L_0x0223
            return r13
        L_0x0223:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            java.lang.String r13 = "Invalid date string, extra chars at end"
            r12.<init>(r13, r4)
            throw r12
        L_0x022b:
            com.adobe.xmp.XMPException r12 = new com.adobe.xmp.XMPException
            r13 = 4
            java.lang.String r0 = "Parameter must not be null"
            r12.<init>(r0, r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.b(java.lang.String, d7.a):d7.a");
    }

    public static String c(a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (aVar.H()) {
            DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
            stringBuffer.append(decimalFormat.format((long) aVar.getYear()));
            if (aVar.getMonth() == 0) {
                return stringBuffer.toString();
            }
            decimalFormat.applyPattern("'-'00");
            stringBuffer.append(decimalFormat.format((long) aVar.getMonth()));
            if (aVar.getDay() == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(decimalFormat.format((long) aVar.getDay()));
            if (aVar.D()) {
                stringBuffer.append('T');
                decimalFormat.applyPattern("00");
                stringBuffer.append(decimalFormat.format((long) aVar.e0()));
                stringBuffer.append(':');
                stringBuffer.append(decimalFormat.format((long) aVar.Y0()));
                if (!(aVar.H0() == 0 && aVar.M() == 0)) {
                    decimalFormat.applyPattern(":00.#########");
                    stringBuffer.append(decimalFormat.format(((double) aVar.H0()) + (((double) aVar.M()) / 1.0E9d)));
                }
                if (aVar.hasTimeZone()) {
                    int offset = aVar.getTimeZone().getOffset(aVar.q0().getTimeInMillis());
                    if (offset == 0) {
                        stringBuffer.append('Z');
                    } else {
                        int i11 = offset / 3600000;
                        int abs = Math.abs((offset % 3600000) / BackgroundRequestStrategy.IMMEDIATE_THRESHOLD);
                        decimalFormat.applyPattern("+00;-00");
                        stringBuffer.append(decimalFormat.format((long) i11));
                        decimalFormat.applyPattern(":00");
                        stringBuffer.append(decimalFormat.format((long) abs));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
