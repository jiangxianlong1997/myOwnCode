package 培训.javaCollection.farmerandlord.src.com.itheima.util;

import java.util.ArrayList;

public class CodeUtil {

//    public static String getCode(){
//        StringBuilder stringBuilder = new StringBuilder();
//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            char random = getRandom();
//            if (random >= '0' && random <= '9' && counter == 0) {
//                counter++;
//                stringBuilder.append(random);
//                continue;
//            }
//            if (random >= '0' && random <= '9' && counter > 0) {
//                while (random >= '0' && random <= '9') {
//                    random = getRandom();
//                }
//                stringBuilder.append(random);
//                continue;
//            }
//            if (i == 4 && counter == 0) {
//                while (!(random >= '0' && random <= '9')) {
//                        random = getRandom();
//                }
//            }
//            stringBuilder.append(random);
//        }
//        return stringBuilder.toString();
//    }

    public static String getCode() {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (('a' + i) == 'o') {
                continue;
            }
            arrayList.add((char)('a'+ i));
            arrayList.add((char)('A'+ i));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            result.append(arrayList.get((int)(Math.random() * arrayList.size())));
        }
        result.append((int) (Math.random() * 10));
        char temp;
        int random = (int) (Math.random() * 5);
        temp = result.charAt(random);
        result.setCharAt(random, result.charAt(4));
        result.setCharAt(4,temp);
        return result.toString();
    }

//    public static char getRandom() {
//        ArrayList<Character> arrayList = new ArrayList<>();
//        for (int i = 0; i < 26; i++) {
//            if (('a' + i) == 'o') {
//                continue;
//            }
//            arrayList.add((char)('a'+ i));
//            arrayList.add((char)('A'+ i));
//        }
//        for (int i = 0; i < 10; i++) {
//            arrayList.add((char)('0' + i));
//        }
//        return arrayList.get((int)(Math.random() * arrayList.size()));
//    }

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
        System.out.println(getCode());
    }
}