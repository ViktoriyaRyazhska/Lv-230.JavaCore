package com.forest.guessthegame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory{

    private Button one = null;
    private Button two = null;
    private Button three = null;
    private Button four = null;

    private ImageSwitcher mBackgroundImage = null;

    private TextView tView_btn_top_left = null;
    private TextView tView_btn_top_right = null;
    private TextView tView_btn_bottom_right = null;
    private TextView tView_btn_bottom_left = null;

    private Game_HashMap game_hashMap = new Game_HashMap();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fullscreen);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                 | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                  | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                  | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        one = (Button) findViewById(R.id.btn_top_left);
        two = (Button) findViewById(R.id.btn_top_right);
        three = (Button) findViewById(R.id.btn_bottom_left);
        four = (Button) findViewById(R.id.btn_bottom_right);

        //стандартний бекраунд
        //final Drawable standartBackround = one.getBackground();

        mBackgroundImage = (ImageSwitcher) findViewById(R.id.gameFrameSwitcher);
        mBackgroundImage.setFactory(this);

        tView_btn_top_left = (TextView) findViewById(R.id.textView_btn_top_left);
        tView_btn_top_right = (TextView) findViewById(R.id.textView_btn_top_right);
        tView_btn_bottom_right = (TextView) findViewById(R.id.textView_btn_bottom_right);
        tView_btn_bottom_left = (TextView) findViewById(R.id.textView_btn_bottom_left);

        Animation inAnimation = new AlphaAnimation(0, 1);
        inAnimation.setDuration(2000);
        Animation outAnimation = new AlphaAnimation(1, 0);
        outAnimation.setDuration(2000);

        mBackgroundImage.setInAnimation(inAnimation);
        mBackgroundImage.setOutAnimation(outAnimation);

        game_hashMap.firstStartRightQuestion();

        randomSetTextToTextView();

        fillRestTextView();


        // 3 поля яких міняє картинку
        String mDrawableName = game_hashMap.getMapOfAllGame().get(game_hashMap.getAnswer()); // файл cat1.png в папке drawable
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
        mBackgroundImage.setImageResource(resID); //картинка при першому запуску


        //винести в окремий клас ????
        View.OnClickListener onClickListener = new View.OnClickListener() {
            public void rightAndWrongAnswers(Button button){
                //if wrong answer
                if(!(button.getText().toString().equals(game_hashMap.getAnswer()))){
                    //button.setBackgroundColor(0x80FD0004); //if answer is wrong change color of button to red
                    onClick2();
//                    Intent intent=new Intent(getApplicationContext(), game_over.class);
//                    startActivity(intent);
                    //button.setBackground(standartBackround);

                }else if(button.getText().toString().equals(game_hashMap.getAnswer())){
                    //тимчасовий if
                    if(game_hashMap.getArrayOfKeyHashMap().size()<4){
                        reset();
                    }

                    changeImg();
                }
            }




            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.btn_bottom_left:
                        rightAndWrongAnswers(three);
                        break;
                    case R.id.btn_bottom_right:
                        rightAndWrongAnswers(four);
                        break;
                    case R.id.btn_top_left:
                        rightAndWrongAnswers(one);
                        break;
                    case R.id.btn_top_right:
                        rightAndWrongAnswers(two);
                        break;
                }
            }
        };

        one.setOnClickListener(onClickListener);
        two.setOnClickListener(onClickListener);
        three.setOnClickListener(onClickListener);
        four.setOnClickListener(onClickListener);
    }

    public void onClick2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
        builder.setTitle("GAME OVER")
                .setCancelable(false)
                .setNegativeButton("RESTART",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                reset();
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public View makeView() {
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        imageView.setBackgroundColor(0xFF000000);
        return imageView;
    }


    private void randomSetTextToTextView(){
        int rand = ((int) (Math.random()*4));
        switch (rand){
            case 0:
                tView_btn_top_left.setText(game_hashMap.getQuestion_NameOfGame());
                break;
            case 1:
                tView_btn_top_right.setText(game_hashMap.getQuestion_NameOfGame());
                break;
            case 2:
                tView_btn_bottom_left.setText(game_hashMap.getQuestion_NameOfGame());
                break;
            case 3:
                tView_btn_bottom_right.setText(game_hashMap.getQuestion_NameOfGame());
                break;
        }
        System.out.println();
        game_hashMap.getArrayOfKeyHashMap().remove(game_hashMap.getIndexOfArrayOfKey());
    }

    public void fillRestTextView(){
        List<TextView> textViewList = new ArrayList<>();
        textViewList.add(tView_btn_top_left);
        textViewList.add(tView_btn_top_right);
        textViewList.add(tView_btn_bottom_left);
        textViewList.add(tView_btn_bottom_right);


        Collections.shuffle(game_hashMap.getArrayOfKeyHashMap());
        for(TextView tv:textViewList){
            if(tv.getText().equals("")){
                tv.setText(game_hashMap.getArrayOfKeyHashMap().get(0));
                game_hashMap.getArrayOfKeyHashMap().remove(0);
            }
            System.out.println(tv.getText().toString());
        }

        System.out.println("size !!"+game_hashMap.getArrayOfKeyHashMap().size());


        one.setText(tView_btn_top_left.getText());
        two.setText(tView_btn_top_right.getText());
        three.setText(tView_btn_bottom_left.getText());
        four.setText(tView_btn_bottom_right.getText());
    }

    public void setEmptyTextForButton(){
        tView_btn_top_left.setText("");
        tView_btn_top_right.setText("");
        tView_btn_bottom_left.setText("");
        tView_btn_bottom_right.setText("");


        one.setText(tView_btn_top_left.getText());
        two.setText(tView_btn_top_right.getText());
        three.setText(tView_btn_bottom_left.getText());
        four.setText(tView_btn_bottom_right.getText());
    }


    public String returnAnswer(){
        return game_hashMap.getMapOfAllGame().get(game_hashMap.getAnswer()); // файл cat1.png в папке drawable
    }
    public void changeText(){
        // метод в якому міняється текст
        setEmptyTextForButton();
        game_hashMap.firstStartRightQuestion();
        randomSetTextToTextView();
        fillRestTextView();
    }
    public void changeImg(){
        changeText();

        String temp = returnAnswer();
        int resID2 = getResources().getIdentifier(temp , "drawable", getPackageName());
        mBackgroundImage.setImageResource(resID2);
        Log.e("Change img","in change img method == "+temp);
        System.out.println("size after press = "+game_hashMap.getArrayOfKeyHashMap().size());
    }


        public void reset(){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
            System.out.println("Size in IF = "+game_hashMap.getArrayOfKeyHashMap().size());
            game_hashMap.setArrayOfKeyHashMap(game_hashMap.copyKeyMapToStringListArray());
            changeImg();
    }
}
