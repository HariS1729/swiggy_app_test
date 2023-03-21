package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewCompat */
public final class i {

    /* compiled from: ListViewCompat */
    static class a {
        static boolean a(ListView listView, int i11) {
            return listView.canScrollList(i11);
        }

        static void b(ListView listView, int i11) {
            listView.scrollListBy(i11);
        }
    }

    public static boolean a(ListView listView, int i11) {
        return a.a(listView, i11);
    }

    public static void b(ListView listView, int i11) {
        a.b(listView, i11);
    }
}
