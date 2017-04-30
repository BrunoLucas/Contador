package rukaso.com.br.contador;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer numeroHomens = 0;
    private Integer numeroMulheres = 0;
    private Integer numeroPessoas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textoPessoas = (TextView) findViewById(R.id.textoPessoas);

        final Button botaoHomens = (Button) findViewById(R.id.botaoHomem);
        final Button botaoMulheres = (Button) findViewById(R.id.botaoMulher);
        Button botaoReset = (Button) findViewById(R.id.botaoReset);


        botaoHomens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroPessoas++;
                botaoHomens.setText(String.valueOf(++numeroHomens));
                textoPessoas.setText("Pessoas: " + numeroPessoas);
            }
        });

        botaoMulheres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeroPessoas++;
                botaoMulheres.setText(String.valueOf(++numeroMulheres));
                textoPessoas.setText("Pessoas: " + numeroPessoas);
            }
        });

        botaoReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    numeroMulheres = 0;
                    numeroHomens = 0;
                    numeroPessoas = 0;
                    textoPessoas.setText("Pessoas: 0");
                    botaoHomens.setText("0");
                    botaoMulheres.setText("0");
            }
        });

    }

}
