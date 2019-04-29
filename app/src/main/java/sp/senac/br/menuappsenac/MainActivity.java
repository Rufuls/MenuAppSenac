package sp.senac.br.menuappsenac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMenuApp);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_suporte, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCompartilhar:
                Intent intent = new Intent(MainActivity.this,CompartilharActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCadastrar:

                Toast.makeText(getApplicationContext(), "Cadastrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Sobre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mMensagens:
                Toast.makeText(getApplicationContext(), "Mensagens", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAvisos:
                Toast.makeText(getApplicationContext(), "Avisos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAjuda:
                Toast.makeText(getApplicationContext(), "Ajuda", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSuporte:
                Toast.makeText(getApplicationContext(), "Suporte", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
