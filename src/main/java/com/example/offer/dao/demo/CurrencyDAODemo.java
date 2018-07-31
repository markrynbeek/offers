package com.example.offer.dao.demo;

import com.example.offer.dao.CurrencyDAO;
import com.example.offer.domain.Currency;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CurrencyDAODemo implements CurrencyDAO {

    private static Map<String, Currency> currencyMap;

    private static List<Currency> currencyList;


    @Override
    public List<Currency> getCurrencies() {
        return currencyList;
    }

    @Override
    public boolean isValidCurrencyCode(String code) {
        return currencyMap.containsKey(code);
    }


    // Populate list of currencyList for demo purposes
    static {
        currencyMap = new HashMap<>();
        currencyMap.put("AFN",new Currency("AFN", "Afghanistan Afghani") );
        currencyMap.put("AED",new Currency("AED",  "United Arab Emirates Dirham"));
        currencyMap.put("AFN",new Currency("AFN",  "Afghanistan Afghani"));
        currencyMap.put("ALL",new Currency("ALL",  "Albania Lek"));
        currencyMap.put("ANG",new Currency("ANG",  "Netherlands Antilles Guilder"));
        currencyMap.put("AOA",new Currency("AOA",  "Angola Kwanza"));
        currencyMap.put("ARS",new Currency("ARS",  "Argentina Peso"));
        currencyMap.put("AUD",new Currency("AUD",  "Australia Dollar"));
        currencyMap.put("AWG",new Currency("AWG",  "Aruba Guilder"));
        currencyMap.put("AZN",new Currency("AZN",  "Azerbaijan Manat"));
        currencyMap.put("BAM",new Currency("BAM",  "Bosnia and Herzegovina Convertible Marka"));
        currencyMap.put("BBD",new Currency("BBD",  "Barbados Dollar"));
        currencyMap.put("BDT",new Currency("BDT",  "Bangladesh Taka"));
        currencyMap.put("BGN",new Currency("BGN",  "Bulgaria Lev"));
        currencyMap.put("BHD",new Currency("BHD",  "Bahrain Dinar"));
        currencyMap.put("BIF",new Currency("BIF",  "Burundi Franc"));
        currencyMap.put("BMD",new Currency("BMD",  "Bermuda Dollar"));
        currencyMap.put("BND",new Currency("BND",  "Brunei Darussalam Dollar"));
        currencyMap.put("BOB",new Currency("BOB",  "Bolivia Bolíviano"));
        currencyMap.put("BRL",new Currency("BRL",  "Brazil Real"));
        currencyMap.put("BSD",new Currency("BSD",  "Bahamas Dollar"));
        currencyMap.put("BTN",new Currency("BTN",  "Bhutan Ngultrum"));
        currencyMap.put("BWP",new Currency("BWP",  "Botswana Pula"));
        currencyMap.put("BYN",new Currency("BYN",  "Belarus Ruble"));
        currencyMap.put("BZD",new Currency("BZD",  "Belize Dollar"));
        currencyMap.put("CAD",new Currency("CAD",  "Canada Dollar"));
        currencyMap.put("CDF",new Currency("CDF",  "Congo/Kinshasa Franc"));
        currencyMap.put("CHF",new Currency("CHF",  "Switzerland Franc"));
        currencyMap.put("CLP",new Currency("CLP",  "Chile Peso"));
        currencyMap.put("CNY",new Currency("CNY",  "China Yuan Renminbi"));
        currencyMap.put("COP",new Currency("COP",  "Colombia Peso"));
        currencyMap.put("CRC",new Currency("CRC",  "Costa Rica Colon"));
        currencyMap.put("CUC",new Currency("CUC",  "Cuba Convertible Peso"));
        currencyMap.put("CUP",new Currency("CUP",  "Cuba Peso"));
        currencyMap.put("CVE",new Currency("CVE",  "Cape Verde Escudo"));
        currencyMap.put("CZK",new Currency("CZK",  "Czech Republic Koruna"));
        currencyMap.put("DJF",new Currency("DJF",  "Djibouti Franc"));
        currencyMap.put("DKK",new Currency("DKK",  "Denmark Krone"));
        currencyMap.put("DOP",new Currency("DOP",  "Dominican Republic Peso"));
        currencyMap.put("DZD",new Currency("DZD",  "Algeria Dinar"));
        currencyMap.put("EGP",new Currency("EGP",  "Egypt Pound"));
        currencyMap.put("ERN",new Currency("ERN",  "Eritrea Nakfa"));
        currencyMap.put("ETB",new Currency("ETB",  "Ethiopia Birr"));
        currencyMap.put("EUR",new Currency("EUR",  "Euro Member Countries"));
        currencyMap.put("FJD",new Currency("FJD",  "Fiji Dollar"));
        currencyMap.put("FKP",new Currency("FKP",  "Falkland Islands (Malvinas) Pound"));
        currencyMap.put("GBP",new Currency("GBP",  "United Kingdom Pound"));
        currencyMap.put("GEL",new Currency("GEL",  "Georgia Lari"));
        currencyMap.put("GGP",new Currency("GGP",  "Guernsey Pound"));
        currencyMap.put("GHS",new Currency("GHS",  "Ghana Cedi"));
        currencyMap.put("GIP",new Currency("GIP",  "Gibraltar Pound"));
        currencyMap.put("GMD",new Currency("GMD",  "Gambia Dalasi"));
        currencyMap.put("GNF",new Currency("GNF",  "Guinea Franc"));
        currencyMap.put("GTQ",new Currency("GTQ",  "Guatemala Quetzal"));
        currencyMap.put("GYD",new Currency("GYD",  "Guyana Dollar"));
        currencyMap.put("HKD",new Currency("HKD",  "Hong Kong Dollar"));
        currencyMap.put("HNL",new Currency("HNL",  "Honduras Lempira"));
        currencyMap.put("HRK",new Currency("HRK",  "Croatia Kuna"));
        currencyMap.put("HTG",new Currency("HTG",  "Haiti Gourde"));
        currencyMap.put("HUF",new Currency("HUF",  "Hungary Forint"));
        currencyMap.put("IDR",new Currency("IDR",  "Indonesia Rupiah"));
        currencyMap.put("ILS",new Currency("ILS",  "Israel Shekel"));
        currencyMap.put("IMP",new Currency("IMP",  "Isle of Man Pound"));
        currencyMap.put("INR",new Currency("INR",  "India Rupee"));
        currencyMap.put("IQD",new Currency("IQD",  "Iraq Dinar"));
        currencyMap.put("IRR",new Currency("IRR",  "Iran Rial"));
        currencyMap.put("ISK",new Currency("ISK",  "Iceland Krona"));
        currencyMap.put("JEP",new Currency("JEP",  "Jersey Pound"));
        currencyMap.put("JMD",new Currency("JMD",  "Jamaica Dollar"));
        currencyMap.put("JOD",new Currency("JOD",  "Jordan Dinar"));
        currencyMap.put("JPY",new Currency("JPY",  "Japan Yen"));
        currencyMap.put("KES",new Currency("KES",  "Kenya Shilling"));
        currencyMap.put("KGS",new Currency("KGS",  "Kyrgyzstan Som"));
        currencyMap.put("KHR",new Currency("KHR",  "Cambodia Riel"));
        currencyMap.put("KMF",new Currency("KMF",  "Comorian Franc"));
        currencyMap.put("KPW",new Currency("KPW",  "Korea (North) Won"));
        currencyMap.put("KRW",new Currency("KRW",  "Korea (South) Won"));
        currencyMap.put("KWD",new Currency("KWD",  "Kuwait Dinar"));
        currencyMap.put("KYD",new Currency("KYD",  "Cayman Islands Dollar"));
        currencyMap.put("KZT",new Currency("KZT",  "Kazakhstan Tenge"));
        currencyMap.put("LAK",new Currency("LAK",  "Laos Kip"));
        currencyMap.put("LBP",new Currency("LBP",  "Lebanon Pound"));
        currencyMap.put("LKR",new Currency("LKR",  "Sri Lanka Rupee"));
        currencyMap.put("LRD",new Currency("LRD",  "Liberia Dollar"));
        currencyMap.put("LSL",new Currency("LSL",  "Lesotho Loti"));
        currencyMap.put("LYD",new Currency("LYD",  "Libya Dinar"));
        currencyMap.put("MAD",new Currency("MAD",  "Morocco Dirham"));
        currencyMap.put("MDL",new Currency("MDL",  "Moldova Leu"));
        currencyMap.put("MGA",new Currency("MGA",  "Madagascar Ariary"));
        currencyMap.put("MKD",new Currency("MKD",  "Macedonia Denar"));
        currencyMap.put("MMK",new Currency("MMK",  "Myanmar (Burma) Kyat"));
        currencyMap.put("MNT",new Currency("MNT",  "Mongolia Tughrik"));
        currencyMap.put("MOP",new Currency("MOP",  "Macau Pataca"));
        currencyMap.put("MRU",new Currency("MRU",  "Mauritania Ouguiya"));
        currencyMap.put("MUR",new Currency("MUR",  "Mauritius Rupee"));
        currencyMap.put("MVR",new Currency("MVR",  "Maldives (Maldive Islands) Rufiyaa"));
        currencyMap.put("MWK",new Currency("MWK",  "Malawi Kwacha"));
        currencyMap.put("MXN",new Currency("MXN",  "Mexico Peso"));
        currencyMap.put("MYR",new Currency("MYR",  "Malaysia Ringgit"));
        currencyMap.put("MZN",new Currency("MZN",  "Mozambique Metical"));
        currencyMap.put("NAD",new Currency("NAD",  "Namibia Dollar"));
        currencyMap.put("NGN",new Currency("NGN",  "Nigeria Naira"));
        currencyMap.put("NIO",new Currency("NIO",  "Nicaragua Cordoba"));
        currencyMap.put("NOK",new Currency("NOK",  "Norway Krone"));
        currencyMap.put("NPR",new Currency("NPR",  "Nepal Rupee"));
        currencyMap.put("NZD",new Currency("NZD",  "New Zealand Dollar"));
        currencyMap.put("OMR",new Currency("OMR",  "Oman Rial"));
        currencyMap.put("PAB",new Currency("PAB",  "Panama Balboa"));
        currencyMap.put("PEN",new Currency("PEN",  "Peru Sol"));
        currencyMap.put("PGK",new Currency("PGK",  "Papua New Guinea Kina"));
        currencyMap.put("PHP",new Currency("PHP",  "Philippines Piso"));
        currencyMap.put("PKR",new Currency("PKR",  "Pakistan Rupee"));
        currencyMap.put("PLN",new Currency("PLN",  "Poland Zloty"));
        currencyMap.put("PYG",new Currency("PYG",  "Paraguay Guarani"));
        currencyMap.put("QAR",new Currency("QAR",  "Qatar Riyal"));
        currencyMap.put("RON",new Currency("RON",  "Romania Leu"));
        currencyMap.put("RSD",new Currency("RSD",  "Serbia Dinar"));
        currencyMap.put("RUB",new Currency("RUB",  "Russia Ruble"));
        currencyMap.put("RWF",new Currency("RWF",  "Rwanda Franc"));
        currencyMap.put("SAR",new Currency("SAR",  "Saudi Arabia Riyal"));
        currencyMap.put("SBD",new Currency("SBD",  "Solomon Islands Dollar"));
        currencyMap.put("SCR",new Currency("SCR",  "Seychelles Rupee"));
        currencyMap.put("SDG",new Currency("SDG",  "Sudan Pound"));
        currencyMap.put("SEK",new Currency("SEK",  "Sweden Krona"));
        currencyMap.put("SGD",new Currency("SGD",  "Singapore Dollar"));
        currencyMap.put("SHP",new Currency("SHP",  "Saint Helena Pound"));
        currencyMap.put("SLL",new Currency("SLL",  "Sierra Leone Leone"));
        currencyMap.put("SOS",new Currency("SOS",  "Somalia Shilling"));
        currencyMap.put("SPL",new Currency("SPL",  "Seborga Luigino"));
        currencyMap.put("SRD",new Currency("SRD",  "Suriname Dollar"));
        currencyMap.put("STN",new Currency("STN",  "São Tomé and Príncipe Dobra"));
        currencyMap.put("SVC",new Currency("SVC",  "El Salvador Colon"));
        currencyMap.put("SYP",new Currency("SYP",  "Syria Pound"));
        currencyMap.put("SZL",new Currency("SZL",  "Swaziland Lilangeni"));
        currencyMap.put("THB",new Currency("THB",  "Thailand Baht"));
        currencyMap.put("TJS",new Currency("TJS",  "Tajikistan Somoni"));
        currencyMap.put("TMT",new Currency("TMT",  "Turkmenistan Manat"));
        currencyMap.put("TND",new Currency("TND",  "Tunisia Dinar"));
        currencyMap.put("TOP",new Currency("TOP",  "Tonga Pa'anga"));
        currencyMap.put("TRY",new Currency("TRY",  "Turkey Lira"));
        currencyMap.put("TTD",new Currency("TTD",  "Trinidad and Tobago Dollar"));
        currencyMap.put("TVD",new Currency("TVD",  "Tuvalu Dollar"));
        currencyMap.put("TWD",new Currency("TWD",  "Taiwan New Dollar"));
        currencyMap.put("TZS",new Currency("TZS",  "Tanzania Shilling"));
        currencyMap.put("UAH",new Currency("UAH",  "Ukraine Hryvnia"));
        currencyMap.put("UGX",new Currency("UGX",  "Uganda Shilling"));
        currencyMap.put("USD",new Currency("USD",  "United States Dollar"));
        currencyMap.put("UYU",new Currency("UYU",  "Uruguay Peso"));
        currencyMap.put("UZS",new Currency("UZS",  "Uzbekistan Som"));
        currencyMap.put("VEF",new Currency("VEF",  "Venezuela Bolívar"));
        currencyMap.put("VND",new Currency("VND",  "Viet Nam Dong"));
        currencyMap.put("VUV",new Currency("VUV",  "Vanuatu Vatu"));
        currencyMap.put("WST",new Currency("WST",  "Samoa Tala"));
        currencyMap.put("XAF",new Currency("XAF",  "Communauté Financière Africaine (BEAC) CFA Franc BEAC"));
        currencyMap.put("XCD",new Currency("XCD",  "East Caribbean Dollar"));
        currencyMap.put("XDR",new Currency("XDR",  "International Monetary Fund (IMF) Special Drawing Rights"));
        currencyMap.put("XOF",new Currency("XOF",  "Communauté Financière Africaine (BCEAO) Franc"));
        currencyMap.put("XPF",new Currency("XPF",  "Comptoirs Français du Pacifique (CFP) Franc"));
        currencyMap.put("YER",new Currency("YER",  "Yemen Rial"));
        currencyMap.put("ZAR",new Currency("ZAR",  "South Africa Rand"));
        currencyMap.put("ZMW",new Currency("ZMW",  "Zambia Kwacha"));
        currencyMap.put("ZWD",new Currency("ZWD",  "Zimbabwe Dollar"));

        currencyList = new ArrayList(currencyMap.values());
    }

}


