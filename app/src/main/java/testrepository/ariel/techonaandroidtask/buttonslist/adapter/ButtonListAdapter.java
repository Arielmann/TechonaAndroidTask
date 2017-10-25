package testrepository.ariel.techonaandroidtask.buttonslist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnDataButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.ButtonData;
import testrepository.ariel.techonaandroidtask.buttonslist.utils.GenericViewHolder;

public class ButtonListAdapter extends RecyclerView.Adapter<GenericViewHolder> {

    private List<ButtonData> dataSet;
    private OnDataButtonClicked listener;

    public ButtonListAdapter(List<ButtonData> dataSet, OnDataButtonClicked listener) {
        super();
        this.dataSet = dataSet;
        this.listener = listener;
    }

    @Override
    public GenericViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_custom_button, parent, false);
        return new ButtonRowViewHolder(view, dataSet, listener);
    }

    @Override
    public void onBindViewHolder(GenericViewHolder holder, int position) {
        holder.itemView.setOnClickListener((View.OnClickListener) holder);
        holder.setUIDataOnView(position);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}
