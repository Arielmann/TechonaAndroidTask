package testrepository.ariel.techonaandroidtask.buttonslist.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import testrepository.ariel.techonaandroidtask.R;
import testrepository.ariel.techonaandroidtask.buttonslist.adapter.ButtonListAdapter;
import testrepository.ariel.techonaandroidtask.buttonslist.events.OnDataButtonClicked;
import testrepository.ariel.techonaandroidtask.buttonslist.model.ButtonData;
import testrepository.ariel.techonaandroidtask.buttonslist.model.ButtonListModel;


public class ButtonListActivity extends AppCompatActivity implements OnDataButtonClicked {

    private String TAG = ButtonListActivity.class.getName();
    RecyclerView recyclerView;
    ButtonListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ButtonData> dataSet = ButtonListModel.getInstance().getDataSet();
        adapter = new ButtonListAdapter(dataSet, this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onButtonClicked(String name) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }
}


