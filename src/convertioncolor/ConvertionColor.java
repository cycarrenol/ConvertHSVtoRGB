package convertioncolor;

public class ConvertionColor {

    public static void main(String[] args) {

        //CONVERTIR HSV A RGB
        double H = 70;//hue
        double S = 1;//saturation
        double V = 1;//value

        double R1 = 0;//Red
        double G1 = 0;//Blue
        double B1 = 0;//Green

        //Begin the formula
        double C = V * S;

        double X = C * (1 - Math.abs(((H / 60) % 2) - 1));
        System.out.println("°°" + X);
        double m = V - C;

        if (H >= 0 && H < 60) {

            R1 = (C + m) * 255;
            G1 = (X + m) * 255;
            B1 = (0 + m) * 255;

        } else if (H >= 60 && H < 120) {

            R1 = (X + m) * 255;
            G1 = (C + m) * 255;
            B1 = (0 + m) * 255;

        } else if (H >= 120 && H < 180) {

            R1 = (0 + m) * 255;
            G1 = (C + m) * 255;
            B1 = (X + m) * 255;

        } else if (H >= 180 && H < 240) {

            R1 = (0 + m) * 255;
            G1 = (X + m) * 255;
            B1 = (C + m) * 255;

        } else if (H >= 240 && H < 300) {

            R1 = (X + m) * 255;
            G1 = (0 + m) * 255;
            B1 = (C + m) * 255;

        } else if (H >= 300 && H < 360) {

            R1 = (C + m) * 255;
            G1 = (0 + m) * 255;
            B1 = (X + m) * 255;

        }

        int R2 = (int) R1;
        int G2 = (int) G1;
        int B2 = (int) B1;

        System.out.println(R2);
        System.out.println(G2);
        System.out.println(B2);

        // FIN CONVERSION
    }

}

//LINK to formula
//https://www.rapidtables.com/convert/color/hsv-to-rgb.html
