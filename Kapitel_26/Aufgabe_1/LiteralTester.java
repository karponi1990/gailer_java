class LiteralTester {
    public static void main(String[] args) {

        String str1 = "Bo, die Katze";
        String str2 = "Bo, die Katze";
        String str3 = new String("Fred, der Hund");
        String str4 = new String("Fred, der Hund");

        System.out.println("str1 == str2: " + (str1 == str2)); // true

        System.out.println("str3 == str4: " + (str3 == str4)); // false

        int count = 0;
        if (str1 == str2) {
            count++;
        } else {
            count += 2;
        }

        if (str3 == str4) {
            count++;
        } else {
            count += 2;
        }

        System.out.println("Es wurden " + count + " Objekte erzeugt.");
    }
}
