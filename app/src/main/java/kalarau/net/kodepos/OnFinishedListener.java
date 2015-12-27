package kalarau.net.kodepos;

import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;

public interface OnFinishedListener {
    void onFinished(SearchResult items);
}
