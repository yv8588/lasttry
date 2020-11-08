package com.example.spinerxlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener , AdapterView.OnItemSelectedListener {
ListView continent;
Spinner country;
TextView hymn,pop,lang,capital;
    String[] con={"Asia","Europe","Africa","America"};
    String[]countAsia={"Israel","Japan","China","Cambodia","Cyprus","Turkey","india"};
    String[]countAmerica={"Argentina","Brazil","Canada","Chile","Colombia","Mexico","Peru"};
    String[]countEurope={"Poland","Germany","Italy","Spain","France","Austria","Sweden"};
    String[]countAfrica={"Togo","Morocco","Cameroon","Gabon","Chad","Ivory coast","Senegal"};
    String type="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hymn =(TextView)findViewById(R.id.hymn);
        pop =(TextView)findViewById(R.id.pop);
        lang =(TextView)findViewById(R.id.lang);
        capital =(TextView)findViewById(R.id.capital);
        continent=(ListView)findViewById(R.id.continent);
        country=(Spinner)findViewById(R.id.country);
        continent.setOnItemClickListener(this);
        country.setOnItemSelectedListener(this);
        ArrayAdapter <String> adp=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,con);
        country.setAdapter(adp);

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
                    hymn.setText("En unión y libertad");
                    lang.setText("spanish");
                    pop.setText("44,938,712 ");
                    capital.setText("buenos aires");
                    break;
                case "Brazil":
                    hymn.setText(" Hino Nacional Brasileiro");
                    lang.setText("portuguese");
                    pop.setText("210,147,125");
                    capital.setText("brasilia");
                    break;
                case "Canada":
                    hymn.setText("o canada");
                    lang.setText("english");
                    pop.setText("37,971,020");
                    capital.setText("toronto");
                    break;
                case "Chile":
                    hymn.setText("Himno Nacional de Chile");
                    lang.setText("spanish");
                    pop.setText("17,574,003");
                    capital.setText("santiago");
                    break;
                case "Colombia":
                    hymn.setText("Himno Nacional de la República de Colombia  ");
                    lang.setText("spanish");
                    pop.setText("50,372,424");
                    capital.setText("bogota");
                    break;
                case "Mexico":
                    hymn.setText("Himno Nacional Mexicano");
                    lang.setText("spanish");
                    pop.setText("128,649,565");
                    capital.setText("mexico city");
                    break;
                case "Peru":
                    hymn.setText("Himno Nacional del Perú");
                    lang.setText("spanish");
                    pop.setText("32,824,358 ");
                    capital.setText("lima");
                    break;
            }
        }
        if (type.equals("Africa")) {
            switch (countAfrica[position]) {
                case "Togo":
                    hymn.setText("Travail, Liberté, Patrie");
                    lang.setText("french");
                    pop.setText("8,608,444");
                    capital.setText("lome");
                    break;
                case "Morocco":
                    hymn.setText("النشيد الوطني المغربي");
                    lang.setText("arabic");
                    pop.setText("36,472,000");
                    capital.setText("rabat");
                    break;
                case "Cameroon":
                    hymn.setText("Ô Cameroun, Berceau de nos Ancêtres");
                    lang.setText("french");
                    pop.setText("yaounde");
                    capital.setText("26,545,864");
                    break;
                case "Gabon":
                    hymn.setText("La Concorde");
                    lang.setText("french");
                    pop.setText("2,119,275");
                    capital.setText("Libreville");
                    break;
                case "Chad":
                    hymn.setText("La Tchadienne");
                    lang.setText("arabic");
                    pop.setText("13,670,084");
                    capital.setText("ndajamena");
                    break;
                case "Ivory coast":
                    hymn.setText(": L'Abidjanaise");
                    lang.setText("french");
                    pop.setText("26,378,274");
                    capital.setText("Yamoussoukro ");
                    break;
                case "Senegal":
                    hymn.setText("Pincez Tous vos Koras, Frappez les Balafons");
                    lang.setText("french");
                    pop.setText("15,854,323");
                    capital.setText("dakar");
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
            continent.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            type=con[position];
        } else if ("America".equals(con[position])) {
            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAmerica);
            continent.setAdapter(adpl);
            continent.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            type=con[position];
        } else if ("Africa".equals(con[position])) {
            ArrayAdapter<String> adpl=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countAfrica);
            continent.setAdapter(adpl);
            continent.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            type=con[position];
        }
        else{
            ArrayAdapter<String> adpl=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countEurope);
            continent.setAdapter(adpl);
            continent.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            type=con[position];
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(),"choose continent",Toast.LENGTH_SHORT);
    }
}