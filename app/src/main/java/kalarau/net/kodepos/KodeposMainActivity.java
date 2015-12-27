package kalarau.net.kodepos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;


import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;

public class KodeposMainActivity
        extends AppCompatActivity
        implements MainView, AdapterView.OnItemClickListener
{

    private ListView listViewSearchResult;
    private ProgressBar progressBar;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodepos_main);

        final EditText searchKeyword = (EditText) findViewById(R.id.searchKeyword);
        searchKeyword.setImeActionLabel("Cari", KeyEvent.KEYCODE_ENTER);
        searchKeyword.setOnEditorActionListener(
                new EditText.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                                actionId == EditorInfo.IME_ACTION_DONE ||
                                event.getAction() == KeyEvent.ACTION_DOWN &&
                                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {

                            Log.i("Kodepos",
                                    String.format("Searching Kodepos with keyword: %s", searchKeyword));
                            presenter.onSearchEnter(searchKeyword);
                            return true;
                        }
                        return false;
                    }

                });

        listViewSearchResult = (ListView) findViewById(R.id.SearchResultListView);
        listViewSearchResult.setOnItemClickListener(this);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new MainPresenterImpl(this);
    }

        @Override
        protected void onResume () {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        listViewSearchResult.setVisibility(View.INVISIBLE);
    }

        @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        listViewSearchResult.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(SearchResult items) {

        // custom row layout
        listViewSearchResult.setAdapter(
                new ResultArrayAdapter(this, R.layout.kodepos_result_row, items));

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onSearchResultListClicked(position);
    }
}
