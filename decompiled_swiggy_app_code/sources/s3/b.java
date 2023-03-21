package s3;

import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* compiled from: SliceQuery */
public class b {

    /* compiled from: SliceQuery */
    static class a implements c<SliceItem> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f16647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f16648c;

        a(String str, String[] strArr, String[] strArr2) {
            this.f16646a = str;
            this.f16647b = strArr;
            this.f16648c = strArr2;
        }

        /* renamed from: b */
        public boolean a(SliceItem sliceItem) {
            return b.a(sliceItem, this.f16646a) && b.h(sliceItem, this.f16647b) && !b.g(sliceItem, this.f16648c);
        }
    }

    /* renamed from: s3.b$b  reason: collision with other inner class name */
    /* compiled from: SliceQuery */
    static class C0185b implements c<SliceItem> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f16650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f16651c;

        C0185b(String str, String[] strArr, String[] strArr2) {
            this.f16649a = str;
            this.f16650b = strArr;
            this.f16651c = strArr2;
        }

        /* renamed from: b */
        public boolean a(SliceItem sliceItem) {
            return b.a(sliceItem, this.f16649a) && b.h(sliceItem, this.f16650b) && !b.g(sliceItem, this.f16651c);
        }
    }

    /* compiled from: SliceQuery */
    private interface c<T> {
        boolean a(T t);
    }

    static boolean a(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.c());
    }

    public static SliceItem b(Slice slice, String str, String str2, String str3) {
        return c(slice, str, new String[]{str2}, new String[]{str3});
    }

    public static SliceItem c(Slice slice, String str, String[] strArr, String[] strArr2) {
        if (slice == null) {
            return null;
        }
        return f(i(slice), new C0185b(str, strArr, strArr2));
    }

    public static List<SliceItem> d(Slice slice, String str, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        e(i(slice), new a(str, strArr, strArr2), arrayList);
        return arrayList;
    }

    private static void e(Deque<SliceItem> deque, c<SliceItem> cVar, List<SliceItem> list) {
        while (!deque.isEmpty()) {
            SliceItem poll = deque.poll();
            if (cVar.a(poll)) {
                list.add(poll);
            }
            if ("slice".equals(poll.c()) || LogCategory.ACTION.equals(poll.c())) {
                Collections.addAll(deque, poll.i().d());
            }
        }
    }

    private static SliceItem f(Deque<SliceItem> deque, c<SliceItem> cVar) {
        while (!deque.isEmpty()) {
            SliceItem poll = deque.poll();
            if (cVar.a(poll)) {
                return poll;
            }
            if ("slice".equals(poll.c()) || LogCategory.ACTION.equals(poll.c())) {
                Collections.addAll(deque, poll.i().d());
            }
        }
        return null;
    }

    public static boolean g(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String l11 : strArr) {
            if (sliceItem.l(l11)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !sliceItem.l(str)) {
                return false;
            }
        }
        return true;
    }

    private static Deque<SliceItem> i(Slice slice) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Collections.addAll(arrayDeque, slice.d());
        return arrayDeque;
    }
}
