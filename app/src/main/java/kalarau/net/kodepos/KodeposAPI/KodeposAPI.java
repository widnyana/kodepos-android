package kalarau.net.kodepos.KodeposAPI;

import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;
import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


public interface KodeposAPI {

    @GET("search")
//    Callback<SearchResult> SearchKodepos(@Query("q") String keyword);
//    SearchKodepos(@Query("q") String keyword, Callback<SearchResult> routesCallback);
    Call<SearchResult> SearchKodepos(
            @Query("q") String keyword);
}
