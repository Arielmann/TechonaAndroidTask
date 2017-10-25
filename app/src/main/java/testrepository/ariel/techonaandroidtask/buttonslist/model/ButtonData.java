package testrepository.ariel.techonaandroidtask.buttonslist.model;

import java.util.UUID;

public class ButtonData {

    private String id;
    private final int spaceHeight;
    private String companyTitle;
    private int buttonLeftMargin;
    private int buttonRightMargin;
    private int buttonTopMargin;
    private int buttonBottomMargin;
    private int tvLeftMargin;
    private int tvRightMargin;
    private int tvTopMargin;
    private int tvBottomMargin;

    public String getCompanyTitle() {
        return companyTitle;
    }

    public int getButtonLeftMargin() {
        return buttonLeftMargin;
    }

    public int getButtonTopMargin() {
        return buttonTopMargin;
    }

    public int getTvLeftMargin() {
        return tvLeftMargin;
    }

    public int getTvTopMargin() {
        return tvTopMargin;
    }

    public int getButtonRightMargin() {
        return buttonRightMargin;
    }

    public int getButtonBottomMargin() {
        return buttonBottomMargin;
    }

    public int getTvBottomMargin() {
        return tvBottomMargin;
    }

    public int getTvRightMargin() {
        return tvRightMargin;
    }

    public int getSpaceHeight() {
        return spaceHeight;
    }

    static class Builder {
        // Required parameters
        private final String companyTitle;

        // Optional parameters - initialized to default values
        private int buttonLeftMargin;
        private int buttonRightMargin;
        private int buttonTopMargin;
        private int buttonBottomMargin;
        private int tvLeftMargin;
        private int tvRightMargin;
        private int tvTopMargin;
        private int tvBottomMargin;
        private int spaceHeight;

        public Builder(String companyTitle) {
            this.companyTitle = companyTitle;
        }

        public Builder buttonLeftMargin(int val) {
            buttonLeftMargin = val;
            return this;
        }

        public Builder buttonRightMargin(int val) {
            buttonRightMargin = val;
            return this;
        }

        public Builder buttonTopMargin(int val) {
            buttonTopMargin = val;
            return this;
        }

        public Builder buttonBottomMargin(int val) {
            buttonBottomMargin = val;
            return this;
        }

        public Builder tvLeftMargin(int val) {
            tvLeftMargin = val;
            return this;
        }

        public Builder tvRightMargin(int val) {
            tvRightMargin = val;
            return this;
        }

        public Builder tvTopMargin(int val) {
            tvTopMargin = val;
            return this;
        }

        public Builder tvBottomMargin(int val) {
            tvBottomMargin = val;
            return this;
        }


        public ButtonData build() {
            return new ButtonData(this);
        }

        public Builder spaceHeight(int val) {
            spaceHeight = val;
            return this;
        }
    }

    private ButtonData(Builder builder) {
        id = UUID.randomUUID().toString();
        companyTitle = builder.companyTitle;
        buttonLeftMargin = builder.buttonLeftMargin;
        buttonRightMargin = builder.buttonRightMargin;
        buttonTopMargin = builder.buttonTopMargin;
        buttonBottomMargin = builder.buttonBottomMargin;
        tvLeftMargin = builder.tvLeftMargin;
        tvRightMargin = builder.tvRightMargin;
        tvTopMargin = builder.tvTopMargin;
        tvBottomMargin = builder.tvBottomMargin;
        spaceHeight = builder.spaceHeight;
    }
}
