package kalarau.net.kodepos;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

import kalarau.net.kodepos.KodeposAPI.Models.Meta;
import kalarau.net.kodepos.KodeposAPI.Models.Result;
import kalarau.net.kodepos.KodeposAPI.Models.SearchResult;

/**
 * Override how to show data on Row of ListView
 */
public class ResultArrayAdapter extends ArrayAdapter<Result>
{

    protected boolean _hasNext = false;
    private final Context ctx;
    private final SearchResult result;
    private final List<Result> resultArrayList;

    public ResultArrayAdapter(Context ctx, @LayoutRes int resource, @NonNull SearchResult objects) {
        super(ctx, resource, objects.getResult());

        this.ctx = ctx;
        this.result = objects;
        this.resultArrayList = objects.getResult();
    }


    public boolean hasNext() {
        return this._hasNext;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check pagination
        try {
            Long curpage = this.result.getMeta().getPagination().getCurrentPage();
            Long totalPage = this.result.getMeta().getPagination().getTotalPages();
            if (curpage < totalPage) {
                this._hasNext = true;
            }
        } catch (NullPointerException ignored) {

        }
        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.kodepos_result_row, parent, false);

        // 3. Get the two text view from the rowView
        TextView labelView = (TextView) rowView.findViewById(R.id.resultKodepos);
        TextView valueView = (TextView) rowView.findViewById(R.id.kodeposResultBrief);

        // 4. Set the text for textView
        String kabupaten = resultArrayList.get(position).getKabupaten();
        if (kabupaten == null) {
            kabupaten = resultArrayList.get(position).getKota().toString();
        }
        String provinsi = resultArrayList.get(position).getProvinsi();

        String brief = String.format(
                "%s %s",
                resultArrayList.get(position).getKelurahan(),
                resultArrayList.get(position).getKecamatan()
        );

        if (("" != kabupaten) && ("" != provinsi)) {
            brief = String.format("%s. (%s %s)",brief, kabupaten, provinsi);
        }

        labelView.setText(resultArrayList.get(position).getKodepos());
        valueView.setText(brief);

        // 5. return rowView
        return rowView;
    }

}
