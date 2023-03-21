package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class g extends u {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.d0> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.d0>> mAdditionsList = new ArrayList<>();
    ArrayList<RecyclerView.d0> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.d0> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.d0> mPendingAdditions = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.d0> mPendingRemovals = new ArrayList<>();
    ArrayList<RecyclerView.d0> mRemoveAnimations = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f11333a;

        a(ArrayList arrayList) {
            this.f11333a = arrayList;
        }

        public void run() {
            Iterator it2 = this.f11333a.iterator();
            while (it2.hasNext()) {
                j jVar = (j) it2.next();
                g.this.animateMoveImpl(jVar.f11367a, jVar.f11368b, jVar.f11369c, jVar.f11370d, jVar.f11371e);
            }
            this.f11333a.clear();
            g.this.mMovesList.remove(this.f11333a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f11335a;

        b(ArrayList arrayList) {
            this.f11335a = arrayList;
        }

        public void run() {
            Iterator it2 = this.f11335a.iterator();
            while (it2.hasNext()) {
                g.this.animateChangeImpl((i) it2.next());
            }
            this.f11335a.clear();
            g.this.mChangesList.remove(this.f11335a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f11337a;

        c(ArrayList arrayList) {
            this.f11337a = arrayList;
        }

        public void run() {
            Iterator it2 = this.f11337a.iterator();
            while (it2.hasNext()) {
                g.this.animateAddImpl((RecyclerView.d0) it2.next());
            }
            this.f11337a.clear();
            g.this.mAdditionsList.remove(this.f11337a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f11339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f11341c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11339a = d0Var;
            this.f11340b = viewPropertyAnimator;
            this.f11341c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11340b.setListener((Animator.AnimatorListener) null);
            this.f11341c.setAlpha(1.0f);
            g.this.dispatchRemoveFinished(this.f11339a);
            g.this.mRemoveAnimations.remove(this.f11339a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchRemoveStarting(this.f11339a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f11343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f11344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11345c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11343a = d0Var;
            this.f11344b = view;
            this.f11345c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f11344b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f11345c.setListener((Animator.AnimatorListener) null);
            g.this.dispatchAddFinished(this.f11343a);
            g.this.mAddAnimations.remove(this.f11343a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchAddStarting(this.f11343a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f11347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11348b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f11349c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f11350d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11351e;

        f(RecyclerView.d0 d0Var, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11347a = d0Var;
            this.f11348b = i11;
            this.f11349c = view;
            this.f11350d = i12;
            this.f11351e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f11348b != 0) {
                this.f11349c.setTranslationX(0.0f);
            }
            if (this.f11350d != 0) {
                this.f11349c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f11351e.setListener((Animator.AnimatorListener) null);
            g.this.dispatchMoveFinished(this.f11347a);
            g.this.mMoveAnimations.remove(this.f11347a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchMoveStarting(this.f11347a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0078g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f11353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f11355c;

        C0078g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11353a = iVar;
            this.f11354b = viewPropertyAnimator;
            this.f11355c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11354b.setListener((Animator.AnimatorListener) null);
            this.f11355c.setAlpha(1.0f);
            this.f11355c.setTranslationX(0.0f);
            this.f11355c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f11353a.f11361a, true);
            g.this.mChangeAnimations.remove(this.f11353a.f11361a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f11353a.f11361a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f11357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f11358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f11359c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11357a = iVar;
            this.f11358b = viewPropertyAnimator;
            this.f11359c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11358b.setListener((Animator.AnimatorListener) null);
            this.f11359c.setAlpha(1.0f);
            this.f11359c.setTranslationX(0.0f);
            this.f11359c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f11357a.f11362b, false);
            g.this.mChangeAnimations.remove(this.f11357a.f11362b);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f11357a.f11362b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f11367a;

        /* renamed from: b  reason: collision with root package name */
        public int f11368b;

        /* renamed from: c  reason: collision with root package name */
        public int f11369c;

        /* renamed from: d  reason: collision with root package name */
        public int f11370d;

        /* renamed from: e  reason: collision with root package name */
        public int f11371e;

        j(RecyclerView.d0 d0Var, int i11, int i12, int i13, int i14) {
            this.f11367a = d0Var;
            this.f11368b = i11;
            this.f11369c = i12;
            this.f11370d = i13;
            this.f11371e = i14;
        }
    }

    private void animateRemoveImpl(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(d0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, d0Var) && iVar.f11361a == null && iVar.f11362b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.d0 d0Var = iVar.f11361a;
        if (d0Var != null) {
            endChangeAnimationIfNecessary(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f11362b;
        if (d0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, d0Var2);
        }
    }

    private void resetAnimation(RecyclerView.d0 d0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(d0Var);
    }

    public boolean animateAdd(RecyclerView.d0 d0Var) {
        resetAnimation(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(d0Var);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateAddImpl(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(d0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(d0Var, view, animate)).start();
    }

    public boolean animateChange(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i11, int i12, int i13, int i14) {
        if (d0Var == d0Var2) {
            return animateMove(d0Var, i11, i12, i13, i14);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        resetAnimation(d0Var);
        int i15 = (int) (((float) (i13 - i11)) - translationX);
        int i16 = (int) (((float) (i14 - i12)) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            resetAnimation(d0Var2);
            d0Var2.itemView.setTranslationX((float) (-i15));
            d0Var2.itemView.setTranslationY((float) (-i16));
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(d0Var, d0Var2, i11, i12, i13, i14));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateChangeImpl(i iVar) {
        View view;
        RecyclerView.d0 d0Var = iVar.f11361a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.itemView;
        }
        RecyclerView.d0 d0Var2 = iVar.f11362b;
        if (d0Var2 != null) {
            view2 = d0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f11361a);
            duration.translationX((float) (iVar.f11365e - iVar.f11363c));
            duration.translationY((float) (iVar.f11366f - iVar.f11364d));
            duration.alpha(0.0f).setListener(new C0078g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f11362b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public boolean animateMove(RecyclerView.d0 d0Var, int i11, int i12, int i13, int i14) {
        View view = d0Var.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) d0Var.itemView.getTranslationY());
        resetAnimation(d0Var);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            dispatchMoveFinished(d0Var);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX((float) (-i15));
        }
        if (i16 != 0) {
            view.setTranslationY((float) (-i16));
        }
        this.mPendingMoves.add(new j(d0Var, translationX, translationY, i13, i14));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateMoveImpl(RecyclerView.d0 d0Var, int i11, int i12, int i13, int i14) {
        View view = d0Var.itemView;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i16 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(d0Var);
        animate.setDuration(getMoveDuration()).setListener(new f(d0Var, i15, view, i16, animate)).start();
    }

    public boolean animateRemove(RecyclerView.d0 d0Var) {
        resetAnimation(d0Var);
        this.mPendingRemovals.add(d0Var);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(d0Var, list);
    }

    /* access modifiers changed from: package-private */
    public void cancelAll(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f11367a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(d0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, d0Var);
        if (this.mPendingRemovals.remove(d0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(d0Var);
        }
        if (this.mPendingAdditions.remove(d0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(d0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f11367a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(d0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(d0Var);
        this.mAddAnimations.remove(d0Var);
        this.mChangeAnimations.remove(d0Var);
        this.mMoveAnimations.remove(d0Var);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f11367a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f11367a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.mPendingAdditions.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(d0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f11367a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f11367a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    public void runPendingAnimations() {
        boolean z11 = !this.mPendingRemovals.isEmpty();
        boolean z12 = !this.mPendingMoves.isEmpty();
        boolean z13 = !this.mPendingChanges.isEmpty();
        boolean z14 = !this.mPendingAdditions.isEmpty();
        if (z11 || z12 || z14 || z13) {
            Iterator<RecyclerView.d0> it2 = this.mPendingRemovals.iterator();
            while (it2.hasNext()) {
                animateRemoveImpl(it2.next());
            }
            this.mPendingRemovals.clear();
            if (z12) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                a aVar = new a(arrayList);
                if (z11) {
                    a0.p0(((j) arrayList.get(0)).f11367a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                b bVar = new b(arrayList2);
                if (z11) {
                    a0.p0(((i) arrayList2.get(0)).f11361a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z14) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                c cVar = new c(arrayList3);
                if (z11 || z12 || z13) {
                    long j11 = 0;
                    long removeDuration = z11 ? getRemoveDuration() : 0;
                    long moveDuration = z12 ? getMoveDuration() : 0;
                    if (z13) {
                        j11 = getChangeDuration();
                    }
                    a0.p0(((RecyclerView.d0) arrayList3.get(0)).itemView, cVar, removeDuration + Math.max(moveDuration, j11));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f11361a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f11362b;

        /* renamed from: c  reason: collision with root package name */
        public int f11363c;

        /* renamed from: d  reason: collision with root package name */
        public int f11364d;

        /* renamed from: e  reason: collision with root package name */
        public int f11365e;

        /* renamed from: f  reason: collision with root package name */
        public int f11366f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f11361a = d0Var;
            this.f11362b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f11361a + ", newHolder=" + this.f11362b + ", fromX=" + this.f11363c + ", fromY=" + this.f11364d + ", toX=" + this.f11365e + ", toY=" + this.f11366f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i11, int i12, int i13, int i14) {
            this(d0Var, d0Var2);
            this.f11363c = i11;
            this.f11364d = i12;
            this.f11365e = i13;
            this.f11366f = i14;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.d0 d0Var) {
        boolean z11 = false;
        if (iVar.f11362b == d0Var) {
            iVar.f11362b = null;
        } else if (iVar.f11361a != d0Var) {
            return false;
        } else {
            iVar.f11361a = null;
            z11 = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(d0Var, z11);
        return true;
    }
}
