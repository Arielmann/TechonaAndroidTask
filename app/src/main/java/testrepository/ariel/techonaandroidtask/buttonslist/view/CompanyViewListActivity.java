package testrepository.ariel.techonaandroidtask.buttonslist.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.adapter.CompanyViewListAdapter;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnCompanyButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.CompanyViewData;
import testrepository.ariel.techonaandroidtask.buttonslist.model.CompanyViewListModel;


public class CompanyViewListActivity extends AppCompatActivity implements OnCompanyButtonClicked {

    private String TAG = CompanyViewListActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataSet();
        List<CompanyViewData> dataSet = CompanyViewListModel.getInstance().getDataSet();
        CompanyViewListAdapter adapter = new CompanyViewListAdapter(dataSet, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    private List<CompanyViewData> initDataSet() {
        List<CompanyViewData> dataSet = CompanyViewListModel.getInstance().getDataSet();
        dataSet.add(new CompanyViewData.Builder("Apple").buttonLeftMargin(-115)
                .buttonRightMargin(165).buttonTopMargin(200).buttonBottomMargin(60)
                .tvLeftMargin(170).tvRightMargin(175).tvTopMargin(50).tvBottomMargin(0).spaceHeight(80).build());

        dataSet.add(new CompanyViewData.Builder("yahoo").buttonLeftMargin(-30)
                .buttonRightMargin(265).buttonTopMargin(70).buttonBottomMargin(70)
                .tvLeftMargin(100).tvRightMargin(30).tvTopMargin(70).tvBottomMargin(70)
                .spaceHeight(60).build());

        dataSet.add(new CompanyViewData.Builder("Google").buttonLeftMargin(100)
                .buttonRightMargin(30).buttonTopMargin(70).buttonBottomMargin(70)
                .tvLeftMargin(-45).tvRightMargin(265).tvTopMargin(70).tvBottomMargin(70)
                .spaceHeight(30).build());

        return dataSet;
    }

    @Override
    public void onCompanyButtonClicked(String title) {
        Toast.makeText(this, title, Toast.LENGTH_LONG).show();
    }
}


