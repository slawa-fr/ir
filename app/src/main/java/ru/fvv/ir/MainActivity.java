package ru.fvv.ir;

import android.view.WindowManager;
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
// Весь функционал готов - 27.01.2025


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Заблокировать ориентацию экрана
//        setRequestedOrientation (MainActivity.SCREEN_ORIENTATION_PORTRAIT);
// Убрать ActionBar
        getSupportActionBar().hide();
// что-бы не включался экран блокировки
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


    }

    public void onClick1(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// ON/OFF
8880,4470, 630,1620, 630,470, 630,520, 530,1720, 580,520, 580,570, 530,570, 580,570, 530,1720, 630,1620, 530,1670, 580,620, 480,1670, 630,1620, 630,1620, 630,1620, 630,470, 630,1620, 630,520, 530,1720, 580,520, 580,570, 530,570, 580,620, 480,1720, 580,570, 530,1670, 630,520, 580,1620, 630,1620, 580,1670, 530,1720, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick2(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// SETTING (шестерёнка)
8880,4470, 630,1620, 630,520, 580,520, 630,1620, 630,470, 630,570, 580,470, 630,520, 630,1620, 630,1620, 630,1570, 630,520, 630,1620, 630,1620, 580,1620, 630,1620, 630,520, 530,570, 630,520, 580,520, 630,520, 530,570, 630,570, 580,1520, 730,1620, 530,1670, 630,1620, 630,1620, 630,1620, 580,1620, 630,1620, 630,520, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick3(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// НОМЕ ((Домой)
8930,4470, 530,1670, 580,620, 480,620, 530,1670, 580,570, 530,620, 530,620, 480,620, 530,1670, 580,1670, 580,1670, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,620, 530,570, 530,1670, 580,1670, 580,570, 530,570, 580,570, 530,620, 530,1670, 580,1670, 580,570, 530,620, 530,1670, 530,1720, 530,1670, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

///////////////////////////////////////////////////
public void onClick4(View view) {
    System.out.println("Test нажатия кнопки");

    if (Build.VERSION.SDK_INT >= 23) {
        ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
        if (consumerIrManager.hasIrEmitter()) {
            consumerIrManager.transmit(38000, new int[]{
// VOL -
8980,4420, 580,1620, 630,520, 580,520, 630,1620, 630,470, 630,520, 630,520, 580,570, 580,1620, 630,1620, 630,1570, 630,570, 580,1620, 630,1620, 580,1620, 630,1620, 580,1670, 630,520, 580,1620, 630,1620, 630,1620, 630,470, 580,1670, 630,520, 630,470, 630,1620, 630,520, 630,470, 630,520, 630,1620, 580,520, 630,1620, 630

            });
            return;
        }
        Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
    }
}

    public void onClick5(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// MUTE
8930,4420, 580,1670, 580,570, 530,570, 580,1670, 580,520, 580,570, 580,520, 580,570, 580,1670, 580,1670, 580,1620, 580,570, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,570, 580,520, 580,570, 580,520, 580,570, 580,1670, 580,520, 580,570, 580,1670, 580,1620, 580,1670, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick6(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// VOL +
8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    ///////////////////////////////////////////////////
    public void onClick7(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// PROG -
8930,4420, 580,1670, 580,570, 580,520, 580,1670, 580,570, 580,520, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,570, 580,1670, 580,520, 580,570, 580,1670, 580,520, 580,1670, 580,570, 580,1620, 580,570, 580,1670, 580,1620, 580,570, 580,1670, 580,520, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick8(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// UP
8930,4420, 530,1720, 530,570, 530,620, 530,1670, 530,620, 530,620, 480,620, 530,620, 530,1720, 530,1670, 580,1670, 530,620, 530,1670, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,520, 580,570, 580,520, 580,570, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,1670, 580,1620, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick9(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// PROG +
8930,4420, 630,1620, 580,570, 580,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,1620, 580,1670, 580,520, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }


    ///////////////////////////////////////////////////
    public void onClick10(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// LEFT
8880,4520, 580,1620, 580,570, 580,570, 530,1670, 580,570, 580,520, 580,570, 530,620, 480,1720, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,570, 530,570, 530,620, 530,570, 530,620, 530,620, 530,570, 530,620, 530,1670, 580,1670, 580,1670, 580,1670, 580,1670, 480,1720, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick11(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// OK
8930,4420, 580,1670, 580,570, 530,570, 580,1670, 580,570, 530,620, 530,570, 530,620, 530,1720, 530,1670, 530,1720, 530,620, 530,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,570, 530,620, 530,570, 530,620, 530,620, 530,570, 530,620, 530,570, 530,1720, 530,1670, 580,1670, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick12(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// RIGHT
8980,4420, 580,1620, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,520, 580,570, 580,1620, 630,1620, 580,1670, 580,520, 630,1620, 630,1620, 580,1670, 580,1670, 580,520, 580,1670, 580,520, 630,520, 580,570, 580,520, 580,570, 580,520, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }


    ///////////////////////////////////////////////////
    public void onClick13(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// BACK
8930,4470, 630,1570, 580,570, 630,520, 580,1620, 630,520, 630,470, 630,570, 580,520, 530,1720, 580,1620, 630,1620, 630,470, 630,1620, 630,1620, 530,1720, 530,1670, 580,570, 630,520, 630,1570, 630,1620, 630,1620, 530,620, 580,520, 630,520, 630,1620, 630,1570, 630,520, 630,520, 580,520, 630,1620, 630,1620, 630,1620, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick14(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// DOWN
8880,4470, 530,1720, 530,570, 580,570, 530,1670, 580,570, 530,570, 580,570, 580,570, 530,1670, 580,1670, 580,1670, 580,570, 530,1670, 580,1670, 580,1670, 530,1720, 530,1670, 580,620, 530,570, 530,570, 580,570, 530,570, 630,520, 530,620, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,1720, 480,1720, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick15(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// APP
8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 580,570, 580,520, 630,520, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1670, 580,520, 580,570, 580,520, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,1620, 580,1670, 580,1670, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }


    ///////////////////////////////////////////////////
    public void onClick16(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// VK VIDEO
8930,4470, 530,1620, 630,570, 530,620, 530,1670, 580,570, 530,570, 580,570, 530,620, 530,1670, 580,1670, 580,1670, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,570, 580,1670, 530,570, 580,570, 530,1720, 530,1670, 580,1670, 580,570, 580,1670, 530,570, 580,1670, 580,1670, 530,620, 530,570, 580,570, 580,1620, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick17(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// ZONA
9030,4370, 580,1620, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,520, 580,570, 580,1620, 630,1620, 630,1620, 580,570, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630,1620, 580,570, 580,520, 630,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,520, 580,570, 580,1620, 630

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick18(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// AIR - Эфир
8880,4470, 580,1670, 580,520, 580,570, 580,1620, 580,570, 580,570, 580,520, 580,570, 580,1670, 580,1620, 580,1670, 580,570, 580,1670, 580,1620, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,1670, 530,1670, 580,1670, 530,620, 580,520, 580,570, 580,1670, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    ///////////////////////////////////////////////////
    public void onClick19(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// MIC
8930,4420, 630,1620, 630,470, 630,570, 580,1620, 630,520, 580,520, 630,470, 630,520, 630,1620, 630,1570, 630,1620, 630,520, 630,1620, 580,1620, 630,1620, 630,1620, 630,520, 580,1620, 630,520, 530,570, 630,570, 580,1620, 630,470, 630,570, 580,1620, 580,520, 580,1670, 630,1620, 630,1570, 630,520, 630,1620, 630,1570, 630

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick20(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// MOUSE
8880,4470, 580,1670, 580,520, 580,570, 580,1620, 580,570, 580,570, 580,520, 580,570, 580,1620, 630,1620, 580,1670, 580,570, 580,1620, 580,1670, 580,1670, 580,1670, 580,520, 580,1670, 580,570, 580,1620, 580,570, 580,570, 580,1620, 580,620, 530,1670, 580,520, 580,1670, 580,570, 580,1620, 580,1670, 580,570, 580,1620, 580

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick21(View view) {
        System.out.println("Test нажатия кнопки");

        if (Build.VERSION.SDK_INT >= 23) {
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(38000, new int[]{
// MENU
8980,4420, 530,1670, 580,620, 580,520, 580,1620, 580,570, 530,620, 580,520, 530,620, 580,1620, 630,1620, 580,1670, 530,620, 530,1670, 580,1670, 630,1620, 530,1670, 580,570, 630,1620, 630,470, 580,1670, 580,1670, 580,570, 630,470, 630,520, 530,1720, 630,470, 580,1670, 630,520, 530,570, 580,1670, 630,1620, 530,1720, 530

                });
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", Toast.LENGTH_SHORT).show();
        }
    }



}




//    Питание ON/OFF
//        8880,4470, 630,1620, 630,470, 630,520, 530,1720, 580,520, 580,570, 530,570, 580,570, 530,1720, 630,1620, 530,1670, 580,620, 480,1670, 630,1620, 630,1620, 630,1620, 630,470, 630,1620, 630,520, 530,1720, 580,520, 580,570, 530,570, 580,620, 480,1720, 580,570, 530,1670, 630,520, 580,1620, 630,1620, 580,1670, 530,1720, 580
//
//        Мышь
//        8880,4470, 580,1670, 580,520, 580,570, 580,1620, 580,570, 580,570, 580,520, 580,570, 580,1620, 630,1620, 580,1670, 580,570, 580,1620, 580,1670, 580,1670, 580,1670, 580,520, 580,1670, 580,570, 580,1620, 580,570, 580,570, 580,1620, 580,620, 530,1670, 580,520, 580,1670, 580,570, 580,1620, 580,1670, 580,570, 580,1620, 580
//
//        Вверх
//        8930,4420, 530,1720, 530,570, 530,620, 530,1670, 530,620, 530,620, 480,620, 530,620, 530,1720, 530,1670, 580,1670, 530,620, 530,1670, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,520, 580,570, 580,520, 580,570, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,1670, 580,1620, 580
//
//        Влево
//        8880,4520, 580,1620, 580,570, 580,570, 530,1670, 580,570, 580,520, 580,570, 530,620, 480,1720, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,570, 530,570, 530,620, 530,570, 530,620, 530,620, 530,570, 530,620, 530,1670, 580,1670, 580,1670, 580,1670, 580,1670, 480,1720, 530
//
//        Вправо
//        8980,4420, 580,1620, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,520, 580,570, 580,1620, 630,1620, 580,1670, 580,520, 630,1620, 630,1620, 580,1670, 580,1670, 580,520, 580,1670, 580,520, 630,520, 580,570, 580,520, 580,570, 580,520, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630
//
//        Вниз
//        8880,4470, 530,1720, 530,570, 580,570, 530,1670, 580,570, 530,570, 580,570, 580,570, 530,1670, 580,1670, 580,1670, 580,570, 530,1670, 580,1670, 580,1670, 530,1720, 530,1670, 580,620, 530,570, 530,570, 580,570, 530,570, 630,520, 530,620, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,1720, 480,1720, 530
//
//        ОК
//        8930,4420, 580,1670, 580,570, 530,570, 580,1670, 580,570, 530,620, 530,570, 530,620, 530,1720, 530,1670, 530,1720, 530,620, 530,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,1670, 530,1720, 530,1670, 580,1670, 580,570, 530,620, 530,570, 530,620, 530,620, 530,570, 530,620, 530,570, 530,1720, 530,1670, 580,1670, 530
//
//        Назад
//        8930,4470, 630,1570, 580,570, 630,520, 580,1620, 630,520, 630,470, 630,570, 580,520, 530,1720, 580,1620, 630,1620, 630,470, 630,1620, 630,1620, 530,1720, 530,1670, 580,570, 630,520, 630,1570, 630,1620, 630,1620, 530,620, 580,520, 630,520, 630,1620, 630,1570, 630,520, 630,520, 580,520, 630,1620, 630,1620, 630,1620, 530
//
//        Домой
//        8930,4470, 530,1670, 580,620, 480,620, 530,1670, 580,570, 530,620, 530,620, 480,620, 530,1670, 580,1670, 580,1670, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,620, 530,570, 530,1670, 580,1670, 580,570, 530,570, 580,570, 530,620, 530,1670, 580,1670, 580,570, 530,620, 530,1670, 530,1720, 530,1670, 580,1670, 580
//
//        Громкость +
//        8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580
//
//        Громкость -
//        8980,4420, 580,1620, 630,520, 580,520, 630,1620, 630,470, 630,520, 630,520, 580,570, 580,1620, 630,1620, 630,1570, 630,570, 580,1620, 630,1620, 580,1620, 630,1620, 580,1670, 630,520, 580,1620, 630,1620, 630,1620, 630,470, 580,1670, 630,520, 630,470, 630,1620, 630,520, 630,470, 630,520, 630,1620, 580,520, 630,1620, 630
//
//        Программа +
//        8930,4420, 630,1620, 580,570, 580,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,1620, 580,1670, 580,520, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580
//
//        Программа -
//        8930,4420, 580,1670, 580,570, 580,520, 580,1670, 580,570, 580,520, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,1670, 580,1620, 580,570, 580,1670, 580,520, 580,570, 580,1670, 580,520, 580,1670, 580,570, 580,1620, 580,570, 580,1670, 580,1620, 580,570, 580,1670, 580,520, 580,1670, 580
//
//        ВК Видео
//        8930,4470, 530,1620, 630,570, 530,620, 530,1670, 580,570, 530,570, 580,570, 530,620, 530,1670, 580,1670, 580,1670, 530,570, 580,1670, 580,1670, 530,1720, 530,1670, 580,570, 580,1670, 530,570, 580,570, 530,1720, 530,1670, 580,1670, 580,570, 580,1670, 530,570, 580,1670, 580,1670, 530,620, 530,570, 580,570, 580,1620, 580
//
//        Кинопоиск
//        8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1670, 580,1620, 630,1620, 580,570, 580,1620, 630,1620, 580,570, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,520, 630,1620, 580,1670, 580,1670, 580,1620, 630,520, 580
//
//        Зона
//        9030,4370, 580,1620, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,520, 580,570, 580,1620, 630,1620, 630,1620, 580,570, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630,1620, 580,570, 580,520, 630,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,520, 580,570, 580,1620, 630
//
//        Эфир
//        8880,4470, 580,1670, 580,520, 580,570, 580,1620, 580,570, 580,570, 580,520, 580,570, 580,1670, 580,1620, 580,1670, 580,570, 580,1670, 580,1620, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,520, 580,1670, 580,1670, 580,1670, 580,520, 580,570, 580,1670, 530,1670, 580,1670, 530,620, 580,520, 580,570, 580,1670, 530
//
//        Меню
//        8980,4420, 530,1670, 580,620, 580,520, 580,1620, 580,570, 530,620, 580,520, 530,620, 580,1620, 630,1620, 580,1670, 530,620, 530,1670, 580,1670, 630,1620, 530,1670, 580,570, 630,1620, 630,470, 580,1670, 580,1670, 580,570, 630,470, 630,520, 530,1720, 630,470, 580,1670, 630,520, 530,570, 580,1670, 630,1620, 530,1720, 530
//
//        Микрофон
//        8930,4420, 630,1620, 630,470, 630,570, 580,1620, 630,520, 580,520, 630,470, 630,520, 630,1620, 630,1570, 630,1620, 630,520, 630,1620, 580,1620, 630,1620, 630,1620, 630,520, 580,1620, 630,520, 530,570, 630,570, 580,1620, 630,470, 630,570, 580,1620, 580,520, 580,1670, 630,1620, 630,1570, 630,520, 630,1620, 630,1570, 630
//
//        Настройки
//        8880,4470, 630,1620, 630,520, 580,520, 630,1620, 630,470, 630,570, 580,470, 630,520, 630,1620, 630,1620, 630,1570, 630,520, 630,1620, 630,1620, 580,1620, 630,1620, 630,520, 530,570, 630,520, 580,520, 630,520, 530,570, 630,570, 580,1520, 730,1620, 530,1670, 630,1620, 630,1620, 630,1620, 580,1620, 630,1620, 630,520, 530
//
//        Телевизор - установленные приложения
//        8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 580,570, 580,520, 630,520, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,1670, 580,1620, 630,520, 580,1670, 580,1670, 580,520, 580,570, 580,520, 630,520, 580,570, 580,1620, 630,520, 580,520, 630,1620, 580,1670, 580,1670, 580
//
//        Выключение звука (MUTE)
//        8930,4420, 580,1670, 580,570, 530,570, 580,1670, 580,520, 580,570, 580,520, 580,570, 580,1670, 580,1670, 580,1620, 580,570, 580,1670, 580,1670, 580,1620, 580,1670, 580,1670, 580,520, 580,1670, 580,1670, 580,570, 580,520, 580,570, 580,520, 580,570, 580,1670, 580,520, 580,570, 580,1670, 580,1620, 580,1670, 580,1670, 580
//
//









































































