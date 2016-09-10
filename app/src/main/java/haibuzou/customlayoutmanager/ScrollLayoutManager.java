package haibuzou.customlayoutmanager;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class ScrollLayoutManager extends LinearLayoutManager{
    public ScrollLayoutManager(Context context) {
        super(context);
    }

    public ScrollLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public boolean canScrollHorizontally() {
        return true;
    }
}
