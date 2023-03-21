package androidx.slice;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import in.juspay.hyper.constants.LogCategory;
import java.util.Set;

/* compiled from: SliceConvert */
public class b {
    public static Slice a(Slice slice) {
        if (slice == null || slice.f() == null) {
            return null;
        }
        Slice.Builder builder = new Slice.Builder(slice.f(), b(slice.e()));
        builder.addHints(slice.c());
        for (SliceItem sliceItem : slice.d()) {
            String c11 = sliceItem.c();
            c11.hashCode();
            char c12 = 65535;
            switch (c11.hashCode()) {
                case -1422950858:
                    if (c11.equals(LogCategory.ACTION)) {
                        c12 = 0;
                        break;
                    }
                    break;
                case 104431:
                    if (c11.equals("int")) {
                        c12 = 1;
                        break;
                    }
                    break;
                case 3327612:
                    if (c11.equals("long")) {
                        c12 = 2;
                        break;
                    }
                    break;
                case 3556653:
                    if (c11.equals("text")) {
                        c12 = 3;
                        break;
                    }
                    break;
                case 100313435:
                    if (c11.equals("image")) {
                        c12 = 4;
                        break;
                    }
                    break;
                case 100358090:
                    if (c11.equals("input")) {
                        c12 = 5;
                        break;
                    }
                    break;
                case 109526418:
                    if (c11.equals("slice")) {
                        c12 = 6;
                        break;
                    }
                    break;
            }
            switch (c12) {
                case 0:
                    builder.addAction(sliceItem.b(), a(sliceItem.i()), sliceItem.j());
                    break;
                case 1:
                    builder.addInt(sliceItem.f(), sliceItem.j(), sliceItem.d());
                    break;
                case 2:
                    builder.addLong(sliceItem.g(), sliceItem.j(), sliceItem.d());
                    break;
                case 3:
                    builder.addText(sliceItem.k(), sliceItem.j(), sliceItem.d());
                    break;
                case 4:
                    builder.addIcon(sliceItem.e().x(), sliceItem.j(), sliceItem.d());
                    break;
                case 5:
                    builder.addRemoteInput(sliceItem.h(), sliceItem.j(), sliceItem.d());
                    break;
                case 6:
                    builder.addSubSlice(a(sliceItem.i()), sliceItem.j());
                    break;
            }
        }
        return builder.build();
    }

    private static SliceSpec b(SliceSpec sliceSpec) {
        if (sliceSpec == null) {
            return null;
        }
        return new SliceSpec(sliceSpec.c(), sliceSpec.b());
    }

    private static SliceSpec c(SliceSpec sliceSpec) {
        if (sliceSpec == null) {
            return null;
        }
        return new SliceSpec(sliceSpec.getType(), sliceSpec.getRevision());
    }

    public static Set<SliceSpec> d(Set<SliceSpec> set) {
        androidx.collection.b bVar = new androidx.collection.b();
        if (set != null) {
            for (SliceSpec c11 : set) {
                bVar.add(c(c11));
            }
        }
        return bVar;
    }
}
