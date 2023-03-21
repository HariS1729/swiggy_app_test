package in.swiggy.android.tejas.dao;

import bp0.k;
import fp0.c;

/* compiled from: BaseDao.kt */
public interface BaseDao<T> {
    Object delete(T t, c<? super k> cVar);

    Object insert(T[] tArr, c<? super k> cVar);

    Object insertIgnore(T t, c<? super k> cVar);

    Object insertOrUpdate(T t, c<? super k> cVar);

    Object update(T t, c<? super k> cVar);
}
