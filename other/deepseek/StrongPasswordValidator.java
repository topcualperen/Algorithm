
/**
 *  Kırılması kolay olmayan şifre oluşturma algorirması.
 *  
 *  NOT: Kullanıcılardan beklenen minimum 17 karakterli şifrenin karmaşıklığı şifrenin gücünü arttırır.
 */

public class StrongPasswordValidator {

    public static boolean validateStrongPassword(String password) {

        if (password == null || password.isEmpty())
            return false;

        if (password.length() < 17)
            return false;

        if (password.contains(" "))
            return false;

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z')
                uppercaseCount++;
            else if (c >= 'a' && c <= 'z')
                lowercaseCount++;
            else if (c >= '0' && c <= '9')
                digitCount++;
            else if (specialChars.indexOf(c) != -1)
                specialCharCount++;
        }

        if (uppercaseCount < 2 || lowercaseCount < 2 ||
                digitCount < 2 || specialCharCount < 2)
            return false;

        if (hasThreeConsecutiveChars(password))
            return false;
        if (hasWeakPatterns(password))
            return false;

        return true;
    }

    private static boolean hasThreeConsecutiveChars(String password) {

        for (int i = 0; i < password.length() - 2; i++) {

            if (password.charAt(i) == password.charAt(i + 1) &&
                    password.charAt(i) == password.charAt(i + 2))
                return true;
        }
        return false;
    }

    private static boolean hasWeakPatterns(String password) {

        String lowerPassword = password.toLowerCase();
        String[] weakPatterns = { "1111111", "2222222", "3333333", "444444444", "555555555",
                "6666666", "77777777", "88888888", "9999999999",
                "000000000", "password", "12345", "strong", "güçlü",
                "1905", "1903", "1907", "1967", "qwerty", "admin",
                "welcome", "iloveyou", "zzzzzz", "galatasaray",
                "fenerbahce", "türkiye", "mustafa", "kemal",
                "aslan", "kartal", "1q2w3e", "secret", "dragon",
                "monkey", "guest", "UNKNOWN" };
        for (String pattern : weakPatterns) {

            if (lowerPassword.contains(pattern))
                return true;
        }
        return false;
    }

    // Test fonksiyonu
    public static void main(String[] args) {
        System.out.println("=== Güçlü Şifre Validasyon Testleri ===\n");

        // Geçerli örnekler
        System.out.println("Geçerli şifreler:");
        testPassword("qwqwqwqwqwqwqwqwqw@@APU..8324", true);
        testPassword("SecureP@ssw0rd!", true);
        testPassword("C0mpl3x!P@ssw0rd", true);
        testPassword("Str0ng!P@ssW0rd#", true);

        System.out.println("\nGeçersiz şifreler:");
        testPassword("short1!", false); // çok kısa
        testPassword("onlylowercase123!@", false); // büyük harf yetersiz
        testPassword("ONLYUPPERCASE123!@", false); // küçük harf yetersiz
        testPassword("NoNumbers!@#ABC", false); // rakam yetersiz
        testPassword("NoSpecial123ABC", false); // özel karakter yetersiz
        testPassword("Has Space123!@", false); // boşluk var
        testPassword("SameAAA123!@#", false); // aynı karakter 3 kez
        testPassword("MyPass123abc!@", false); // "123" ve "abc" kalıbı
        testPassword("Password1!", false); // büyük/küçük harf yetersiz
        testPassword("StrongPass111!!!", false); // rakam yetersiz (aynı rakam)
        testPassword("MyQwerty12!@", false); // "qwerty" kalıbı
    }

    private static void testPassword(String password, boolean expected) {
        boolean result = validateStrongPassword(password);
        String status = result == expected ? "✓" : "✗";
        System.out.println(String.format("%s %-20s -> %s (beklenen: %s)",
                status, "\"" + password + "\"", result, expected));

        if (result != expected) {
            System.out.println("    HATA: Beklenen " + expected + " ama " + result + " döndü!");
        }
    }
}
