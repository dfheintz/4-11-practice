public class rgb_to_hex {
    public static void main(String[] args) {
        //testing values
        int r = 255;
        int g = 127;
        int b = 0;
        //call conversion function
        String hexColor = rgbToHex(r, g, b);
        //print hex
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        //convert to number or letter value associated with the rbg number
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        //format as a string
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


