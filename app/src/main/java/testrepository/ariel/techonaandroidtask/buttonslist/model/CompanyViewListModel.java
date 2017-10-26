package testrepository.ariel.techonaandroidtask.buttonslist.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyViewListModel {

    private static CompanyViewListModel buttonsModel;
    private static List<CompanyViewData> dataSet;

    public static CompanyViewListModel getInstance() {
        if (buttonsModel == null) {
            buttonsModel = new CompanyViewListModel();
            dataSet = new ArrayList<>();
        }
        return buttonsModel;
    }

    private CompanyViewListModel() {
    }

    public List<CompanyViewData> getDataSet() {
        return dataSet;
    }

}


