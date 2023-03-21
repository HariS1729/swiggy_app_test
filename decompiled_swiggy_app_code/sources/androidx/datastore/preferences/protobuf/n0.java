package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: MessageSchema */
final class n0<T> implements y0<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f10076r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f10077s = i1.B();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f10078a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f10079b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10080c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10081d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f10082e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10083f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10084g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10085h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10086i;
    private final int[] j;
    private final int k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10087l;

    /* renamed from: m  reason: collision with root package name */
    private final p0 f10088m;
    private final b0 n;

    /* renamed from: o  reason: collision with root package name */
    private final e1<?, ?> f10089o;

    /* renamed from: p  reason: collision with root package name */
    private final o<?> f10090p;
    private final f0 q;

    private n0(int[] iArr, Object[] objArr, int i11, int i12, k0 k0Var, boolean z11, boolean z12, int[] iArr2, int i13, int i14, p0 p0Var, b0 b0Var, e1<?, ?> e1Var, o<?> oVar, f0 f0Var) {
        this.f10078a = iArr;
        this.f10079b = objArr;
        this.f10080c = i11;
        this.f10081d = i12;
        this.f10084g = k0Var instanceof GeneratedMessageLite;
        this.f10085h = z11;
        this.f10083f = oVar != null && oVar.e(k0Var);
        this.f10086i = z12;
        this.j = iArr2;
        this.k = i13;
        this.f10087l = i14;
        this.f10088m = p0Var;
        this.n = b0Var;
        this.f10089o = e1Var;
        this.f10090p = oVar;
        this.f10082e = k0Var;
        this.q = f0Var;
    }

    private static <T> long A(T t, long j11) {
        return i1.y(t, j11);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.s.b<ET>> void B(androidx.datastore.preferences.protobuf.e1<UT, UB> r17, androidx.datastore.preferences.protobuf.o<ET> r18, T r19, androidx.datastore.preferences.protobuf.x0 r20, androidx.datastore.preferences.protobuf.n r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.getFieldNumber()     // Catch:{ all -> 0x0612 }
            int r3 = r8.Q(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.k
        L_0x001e:
            int r1 = r8.f10087l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.g(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f10083f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            androidx.datastore.preferences.protobuf.k0 r2 = r8.f10082e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            androidx.datastore.preferences.protobuf.s r1 = r18.d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.skipField()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.k
        L_0x0079:
            int r1 = r8.f10087l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.g(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.b0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = a0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            switch(r2) {
                case 0: goto L_0x059d;
                case 1: goto L_0x058d;
                case 2: goto L_0x057d;
                case 3: goto L_0x056d;
                case 4: goto L_0x055d;
                case 5: goto L_0x054d;
                case 6: goto L_0x053d;
                case 7: goto L_0x052d;
                case 8: goto L_0x0525;
                case 9: goto L_0x04ee;
                case 10: goto L_0x04de;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049b;
                case 14: goto L_0x048b;
                case 15: goto L_0x047b;
                case 16: goto L_0x046b;
                case 17: goto L_0x0434;
                case 18: goto L_0x0425;
                case 19: goto L_0x0416;
                case 20: goto L_0x0407;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03da;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bc;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0396;
                case 29: goto L_0x0387;
                case 30: goto L_0x0370;
                case 31: goto L_0x0361;
                case 32: goto L_0x0352;
                case 33: goto L_0x0343;
                case 34: goto L_0x0334;
                case 35: goto L_0x0325;
                case 36: goto L_0x0316;
                case 37: goto L_0x0307;
                case 38: goto L_0x02f8;
                case 39: goto L_0x02e9;
                case 40: goto L_0x02da;
                case 41: goto L_0x02cb;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0296;
                case 45: goto L_0x0287;
                case 46: goto L_0x0278;
                case 47: goto L_0x0269;
                case 48: goto L_0x025a;
                case 49: goto L_0x0244;
                case 50: goto L_0x0233;
                case 51: goto L_0x021f;
                case 52: goto L_0x020b;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e3;
                case 55: goto L_0x01cf;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a7;
                case 58: goto L_0x0193;
                case 59: goto L_0x018b;
                case 60: goto L_0x0152;
                case 61: goto L_0x0142;
                case 62: goto L_0x012e;
                case 63: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00df;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x009b:
            if (r13 != 0) goto L_0x05ae
            java.lang.Object r1 = r17.n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.readSInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.readSInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.readSFixed64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.readSFixed32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.readEnum()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.w$e r5 = r8.j(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.isInRange(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.a1.L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.readUInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.ByteString r2 = r20.readBytes()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.x(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.i1.A(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r5 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.c(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.w.h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.c(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.U(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.readBool()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.readFixed32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.readFixed64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.readInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.readUInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.readInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.Y(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.k(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.C(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r6 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.S(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSFixed64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSFixed32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            androidx.datastore.preferences.protobuf.b0 r2 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readEnumList(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.w$e r3 = r8.j(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.a1.A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readUInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readBoolList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFixed32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFixed64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readUInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFloatList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readDoubleList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSFixed64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readSFixed32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            androidx.datastore.preferences.protobuf.b0 r2 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readEnumList(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.w$e r3 = r8.j(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.a1.A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readUInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readBytesList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            androidx.datastore.preferences.protobuf.y0 r5 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.T(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.V(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readBoolList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFixed32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFixed64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readInt32List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readUInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readInt64List(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readFloatList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            androidx.datastore.preferences.protobuf.b0 r1 = r8.n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.readDoubleList(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.r(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.i1.A(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.w.h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r4 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.a(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.readSInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.readSInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.readSFixed64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.readSFixed32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.readEnum()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.w$e r5 = r8.j(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.isInRange(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.a1.L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.readUInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.ByteString r4 = r20.readBytes()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.r(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.i1.A(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r2 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.c(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.w.h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.y0 r4 = r8.l(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.c(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.U(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.readBool()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.E(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.readFixed32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.readFixed64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.readInt32()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.readUInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.readInt64()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.L(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = K(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            androidx.datastore.preferences.protobuf.i1.K(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.X(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x05b6:
            int r1 = r8.f10087l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.g(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.skipField()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x05d9:
            int r1 = r8.f10087l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.g(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x05fd:
            int r1 = r8.f10087l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.g(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.k
        L_0x0615:
            int r2 = r8.f10087l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.j
            r2 = r2[r1]
            java.lang.Object r13 = r8.g(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.B(androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.x0, androidx.datastore.preferences.protobuf.n):void");
    }

    private final <K, V> void C(Object obj, int i11, Object obj2, n nVar, x0 x0Var) throws IOException {
        long K = K(b0(i11));
        Object A = i1.A(obj, K);
        if (A == null) {
            A = this.q.newMapField(obj2);
            i1.O(obj, K, A);
        } else if (this.q.isImmutable(A)) {
            Object newMapField = this.q.newMapField(obj2);
            this.q.mergeFrom(newMapField, A);
            i1.O(obj, K, newMapField);
            A = newMapField;
        }
        x0Var.f(this.q.forMutableMapData(A), this.q.forMapMetadata(obj2), nVar);
    }

    private void D(T t, T t11, int i11) {
        long K = K(b0(i11));
        if (r(t11, i11)) {
            Object A = i1.A(t, K);
            Object A2 = i1.A(t11, K);
            if (A != null && A2 != null) {
                i1.O(t, K, w.h(A, A2));
                X(t, i11);
            } else if (A2 != null) {
                i1.O(t, K, A2);
                X(t, i11);
            }
        }
    }

    private void E(T t, T t11, int i11) {
        int b02 = b0(i11);
        int J = J(i11);
        long K = K(b02);
        if (x(t11, J, i11)) {
            Object A = i1.A(t, K);
            Object A2 = i1.A(t11, K);
            if (A != null && A2 != null) {
                i1.O(t, K, w.h(A, A2));
                Y(t, J, i11);
            } else if (A2 != null) {
                i1.O(t, K, A2);
                Y(t, J, i11);
            }
        }
    }

    private void F(T t, T t11, int i11) {
        int b02 = b0(i11);
        long K = K(b02);
        int J = J(i11);
        switch (a0(b02)) {
            case 0:
                if (r(t11, i11)) {
                    i1.K(t, K, i1.v(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 1:
                if (r(t11, i11)) {
                    i1.L(t, K, i1.w(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 2:
                if (r(t11, i11)) {
                    i1.N(t, K, i1.y(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 3:
                if (r(t11, i11)) {
                    i1.N(t, K, i1.y(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 4:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 5:
                if (r(t11, i11)) {
                    i1.N(t, K, i1.y(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 6:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 7:
                if (r(t11, i11)) {
                    i1.E(t, K, i1.p(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 8:
                if (r(t11, i11)) {
                    i1.O(t, K, i1.A(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 9:
                D(t, t11, i11);
                return;
            case 10:
                if (r(t11, i11)) {
                    i1.O(t, K, i1.A(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 11:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 12:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 13:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 14:
                if (r(t11, i11)) {
                    i1.N(t, K, i1.y(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 15:
                if (r(t11, i11)) {
                    i1.M(t, K, i1.x(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 16:
                if (r(t11, i11)) {
                    i1.N(t, K, i1.y(t11, K));
                    X(t, i11);
                    return;
                }
                return;
            case 17:
                D(t, t11, i11);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.d(t, t11, K);
                return;
            case 50:
                a1.F(this.q, t, t11, K);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (x(t11, J, i11)) {
                    i1.O(t, K, i1.A(t11, K));
                    Y(t, J, i11);
                    return;
                }
                return;
            case 60:
                E(t, t11, i11);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (x(t11, J, i11)) {
                    i1.O(t, K, i1.A(t11, K));
                    Y(t, J, i11);
                    return;
                }
                return;
            case 68:
                E(t, t11, i11);
                return;
            default:
                return;
        }
    }

    static <T> n0<T> G(Class<T> cls, i0 i0Var, p0 p0Var, b0 b0Var, e1<?, ?> e1Var, o<?> oVar, f0 f0Var) {
        if (i0Var instanceof w0) {
            return I((w0) i0Var, p0Var, b0Var, e1Var, oVar, f0Var);
        }
        return H((c1) i0Var, p0Var, b0Var, e1Var, oVar, f0Var);
    }

    static <T> n0<T> H(c1 c1Var, p0 p0Var, b0 b0Var, e1<?, ?> e1Var, o<?> oVar, f0 f0Var) {
        boolean z11 = c1Var.getSyntax() == ProtoSyntax.PROTO3;
        r[] b11 = c1Var.b();
        if (b11.length == 0) {
            int length = b11.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (b11.length <= 0) {
                int[] a11 = c1Var.a();
                if (a11 == null) {
                    a11 = f10076r;
                }
                if (b11.length <= 0) {
                    int[] iArr2 = f10076r;
                    int[] iArr3 = f10076r;
                    int[] iArr4 = new int[(a11.length + iArr2.length + iArr3.length)];
                    System.arraycopy(a11, 0, iArr4, 0, a11.length);
                    System.arraycopy(iArr2, 0, iArr4, a11.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, a11.length + iArr2.length, iArr3.length);
                    return new n0(iArr, objArr, 0, 0, c1Var.getDefaultInstance(), z11, true, iArr4, a11.length, a11.length + iArr2.length, p0Var, b0Var, e1Var, oVar, f0Var);
                }
                r rVar = b11[0];
                throw null;
            }
            r rVar2 = b11[0];
            throw null;
        }
        r rVar3 = b11[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> androidx.datastore.preferences.protobuf.n0<T> I(androidx.datastore.preferences.protobuf.w0 r36, androidx.datastore.preferences.protobuf.p0 r37, androidx.datastore.preferences.protobuf.b0 r38, androidx.datastore.preferences.protobuf.e1<?, ?> r39, androidx.datastore.preferences.protobuf.o<?> r40, androidx.datastore.preferences.protobuf.f0 r41) {
        /*
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r36.getSyntax()
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.b()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f10076r
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f10077s
            java.lang.Object[] r18 = r36.a()
            androidx.datastore.preferences.protobuf.k0 r19 = r36.getDefaultInstance()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = W(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = W(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = W(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = W(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            androidx.datastore.preferences.protobuf.n0 r0 = new androidx.datastore.preferences.protobuf.n0
            androidx.datastore.preferences.protobuf.k0 r9 = r36.getDefaultInstance()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.I(androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.f0):androidx.datastore.preferences.protobuf.n0");
    }

    private int J(int i11) {
        return this.f10078a[i11];
    }

    private static long K(int i11) {
        return (long) (i11 & 1048575);
    }

    private static <T> boolean L(T t, long j11) {
        return ((Boolean) i1.A(t, j11)).booleanValue();
    }

    private static <T> double M(T t, long j11) {
        return ((Double) i1.A(t, j11)).doubleValue();
    }

    private static <T> float N(T t, long j11) {
        return ((Float) i1.A(t, j11)).floatValue();
    }

    private static <T> int O(T t, long j11) {
        return ((Integer) i1.A(t, j11)).intValue();
    }

    private static <T> long P(T t, long j11) {
        return ((Long) i1.A(t, j11)).longValue();
    }

    private int Q(int i11) {
        if (i11 < this.f10080c || i11 > this.f10081d) {
            return -1;
        }
        return Z(i11, 0);
    }

    private int R(int i11) {
        return this.f10078a[i11 + 2];
    }

    private <E> void S(Object obj, long j11, x0 x0Var, y0<E> y0Var, n nVar) throws IOException {
        x0Var.g(this.n.e(obj, j11), y0Var, nVar);
    }

    private <E> void T(Object obj, int i11, x0 x0Var, y0<E> y0Var, n nVar) throws IOException {
        x0Var.d(this.n.e(obj, K(i11)), y0Var, nVar);
    }

    private void U(Object obj, int i11, x0 x0Var) throws IOException {
        if (q(i11)) {
            i1.O(obj, K(i11), x0Var.readStringRequireUtf8());
        } else if (this.f10084g) {
            i1.O(obj, K(i11), x0Var.readString());
        } else {
            i1.O(obj, K(i11), x0Var.readBytes());
        }
    }

    private void V(Object obj, int i11, x0 x0Var) throws IOException {
        if (q(i11)) {
            x0Var.readStringListRequireUtf8(this.n.e(obj, K(i11)));
        } else {
            x0Var.readStringList(this.n.e(obj, K(i11)));
        }
    }

    private static Field W(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void X(T t, int i11) {
        if (!this.f10085h) {
            int R = R(i11);
            long j11 = (long) (R & 1048575);
            i1.M(t, j11, i1.x(t, j11) | (1 << (R >>> 20)));
        }
    }

    private void Y(T t, int i11, int i12) {
        i1.M(t, (long) (R(i12) & 1048575), i11);
    }

    private int Z(int i11, int i12) {
        int length = (this.f10078a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int J = J(i14);
            if (i11 == J) {
                return i14;
            }
            if (i11 < J) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static int a0(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    private int b0(int i11) {
        return this.f10078a[i11 + 1];
    }

    private boolean c(T t, T t11, int i11) {
        return r(t, i11) == r(t11, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c0(T r18, androidx.datastore.preferences.protobuf.Writer r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f10083f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.o<?> r3 = r0.f10090p
            androidx.datastore.preferences.protobuf.s r3 = r3.c(r1)
            boolean r5 = r3.n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f10078a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f10077s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.b0(r10)
            int r13 = r0.J(r10)
            int r14 = a0(r12)
            boolean r15 = r0.f10085h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f10078a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            androidx.datastore.preferences.protobuf.o<?> r9 = r0.f10090p
            int r9 = r9.a(r5)
            if (r9 > r13) goto L_0x0081
            androidx.datastore.preferences.protobuf.o<?> r9 = r0.f10090p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = K(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.y0 r5 = r0.l(r10)
            r2.e(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = P(r1, r5)
            r2.writeSInt64(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeSInt32(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = P(r1, r5)
            r2.writeSFixed64(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeSFixed32(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeEnum(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeUInt32(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.a(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.y0 r5 = r0.l(r10)
            r2.b(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.g0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = L(r1, r5)
            r2.writeBool(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeFixed32(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = P(r1, r5)
            r2.writeFixed64(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = O(r1, r5)
            r2.writeInt32(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = P(r1, r5)
            r2.writeUInt64(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = P(r1, r5)
            r2.writeInt64(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = N(r1, r5)
            r2.writeFloat(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.x(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = M(r1, r5)
            r2.writeDouble(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.f0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r0.l(r10)
            androidx.datastore.preferences.protobuf.a1.U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            androidx.datastore.preferences.protobuf.a1.b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.a1.b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.y0 r6 = r0.l(r10)
            androidx.datastore.preferences.protobuf.a1.X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.a1.N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.J(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.a1.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.y0 r5 = r0.l(r10)
            r2.e(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.writeSInt64(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeSInt32(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.writeSFixed64(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeSFixed32(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeEnum(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeUInt32(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.a(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.y0 r5 = r0.l(r10)
            r2.b(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.g0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = d(r1, r5)
            r2.writeBool(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeFixed32(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.writeFixed64(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.writeInt32(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.writeUInt64(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.writeInt64(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = i(r1, r5)
            r2.writeFloat(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = e(r1, r5)
            r2.writeDouble(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            androidx.datastore.preferences.protobuf.o<?> r4 = r0.f10090p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            androidx.datastore.preferences.protobuf.e1<?, ?> r3 = r0.f10089o
            r0.h0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.c0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private static <T> boolean d(T t, long j11) {
        return i1.p(t, j11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d0(T r13, androidx.datastore.preferences.protobuf.Writer r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f10083f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            androidx.datastore.preferences.protobuf.o<?> r0 = r12.f10090p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f10078a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.b0(r5)
            int r7 = r12.J(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            androidx.datastore.preferences.protobuf.o<?> r8 = r12.f10090p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            androidx.datastore.preferences.protobuf.o<?> r8 = r12.f10090p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = a0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            r14.e(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = P(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = P(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeEnum(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.a(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            r14.b(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            r12.g0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            boolean r6 = L(r13, r8)
            r14.writeBool(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = P(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = O(r13, r8)
            r14.writeInt32(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = P(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = P(r13, r8)
            r14.writeInt64(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            float r6 = N(r13, r8)
            r14.writeFloat(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.x(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            double r8 = M(r13, r8)
            r14.writeDouble(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            r12.f0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            androidx.datastore.preferences.protobuf.a1.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.J(r5)
            long r10 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            androidx.datastore.preferences.protobuf.a1.X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.J(r5)
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.a1.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            r14.e(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = A(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = A(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeEnum(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.a(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            androidx.datastore.preferences.protobuf.y0 r8 = r12.l(r5)
            r14.b(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r13, r8)
            r12.g0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            boolean r6 = d(r13, r8)
            r14.writeBool(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = A(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            int r6 = p(r13, r8)
            r14.writeInt32(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = A(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            long r8 = A(r13, r8)
            r14.writeInt64(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            float r6 = i(r13, r8)
            r14.writeFloat(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.r(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = K(r6)
            double r8 = e(r13, r8)
            r14.writeDouble(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            androidx.datastore.preferences.protobuf.o<?> r3 = r12.f10090p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            androidx.datastore.preferences.protobuf.e1<?, ?> r0 = r12.f10089o
            r12.h0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.d0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private static <T> double e(T t, long j11) {
        return i1.v(t, j11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e0(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.e1<?, ?> r0 = r10.f10089o
            r10.h0(r0, r11, r12)
            boolean r0 = r10.f10083f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.o<?> r0 = r10.f10090p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f10078a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.b0(r3)
            int r5 = r10.J(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.o<?> r6 = r10.f10090p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.o<?> r6 = r10.f10090p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = a0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            r12.e(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = P(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = P(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeEnum(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.a(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            r12.b(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            r10.g0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            boolean r4 = L(r11, r6)
            r12.writeBool(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = P(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = O(r11, r6)
            r12.writeInt32(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = P(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = P(r11, r6)
            r12.writeInt64(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            float r4 = N(r11, r6)
            r12.writeFloat(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.x(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            double r6 = M(r11, r6)
            r12.writeDouble(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            r10.f0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            androidx.datastore.preferences.protobuf.a1.U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.J(r3)
            long r8 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            androidx.datastore.preferences.protobuf.a1.X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.J(r3)
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.a1.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            r12.e(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = A(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = A(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeEnum(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.a(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            androidx.datastore.preferences.protobuf.y0 r6 = r10.l(r3)
            r12.b(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.i1.A(r11, r6)
            r10.g0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            boolean r4 = d(r11, r6)
            r12.writeBool(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = A(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            int r4 = p(r11, r6)
            r12.writeInt32(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = A(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            long r6 = A(r11, r6)
            r12.writeInt64(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            float r4 = i(r11, r6)
            r12.writeFloat(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.r(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = K(r4)
            double r6 = e(r11, r6)
            r12.writeDouble(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.o<?> r11 = r10.f10090p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.e0(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private boolean f(T t, T t11, int i11) {
        int b02 = b0(i11);
        long K = K(b02);
        switch (a0(b02)) {
            case 0:
                if (!c(t, t11, i11) || Double.doubleToLongBits(i1.v(t, K)) != Double.doubleToLongBits(i1.v(t11, K))) {
                    return false;
                }
                return true;
            case 1:
                if (!c(t, t11, i11) || Float.floatToIntBits(i1.w(t, K)) != Float.floatToIntBits(i1.w(t11, K))) {
                    return false;
                }
                return true;
            case 2:
                if (!c(t, t11, i11) || i1.y(t, K) != i1.y(t11, K)) {
                    return false;
                }
                return true;
            case 3:
                if (!c(t, t11, i11) || i1.y(t, K) != i1.y(t11, K)) {
                    return false;
                }
                return true;
            case 4:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 5:
                if (!c(t, t11, i11) || i1.y(t, K) != i1.y(t11, K)) {
                    return false;
                }
                return true;
            case 6:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 7:
                if (!c(t, t11, i11) || i1.p(t, K) != i1.p(t11, K)) {
                    return false;
                }
                return true;
            case 8:
                if (!c(t, t11, i11) || !a1.K(i1.A(t, K), i1.A(t11, K))) {
                    return false;
                }
                return true;
            case 9:
                if (!c(t, t11, i11) || !a1.K(i1.A(t, K), i1.A(t11, K))) {
                    return false;
                }
                return true;
            case 10:
                if (!c(t, t11, i11) || !a1.K(i1.A(t, K), i1.A(t11, K))) {
                    return false;
                }
                return true;
            case 11:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 12:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 13:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 14:
                if (!c(t, t11, i11) || i1.y(t, K) != i1.y(t11, K)) {
                    return false;
                }
                return true;
            case 15:
                if (!c(t, t11, i11) || i1.x(t, K) != i1.x(t11, K)) {
                    return false;
                }
                return true;
            case 16:
                if (!c(t, t11, i11) || i1.y(t, K) != i1.y(t11, K)) {
                    return false;
                }
                return true;
            case 17:
                if (!c(t, t11, i11) || !a1.K(i1.A(t, K), i1.A(t11, K))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return a1.K(i1.A(t, K), i1.A(t11, K));
            case 50:
                return a1.K(i1.A(t, K), i1.A(t11, K));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!w(t, t11, i11) || !a1.K(i1.A(t, K), i1.A(t11, K))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private <K, V> void f0(Writer writer, int i11, Object obj, int i12) throws IOException {
        if (obj != null) {
            writer.c(i11, this.q.forMapMetadata(k(i12)), this.q.forMapData(obj));
        }
    }

    private final <UT, UB> UB g(Object obj, int i11, UB ub2, e1<UT, UB> e1Var) {
        w.e j11;
        int J = J(i11);
        Object A = i1.A(obj, K(b0(i11)));
        if (A == null || (j11 = j(i11)) == null) {
            return ub2;
        }
        return h(i11, J, this.q.forMutableMapData(A), j11, ub2, e1Var);
    }

    private void g0(int i11, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i11, (String) obj);
        } else {
            writer.a(i11, (ByteString) obj);
        }
    }

    private final <K, V, UT, UB> UB h(int i11, int i12, Map<K, V> map, w.e eVar, UB ub2, e1<UT, UB> e1Var) {
        e0.a<?, ?> forMapMetadata = this.q.forMapMetadata(k(i11));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = e1Var.n();
                }
                ByteString.g o11 = ByteString.o(e0.b(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    e0.e(o11.b(), forMapMetadata, next.getKey(), next.getValue());
                    e1Var.d(ub2, i12, o11.a());
                    it2.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private <UT, UB> void h0(e1<UT, UB> e1Var, T t, Writer writer) throws IOException {
        e1Var.t(e1Var.g(t), writer);
    }

    private static <T> float i(T t, long j11) {
        return i1.w(t, j11);
    }

    private w.e j(int i11) {
        return (w.e) this.f10079b[((i11 / 3) * 2) + 1];
    }

    private Object k(int i11) {
        return this.f10079b[(i11 / 3) * 2];
    }

    private y0 l(int i11) {
        int i12 = (i11 / 3) * 2;
        y0 y0Var = (y0) this.f10079b[i12];
        if (y0Var != null) {
            return y0Var;
        }
        y0 d11 = u0.a().d((Class) this.f10079b[i12 + 1]);
        this.f10079b[i12] = d11;
        return d11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0347, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0518, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f10077s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f10078a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x051e
            int r8 = r0.b0(r5)
            int r9 = r0.J(r5)
            int r10 = a0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f10078a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f10086i
            if (r11 == 0) goto L_0x0055
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r11 = r11.id()
            if (r10 < r11) goto L_0x0055
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r11 = r11.id()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f10078a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = K(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x050c;
                case 1: goto L_0x0502;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e6;
                case 4: goto L_0x04d8;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c4;
                case 7: goto L_0x04b9;
                case 8: goto L_0x049d;
                case 9: goto L_0x048c;
                case 10: goto L_0x047d;
                case 11: goto L_0x0470;
                case 12: goto L_0x0463;
                case 13: goto L_0x0458;
                case 14: goto L_0x044f;
                case 15: goto L_0x0442;
                case 16: goto L_0x0435;
                case 17: goto L_0x0422;
                case 18: goto L_0x0413;
                case 19: goto L_0x0407;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03ef;
                case 22: goto L_0x03e3;
                case 23: goto L_0x03d7;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bf;
                case 26: goto L_0x03b4;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0399;
                case 29: goto L_0x038c;
                case 30: goto L_0x037f;
                case 31: goto L_0x0372;
                case 32: goto L_0x0365;
                case 33: goto L_0x0358;
                case 34: goto L_0x034b;
                case 35: goto L_0x032b;
                case 36: goto L_0x030e;
                case 37: goto L_0x02f1;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02b6;
                case 40: goto L_0x0298;
                case 41: goto L_0x027a;
                case 42: goto L_0x025c;
                case 43: goto L_0x023e;
                case 44: goto L_0x0220;
                case 45: goto L_0x0202;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017a;
                case 52: goto L_0x016e;
                case 53: goto L_0x015e;
                case 54: goto L_0x014e;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0125;
                case 58: goto L_0x0118;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a7;
                case 65: goto L_0x009b;
                case 66: goto L_0x008b;
                case 67: goto L_0x007b;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x041f
        L_0x0065:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.k0 r3 = (androidx.datastore.preferences.protobuf.k0) r3
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.s(r9, r3, r4)
            goto L_0x041e
        L_0x007b:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = P(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r9, r3)
            goto L_0x041e
        L_0x008b:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = O(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r9, r3)
            goto L_0x041e
        L_0x009b:
            boolean r8 = r0.x(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r9, r3)
            goto L_0x041e
        L_0x00a7:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r9, r3)
            goto L_0x0461
        L_0x00b4:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = O(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r9, r3)
            goto L_0x041e
        L_0x00c4:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = O(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r9, r3)
            goto L_0x041e
        L_0x00d4:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x00e6:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.a1.o(r9, r3, r4)
            goto L_0x041e
        L_0x00fa:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L_0x0110
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x0110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r9, r3)
            goto L_0x041e
        L_0x0118:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.d(r9, r3)
            goto L_0x041e
        L_0x0125:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r9, r3)
            goto L_0x0461
        L_0x0132:
            boolean r8 = r0.x(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.o(r9, r3)
            goto L_0x041e
        L_0x013e:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = O(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.v(r9, r3)
            goto L_0x041e
        L_0x014e:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = P(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r9, r3)
            goto L_0x041e
        L_0x015e:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = P(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.x(r9, r3)
            goto L_0x041e
        L_0x016e:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.q(r9, r8)
            goto L_0x041e
        L_0x017a:
            boolean r3 = r0.x(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r9, r3)
            goto L_0x041e
        L_0x0188:
            androidx.datastore.preferences.protobuf.f0 r3 = r0.q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.k(r5)
            int r3 = r3.getSerializedSize(r9, r4, r8)
            goto L_0x041e
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.a1.j(r9, r3, r4)
            goto L_0x041e
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.t(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x01bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01bc:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.r(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x01da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01da:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x01f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01f8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0216:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x0220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.e(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0234:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.w(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0252:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x025c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.b(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0270:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x027a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x028e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x028e:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x0298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x02ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ac:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.l(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x02ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ca:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.y(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x02e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02e8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.n(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0305:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x0322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0322:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
            goto L_0x0347
        L_0x032b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f10086i
            if (r4 == 0) goto L_0x033f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x033f:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r3)
        L_0x0347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x0461
        L_0x034b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.a1.s(r9, r3, r4)
            goto L_0x041e
        L_0x0358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.q(r9, r3, r4)
            goto L_0x041e
        L_0x0365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.h(r9, r3, r4)
            goto L_0x041e
        L_0x0372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.f(r9, r3, r4)
            goto L_0x041e
        L_0x037f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.d(r9, r3, r4)
            goto L_0x041e
        L_0x038c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.v(r9, r3, r4)
            goto L_0x041e
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.c(r9, r3)
            goto L_0x041e
        L_0x03a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.a1.p(r9, r3, r4)
            goto L_0x041e
        L_0x03b4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.u(r9, r3)
            goto L_0x041e
        L_0x03bf:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.a1.a(r9, r3, r4)
            goto L_0x041e
        L_0x03cb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.f(r9, r3, r4)
            goto L_0x041e
        L_0x03d7:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.h(r9, r3, r4)
            goto L_0x041e
        L_0x03e3:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.k(r9, r3, r4)
            goto L_0x041e
        L_0x03ef:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.x(r9, r3, r4)
            goto L_0x041e
        L_0x03fb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.m(r9, r3, r4)
            goto L_0x041e
        L_0x0407:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.f(r9, r3, r4)
            goto L_0x041e
        L_0x0413:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.a1.h(r9, r3, r4)
        L_0x041e:
            int r6 = r6 + r3
        L_0x041f:
            r10 = 0
            goto L_0x0518
        L_0x0422:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.k0 r3 = (androidx.datastore.preferences.protobuf.k0) r3
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.s(r9, r3, r4)
            goto L_0x041e
        L_0x0435:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r9, r3)
            goto L_0x041e
        L_0x0442:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r9, r3)
            goto L_0x041e
        L_0x044f:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x041f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r9, r3)
            goto L_0x041e
        L_0x0458:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r9, r3)
        L_0x0461:
            int r6 = r6 + r4
            goto L_0x041f
        L_0x0463:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r9, r3)
            goto L_0x041e
        L_0x0470:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r9, r3)
            goto L_0x041e
        L_0x047d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x048c:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.y0 r4 = r0.l(r5)
            int r3 = androidx.datastore.preferences.protobuf.a1.o(r9, r3, r4)
            goto L_0x041e
        L_0x049d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L_0x04b1
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r9, r3)
            goto L_0x041e
        L_0x04b1:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r9, r3)
            goto L_0x041e
        L_0x04b9:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.d(r9, r3)
            goto L_0x041e
        L_0x04c4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r10 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r9, r10)
            goto L_0x0517
        L_0x04ce:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0518
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.o(r9, r3)
            goto L_0x0517
        L_0x04d8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.v(r9, r3)
            goto L_0x0517
        L_0x04e6:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r9, r3)
            goto L_0x0517
        L_0x04f4:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.x(r9, r3)
            goto L_0x0517
        L_0x0502:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.q(r9, r8)
            goto L_0x0517
        L_0x050c:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r9, r3)
        L_0x0517:
            int r6 = r6 + r3
        L_0x0518:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x051e:
            androidx.datastore.preferences.protobuf.e1<?, ?> r2 = r0.f10089o
            int r2 = r0.o(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f10083f
            if (r2 == 0) goto L_0x0534
            androidx.datastore.preferences.protobuf.o<?> r2 = r0.f10090p
            androidx.datastore.preferences.protobuf.s r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.m(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f10077s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f10078a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.b0(r4)
            int r7 = a0(r6)
            int r8 = r15.J(r4)
            long r9 = K(r6)
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r7 < r6) goto L_0x0038
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f10078a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.k0 r6 = (androidx.datastore.preferences.protobuf.k0) r6
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.s(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = P(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = O(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = O(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = O(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.a1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.o(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = O(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.v(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = P(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = P(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.x(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.q(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.x(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r8, r6)
            goto L_0x03c4
        L_0x0162:
            androidx.datastore.preferences.protobuf.f0 r6 = r0.q
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            java.lang.Object r9 = r15.k(r4)
            int r6 = r6.getSerializedSize(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = z(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.a1.j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.a1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f10086i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = z(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.a1.p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = z(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.a1.h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.k0 r6 = (androidx.datastore.preferences.protobuf.k0) r6
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.s(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.i1.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.i1.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.i1.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.k(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.i1.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            androidx.datastore.preferences.protobuf.y0 r7 = r15.l(r4)
            int r6 = androidx.datastore.preferences.protobuf.a1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.i1.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.g(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.m(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.o(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.i1.x(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.v(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.i1.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = androidx.datastore.preferences.protobuf.i1.y(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.x(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.q(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.r(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.i(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            androidx.datastore.preferences.protobuf.e1<?, ?> r2 = r0.f10089o
            int r1 = r15.o(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.n(java.lang.Object):int");
    }

    private <UT, UB> int o(e1<UT, UB> e1Var, T t) {
        return e1Var.h(e1Var.g(t));
    }

    private static <T> int p(T t, long j11) {
        return i1.x(t, j11);
    }

    private static boolean q(int i11) {
        return (i11 & 536870912) != 0;
    }

    private boolean r(T t, int i11) {
        if (this.f10085h) {
            int b02 = b0(i11);
            long K = K(b02);
            switch (a0(b02)) {
                case 0:
                    if (i1.v(t, K) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (i1.w(t, K) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (i1.y(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (i1.y(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (i1.y(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return i1.p(t, K);
                case 8:
                    Object A = i1.A(t, K);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof ByteString) {
                        return !ByteString.f9898b.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i1.A(t, K) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.f9898b.equals(i1.A(t, K));
                case 11:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (i1.y(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (i1.x(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (i1.y(t, K) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (i1.A(t, K) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int R = R(i11);
            if ((i1.x(t, (long) (R & 1048575)) & (1 << (R >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private boolean s(T t, int i11, int i12, int i13) {
        if (this.f10085h) {
            return r(t, i11);
        }
        return (i12 & i13) != 0;
    }

    private static boolean t(Object obj, int i11, y0 y0Var) {
        return y0Var.isInitialized(i1.A(obj, K(i11)));
    }

    private <N> boolean u(Object obj, int i11, int i12) {
        List list = (List) i1.A(obj, K(i11));
        if (list.isEmpty()) {
            return true;
        }
        y0 l11 = l(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!l11.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    private boolean v(T t, int i11, int i12) {
        Map<?, ?> forMapData = this.q.forMapData(i1.A(t, K(i11)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.q.forMapMetadata(k(i12)).f10003c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        y0<?> y0Var = null;
        for (Object next : forMapData.values()) {
            if (y0Var == null) {
                y0Var = u0.a().d(next.getClass());
            }
            if (!y0Var.isInitialized(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean w(T t, T t11, int i11) {
        long R = (long) (R(i11) & 1048575);
        return i1.x(t, R) == i1.x(t11, R);
    }

    private boolean x(T t, int i11, int i12) {
        return i1.x(t, (long) (R(i12) & 1048575)) == i11;
    }

    private static boolean y(int i11) {
        return (i11 & 268435456) != 0;
    }

    private static List<?> z(Object obj, long j11) {
        return (List) i1.A(obj, j11);
    }

    public void a(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            e0(t, writer);
        } else if (this.f10085h) {
            d0(t, writer);
        } else {
            c0(t, writer);
        }
    }

    public void b(T t, x0 x0Var, n nVar) throws IOException {
        Objects.requireNonNull(nVar);
        B(this.f10089o, this.f10090p, t, x0Var, nVar);
    }

    public boolean equals(T t, T t11) {
        int length = this.f10078a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!f(t, t11, i11)) {
                return false;
            }
        }
        if (!this.f10089o.g(t).equals(this.f10089o.g(t11))) {
            return false;
        }
        if (this.f10083f) {
            return this.f10090p.c(t).equals(this.f10090p.c(t11));
        }
        return true;
    }

    public int getSerializedSize(T t) {
        return this.f10085h ? n(t) : m(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int hashCode(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f10078a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.b0(r1)
            int r4 = r8.J(r1)
            long r5 = K(r3)
            int r3 = a0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = P(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = P(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = L(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = P(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = P(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = P(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = N(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = M(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.i1.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.i1.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.i1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.i1.p(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.i1.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.i1.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.i1.y(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.i1.w(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.i1.v(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.w.f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.e1<?, ?> r0 = r8.f10089o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f10083f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.o<?> r0 = r8.f10090p
            androidx.datastore.preferences.protobuf.s r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.hashCode(java.lang.Object):int");
    }

    public final boolean isInitialized(T t) {
        int i11;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < this.k; i14++) {
            int i15 = this.j[i14];
            int J = J(i15);
            int b02 = b0(i15);
            if (!this.f10085h) {
                int i16 = this.f10078a[i15 + 2];
                int i17 = 1048575 & i16;
                i11 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = f10077s.getInt(t, (long) i17);
                    i12 = i17;
                }
            } else {
                i11 = 0;
            }
            if (y(b02) && !s(t, i15, i13, i11)) {
                return false;
            }
            int a02 = a0(b02);
            if (a02 != 9 && a02 != 17) {
                if (a02 != 27) {
                    if (a02 == 60 || a02 == 68) {
                        if (x(t, J, i15) && !t(t, b02, l(i15))) {
                            return false;
                        }
                    } else if (a02 != 49) {
                        if (a02 == 50 && !v(t, b02, i15)) {
                            return false;
                        }
                    }
                }
                if (!u(t, b02, i15)) {
                    return false;
                }
            } else if (s(t, i15, i13, i11) && !t(t, b02, l(i15))) {
                return false;
            }
        }
        return !this.f10083f || this.f10090p.c(t).p();
    }

    public void makeImmutable(T t) {
        int i11;
        int i12 = this.k;
        while (true) {
            i11 = this.f10087l;
            if (i12 >= i11) {
                break;
            }
            long K = K(b0(this.j[i12]));
            Object A = i1.A(t, K);
            if (A != null) {
                i1.O(t, K, this.q.toImmutable(A));
            }
            i12++;
        }
        int length = this.j.length;
        while (i11 < length) {
            this.n.c(t, (long) this.j[i11]);
            i11++;
        }
        this.f10089o.j(t);
        if (this.f10083f) {
            this.f10090p.f(t);
        }
    }

    public void mergeFrom(T t, T t11) {
        Objects.requireNonNull(t11);
        for (int i11 = 0; i11 < this.f10078a.length; i11 += 3) {
            F(t, t11, i11);
        }
        if (!this.f10085h) {
            a1.G(this.f10089o, t, t11);
            if (this.f10083f) {
                a1.E(this.f10090p, t, t11);
            }
        }
    }

    public T newInstance() {
        return this.f10088m.newInstance(this.f10082e);
    }
}
