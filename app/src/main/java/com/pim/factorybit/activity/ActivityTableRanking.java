package com.pim.factorybit.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pim.factorybit.R;

public class ActivityTableRanking extends AppCompatActivity {

    private boolean tableFlg = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_table_ranking);

    }

    public void collapseTable(View view) {
        TableLayout table = findViewById(R.id.table);
        Button switchButton = findViewById(R.id.switchBtn);

        table.setColumnCollapsed(1, tableFlg);
        table.setColumnCollapsed(2, tableFlg);
        if (tableFlg) {
            //Close
            tableFlg = false;
            switchButton.setText("show Detail");
        } else {
            //Open
            tableFlg = true;
            switchButton.setText("Hide Detail");
        }

    }


}


