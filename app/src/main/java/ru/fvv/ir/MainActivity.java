package ru.fvv.ir;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.PrintStream;





public class MainActivity extends AppCompatActivity {

    private String freqA;
    SharedPreferences mySP11;
    private int freqB = 38000;
    String SAVE_TEXT11 = "save text11";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//        public void OnClick1 (View view) {
//            System.out.println("Test нажатия кнопки");
//
//
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.getSystemService(Context.CONSUMER_IR_SERVICE);
//            int frequency = 38400;
//            int[] pattern = new int[]{
////                      1, 105, 5, 1, 75, 1095, 20, 60, 20, 140, 15, 2500, 80, 1
//// Volume +
//                        8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580
//
//
//            };
//            consumerIrManager.transmit(frequency, pattern);
//
//
//
////                    if (Build.VERSION.SDK_INT >= 23) {
////            // ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
////            ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.getSystemService(Context.CONSUMER_IR_SERVICE);
////
////            if (consumerIrManager.hasIrEmitter()) {
////                consumerIrManager.transmit(this.freqB, new int[]{
////                        //4580, 4470, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 580, 520, 580, 520, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 630, 520, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 570, 530, 1720, 580, 520, 580, 1670, 580, 1670, 580, 1720, 530, 1720, 580, 1670, 580, 1670, 580
////
////                        // Volume +
////                        8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580
////
////                });
//////                PrintStream printStream = System.out;
//////                printStream.println("freqB = " + this.freqB);
//////                PrintStream printStream2 = System.out;
//////                printStream2.println("freqB = " + this.freqB);
////                return;
////            }
////            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
////        }
//    }

