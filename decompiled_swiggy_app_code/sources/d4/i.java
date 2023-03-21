package d4;

import android.util.Log;

/* compiled from: Logger */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static i f14132a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f14133b = 20;

    /* compiled from: Logger */
    public static class a extends i {

        /* renamed from: c  reason: collision with root package name */
        private int f14134c;

        public a(int i11) {
            super(i11);
            this.f14134c = i11;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f14134c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f14134c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f14134c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        public void g(String str, String str2, Throwable... thArr) {
            if (this.f14134c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        public void h(String str, String str2, Throwable... thArr) {
            if (this.f14134c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public i(int i11) {
    }

    public static synchronized i c() {
        i iVar;
        synchronized (i.class) {
            if (f14132a == null) {
                f14132a = new a(3);
            }
            iVar = f14132a;
        }
        return iVar;
    }

    public static synchronized void e(i iVar) {
        synchronized (i.class) {
            f14132a = iVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i11 = f14133b;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
