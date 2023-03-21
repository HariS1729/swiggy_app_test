package o5;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@TargetApi(21)
public class d {

    static class a implements Comparator<Size> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15931a;

        a(int i11) {
            this.f15931a = i11;
        }

        /* renamed from: a */
        public int compare(Size size, Size size2) {
            return Math.abs((size.getWidth() * size.getHeight()) - this.f15931a) - Math.abs((size2.getWidth() * size2.getHeight()) - this.f15931a);
        }
    }

    public static Size a(StreamConfigurationMap streamConfigurationMap, int i11, int i12, float f11) {
        ArrayList<Size> arrayList = new ArrayList<>(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)));
        c(arrayList, (int) (f11 * 1000000.0f));
        for (Size size : arrayList) {
            if (size.getWidth() * i11 == size.getHeight() * i12) {
                return size;
            }
        }
        return null;
    }

    public static Size b(StreamConfigurationMap streamConfigurationMap, int i11, int i12, float f11, boolean z11) {
        ArrayList<Size> arrayList = new ArrayList<>(Arrays.asList(streamConfigurationMap.getOutputSizes(35)));
        c(arrayList, (int) (f11 * 1000000.0f));
        if (z11 && !arrayList.isEmpty()) {
            return (Size) arrayList.get(0);
        }
        for (Size size : arrayList) {
            if (size.getWidth() * i11 == size.getHeight() * i12) {
                size.toString();
                return size;
            }
        }
        return null;
    }

    public static void c(List<Size> list, int i11) {
        Collections.sort(list, new a(i11));
    }
}
