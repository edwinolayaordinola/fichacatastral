package com.ficha.fichacatastral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.ViewGroup.LayoutParams;

public class MainActivity extends AppCompatActivity {
    private CardView cardView;
    private Button buttonToggle;
    private boolean isCardExpanded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardView);
        buttonToggle = findViewById(R.id.buttonToggle);

        buttonToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCardView();
            }
        });
    }

    private void toggleCardView() {
        // Obtiene los parámetros de diseño del CardView
        LayoutParams layoutParams = cardView.getLayoutParams();

        if (isCardExpanded) {
            // Contrae el CardView
            /*layoutParams.height = LayoutParams.WRAP_CONTENT;
            cardView.setLayoutParams(layoutParams);*/
            cardView.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.cardview_height_collapsed);
            buttonToggle.setText("+");
        } else {
            // Expande el CardView
            /*layoutParams.height = LayoutParams.MATCH_PARENT;
            cardView.setLayoutParams(layoutParams);*/
            cardView.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.cardview_height_expanded);
            buttonToggle.setText("-");
        }

        // Invierte el estado de expansión
        isCardExpanded = !isCardExpanded;
    }
}