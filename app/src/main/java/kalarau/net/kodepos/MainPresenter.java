package kalarau.net.kodepos;

import android.widget.EditText;

public interface MainPresenter {

    public void onResume();

    public void onSearchEnter(EditText searchKeyword);

    public void onSearchResultListClicked(int posisiton);
}
