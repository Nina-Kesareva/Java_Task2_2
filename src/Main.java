public class Main {
    public static void main(String[] args) {
        int account = 130;
        int add = 1500;
        int bonus;
        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int bill = (account + add + bonus);
        System.out.println(" Всего на счету " + bill);
    }
}
