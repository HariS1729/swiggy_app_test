package h5;

import android.hardware.Camera;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f14809a = -1;

    static class a implements Comparator<Camera.Size> {
        a() {
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            return (size2.width * size2.height) - (size.width * size.height);
        }
    }

    static class b implements Comparator<Camera.Size> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14810a;

        b(int i11) {
            this.f14810a = i11;
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Math.abs((size.width * size.height) - this.f14810a) - Math.abs((size2.width * size2.height) - this.f14810a);
        }
    }

    public static Camera.Size a(Camera camera, int i11, int i12, float f11, boolean z11) {
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        c(supportedPictureSizes);
        if (z11 && !supportedPictureSizes.isEmpty()) {
            return supportedPictureSizes.get(0);
        }
        for (Camera.Size next : supportedPictureSizes) {
            int i13 = next.width;
            int i14 = i13 * i11;
            int i15 = next.height;
            if (i14 == i15 * i12 && ((int) (1000000.0f * f11)) > i13 * i15) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (r0.equals("" + r3) == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r3, android.hardware.Camera r4, int r5) {
        /*
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            android.hardware.Camera.getCameraInfo(r3, r0)
            int r5 = r5 + 45
            int r5 = r5 / 90
            int r5 = r5 * 90
            int r3 = r0.facing
            r1 = 1
            if (r3 != r1) goto L_0x001b
            int r3 = r0.orientation
            int r3 = r3 - r5
            int r3 = r3 + 360
            int r3 = r3 % 360
            goto L_0x0020
        L_0x001b:
            int r3 = r0.orientation
            int r3 = r3 + r5
            int r3 = r3 % 360
        L_0x0020:
            int r5 = f14809a
            if (r5 == r3) goto L_0x0053
            android.hardware.Camera$Parameters r5 = r4.getParameters()
            java.lang.String r0 = "rotation"
            java.lang.String r1 = r5.get(r0)
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = r5.get(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
        L_0x004b:
            r5.setRotation(r3)
            r4.setParameters(r5)
        L_0x0051:
            f14809a = r3
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c.b(int, android.hardware.Camera, int):void");
    }

    public static void c(List<Camera.Size> list) {
        Collections.sort(list, new a());
    }

    public static void d(List<Camera.Size> list, int i11) {
        Collections.sort(list, new b(i11));
    }

    public static Camera.Size e(Camera camera, int i11, int i12, float f11) {
        boolean b11 = n5.a.b();
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        d(supportedPreviewSizes, (int) (f11 * 1000000.0f));
        for (Camera.Size next : supportedPreviewSizes) {
            if (next.width * i11 == next.height * i12) {
                return next;
            }
        }
        return null;
    }
}
