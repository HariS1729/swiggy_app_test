package z5;

/* compiled from: GPSHelper */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static StringBuilder f18067a = new StringBuilder(20);

    public static final synchronized String a(double d11) {
        String sb2;
        synchronized (b.class) {
            double abs = Math.abs(d11);
            int i11 = (int) abs;
            double d12 = (abs * 60.0d) - (((double) i11) * 60.0d);
            int i12 = (int) d12;
            f18067a.setLength(0);
            f18067a.append(i11);
            f18067a.append("/1,");
            f18067a.append(i12);
            f18067a.append("/1,");
            f18067a.append((int) (((d12 * 60.0d) - (((double) i12) * 60.0d)) * 1000.0d));
            f18067a.append("/1000");
            sb2 = f18067a.toString();
        }
        return sb2;
    }

    public static String b(double d11) {
        return d11 < 0.0d ? "S" : "N";
    }
}
