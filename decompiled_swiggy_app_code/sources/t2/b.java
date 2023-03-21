package t2;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f16710a;

    /* compiled from: CursorFilter */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f16710a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f16710a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d11 = this.f16710a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d11 != null) {
            filterResults.count = d11.getCount();
            filterResults.values = d11;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b11 = this.f16710a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b11) {
            this.f16710a.a((Cursor) obj);
        }
    }
}
