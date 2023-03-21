package b2;

import android.util.Log;
import c2.a;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import tp0.e;

/* compiled from: PreviewUtils.kt */
public final class b {
    public static final Class<? extends a<?>> a(String str) {
        p.j(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            Log.e("PreviewProvider", "Unable to find provider '" + str + '\'', e11);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r5 == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object[] b(java.lang.Class<? extends c2.a<?>> r10, int r11) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x007b
            java.lang.reflect.Constructor[] r10 = r10.getConstructors()     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.String r1 = "parameterProviderClass.constructors"
            kotlin.jvm.internal.p.i(r10, r1)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            int r1 = r10.length     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            r2 = 0
            r3 = 1
            r6 = r2
            r4 = 0
            r5 = 0
        L_0x0012:
            if (r4 >= r1) goto L_0x002f
            r7 = r10[r4]     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            int r4 = r4 + 1
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.String r9 = "it.parameterTypes"
            kotlin.jvm.internal.p.i(r8, r9)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            int r8 = r8.length     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            if (r8 != 0) goto L_0x0026
            r8 = 1
            goto L_0x0027
        L_0x0026:
            r8 = 0
        L_0x0027:
            if (r8 == 0) goto L_0x0012
            if (r5 == 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r6 = r7
            r5 = 1
            goto L_0x0012
        L_0x002f:
            if (r5 != 0) goto L_0x0032
        L_0x0031:
            r6 = r2
        L_0x0032:
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            if (r6 != 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r6.setAccessible(r3)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            r2 = r6
        L_0x003b:
            if (r2 == 0) goto L_0x006b
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.Object r10 = r2.newInstance(r10)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            if (r10 == 0) goto L_0x0063
            c2.a r10 = (c2.a) r10     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            if (r11 >= 0) goto L_0x0056
            tp0.e r11 = r10.a()     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            int r10 = r10.getCount()     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.Object[] r10 = c(r11, r10)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            return r10
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            tp0.e r10 = r10.a()     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.Object r10 = kotlin.sequences.SequencesKt___SequencesKt.i(r10, r11)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            r1[r0] = r10     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            return r1
        L_0x0063:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            r10.<init>(r11)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            throw r10     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
        L_0x006b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            java.lang.String r11 = "PreviewParameterProvider constructor can not have parameters"
            r10.<init>(r11)     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
            throw r10     // Catch:{ KotlinReflectionNotSupportedError -> 0x0073 }
        L_0x0073:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            r10.<init>(r11)
            throw r10
        L_0x007b:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.b(java.lang.Class, int):java.lang.Object[]");
    }

    private static final Object[] c(e<? extends Object> eVar, int i11) {
        Iterator<? extends Object> it2 = eVar.iterator();
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = it2.next();
        }
        return objArr;
    }
}
