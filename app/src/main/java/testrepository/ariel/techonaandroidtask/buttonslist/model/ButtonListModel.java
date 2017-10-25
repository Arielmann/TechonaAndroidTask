package testrepository.ariel.techonaandroidtask.buttonslist.model;

import java.util.ArrayList;
import java.util.List;

public class ButtonListModel {

    private static ButtonListModel buttonsModel;
    private static List<ButtonData> dataSet;

    public static ButtonListModel getInstance() {
        if (buttonsModel == null) {
            buttonsModel = new ButtonListModel();
            dataSet = new ArrayList<>();
            dataSet = buttonsModel.initDataSet();
        }
        return buttonsModel;
    }

    private ButtonListModel() {
    }

    private List<ButtonData> initDataSet() {
        dataSet.add(new ButtonData.Builder("Apple").buttonLeftMargin(0)
                .buttonRightMargin(250).buttonTopMargin(200).buttonBottomMargin(0)
                .tvLeftMargin(0).tvRightMargin(245).tvTopMargin(0).tvBottomMargin(0).build());

        dataSet.add(new ButtonData.Builder("yahoo").buttonLeftMargin(0)
                .buttonRightMargin(450).buttonTopMargin(0).buttonBottomMargin(0)
                .tvLeftMargin(0).tvRightMargin(145).tvTopMargin(0).tvBottomMargin(0).build());

        dataSet.add(new ButtonData.Builder("Google").buttonLeftMargin(0)
                .buttonRightMargin(145).buttonTopMargin(0).buttonBottomMargin(0)
                .tvLeftMargin(0).tvRightMargin(450).tvTopMargin(0).tvBottomMargin(0).build());
       // dataSet.add(new ButtonData.Builder("yahoo").buttonXLeftMargin(-100).buttonYPos(50).tvXPod(200).tvYPos(50).build());
        //dataSet.add(new ButtonData.Builder("Google").buttonXLeftMargin(250).buttonYPos(50).tvXPod(-100).tvYPos(50).build());
        return dataSet;
    }

    public List<ButtonData> getDataSet() {
        return dataSet;
    }

}


