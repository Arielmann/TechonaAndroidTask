package testrepository.ariel.techonaandroidtask.buttonslist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnCompanyButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.CompanyViewData;

public class CompanyViewListAdapter extends RecyclerView.Adapter<CompanyViewRowVH> {

    private List<CompanyViewData> dataSet;
    private OnCompanyButtonClicked listener;

    public CompanyViewListAdapter(List<CompanyViewData> dataSet, OnCompanyButtonClicked listener) {
        super();
        this.dataSet = dataSet;
        this.listener = listener;
    }

    @Override
    public CompanyViewRowVH onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_custom_button, parent, false);
        return new CompanyViewRowVH(view, listener);
    }

    @Override
    public void onBindViewHolder(CompanyViewRowVH holder, int position) {
        holder.setViewHolderUI(dataSet.get(position));

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}