    public void onClick1(View view) {
        System.out.println("Test нажатия кнопки");

                if (Build.VERSION.SDK_INT >= 23) {
            //ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService(Context.CONSUMER_IR_SERVICE);
            if (consumerIrManager.hasIrEmitter()) {
                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 580, 520, 580, 520, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 630, 520, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 570, 530, 1720, 580, 520, 580, 1670, 580, 1670, 580, 1720, 530, 1720, 580, 1670, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                PrintStream printStream2 = System.out;
//                printStream2.println("freqB = " + this.freqB);
                return;
            }
            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
        }




//        ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.getSystemService(Context.CONSUMER_IR_SERVICE);
//        int frequency = 38400;
//        int[] pattern = new int[]{
////                      1, 105, 5, 1, 75, 1095, 20, 60, 20, 140, 15, 2500, 80, 1
//// Volume +
//                8930,4420, 580,1670, 580,520, 630,520, 580,1670, 580,520, 630,520, 580,520, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,1670, 580,1620, 630,1620, 580,1670, 580,520, 630,520, 580,520, 630,1620, 630,1620, 580,570, 580,1620, 630,520, 580,1670, 580,1620, 630,1620, 630,520, 580,570, 580,1620, 630,520, 580,1670, 580
//
//
//        };
//        consumerIrManager.transmit(frequency, pattern);

    }


//    void loadPref() {
//        SharedPreferences sharedPreferences = getSharedPreferences("MyPref", 0);
//        this.mySP11 = sharedPreferences;
//        String string = sharedPreferences.getString(this.SAVE_TEXT11, "33000");
//        this.freqA = string;
//        this.freqB = Integer.parseInt(string);
//    }
//
//    void savePref() {
//        SharedPreferences sharedPreferences = getSharedPreferences("MyPref", 0);
//        this.mySP11 = sharedPreferences;
//        SharedPreferences.Editor edit = sharedPreferences.edit();
//        edit.putString(this.SAVE_TEXT11, ((EditText) findViewById(R.id.editText1)).getText().toString());
//        edit.apply();
//    }
//
//    public void onClickFreq(View view) {
//        String obj = ((EditText) findViewById(R.id.editText1)).getText().toString();
//        this.freqA = obj;
//        this.freqB = Integer.parseInt(obj);
//        savePref();
//        PrintStream printStream = System.out;
//        printStream.println("freqB = " + this.freqB);
//    }

//
//    public void onClick1(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 580, 520, 580, 520, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 630, 520, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 570, 530, 1720, 580, 520, 580, 1670, 580, 1670, 580, 1720, 530, 1720, 580, 1670, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                PrintStream printStream2 = System.out;
//                printStream2.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick2(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[0]);
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick3(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4520, 580, 1670, 580, 1670, 580, 1670, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 1670, 580, 1670, 580, 1670, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 1620, 630, 1670, 580, 1670, 580, 1670, 580, 1670, 580, 1670, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick4(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 580, 1670, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 580, 1670, 630, 1670, 580, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 580, 1670, 630, 1620, 630, 1670, 580, 1670, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick5(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[0]);
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick6(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1670, 530, 570, 580, 520, 630, 520, 580, 520, 580, 520, 580, 1670, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 1670, 580, 520, 580, 520, 630, 1620, 580, 570, 580, 520, 580, 520, 630, 1670, 580, 520, 580, 1670, 580, 1670, 580, 520, 630, 1670, 580, 1670, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick7(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4630, 4420, 630, 1670, 580, 1670, 580, 1670, 630, 470, 630, 470, 630, 520, 630, 470, 630, 470, 630, 1670, 580, 1670, 580, 1670, 630, 470, 630, 470, 630, 520, 630, 470, 630, 470, 630, 1670, 580, 1670, 630, 470, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 630, 470, 630, 1620, 630, 520, 580, 1670, 580, 1670, 630, 1620, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick8(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1620, 630, 1620, 630, 520, 630, 470, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 630, 470, 630, 470, 630, 520, 630, 470, 630, 470, 630, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 630, 1620, 630, 470, 630, 1620, 630, 1670, 580, 1670, 630, 1620, 630, 1620, 630, 470, 630, 520, 580, 1670, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick9(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4530, 4520, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 1670, 580, 1720, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 570, 530, 570, 580, 520, 580, 570, 530, 1720, 530, 570, 580, 520, 580, 570, 530, 1720, 580, 1670, 580, 1670, 580, 1670, 580, 570, 530, 1720, 530, 1720, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick10(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 470, 630, 1670, 580, 520, 630, 470, 630, 1620, 630, 1620, 630, 520, 630, 470, 630, 1620, 630, 520, 580, 1670, 580, 1670, 630, 470, 630, 470, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick11(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 580, 1670, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 580, 570, 580, 520, 580, 520, 580, 1670, 630, 520, 580, 1670, 580, 1670, 580, 520, 580, 1670, 630, 1670, 580, 1670, 580, 520, 580, 1670, 580, 520, 630, 520, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick12(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 680, 420, 630, 1620, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 630, 470, 680, 470, 630, 1620, 630, 470, 630, 470, 630, 520, 580, 1670, 580, 1670, 680, 420, 630, 1620, 630, 520, 580, 1670, 630, 1620, 630, 1620, 630, 520, 580, 520, 580, 1670, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick13(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[0]);
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick14(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 580, 1670, 630, 1620, 630, 520, 580, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 580, 1670, 630, 1620, 630, 520, 580, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 580, 520, 630, 520, 580, 520, 580, 520, 630, 1620, 630, 1670, 580, 520, 580, 520, 630, 1620, 630, 1620, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick15(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[0]);
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick16(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1620, 630, 470, 630, 520, 630, 470, 630, 470, 630, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 630, 1620, 630, 1620, 630, 470, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick17(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1620, 630, 470, 630, 520, 630, 470, 630, 470, 630, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 630, 470, 630, 1620, 630, 520, 580, 1670, 580, 520, 630, 470, 630, 1620, 630, 520, 630, 1620, 630, 470, 630, 1620, 630, 520, 580, 1670, 630, 1620, 630, 470, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick18(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1670, 580, 1670, 580, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 1620, 630, 1670, 580, 1620, 630, 520, 580, 520, 630, 520, 580, 520, 580, 520, 630, 520, 580, 1670, 580, 1670, 580, 520, 630, 520, 580, 520, 580, 1670, 580, 520, 630, 1670, 580, 520, 580, 520, 630, 1620, 630, 1670, 580, 1670, 580, 520, 580, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick19(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4630, 4470, 580, 1670, 580, 1670, 580, 1670, 630, 470, 630, 520, 580, 520, 580, 520, 630, 520, 580, 1670, 580, 1670, 580, 1670, 630, 470, 630, 520, 580, 520, 580, 520, 630, 520, 580, 520, 580, 1670, 630, 470, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 520, 580, 1670, 580, 520, 630, 1620, 630, 520, 580, 520, 580, 1670, 630, 1620, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick20(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 580, 520, 630, 1620, 630, 1620, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick21(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 630, 1620, 630, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 630, 470, 630, 1620, 630, 1620, 630, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 520, 580, 1670, 580, 520, 630, 1620, 630, 1620, 630, 1670, 580, 520, 630, 470, 630, 1620, 630, 520, 580, 1670, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick22(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 630, 1620, 530, 1770, 530, 1720, 530, 570, 580, 520, 630, 520, 530, 570, 580, 520, 630, 1620, 630, 1670, 580, 1670, 580, 520, 630, 470, 630, 520, 580, 520, 630, 470, 630, 1620, 530, 620, 530, 1720, 530, 1720, 580, 520, 630, 1620, 630, 520, 530, 570, 580, 520, 630, 1670, 580, 520, 580, 520, 630, 1620, 630, 520, 580, 1670, 530, 1720, 530});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick23(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 580, 1670, 630, 1620, 630, 470, 630, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 630, 1620, 630, 1620, 630, 470, 630, 520, 580, 520, 630, 470, 630, 520, 580, 1670, 630, 470, 630, 470, 630, 1670, 580, 1670, 580, 1670, 630, 1620, 630, 470, 630, 520, 580, 1670, 630, 1620, 630, 470, 630, 520, 580, 520, 630, 470, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick24(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{4580, 4470, 580, 1670, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 470, 630, 470, 630, 520, 630, 1620, 630, 1620, 630, 1620, 630, 1620, 630, 520, 630, 470, 630, 470, 630, 520, 580, 520, 630, 470, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 1670, 580});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick25(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{8980, 4420, 630, 520, 580, 520, 580, 1670, 580, 1670, 580, 520, 630, 520, 580, 1670, 580, 1670, 580, 1670, 580, 520, 580, 1670, 580, 1670, 580, 1670, 580, 520, 630, 520, 580, 520, 630, 1620, 630, 520, 580, 1670, 580, 520, 580, 570, 580, 520, 580, 520, 630, 520, 580, 520, 630, 1620, 630, 520, 580, 1670, 580, 1670, 580, 1670, 580, 1620, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }
//
//
//    public void onClick26(View view) {
//        if (Build.VERSION.SDK_INT >= 23) {
//            ConsumerIrManager consumerIrManager = (ConsumerIrManager) getApplicationContext().getSystemService("consumer_ir");
//            if (consumerIrManager.hasIrEmitter()) {
//                consumerIrManager.transmit(this.freqB, new int[]{9030, 4420, 580, 520, 630, 520, 580, 1620, 630, 1620, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 1620, 630, 520, 580, 1670, 580, 1620, 630, 1620, 630, 520, 580, 520, 630, 520, 580, 520, 630, 1620, 630, 1620, 630, 520, 580, 520, 630, 520, 580, 520, 630, 520, 580, 1620, 630, 520, 630, 470, 630, 1620, 630, 1620, 630, 1620, 630, 1620, 630, 1620, 630});
//                PrintStream printStream = System.out;
//                printStream.println("freqB = " + this.freqB);
//                return;
//            }
//            Toast.makeText((Context) this, (CharSequence) "Смартфон не поддерживает ИК порт", 0).show();
//        }
//    }


}