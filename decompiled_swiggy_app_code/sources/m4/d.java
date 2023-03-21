package m4;

import android.content.ComponentName;
import android.content.Context;
import d4.i;

/* compiled from: PackageManagerHelper */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15640a = i.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z11) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            i c11 = i.c();
            String str3 = f15640a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z11) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c11.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e11) {
            i c12 = i.c();
            String str4 = f15640a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z11) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c12.a(str4, String.format("%s could not be %s", objArr2), e11);
        }
    }
}
