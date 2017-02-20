package com.decisionsupport.ahpmethod.AhpDashboard;

import android.view.View;

import com.decisionsupport.BasePresenter;
import com.decisionsupport.BaseView;

/**
 * Created by denisvieira on 04/01/17.
 */
public interface AhpDashboardContract {

    interface View extends BaseView<Presenter> {
        void startNew();
        void addCriterion(android.view.View view);
        void addAlternative(android.view.View view);
        void openAddCriterionDialog(android.view.View view);
        void closeAddCriterionDialog(android.view.View view);
        void openAddAlternativeDialog(android.view.View view);
        void closeAddAlternativeDialog(android.view.View view);
        void checkListsContent();
    }

    interface Presenter extends BasePresenter {}
}
