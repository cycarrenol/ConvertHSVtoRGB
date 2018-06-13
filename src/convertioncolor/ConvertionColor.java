package convertioncolor;

public class ConvertionColor {

    public static void main(String[] args) {

        int H =120;//hue
        int S = 1;//saturation
        int V = 1;//value

        int R = 0;//Red
        int G = 0;//Blue
        int B = 0;//Green
        
        //Begin the formula
        int C = V * S;

        int X = C * (1 - Math.abs((H / 60) % 2 - 1));

        int m = V - C;

        if (H >= 0 && H < 60) {

            R = (C + m) * 255;
            G = (X + m) * 255;
            B = (0 + m) * 255;

        } else if (H >= 60 && H < 120) {

            R = (X + m) * 255;
            G = (C + m) * 255;
            B = (0 + m) * 255;

        } else if (H >= 120 && H < 180) {

            R = (0 + m) * 255;
            G = (C + m) * 255;
            B = (X + m) * 255;

        } else if (H >= 180 && H < 240) {

            R = (0 + m) * 255;
            G = (X + m) * 255;
            B = (C + m) * 255;

        } else if (H >= 240 && H < 300) {

            R = (X + m) * 255;
            G = (0 + m) * 255;
            B = (C + m) * 255;

        } else if (H >= 300 && H < 360) {

            R = (C + m) * 255;
            G = (0 + m) * 255;
            B = (X + m) * 255;

        }
         //End the formula
         
         //print the RGB
        System.out.println(R);
        System.out.println(G);
        System.out.println(B);

    }

}

//LINK to formula