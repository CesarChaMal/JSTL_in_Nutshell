/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.java.beans;

import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class Countries {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<String> country_value;
   private ArrayList<String> country_name;

    public ArrayList<String> getCountry_value() {
    ArrayList<String> v=new ArrayList<String>();       
    v.add("AF");
    v.add("AX");
v.add("AL");
v.add("DZ");
v.add("AS");
v.add("AD");
v.add("AO");
v.add("AI");
v.add("AQ");
v.add("AG");
v.add("AR");
v.add("AM");
v.add("AW");
v.add("AC");
v.add("AU");
v.add("AT");
v.add("AZ");
v.add("BS");
v.add("BH");
v.add("BD");
v.add("BB");
v.add("BY");
v.add("BE");
v.add("BZ");
v.add("BJ");
v.add("BM");
v.add("BT");
v.add("BO");
v.add("BA");
v.add("BW");
v.add("BV");
v.add("BR");
v.add("IO");
v.add("VG");
v.add("BN");
v.add("BG");
v.add("BF");
v.add("BI");
v.add("KH");
v.add("CM");
v.add("CA");
v.add("IC");
v.add("CV");
v.add("BQ");
v.add("KY");
v.add("CF");
v.add("EA");
v.add("TD");
v.add("CL");
v.add("CN");
v.add("CX");
v.add("CP");
v.add("CC");
v.add("CO");
v.add("KM");
v.add("CD");
v.add("CG");
v.add("CK");
v.add("CR");
v.add("CI");
v.add("HR");
v.add("CU");
v.add("CW");
v.add("CY");
v.add("CZ");
v.add("DK");
v.add("DG");
v.add("DJ");
v.add("DM");
v.add("DO");
v.add("EC");
v.add("EG");
v.add("SV");
v.add("GQ");
v.add("ER");
v.add("EE");
v.add("ET");
v.add("FK");
v.add("FO");
v.add("FJ");
v.add("FI");
v.add("FR");
v.add("GF");
v.add("PF");
v.add("TF");
v.add("GA");
v.add("GM");
v.add("GE");
v.add("DE");
v.add("GH");
v.add("GI");
v.add("GR");
v.add("GL");
v.add("GD");
v.add("GP");
v.add("GU");
v.add("GT");
v.add("GG");
v.add("GN");
v.add("GW");
v.add("GY");
v.add("HT");
v.add("HM");
v.add("HN");
v.add("HK");
v.add("HU");
v.add("IS");
v.add("IN");
v.add("ID");
v.add("IR");
v.add("IQ");
v.add("IE");
v.add("IM");
v.add("IL");
v.add("IT");
v.add("JM");
v.add("JP");
v.add("JE");
v.add("JO");
v.add("KZ");
v.add("KE");
v.add("KI");
v.add("XK");
v.add("KW");
v.add("KG");
v.add("LA");
v.add("LV");
v.add("LB");
v.add("LS");
v.add("LR");
v.add("LY");
v.add("LI");
v.add("LT");
v.add("LU");
v.add("MO");
v.add("MK");
v.add("MG");
v.add("MW");
v.add("MY");
v.add("MV");
v.add("ML");
v.add("MT");
v.add("MH");
v.add("MQ");
v.add("MR");
v.add("MU");
v.add("YT");
v.add("MX");
v.add("FM");
v.add("MD");
v.add("MC");
v.add("MN");
v.add("ME");
v.add("MS");
v.add("MA");
v.add("MZ");
v.add("MM");
v.add("NA");
v.add("NR");
v.add("NP");
v.add("NL");
v.add("NC");
v.add("NZ");
v.add("NI");
v.add("NE");
v.add("NG");
v.add("NU");
v.add("NF");
v.add("MP");
v.add("KP");
v.add("NO");
v.add("OM");
v.add("PK");
v.add("PW");
v.add("PS");
v.add("PA");
v.add("PG");
v.add("PY");
v.add("PE");
v.add("PH");
v.add("PN");
v.add("PL");
v.add("PT");
v.add("PR");
v.add("QA");
v.add("RE");
v.add("RO");
v.add("RU");
v.add("RW");
v.add("WS");
v.add("SM");
v.add("ST");
v.add("SA");
v.add("SN");
v.add("RS");
v.add("SC");
v.add("SL");
v.add("SG");
v.add("SX");
v.add("SK");
v.add("SI");
v.add("SB");
v.add("SO");
v.add("ZA");
v.add("GS");
v.add("KR");
v.add("SS");
v.add("ES");
v.add("LK");
v.add("BL");
v.add("SH");
v.add("KN");
v.add("LC");
v.add("MF");
v.add("PM");
v.add("VC");
v.add("SD");
v.add("SR");
v.add("SJ");
v.add("SZ");
v.add("SE");
v.add("CH");
v.add("SY");
v.add("TW");
v.add("TJ");
v.add("TZ");
v.add("TH");
v.add("TL");
v.add("TG");
v.add("TK");
v.add("TO");
v.add("TT");
v.add("TA");
v.add("TN");
v.add("TR");
v.add("TM");
v.add("TC");
v.add("TV");
v.add("UM");
v.add("VI");
v.add("UG");
v.add("UA");
v.add("AE");
v.add("GB");
v.add("US");
v.add("UY");
v.add("UZ");
v.add("VU");
v.add("VA");
v.add("VE");
v.add("VN");
v.add("WF");
v.add("EH");
v.add("YE");
v.add("ZM");
v.add("ZW");
country_value=v;
        return country_value;
    }

   
    public ArrayList<String> getCountry_name() {
        ArrayList<String> n=new ArrayList<String>();
        n.add("Afghanistan (‫افغانستان‬‎)");
  n.add("Åland Islands (Åland)");
  n.add("lbania (Shqipëri)");
  n.add("Algeria");
  n.add("American Samoa");
  n.add("Andorra");
  n.add("Angola");
  n.add("Anguilla");
  n.add("Antarctica");
  n.add("Antigua &amp; Barbuda");
  n.add("Argentina");
  n.add("Armenia (Հայաստան)");
  n.add("Aruba");
  n.add("Ascension Island");
  n.add("Australia");
  n.add("Austria (Österreich)");
  n.add("Azerbaijan (Azərbaycan)");
  n.add("Bahamas");
  n.add("Bahrain (‫البحرين‬‎)");
  n.add("Bangladesh (বাংলাদেশ)");
  n.add("Barbados");
  n.add("Belarus (Беларусь)");
  n.add("Belgium");
  n.add("Belize");
  n.add("Benin (Bénin)");
  n.add("Bermuda");
  n.add("Bhutan (འབྲུག)");
  n.add("Bolivia");
  n.add("Bosnia &amp; Herzegovina (Босна и Херцеговина)");
  n.add("Botswana");
  n.add("Bouvet Island");
  n.add("Brazil (Brasil)");
  n.add("British Indian Ocean Territory");
  n.add("British Virgin Islands");
  n.add("Brunei");
  n.add("Bulgaria (България)");
  n.add("Burkina Faso");
  n.add("Burundi (Uburundi)");
  n.add("Cambodia (កម្ពុជា)");
  n.add("Cameroon (Cameroun)");
  n.add("Canada");
  n.add("Canary Islands (islas Canarias)");
  n.add("Cape Verde (Kabu Verdi)");
  n.add("Caribbean Netherlands");
  n.add("Cayman Islands");
  n.add("Central African Republic (République centrafricaine)");
  n.add("Ceuta &amp; Melilla (Ceuta y Melilla)");
  n.add("Chad (Tchad)");
  n.add("Chile");
  n.add("China (中国)");
  n.add("Christmas Island");
  n.add("Clipperton Island");
  n.add("Cocos (Keeling) Islands (Kepulauan Cocos (Keeling))");
  n.add("Colombia");
  n.add("Comoros (‫جزر القمر‬‎)");
  n.add("Congo (DRC) (Jamhuri ya Kidemokrasia ya Kongo)");
  n.add("Congo (Republic) (Congo-Brazzaville)");
  n.add("Cook Islands");
  n.add("Costa Rica");
  n.add("Côte d’Ivoire");
  n.add("Croatia (Hrvatska)");
  n.add("Cuba");
  n.add("Curaçao");
  n.add("Cyprus (Κύπρος)");
  n.add("Czech Republic (Česká republika)");
  n.add("Denmark (Danmark)");
  n.add("Diego Garcia");
  n.add("Djibouti");
  n.add("Dominica");
  n.add("Dominican Republic (República Dominicana)");
  n.add("Ecuador");
  n.add("Egypt (‫مصر‬‎)");
  n.add("El Salvador");
  n.add("Equatorial Guinea (Guinea Ecuatorial)");
  n.add("Eritrea");
  n.add("Estonia (Eesti)");
  n.add("Ethiopia");
  n.add("Falkland Islands (Islas Malvinas)");
  n.add("Faroe Islands (Føroyar)");
  n.add("Fiji");
  n.add("Finland (Suomi)");
  n.add("France");
  n.add("French Guiana (Guyane française)");
  n.add("French Polynesia (Polynésie française)");
  n.add("French Southern Territories (Terres australes françaises)");
  n.add("Gabon");
  n.add("Gambia");
  n.add("Georgia (საქართველო)");
  n.add("Germany (Deutschland)");
  n.add("Ghana (Gaana)");
  n.add("Gibraltar");
  n.add("Greece (Ελλάδα)");
  n.add("Greenland (Kalaallit Nunaat)");
  n.add("Grenada");
  n.add("Guadeloupe");
  n.add("Guam");
  n.add("Guatemala");
  n.add("Guernsey");
  n.add("Guinea (Guinée)");
  n.add("Guinea-Bissau (Guiné-Bissau)");
  n.add("Guyana");
  n.add("Haiti");
  n.add("Heard &amp; McDonald Islands");
  n.add("Honduras");
  n.add("Hong Kong (香港)");
  n.add("Hungary (Magyarország)");
  n.add("Iceland (Ísland)");
  n.add("India (भारत)");
  n.add("Indonesia");
  n.add("Iran (‫ایران‬‎)");
  n.add("Iraq (‫العراق‬‎)");
  n.add("Ireland");
  n.add("Isle of Man");
  n.add("Israel (‫ישראל‬‎)");
  n.add("Italy (Italia)");
  n.add("Jamaica");
  n.add("Japan (日本)");
  n.add("Jersey");
  n.add("Jordan (‫الأردن‬‎)");
  n.add("Kazakhstan (Казахстан)");
  n.add("Kenya");
  n.add("Kiribati");
  n.add("Kosovo (Kosovë)");
  n.add("Kuwait (‫الكويت‬‎)");
  n.add("Kyrgyzstan (Кыргызстан)");
  n.add("Laos (ລາວ)");
  n.add("Latvia (Latvija)");
  n.add("Lebanon (‫لبنان‬‎)");
  n.add("Lesotho");
  n.add("Liberia");
  n.add("Libya (‫ليبيا‬‎)");
  n.add("Liechtenstein");
  n.add("Lithuania (Lietuva)");
  n.add("Luxembourg");
  n.add("Macau (澳門)");
  n.add("Macedonia (FYROM) (Македонија)");
  n.add("Madagascar (Madagasikara)");
  n.add("Malawi");
  n.add("Malaysia");
  n.add("Maldives");
  n.add("Mali");
  n.add("Malta");
  n.add("Marshall Islands");
  n.add("Martinique");
  n.add("Mauritania (‫موريتانيا‬‎)");
  n.add("Mauritius (Moris)");
  n.add("Mayotte");
  n.add("Mexico (México)");
  n.add("Micronesia");
  n.add("Moldova (Republica Moldova)");
  n.add("Monaco");
  n.add("Mongolia (Монгол)");
  n.add("Montenegro (Crna Gora)");
  n.add("Montserrat");
  n.add("Morocco");
  n.add("Mozambique (Moçambique)");
  n.add("Myanmar (Burma) (မြန်မာ)");
  n.add("Namibia (Namibië)");
  n.add("Nauru");
  n.add("Nepal (नेपाल)");
  n.add("Netherlands (Nederland)");
  n.add("New Caledonia (Nouvelle-Calédonie)");
  n.add("New Zealand");
  n.add("Nicaragua");
  n.add("Niger (Nijar)");
  n.add("Nigeria");
  n.add("Niue");
  n.add("Norfolk Island");
  n.add("Northern Mariana Islands");
  n.add("North Korea (조선민주주의인민공화국)");
  n.add("Norway (Norge)");
  n.add("Oman (‫عُمان‬‎)");
  n.add("Pakistan (‫پاکستان‬‎)");
  n.add("Palau");
  n.add("Palestine (‫فلسطين‬‎)");
  n.add("Panama (Panamá)");
  n.add("Papua New Guinea");
  n.add("Paraguay");
  n.add("Peru (Perú)");
  n.add("Philippines");
  n.add("Pitcairn Islands");
  n.add("Poland (Polska)");
  n.add("Portugal");
  n.add("Puerto Rico");
  n.add("Qatar (‫قطر‬‎)");
  n.add("Réunion (La Réunion)");
  n.add("Romania (România)");
  n.add("Russia (Россия)");
  n.add("Rwanda");
  n.add("Samoa");
  n.add("San Marino");
  n.add("São Tomé &amp; Príncipe (São Tomé e Príncipe)");
  n.add("Saudi Arabia (‫المملكة العربية السعودية‬‎)");
  n.add("Senegal");
  n.add("Serbia (Србија)");
  n.add("Seychelles");
  n.add("Sierra Leone");
  n.add("Singapore");
  n.add("Sint Maarten");
  n.add("Slovakia (Slovensko)");
  n.add("Slovenia (Slovenija)");
  n.add("Solomon Islands");
  n.add("Somalia (Soomaaliya)");
  n.add("South Africa");
  n.add("South Georgia &amp; South Sandwich Islands");
  n.add("South Korea (대한민국)");
  n.add("South Sudan (‫جنوب السودان‬‎)");
  n.add("Spain (España)");
  n.add("Sri Lanka (ශ්‍රී ලංකාව)");
  n.add("St. Barthélemy (Saint-Barthélemy)");
  n.add("St. Helena");
  n.add("St. Kitts &amp; Nevis");
  n.add("St. Lucia");
  n.add("St. Martin (Saint-Martin)");
  n.add("St. Pierre &amp; Miquelon (Saint-Pierre-et-Miquelon)");
  n.add("St. Vincent &amp; Grenadines");
  n.add("Sudan (‫السودان‬‎)");
  n.add("Suriname");
  n.add("Svalbard &amp; Jan Mayen (Svalbard og Jan Mayen)");
  n.add("Swaziland");
  n.add("Sweden (Sverige)");
  n.add("Switzerland (Schweiz)");
  n.add("Syria (‫سوريا‬‎)");
  n.add("Taiwan (台灣)");
  n.add("Tajikistan");
  n.add("Tanzania");
  n.add("Thailand (ไทย)");
  n.add("Timor-Leste");
  n.add("Togo");
  n.add("Tokelau");
  n.add("Tonga");
  n.add("Trinidad &amp; Tobago");
  n.add("Tristan da Cunha");
  n.add("Tunisia");
  n.add("Turkey (Türkiye)");
  n.add("Turkmenistan");
  n.add("Turks &amp; Caicos Islands");
  n.add("Tuvalu");
  n.add("U.S. Outlying Islands");
  n.add("U.S. Virgin Islands");
  n.add("Uganda");
  n.add("Ukraine (Україна)");
  n.add("United Arab Emirates (‫الإمارات العربية المتحدة‬‎)");
  n.add("United Kingdom");
  n.add("United States");
  n.add("Uruguay");
  n.add("Uzbekistan (Oʻzbekiston)");
  n.add("Vanuatu");
  n.add("Vatican City (Città del Vaticano)");
  n.add("Venezuela");
  n.add("Vietnam (Việt Nam)");
  n.add("Wallis &amp; Futuna");
  n.add("Western Sahara (‫الصحراء الغربية‬‎)");
  n.add("Yemen (‫اليمن‬‎)");
  n.add("Zambia");
  n.add("Zimbabwe");
  country_name=n;
        return n;
    }

   
    
}
