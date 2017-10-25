package testrepository.ariel.techonaandroidtask.buttonslist.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnDataButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.ButtonData;
import testrepository.ariel.techonaandroidtask.buttonslist.utils.GenericViewHolder;

class ButtonRowViewHolder extends GenericViewHolder implements View.OnClickListener {


    private static final String TAG = ButtonRowViewHolder.class.getSimpleName();

    private final OnDataButtonClicked listener;
    private final List<ButtonData> dataSet;
    private final View itemView;


    ButtonRowViewHolder(View itemView, List<ButtonData> dataSet, OnDataButtonClicked listener) {
        super(itemView);
        this.itemView = itemView;
        this.dataSet = dataSet;
        this.listener = listener;
    }

    View.OnClickListener onCompanyButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            listener.onButtonClicked(dataSet.get(position).getCompanyTitle());
        }
    };

    public void setUIDataOnView(int position) {
        final String title = dataSet.get(position).getCompanyTitle();
        final Button companyButton = (Button) itemView.findViewById(R.id.companyButton);
        final TextView companyTitleTV = (TextView) itemView.findViewById(R.id.companyTV);
        companyTitleTV.setText(title);

        RelativeLayout.LayoutParams buttonLayoutParams = new RelativeLayout.LayoutParams(companyButton.getLayoutParams().height, companyButton.getLayoutParams().width);
        buttonLayoutParams.setMargins(dataSet.get(position).getButtonLeftMargin(), dataSet.get(position).
                getButtonTopMargin(), dataSet.get(position).
                getButtonRightMargin(), dataSet.get(position).
                getButtonBottomMargin());

        companyButton.setLayoutParams(buttonLayoutParams);

        companyButton.setOnClickListener(onCompanyButtonClicked);

        RelativeLayout.LayoutParams tvLayoutParams = new RelativeLayout.LayoutParams(companyTitleTV.getLayoutParams().height, companyTitleTV.getLayoutParams().width);
        tvLayoutParams.setMargins(dataSet.get(position).getTvLeftMargin(), dataSet.get(position).
                getTvTopMargin(), dataSet.get(position).
                getTvRightMargin(), dataSet.get(position).
                getTvBottomMargin());

        companyTitleTV.setLayoutParams(tvLayoutParams);
    }


    @Override
    public void onClick(View view) {
        int position = this.getLayoutPosition();
        listener.onButtonClicked(dataSet.get(position - 1).getCompanyTitle());
    }
}

