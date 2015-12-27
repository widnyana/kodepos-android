package kalarau.net.kodepos;

import android.util.Log;
import android.widget.EditText;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kalarau.net.kodepos.KodeposAPI.KodeposAPI;
import kalarau.net.kodepos.KodeposAPI.KodeposRestClient;
import kalarau.net.kodepos.KodeposAPI.Models.Meta;
import kalarau.net.kodepos.KodeposAPI.Models.Result;
import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


/**
 * Created by wid on 12/27/15.
 */
public class MainPresenterImpl
        implements MainPresenter, OnFinishedListener
{

    protected boolean haveSearch;
    protected Retrofit retrofit;
    protected KodeposAPI api_client;
    private MainView mainView;
//    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
//        findItemsInteractor = new FindItemsInteractorImpl();
    }


    @Override
    public void onResume() {
//        mainView.showProgress();
//        findItemsInteractor.findItems(this);
    }

    @Override
    public void onSearchEnter(EditText searchKeyword) {
        mainView.showProgress();
        this.haveSearch = true;

        String keyword = searchKeyword.getText().toString();
        mainView.showMessage(String.format("I'm Trigered by enter. and got keyword: %s", keyword));

        if (api_client == null) {
            retrofit = new KodeposRestClient().getClient();
            api_client = retrofit.create(KodeposAPI.class);
        }

        Call<SearchResult> call = api_client.SearchKodepos(keyword);
        call.enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Response<SearchResult> response, Retrofit retrofit) {
                mainView.setItems(response.body());
                mainView.hideProgress();
            }

            @Override
            public void onFailure(Throwable t) {
                mainView.hideProgress();
                Log.e("net.kalarau.Kodepos", String.format("Error mbak. %s", t.getMessage()));
                mainView.showMessage("Data Tidak Ditemukan.");

                List<Result> results = new ArrayList<>();
                results.add(new Result("0", "0", "", "", "", "", "Data Tidak Ditemukan"));
                SearchResult result = new SearchResult(results, new Meta());

                mainView.setItems(result);
            }
        });
    }

    @Override
    public void onSearchResultListClicked(int position) {
        mainView.showMessage(String.format("Item Clicked at pos: %d", position));
    }

    @Override
    public void onFinished(SearchResult items) {
        mainView.setItems(items);
        mainView.hideProgress();
    }
}
