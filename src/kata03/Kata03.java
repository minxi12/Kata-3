package kata03;

public class Kata03 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("Yahoo.es");
        histogram.increment("Yahoo.es");
        histogram.increment("Yahoo.es");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();

    }

}
