package testrepository.ariel.techonaandroidtask.buttonslist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnCompanyButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.CompanyViewData;

class CompanyViewRowVH extends RecyclerView.ViewHolder {


    private static final String TAG = CompanyViewRowVH.class.getSimpleName();
    private static final int DEFAULT_LAYOUT_MARGIN = 100; //In the future, CompanyViewData may include this property as well

    private final OnCompanyButtonClicked listener;
    private final View itemView;


    CompanyViewRowVH(View itemView, OnCompanyButtonClicked listener) {
        super(itemView);
        this.itemView = itemView;
        this.listener = listener;
    }

    void setViewHolderUI(final CompanyViewData data){
        final String title = data.getTvTitle();
        final Button companyButton = (Button) itemView.findViewById(R.id.companyButton);
        final TextView companyTitleTV = (TextView) itemView.findViewById(R.id.companyTV);
        final RelativeLayout companyViewLayout = (RelativeLayout) itemView.findViewById(R.id.companyViewLayout);

        companyTitleTV.setText(title);

        RelativeLayout.LayoutParams companyViewLayoutParams = new RelativeLayout.LayoutParams(companyViewLayout.getLayoutParams().height, companyViewLayout.getLayoutParams().width);
        companyViewLayoutParams.setMargins(DEFAULT_LAYOUT_MARGIN, data.getSpaceHeight(), DEFAULT_LAYOUT_MARGIN, 0);
        companyViewLayout.setLayoutParams(companyViewLayoutParams);

        RelativeLayout.LayoutParams buttonLayoutParams = new RelativeLayout.LayoutParams(companyButton.getLayoutParams().height, companyButton.getLayoutParams().width);
        buttonLayoutParams.setMargins(data.getButtonLeftMargin(),
                data.getButtonTopMargin(), data.getButtonRightMargin(), data.getButtonBottomMargin());

        companyButton.setLayoutParams(buttonLayoutParams);


        RelativeLayout.LayoutParams tvLayoutParams = new RelativeLayout.LayoutParams(companyTitleTV.getLayoutParams().height, companyTitleTV.getLayoutParams().width);
        tvLayoutParams.setMargins(data.getTvLeftMargin(), data.getTvTopMargin(), data.getTvRightMargin(), data.getTvBottomMargin());

        companyTitleTV.setLayoutParams(tvLayoutParams);

        companyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onCompanyButtonClicked(data.getTvTitle());
            }
        });
    }

}

