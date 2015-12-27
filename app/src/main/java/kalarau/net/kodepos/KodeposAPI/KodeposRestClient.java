package kalarau.net.kodepos.KodeposAPI;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class KodeposRestClient
{
    public static final String KODEPOS_BASEURL = "http://kalarau.net/api/v1/kodepos/";
    protected KodeposAPI client;

    public Retrofit getClient() {
        Gson gson = new GsonBuilder()
                .create();

        Retrofit r = new Retrofit.Builder()
                .baseUrl(KODEPOS_BASEURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


        return r;

    }
}
