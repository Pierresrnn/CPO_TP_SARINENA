/*
SARINENA, TDC , convetisseurObjet, 12/10/2023
 */
package tp2_convertisseurobjet_sarinena;

/**
 *
 * @author pierr
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        nbConversions = 1 + nbConversions;
        return tCelcius + 273.15;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions = 1 + nbConversions;
        return tKelvin - 273.15;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions = 1 + nbConversions;
        return (tFarenheit - 32) * 5 / 9;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions = 1 + nbConversions;
        return (tCelcius * 9 / 5) + 32;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions = 1 + nbConversions;
        return KelvinVersCelcius(CelciusVersFarenheit(tKelvin));
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions = 1 + nbConversions;
        return FarenheitVersCelcius(CelciusVersKelvin(tFarenheit));
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}
