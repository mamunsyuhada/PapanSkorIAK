package xyz.mamunsyuhada.papanskoriak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView skorA;
    private TextView skorB;

    int nilaiTimA = 0;
    int nilaiTimB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tambahTigaKiri(View view) {
        nilaiTimA = nilaiTimA + 3;
        tamppilkanSkorKiri(nilaiTimA);
    }

    public void tambahDuaKiri(View view) {
        nilaiTimA = nilaiTimA + 2;
        tamppilkanSkorKiri(nilaiTimA);
    }

    public void tambahSatuKiri(View view) {
        nilaiTimA = nilaiTimA + 1;
        tamppilkanSkorKiri(nilaiTimA);
    }

    private void tamppilkanSkorKiri(int nilaiTimA) {
        skorA = findViewById(R.id.tvNilaiA);
        skorA.setText(String.valueOf(nilaiTimA));
    }

    public void tambahTigaKanan(View view) {
        nilaiTimB = nilaiTimB + 3;
        tamppilkanSkorKanan(nilaiTimB);
    }

    public void tambahDuaKanan(View view) {
        nilaiTimB = nilaiTimB + 2;
        tamppilkanSkorKanan(nilaiTimB);
    }

    public void tambahSatuKanan(View view) {
        nilaiTimB = nilaiTimB + 1;
        tamppilkanSkorKanan(nilaiTimB);
    }

    private void tamppilkanSkorKanan(int nilaiTimB) {
        skorB = findViewById(R.id.tvNilaiB);
        skorB.setText(String.valueOf(nilaiTimB));
    }


    public void resetNilai(View view) {
        nilaiTimA = 0;
        nilaiTimB = 0;

        tamppilkanSkorKiri(nilaiTimA);
        tamppilkanSkorKanan(nilaiTimB);
    }
}