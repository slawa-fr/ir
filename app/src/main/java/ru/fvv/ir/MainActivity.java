package ru.fvv.ir;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.view.View;
import android.widget.Toast;

// 26.01.2025 Я начал восстанавливать проект ИК-пульта. Архив был утерян, пытался декомпелировать старый апк-файл.
// Приходится всё делать с нуля. 2 дня пытался создать пустой проект в Android Studio - результата ноль
// Получилось только в IDEA и то старой версии: Itellige IDEA 2023.1.2. Эмулятор Pixel API33
// Это проект для пульта ТВ приставки Media Room

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// VOL+
8930, 4420, 580, 1670, 580, 520, 630, 520, 580, 1670, 580, 520, 630, 520, 580, 520, 630, 520, 580, 1670, 580, 1620, 630, 1620, 630, 520, 580, 1670, 580, 1620, 630, 1620, 580, 1670, 580, 520, 630, 520, 580, 520, 630, 1620, 630, 1620, 580, 570, 580, 1620, 630, 520, 580, 1670, 580, 1620, 630, 1620, 630, 520, 580, 570, 580, 1620, 630, 520, 580, 1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
        }


    }

}