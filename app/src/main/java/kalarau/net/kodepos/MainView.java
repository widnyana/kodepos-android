package kalarau.net.kodepos;

import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;

/**
 * Created by wid on 12/27/15.
 */
public interface MainView {
    public void showProgress();

    public void hideProgress();

    public void setItems(SearchResult items);

    public void showMessage(String message);

}
