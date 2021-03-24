import javax.print.DocFlavor;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Scratch {

}

class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.println(altimeter);
        System.out.println(airGauge);
    }
}


//class Test {
//    public static void main(String[] args) {
//
//    }
//}


