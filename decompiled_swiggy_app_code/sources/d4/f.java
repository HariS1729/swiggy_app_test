package d4;

import androidx.work.b;
import java.util.List;

/* compiled from: InputMerger */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14129a = i.f("InputMerger");

    public static f a(String str) {
        try {
            return (f) Class.forName(str).newInstance();
        } catch (Exception e11) {
            i c11 = i.c();
            String str2 = f14129a;
            c11.b(str2, "Trouble instantiating + " + str, e11);
            return null;
        }
    }

    public abstract b b(List<b> list);
}
