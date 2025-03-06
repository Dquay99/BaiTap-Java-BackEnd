package Buoi4.BaiTap.VeNha;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        String text = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. "
                + "Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, "
                + "nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. "
                + "Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";


        countWords(text);


        String capitalizedText = capitalizeWords(text);
        System.out.println("\nChuỗi sau khi viết hoa chữ cái đầu:\n" + capitalizedText);


        String removedVowels = removeVowels(text);
        System.out.println("\nChuỗi sau khi xóa nguyên âm:\n" + removedVowels);
    }


    public static void countWords(String text) {
        text = text.toLowerCase().replaceAll("[.,:;!?]", "");
        String[] words = text.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Số lượng từng từ trong văn bản:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static String capitalizeWords(String text) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }


    public static String removeVowels(String text) {
        return text.replaceAll("[aeiouAEIOUáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ]", "");
    }

}
