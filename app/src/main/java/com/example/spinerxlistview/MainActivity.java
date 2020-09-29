package com.example.spinerxlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener , AdapterView.OnItemSelectedListener {
ListView continent;
Spinner country;
TextView hymn,pop,lang,capital;
    String[] con={"Asia","Europe","Africa","America"};
    String text[][]=new String[8][4];
    String[]countAsia={"Israel","Japan","China","Cambodia","Cyprus","Turkey","india"};
    String[]countAmerica={"Argentina","Brazil","Canada","Chile","Colombia","Mexico","Peru"};
    String[]countEurope={"Poland","Germany","Italy","Spain","France","Austria","Sweden"};
    String[]countAfrica={"Togo","Morocco","Cameroon","Gabon","Chad","Ivory coast","Senegal"};
    String type="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        continent.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        hymn =(TextView)findViewById(R.id.hymn);
        pop =(TextView)findViewById(R.id.pop);
        lang =(TextView)findViewById(R.id.lang);
        capital =(TextView)findViewById(R.id.capital);
        continent=(ListView)findViewById(R.id.continent);
        country=(Spinner)findViewById(R.id.country);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (type.equals("Asia")) {
            switch (countAsia[position]) {
                case "Israel":
                    hymn.setText("hatikva");
                    lang.setText("hebrew");
                    pop.setText("9.18 milion");
                    capital.setText("jerusalem");
                    break;
                case "Japan":
                    hymn.setText("Kimigayo");
                    lang.setText("japanese");
                    pop.setText(" 125,960,000");
                    capital.setText("tokyo");
                    break;
                case "China":
                    hymn.setText("Yìyǒngjūn Jìnxíngqǔ");
                    lang.setText("chinese");
                    pop.setText(" 1,400,050,000");
                    capital.setText("beijing");
                    break;
                case "Cambodia":
                    hymn.setText("Nokor Reach");
                    lang.setText("khmer");
                    pop.setText("15,288,489");
                    capital.setText("Phnom Penh");
                    break;
                case "Cyprus":
                    hymn.setText(" Ὕμνος εἰς τὴν Ἐλευθερίαν");
                    lang.setText("greek");
                    pop.setText("1,189,265");
                    capital.setText("nicosia");
                    break;
                case "Turkey":
                    hymn.setText("İstiklal Marşı ");
                    lang.setText("turkish");
                    pop.setText(" 83,154,997");
                    capital.setText("ankara");
                    break;
                case "india":
                    hymn.setText(" Vande Mataram");
                    lang.setText("hindi");
                    pop.setText("1,352,642,280");
                    capital.setText("new delhi");
                    break;
            }
        }
        if (type.equals("America")) {
            switch (countAmerica[position]) {
                case "Argentina":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Brazil":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Canada":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Chile":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Colombia":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Mexico":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Peru":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
            }
        }
        if (type.equals("Africa")) {
            switch (countAfrica[position]) {
                case "Togo":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Morocco":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Cameroon":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Gabon":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Chad":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Ivory coast":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
                case "Senegal":
                    hymn.setText("");
                    lang.setText("");
                    pop.setText("");
                    capital.setText("");
                    break;
            }

        } else {

            switch (countEurope[position]) {
                case "Poland":
                    hymn.setText("Mazurek Dąbrowskiego");
                    lang.setText("polish");
                    pop.setText("38,383,000");
                    capital.setText("Warsaw");
                    break;
                case "Germany":
                    hymn.setText("Deutschlandlied");
                    lang.setText("German");
                    pop.setText("83,166,711");
                    capital.setText("Berlin");
                    break;
                case "Italy":
                    hymn.setText("Canto degli Italiani ");
                    lang.setText("Italian");
                    pop.setText("60,317,116");
                    capital.setText("rome");
                    break;
                case "Spain":
                    capital.setText("madrid");
                    lang.setText("spanish");
                    pop.setText(" 47,431,256");
                    hymn.setText("Marcha Real");
                    break;
                case "France":
                    capital.setText("paris");
                    lang.setText("france");
                    pop.setText(" 47,431,256");
                    hymn.setText("Marcha Real");
                    break;
                case "Austria":
                    capital.setText("viena");
                    lang.setText("german");
                    pop.setText("8,902,600");
                    hymn.setText("Bundeshymne der Republik Österreich");
                    break;
                case "Sweden":
                    capital.setText("Stockholm");
                    lang.setText("Swedish[");
                    pop.setText("10,343,403");
                    hymn.setText("  Du gamla, Du fria");
                    break;
            }
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if ("Asia".equals(con[position])) {
            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAsia);
            continent.setAdapter(adpl);
            type=con[position];
        } else if ("America".equals(con[position])) {
            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAmerica);
            continent.setAdapter(adpl);
            type=con[position];
        } else if ("Africa".equals(con[position])) {
            ArrayAdapter<String> adpl=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countAfrica);
            continent.setAdapter(adpl);
            type=con[position];
        }
        else{
            ArrayAdapter<String> adpl=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countEurope);
            continent.setAdapter(adpl);
            type=con[position];
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}