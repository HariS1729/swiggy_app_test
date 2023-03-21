package b2;

import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.g;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.p;

/* compiled from: CommonPreviewUtils.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12573a = new a();

    private a() {
    }

    private final int a(int i11, int i12) {
        if (i11 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i11 + i12)) / 15.0d);
    }

    private final boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z11;
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Class<?> cls = clsArr[i11];
            i11++;
            arrayList.add(Boolean.valueOf(cls.isAssignableFrom(clsArr2[i12])));
            i12++;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return true;
        }
        return false;
    }

    private final int c(int i11) {
        return (int) Math.ceil(((double) i11) / 31.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r11 = r9.getDeclaredMethods();
        kotlin.jvm.internal.p.i(r11, "declaredMethods");
        r2 = r11.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r1 < r2) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r3 = r11[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (kotlin.jvm.internal.p.e(r3.getName(), r10) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method d(java.lang.Class<?> r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r11.length     // Catch:{ ReflectiveOperationException -> 0x008c }
            int r2 = r8.a(r2, r1)     // Catch:{ ReflectiveOperationException -> 0x008c }
            kotlin.jvm.internal.v r3 = new kotlin.jvm.internal.v     // Catch:{ ReflectiveOperationException -> 0x008c }
            r4 = 4
            r3.<init>(r4)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ ReflectiveOperationException -> 0x008c }
            r4.<init>()     // Catch:{ ReflectiveOperationException -> 0x008c }
            int r5 = r11.length     // Catch:{ ReflectiveOperationException -> 0x008c }
            r6 = 0
        L_0x0014:
            if (r6 >= r5) goto L_0x0029
            r7 = r11[r6]     // Catch:{ ReflectiveOperationException -> 0x008c }
            int r6 = r6 + 1
            if (r7 != 0) goto L_0x001e
            r7 = r0
            goto L_0x0022
        L_0x001e:
            java.lang.Class r7 = r7.getClass()     // Catch:{ ReflectiveOperationException -> 0x008c }
        L_0x0022:
            if (r7 != 0) goto L_0x0025
            goto L_0x0014
        L_0x0025:
            r4.add(r7)     // Catch:{ ReflectiveOperationException -> 0x008c }
            goto L_0x0014
        L_0x0029:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r11 == 0) goto L_0x0086
            r3.b(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Class<e0.g> r11 = e0.g.class
            r3.a(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ ReflectiveOperationException -> 0x008c }
            r3.a(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            rp0.f r5 = new rp0.f     // Catch:{ ReflectiveOperationException -> 0x008c }
            r5.<init>(r1, r2)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ReflectiveOperationException -> 0x008c }
            r6 = 10
            int r6 = kotlin.collections.l.u(r5, r6)     // Catch:{ ReflectiveOperationException -> 0x008c }
            r2.<init>(r6)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ ReflectiveOperationException -> 0x008c }
        L_0x0054:
            boolean r6 = r5.hasNext()     // Catch:{ ReflectiveOperationException -> 0x008c }
            if (r6 == 0) goto L_0x0064
            r6 = r5
            cp0.m r6 = (cp0.m) r6     // Catch:{ ReflectiveOperationException -> 0x008c }
            r6.b()     // Catch:{ ReflectiveOperationException -> 0x008c }
            r2.add(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            goto L_0x0054
        L_0x0064:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Object[] r11 = r2.toArray(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            if (r11 == 0) goto L_0x0080
            r3.b(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            int r11 = r3.c()     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Object[] r11 = r3.d(r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch:{ ReflectiveOperationException -> 0x008c }
            java.lang.reflect.Method r11 = r8.e(r9, r10, r11)     // Catch:{ ReflectiveOperationException -> 0x008c }
            goto L_0x00a8
        L_0x0080:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ ReflectiveOperationException -> 0x008c }
            r11.<init>(r4)     // Catch:{ ReflectiveOperationException -> 0x008c }
            throw r11     // Catch:{ ReflectiveOperationException -> 0x008c }
        L_0x0086:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ ReflectiveOperationException -> 0x008c }
            r11.<init>(r4)     // Catch:{ ReflectiveOperationException -> 0x008c }
            throw r11     // Catch:{ ReflectiveOperationException -> 0x008c }
        L_0x008c:
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x00a7 }
            java.lang.String r2 = "declaredMethods"
            kotlin.jvm.internal.p.i(r11, r2)     // Catch:{ ReflectiveOperationException -> 0x00a7 }
            int r2 = r11.length     // Catch:{ ReflectiveOperationException -> 0x00a7 }
        L_0x0096:
            if (r1 >= r2) goto L_0x00a7
            r3 = r11[r1]     // Catch:{ ReflectiveOperationException -> 0x00a7 }
            int r1 = r1 + 1
            java.lang.String r4 = r3.getName()     // Catch:{ ReflectiveOperationException -> 0x00a7 }
            boolean r4 = kotlin.jvm.internal.p.e(r4, r10)     // Catch:{ ReflectiveOperationException -> 0x00a7 }
            if (r4 == 0) goto L_0x0096
            r0 = r3
        L_0x00a7:
            r11 = r0
        L_0x00a8:
            if (r11 == 0) goto L_0x00ab
            return r11
        L_0x00ab:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r9.getName()
            r0.append(r9)
            r9 = 46
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.d(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b A[EDGE_INSN: B:15:0x003b->B:10:0x003b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method e(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            r7 = this;
            int r0 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            java.lang.Class[] r10 = (java.lang.Class[]) r10
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            java.lang.String r0 = "declaredMethods"
            kotlin.jvm.internal.p.i(r8, r0)
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0013:
            if (r2 >= r0) goto L_0x003a
            r3 = r8[r2]
            int r2 = r2 + 1
            java.lang.String r4 = r3.getName()
            boolean r4 = kotlin.jvm.internal.p.e(r9, r4)
            if (r4 == 0) goto L_0x0036
            b2.a r4 = f12573a
            java.lang.Class[] r5 = r3.getParameterTypes()
            java.lang.String r6 = "it.parameterTypes"
            kotlin.jvm.internal.p.i(r5, r6)
            boolean r4 = r4.b(r5, r10)
            if (r4 == 0) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r4 == 0) goto L_0x0013
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            return r3
        L_0x003e:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException
            java.lang.String r10 = " not found"
            java.lang.String r9 = kotlin.jvm.internal.p.s(r9, r10)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.e(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return '0';
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    private final Object g(Method method, Object obj, g gVar, Object... objArr) {
        int i11;
        Class[] parameterTypes = method.getParameterTypes();
        p.i(parameterTypes, "parameterTypes");
        int i12 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (p.e(parameterTypes[length], g.class)) {
                    i12 = length;
                    break;
                } else if (i13 < 0) {
                    break;
                } else {
                    length = i13;
                }
            }
        }
        int i14 = i12 + 1;
        int a11 = a(i12, obj != null ? 1 : 0) + i14;
        int length2 = method.getParameterTypes().length;
        if ((length2 != a11 ? c(i12) : 0) + a11 == length2) {
            Object[] objArr2 = new Object[length2];
            int i15 = 0;
            while (i15 < length2) {
                if (i15 >= 0 && i15 < i12) {
                    if (i15 < 0 || i15 > ArraysKt___ArraysKt.O(objArr)) {
                        a aVar = f12573a;
                        Class cls = method.getParameterTypes()[i15];
                        p.i(cls, "parameterTypes[idx]");
                        i11 = aVar.f(cls);
                    } else {
                        i11 = objArr[i15];
                    }
                } else if (i15 == i12) {
                    i11 = gVar;
                } else {
                    if (i14 <= i15 && i15 < a11) {
                        i11 = 0;
                    } else {
                        if (a11 <= i15 && i15 < length2) {
                            i11 = 2097151;
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                objArr2[i15] = i11;
                i15++;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void h(String str, String str2, g gVar, Object... objArr) {
        p.j(str, HexAttribute.HEX_ATTR_CLASS_NAME);
        p.j(str2, HexAttribute.HEX_ATTR_METHOD_NAME);
        p.j(gVar, "composer");
        p.j(objArr, "args");
        try {
            Class<?> cls = Class.forName(str);
            p.i(cls, "composableClass");
            Method d11 = d(cls, str2, Arrays.copyOf(objArr, objArr.length));
            d11.setAccessible(true);
            if (Modifier.isStatic(d11.getModifiers())) {
                g(d11, (Object) null, gVar, Arrays.copyOf(objArr, objArr.length));
            } else {
                g(d11, cls.getConstructor(new Class[0]).newInstance(new Object[0]), gVar, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e11) {
            throw new ClassNotFoundException("Composable Method '" + str + '.' + str2 + "' not found", e11);
        }
    }
}
